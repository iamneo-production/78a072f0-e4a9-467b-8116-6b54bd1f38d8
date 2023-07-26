import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormGroup, Validators,FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { CustomerService } from 'src/app/customer.service';
@Component({
  selector: 'app-customer-service',
  templateUrl: './customer-service.component.html',
  styleUrls: ['./customer-service.component.css']
})
export class CustomerServiceComponent implements OnInit {
  bookingForm!: FormGroup;
  bookings: any; 
  customerName:any;
  data:any;
  constructor(private formBuilder:FormBuilder,
    private customerService: CustomerService,
    http:HttpClient,
     private router:Router,
     private snackBar:MatSnackBar) { }

  ngOnInit(): void {
    this.intiForm();
    this.customerService.getAllCustomer().subscribe((data)=>{
      this.bookings=data;
    });
  }
  intiForm() {
    this.bookingForm = this.formBuilder.group({
      name: ['', Validators.required],
      checkIn: ['', Validators.required],
      checkOut: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
     phoneNumber: ['', [Validators.required, Validators.pattern('^[0-9]{10}$')]]
    });
    
  }
  submitForm(): void {
    if (this.bookingForm.invalid) {
      return;
    }

    if(this.bookingForm.valid){
      const bookingData = this.bookingForm.value;
      this.bookings.push(bookingData);
      this.bookingForm.reset;
    }
      this.customerService.saveCustomerData(this.bookingForm.value).subscribe((data)=>{
        console.log(data);
      });
    // Reset the form
    this.bookingForm.reset();


  }
 
  deleteBooking(id:number) {
    this.customerService.deleteBooking(id).subscribe((data)=>{
     console.log(data);
    
    });
    this.router.navigate(['/customer-service']);
   window.location.reload();
   
  }
}
