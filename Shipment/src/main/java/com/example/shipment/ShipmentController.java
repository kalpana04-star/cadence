package com.example.shipment;

import com.example.shipment.model.OrderDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController
{
    @PostMapping(value ="/ship", consumes = "application/json")
    public void processShipment(@RequestBody OrderDetails order)
    {
      System.out.println(" SUCCESS : process shipment completed for Order " + order + "   Shipment microservice");
    }

}
