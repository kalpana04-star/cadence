package com.cadence.example.CadencePOC;

import com.uber.cadence.worker.Worker;
import java.lang.management.ManagementFactory;

public class MyWorker
{
  public static final String TASK_LIST = "processing";
  public static void main(String[] args) throws InterruptedException {

    // Get worker to poll the common task list.
    Worker.Factory factory = new Worker.Factory(WorkflowStarter.DOMAIN);
    final Worker myworker = factory.newWorker(TASK_LIST);
    myworker.registerWorkflowImplementationTypes(WorkflowDefinition.class);

    // Start all workers created by this factory.
    factory.start();
    System.out.println("Worker started for task list: " + TASK_LIST);

    //sleep for some time
    Thread.sleep(1000);
  }


}
