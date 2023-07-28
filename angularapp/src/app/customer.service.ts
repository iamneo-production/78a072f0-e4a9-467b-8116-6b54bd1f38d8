import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  static getCustomer(id: any, number: any) {
    throw new Error('Method not implemented.');
  }
  getcustomer() {
    throw new Error('Method not implemented.');
  }
  setCustomerData(customerData: { profileImage: string | null; customerId: number; name: string; email: string; phone: string; }) {
  
  }

  private baseUrl = 'https://8080-eccfdafeaeefbffebceaeaadbdbabf.project.examly.io/customers/bookings';

  constructor(private httpClient: HttpClient) { }

  saveCustomer(formData: any): Observable<any> {
    return this.httpClient.post(this.baseUrl, formData);
  }

  getCustomer(customerId: string): Observable<any> {
    const url= `${this.baseUrl}/customers/${customerId}/bookings`;
    return this.httpClient.get<any[]>(url);
  }
  updateCustomer(customerId: string, customers: any, bookings: any): Observable<any>{
    const url= `${this.baseUrl}/customers/${customerId}/bookings`;
    return this.httpClient.put<any[]>(url, Customer);
  }
  createCustomer( customers: any, bookings:any): Observable<any>{

    return this.httpClient.post<Customer>(`${this.baseUrl}`, customers);
  }
  

  deleteCustomer(): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}`);
  }
}

