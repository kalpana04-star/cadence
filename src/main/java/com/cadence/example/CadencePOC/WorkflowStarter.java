package com.cadence.example.CadencePOC;

import com.uber.cadence.client.WorkflowClient;

public class WorkflowStarter
{
  public static final String DOMAIN = "sample";



  public static void main(String[] args) throws Exception {

    //cadence service configuration
    String cadence_host = "127.0.0.1";
    String cadence_port ="7933";

    WorkflowClient workflowClient = WorkflowClient.newInstance(cadence_host, Integer.parseInt(cadence_port),DOMAIN);
    System.out.println("workflowClient created" +workflowClient);

    WorkflowDefinition workflow = workflowClient.newWorkflowStub(WorkflowDefinition.class);
    System.out.println("Executing WorkFlowDefinition from starter");
    String result = workflow.process("hello");
    System.out.println("workflow starter completed");


    System.exit(0);
  }


}
