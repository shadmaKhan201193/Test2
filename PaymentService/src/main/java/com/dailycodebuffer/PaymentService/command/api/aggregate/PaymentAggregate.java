package com.dailycodebuffer.PaymentService.command.api.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.dailycodebuffer.CommonService.commands.CancelPaymentCommand;
import com.dailycodebuffer.CommonService.commands.ValidatePaymentCommand;
import com.dailycodebuffer.CommonService.events.PaymentCancelledEvent;
import com.dailycodebuffer.CommonService.events.PaymentProcessedEvent;

import lombok.extern.slf4j.Slf4j;

@Aggregate
@Slf4j
public class PaymentAggregate {
	private static final Logger log = LoggerFactory.getLogger(PaymentAggregate.class);
    @AggregateIdentifier
    private String paymentId;
    private String orderId;
    private String paymentStatus;

    public PaymentAggregate() {
    }

    @CommandHandler
    public PaymentAggregate(ValidatePaymentCommand validatePaymentCommand) {
        //Validate the Payment Details
        // Publish the Payment Processed event
        log.info("Executing ValidatePaymentCommand for " +
                "Order Id: {} and Payment Id: {}",
                validatePaymentCommand.getOrderId(),
                validatePaymentCommand.getPaymentId());

        PaymentProcessedEvent paymentProcessedEvent
                = new PaymentProcessedEvent(
                validatePaymentCommand.getPaymentId(), validatePaymentCommand.getOrderId()
        );

        AggregateLifecycle.apply(paymentProcessedEvent);

        log.info("PaymentProcessedEvent Applied");
    }

    @EventSourcingHandler
    public void on(PaymentProcessedEvent event) {
        this.paymentId = event.getPaymentId();
        this.orderId = event.getOrderId();
    }
//
//    @CommandHandler
//    public void handle(CancelPaymentCommand cancelPaymentCommand) {
//        PaymentCancelledEvent paymentCancelledEvent
//                = new PaymentCancelledEvent();
//        BeanUtils.copyProperties(cancelPaymentCommand,
//                paymentCancelledEvent);
//
//        AggregateLifecycle.apply(paymentCancelledEvent);
//    }
//
//    @EventSourcingHandler
//    public void on(PaymentCancelledEvent event) {
//        this.paymentStatus = event.getPaymentStatus();
//    }
}
