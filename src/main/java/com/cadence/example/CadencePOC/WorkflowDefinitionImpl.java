package com.cadence.example.CadencePOC;

import java.sql.SQLOutput;

public class WorkflowDefinitionImpl implements WorkflowDefinition
{

  @Override
  public String process(String source) throws InterruptedException {
    System.out.println("process called from Worker Implementation");
    try
    {
      Thread.sleep(2000);
      System.out.println("sleep over for impl");
    } catch (InterruptedException e) {
      e.printStackTrace();
      return null;
    }

    return source;
  }
}
