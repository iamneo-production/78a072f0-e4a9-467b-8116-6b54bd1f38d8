import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Booking } from './booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private bookingUrl = 'your_api_endpoint_here'; // Replace 'your_api_endpoint_here' with your actual API endpoint

  constructor(private http: HttpClient) { }

  // Method to send booking data to the server
  bookRoom(bookingData: Booking): Observable<any> {
    return this.http.post(this.bookingUrl, bookingData);
  }
}
