package com.example.order.workflow;

import static com.example.order.workflow.Constants.DOMAIN;
import static com.example.order.workflow.Constants.TASK_LIST;

import com.uber.cadence.worker.Worker;
import org.springframework.stereotype.Component;

@Component
public class OrderWorker
{
  public static void createWorker()
  {
    //create worker for Order fulfillment workflow
    System.out.println(" ---- creating worker -------");
    Worker.Factory factory = new Worker.Factory(DOMAIN);
    Worker worker = factory.newWorker(TASK_LIST);
    // Workflows are stateful. So you need a type to create instances.
    worker.registerWorkflowImplementationTypes(OrderWorkflowImpl.class);
    // Activities are stateless and thread safe. So a shared instance is used.
    worker.registerActivitiesImplementations(new OrderFulfillmentActivitiesImpl());
    // Start listening to the workflow and activity task lists.
    factory.start();

  }

}
