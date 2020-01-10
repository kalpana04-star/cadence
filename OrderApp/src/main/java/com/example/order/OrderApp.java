package com.example.order;

import static com.example.order.workflow.Constants.DOMAIN;
import static com.example.order.workflow.Constants.TASK_LIST;

import com.example.order.workflow.OrderFulfillmentActivitiesImpl;
import com.example.order.workflow.OrderWorker;
import com.example.order.workflow.OrderWorkflowImpl;
import com.uber.cadence.worker.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.order.workflow.Constants;

@SpringBootApplication
public class OrderApp
{
  @Autowired
  public static OrderWorker worker;

  public static void main(String[] args)
  {
    SpringApplication.run(OrderApp.class,args);
    OrderWorker.createWorker();



  }
}
