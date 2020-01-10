package com.example.order.workflow;

import com.example.order.model.OrderDetails;
import com.uber.cadence.workflow.Workflow;
import java.sql.SQLOutput;

public class OrderWorkflowImpl implements OrderWorkFlow
{
  public OrderFulfillmentActivities activities = Workflow.newActivityStub(OrderFulfillmentActivities.class);


  @Override
  public void startOrderfulfillmentProcess(OrderDetails order)
  {
     //create activities for order process
     //Activity 1: call shipment process
     String value = activities.doShipment(order);

     System.out.println("shipment Activity completed");

     //Activity 2: call payment process
     activities.doPayment();

     System.out.println("payment Activity completed");

  }
}
