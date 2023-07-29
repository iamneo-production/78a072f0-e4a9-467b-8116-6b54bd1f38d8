import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CancellationService {
  private baseUrl = 'http://localhost:8080';

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
