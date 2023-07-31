package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.examly.springapp.exceptions.ResourceNotFoundException;
import com.examly.springapp.model.Customers;
import com.examly.springapp.repository.Customersrepository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "https://8081-fdedbdfabffebcfbfbfaeedd.project.examly.io")
@RequestMapping
public class Customerscontroller {

  @Autowired
  private Customersrepository customersrepository;

  //get all customers
  @GetMapping("/customers")
  public List<Customers> getAllcustomers()
  {
    return customersrepository.findAll();
  }

  //create
  @PostMapping("/addcustomer")
  public Customers creatcustomer(@RequestBody Customers customer){
    return customersrepository.save(customer);
  }

  //retriving the infos
  @GetMapping("/customer/{id}")
  public ResponseEntity<Customers> getCustomerById(@PathVariable long id) {
    Customers customer = customersrepository.findById(id).
                       orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+id));
   return ResponseEntity.ok(customer);
   }

  //update the infos
  @PutMapping("/updatecustomer/{id}")
  public ResponseEntity<Customers> updateCustomer(@PathVariable long id,@RequestBody Customers customerdetails) {
    Customers customer = customersrepository.findById(id).
                        orElseThrow(() -> new ResourceNotFoundException("Room not existedd for id:"+id));
    customer.setName(customerdetails.getName());
    customer.setDob(customerdetails.getDob());
    customer.setEmailId(customerdetails.getEmailId());
    customer.setUserName(customerdetails.getUserName());
    customer.setPassword(customerdetails.getPassword());
    //customer.setIdentifier("user");
    Customers updatedcustomer = customersrepository.save(customer);
    return ResponseEntity.ok(updatedcustomer);
   }

   //delete  the employee infos
   @DeleteMapping("/customer/{id}")
   public ResponseEntity<Map<String,Boolean>> deleteCustomer(@PathVariable Long id){
 
   Customers customer = customersrepository.findById(id).
   orElseThrow(() -> new ResourceNotFoundException("Customer not existed for id:"+id));

   customersrepository.delete(customer);
   Map<String,Boolean> response = new HashMap<>();
   response.put("deleted",Boolean.TRUE);
   return ResponseEntity.ok(response);
 }


 //verify the username
 @GetMapping("/username/{userName}/{password}")
 public int isValidcustomer(@PathVariable String userName,@PathVariable String password)
 {
  int result;
  Customers customer = customersrepository.findByuserName(userName);
  if(customer == null)
  {
    return 0;
    //throw new ResourceNotFoundException("username not found");
  }

  if(customer.getIdentifier().equalsIgnoreCase("admin") && customer.getPassword().equalsIgnoreCase(password))
    {
      result = 1;
    }

  else if(customer.getIdentifier().equalsIgnoreCase("user") && customer.getPassword().equalsIgnoreCase(password))
    {
      result = 2;
    }
  else
    {
      result = 3;
    }
    return result;
 }

  //get by username
  @GetMapping("/username/{userName}")
  public ResponseEntity<Customers> getElementsByusername(@PathVariable String userName)
  {
    Customers customer = customersrepository.findByuserName(userName);
    return ResponseEntity.ok(customer);
  }

}
