package com.sample.checkout;

import com.sample.checkout.model.OrderDetails;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CheckOutController
{

     RestTemplate restTemplate;

     @PostConstruct
     private void init() {
    restTemplate =  new RestTemplate();
  }

     @RequestMapping("/checkout")
     public void processCheckout(@RequestBody OrderDetails orderDetails)
     {
        //call order microservice for processing
        System.out.println("calling order microservice after checkout");
        restTemplate.postForEntity("http://127.0.0.1:8090/order",orderDetails, OrderDetails.class);
     }

}
