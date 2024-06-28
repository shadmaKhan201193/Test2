package com.dailycodebuffer.ShipmentService.command.api.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {

    @Id
    private String shipmentId;
    private String orderId;
    private String shipmentStatus;
}
