package com.binder.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binder.hrpayroll.entities.Payment;
import com.binder.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

 @Autowired	
 private PaymentService service;	
	
 @GetMapping(value = "/{workerId}/days/{days}")
 
  //Método getPayment do tipo ResponseEntity<Payment>
  public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days ) {
	 
	  //Chama o servico chamando o método lá dentro getPayment
	  Payment payment  = service.getPayment(workerId, days);
      return ResponseEntity.ok(payment);
  }
 
 
 
}
