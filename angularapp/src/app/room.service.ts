import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Booking } from './booking';
import { Customer } from './customer';
import { Room } from './room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {

  private baseURL1 = "https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/getrooms"; // getallroom
  private baseURL2 = "https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/addroom";  //addroom
  private baseURL3 = "https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/room";  //retriveroomdata
  private baseURL4 = "https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/updateroom";  //updateroom
  private baseURL5 = "https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/bookedroom"       
   //update booked room

  constructor(private httpClient:HttpClient) { }
 
  getRoomList(): Observable<Room[]>{
    return this.httpClient.get<Room[]>(`${this.baseURL1}`);
  }

  getCustomerList(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/customers`);
  }


  getBookingList(): Observable<Booking[]>{
    return this.httpClient.get<Booking[]>(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/getbookings`);
  }


  createRoom(room:Room):Observable<any>{
    return this.httpClient.post(`${this.baseURL2}`,room);
  }

  getRoomByRoomNo(RoomNumber:number):Observable<Room>{
    return this.httpClient.get<Room>(`${this.baseURL3}/${RoomNumber}`);
  }

  getBookingById(bookingId:number):Observable<Booking>{
    return this.httpClient.get<Booking>(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/booking/`+bookingId);
  }


  updateRoom(RoomNumber:number, room: Room):Observable<object>{
    return this.httpClient.put(`${this.baseURL4}/${RoomNumber}`,room);
  }

  deleteRoom(RoomNumber:number): Observable<object>
  {
    return this.httpClient.delete(`${this.baseURL3}/${RoomNumber}`);
  }

  deleteCustomer(customerid:number): Observable<object>
  {
    return this.httpClient.delete(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/customer/`+customerid);
  }

  cancelBooking(bookingid:number): Observable<object>
  {
    return this.httpClient.delete(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/booking/`+bookingid);
  }

  checkvaliduser(userName:string,password:string): Observable<number>
  {
    return this.httpClient.get<number>('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/username/'+userName+'/'+password);
  }

  addcustomer(customer:Customer):Observable<any>{
    return this.httpClient.post('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/addcustomer',customer);
  }

  getcustomerByusername(userName:String):Observable<Customer>
  {
    return this.httpClient.get<Customer>('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/username/'+userName);
  }

  newbooking(booking:Booking):Observable<any>{
    return this.httpClient.post('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/book',booking);
  }


  // updatebookedroom(RoomNumber:number):Observable<object>{
  //   return this.httpClient.post(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/bookedroom/`+RoomNumber);
  // }


  updatedbookedroom(roomnumber:number,availabilty:number):Observable<any>{
    return this.httpClient.post('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/bookedroom/'+roomnumber,availabilty);
  }

  getbookingByname(bookingname:string):Observable<Booking[]>{
    return this.httpClient.get<Booking[]>('https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/bookingbyname/'+bookingname);
  }


  getcustomerById(customerid :number):Observable<Customer>{
    return this.httpClient.get<Customer>(`https://8080-fdedbdfabffebcfbfbfaeedd.project.examly.io/customer/`+customerid);
  }

}
