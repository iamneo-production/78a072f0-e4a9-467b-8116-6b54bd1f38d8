<<<<<<< HEAD
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

=======
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d
@Injectable({
  providedIn: 'root'
})
export class CancellationService {
<<<<<<< HEAD
  private baseUrl = "https://8080-aeadcaeeecbffebcfbfbfaeedd.project.examly.io/";
=======
  private baseUrl = 'https://8080-dfabcadabfbffebceaeaadbdbabf.project.examly.io';
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d

  constructor(private httpclient: HttpClient) { }

  createCancellation(bookingId: number, cancellation: any): Observable<any> {
    const url = `${this.baseUrl}/bookings/${bookingId}/cancellations`;
    return this.httpclient.post<any>(url, cancellation);
  }

  getAllCancellations(bookingId: number): Observable<any[]> {
    const url = `${this.baseUrl}/bookings/${bookingId}/cancellations`;
    return this.httpclient.get<any[]>(url);
  }

  updateCancellation(bookingId: number, cancellationId: number, cancellation: any): Observable<any> {
    const url = `${this.baseUrl}/bookings/${bookingId}/cancellations/${cancellationId}`;
    return this.httpclient.put<any>(url, cancellation);
  }

  deleteCancellation(bookingId: number, cancellationId: number): Observable<any> {
    const url = `${this.baseUrl}/bookings/${bookingId}/cancellations/${cancellationId}`;
    return this.httpclient.delete(url);
  }
}
