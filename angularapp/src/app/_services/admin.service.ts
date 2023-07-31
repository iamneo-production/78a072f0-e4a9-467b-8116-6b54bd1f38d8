import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  private baseUrl = 'http://localhost:8080'; // Adjust the URL to match your backend server address
  isAuthenticated: boolean | undefined;

  constructor(private http: HttpClient) { }

  adminLogin(email: string, password: string): Observable<any> {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    const body = { username: email, password: password };
    return this.http.post(`${this.baseUrl}/adminlogin`, body, { headers: headers });
  }

  adminRegister(name: string, email: string, password: string): Observable<any> {
    const admin = {
      username: name,
      password: password,
      email: email
    };
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this.http.post(`${this.baseUrl}/adminregister`, admin, { headers: headers });
  }
  canAuthenticate(): boolean {
    // Implement your authentication logic here.
    // For example, you might have an authentication token stored in localStorage or a session variable.
    // Check if the user is logged in and has admin privileges.
    // Return true if authentication succeeds, otherwise return false.
    
    // For simplicity, let's assume you have a token stored in localStorage after successful login
    const authToken = localStorage.getItem('adminAuthToken');

    // Your authentication and authorization checks
    if (authToken) {
      // Perform additional checks if needed (e.g., check if the token is still valid, etc.)
      // ...

      this.isAuthenticated = true;
    } else {
      this.isAuthenticated = false;
    }

    return this.isAuthenticated;
  }
}
