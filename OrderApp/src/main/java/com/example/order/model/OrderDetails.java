package com.example.order.model;

public class OrderDetails
{
  private String orderId;
  private String quantity;

  public OrderDetails(String orderId, String quantity) {
    this.orderId = orderId;
    this.quantity = quantity;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }
}
