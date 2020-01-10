package com.example.order.workflow;

import com.example.order.model.OrderDetails;
import javax.annotation.PostConstruct;
import org.springframework.web.client.RestTemplate;

public class OrderFulfillmentActivitiesImpl implements  OrderFulfillmentActivities
{
  RestTemplate restTemplate;

  @PostConstruct
  private void init() {
    restTemplate =  new RestTemplate();
  }

  @Override
  public String doShipment(OrderDetails order)
  {
    // call sync and async shipment microservice
    System.out.println(restTemplate);
    restTemplate.postForEntity("http://127.0.0.1:8070/ship",order,OrderDetails.class);
    return "doshipment called";
  }

  @Override
  public String doPayment()
  {


    System.out.println("doPayment Activity started");
    return null;
  }
}
