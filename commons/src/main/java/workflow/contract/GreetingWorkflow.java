package workflow.contract;

import com.uber.cadence.workflow.WorkflowMethod;
import utilties.Constants;

public interface GreetingWorkflow {

  /** @return greeting string */
  @WorkflowMethod(executionStartToCloseTimeoutSeconds = 10, taskList = Constants.TASK_LIST)
  String getGreeting(String name);

}
