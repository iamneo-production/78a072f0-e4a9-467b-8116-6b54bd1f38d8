import { Component,OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PaymentService } from 'src/app/payment.service';


@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  paymentForm!:FormGroup;
  data:any;
  pays!:any;
  constructor(private route:Router, private formBuilder:FormBuilder,private paymentService:PaymentService){}
  ngOnInit(){
    this.initForm();
    this.paymentService.getAllPayment().subscribe((data=>{
      this.pays=data;
    }))
  }


  initForm(){
    this.paymentForm = this.formBuilder.group({
      cardholdername:['',Validators.required],
      cardnumber:['',Validators.required,Validators.pattern('^[0-9]{16}$')],
      ccv:['',Validators.required,Validators.pattern('^[0-9]{3}$')]
    });
  }
submitForm(){
  this.route.navigate(['/sucess']);
}
}
