import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  baseURL='http://localhost:8080/api/v1/customer';
  apiURL='http://localhost:8080/api/v1/customer/{id}';
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
    return this.http.get(`${this,this.baseURL}`);
  }
  static getCustomer(id: any, number: any) {
    throw new Error('Method not implemented.');
  }
  getcustomer() {
    throw new Error('Method not implemented.');
  }
  setCustomerData(customerData: { profileImage: string | null; customerId: number; name: string; email: string; phone: number; }) {
  
  }

  private baseUrl = 'https://8080-ceafffcbaffbffebceaeaadbdbabf.project.examly.io/customers/bookings';

 

  saveCustomer(formData: any): Observable<any> {
    return this.http.post(this.baseUrl, formData);
  }

  getCustomer(customerId: string): Observable<any> {
    const url= `${this.baseUrl}/customers/${customerId}/bookings`;
    return this.http.get<any[]>(url);
  }
  updateCustomer(customerId: string, customers: any, bookings: any): Observable<any>{
    const url= `${this.baseUrl}/customers/${customerId}/bookings`;
    return this.http.put<any[]>(url, Customer);
  }
  createCustomer( customers: any, bookings:any): Observable<any>{

    return this.http.post<Customer>(`${this.baseUrl}`, customers);
  }
  

  deleteCustomer(): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}`);
  }

}
