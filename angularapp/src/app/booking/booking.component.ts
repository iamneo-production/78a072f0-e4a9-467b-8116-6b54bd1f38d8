import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
  title = 'booking1';
  user:any={};
  booking = {
    roomType: '',
    checkInDate: '',
    checkOutDate: '',
    guests: 1,
    preferences: ''
  };

  roomTypes = ['Standard', 'Deluxe', 'Suite'];
  numberOfGuests = [1, 2, 3, 4, 5];


constructor(private http: HttpClient) { }

onSubmit(): void {
  const url = 'http://localhost:8080/user';
  this.http.post(url, this.user)
    .subscribe(createdUser => {
      console.log('User created:', createdUser);
      
    });
}
}
