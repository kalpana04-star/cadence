package com.example.order.workflow;

import com.example.order.model.OrderDetails;
import com.uber.cadence.activity.ActivityMethod;

public interface OrderFulfillmentActivities
{
    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2)
    public String doShipment(OrderDetails order);

    @ActivityMethod(scheduleToCloseTimeoutSeconds = 2)
    public String doPayment();




}
