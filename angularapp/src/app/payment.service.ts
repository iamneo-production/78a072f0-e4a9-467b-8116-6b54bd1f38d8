import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  private payments: any[] = [];

  baseURL='https://8081-aeadcaeeecbffebcfbfbfaeedd.project.examly.io/api/v1/payment';
    constructor(private http:HttpClient) { }
  getAllPayment(){
    return this.http.get(`${this.baseURL}`);
  }
  savePaymentData(data:any){
    console.log(data)
    return this.http.post(`${this.baseURL}`,data);
  }
  storePayment(paymentData: any) {
    this.payments.push(paymentData);
  }

  
  storePaymentData(paymentData: any) {
    return this.http.post(this.baseURL, paymentData);
  }
}