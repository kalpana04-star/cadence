package com.example.order.controller;

import static com.example.order.workflow.Constants.DOMAIN;

import com.example.order.model.OrderDetails;
import com.example.order.workflow.OrderWorkFlow;
import com.uber.cadence.client.WorkflowClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
  @PostMapping(path = "/order", consumes = "application/json")
     public void receiveOrder(@RequestBody OrderDetails order)
     {
       System.out.println("Order is received by Order microservice");
       // Start a workflow execution. Usually this is done from another program.
       WorkflowClient workflowClient = WorkflowClient.newInstance(DOMAIN);
       // Get a workflow stub using the same task list the worker uses.
       OrderWorkFlow workflow = workflowClient.newWorkflowStub(OrderWorkFlow.class);
       // Execute a workflow waiting for it to complete.
       workflow.startOrderfulfillmentProcess(order);
       System.out.println("OrderWorkflow completed");
       //System.exit(0);



     }
}
