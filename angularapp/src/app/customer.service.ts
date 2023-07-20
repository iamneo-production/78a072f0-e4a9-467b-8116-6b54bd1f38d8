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
  setCustomerData(customerData: { profileImage: string | null; customerId: string; firstName: string; lastName: string; email: string; password: string; phoneNumber: string; address: string; gender: string; state:string; pincode:string;}) {
  
  }

  private baseUrl = 'http://localhost:8080/api/v1/customer';

  constructor(private httpClient: HttpClient) { }

  saveCustomer(formData: any): Observable<any> {
    return this.httpClient.post(this.baseUrl, formData);
  }

  getCustomer(id: number): Observable<Customer> {
    const url= `${this.baseUrl}/${id}`;
    return this.httpClient.get<Customer>(url);
  }
  updateCustomer(id: number, customer: Customer): Observable<Customer>{
    const url= `${this.baseUrl}/${id}`;
    return this.httpClient.put<Customer>(url, Customer);
  }
  createCustomer( customer: Customer): Observable<Customer>{

    return this.httpClient.post<Customer>(`${this.baseUrl}`, customer);
  }
  

  deleteCustomer(): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}`);
  }
}

