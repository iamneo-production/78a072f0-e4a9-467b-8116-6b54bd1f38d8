import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  setProfileData(profileData: { profileImage: string | null; firstName: string; lastName: string; email: string; password: string; phoneNumber: string; address: string; gender: string;  pincode: string;
  state: string ;
  paymentMethod: string;
  cardNumber: string;
  cardHolderName: string;
  expiryDate: string;
  cvv: string}) {
    throw new Error('Method not implemented.');
  }
  getCustomerData() {
    throw new Error('Method not implemented.');
  }
  private baseUrl = 'http://localhost:8080/api/v1/customer';

  constructor(private httpClient: HttpClient) { }



  getCustomer(id: number): Observable<Customer> {
    const url= `${this.baseUrl}/${id}`;
    return this.httpClient.get<Customer>(url);
  }
  updateCustomer(id: number, profile: Customer): Observable<Customer>{
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

