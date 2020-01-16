package activity.implementations;

import activity.contract.GreetingActivities;

public class GreetingActivitiesImpl implements GreetingActivities {

  @Override
  public String composeGreeting(String greeting, String name) {
    return greeting + " " + name + "!";
  }

}
