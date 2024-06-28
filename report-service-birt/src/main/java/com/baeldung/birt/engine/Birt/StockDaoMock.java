package com.baeldung.birt.engine.Birt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class StockDaoMock {
    private RestTemplate restTemplate = new RestTemplate();
    public List<CustomerVO> getStockValues(String company) {
  
   	 String URL2= "http://localhost:8185/customer/id/121";
        
        List<CustomerVO> Custhistory = new ArrayList<CustomerVO>();
        
        ResponseEntity<CustomerVO>  responseFromMaster = restTemplate.exchange(URL2,HttpMethod.GET, null,CustomerVO.class);
        CustomerVO cust = responseFromMaster.getBody();
        
        
        CustomerVO customer = new CustomerVO();
        customer.setCustomerId(cust.getCustomerId());
        customer.setFirstName(cust.getFirstName());
        customer.setLastName(cust.getLastName());
        customer.setMiddleName(cust.getMiddleName());
        customer.setEmailId(cust.getEmailId());
        customer.setMobileNumber(cust.getMobileNumber());
        Custhistory.add(customer);
        
        return Custhistory;	
       
    }
}