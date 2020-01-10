package com.example.order.workflow;

import static com.example.order.workflow.Constants.TASK_LIST;

import com.example.order.model.OrderDetails;
import com.uber.cadence.workflow.WorkflowMethod;
import com.example.order.workflow.Constants;

public interface OrderWorkFlow
{
  @WorkflowMethod(executionStartToCloseTimeoutSeconds = 10, taskList = TASK_LIST)
  public void startOrderfulfillmentProcess(OrderDetails order);

  //signal and query Methods


}
