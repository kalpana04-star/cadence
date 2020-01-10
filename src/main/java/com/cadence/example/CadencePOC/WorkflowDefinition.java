package com.cadence.example.CadencePOC;

import com.uber.cadence.workflow.WorkflowMethod;

public interface WorkflowDefinition
{
  @WorkflowMethod(taskList = MyWorker.TASK_LIST,
      executionStartToCloseTimeoutSeconds = 30
  )
  String process(String source) throws InterruptedException;

}
