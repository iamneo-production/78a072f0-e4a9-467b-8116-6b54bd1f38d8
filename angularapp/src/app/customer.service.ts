import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  baseURL='http://localhost:8080/api/v1/customer';
  constructor(private http:HttpClient){}
  getAllCustomer(){
    return this.http.get(this.baseURL);
  }
  saveCustomerData(data:any){
    console.log(data);
    return this.http.post(this.baseURL,data);
  }
  deleteBooking(id:number):Observable<Object>{
    return this.http.delete(`${this.baseURL}/${id}`);
  }
}