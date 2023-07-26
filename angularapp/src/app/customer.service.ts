import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  baseURL='https://8081-aeadcaeeecbffebcfbfbfaeedd.project.examly.io/api/v1/customer';
  apiURL='https://8081-aeadcaeeecbffebcfbfbfaeedd.project.examly.io/api/v1/customer/{id}';
  constructor(private http:HttpClient){}
  getAllCustomer(){
    return this.http.get(`${this.baseURL}`);
  }
  saveCustomerData(data:any){
    console.log(data);
    return this.http.post(`${this.baseURL}`,data);
  }
  deleteBooking(id:number):Observable<Object>{
    return this.http.delete(`${this.baseURL}/${id}`);
  }
  getChartInfo(){
    return this.http.get(`${this.baseURL}`);
  }
}
