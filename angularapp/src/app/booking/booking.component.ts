import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { BookingService } from '../booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
  title = 'booking1';
  user:any={};
  id:number=1;
  booking = {
    name:'',
    email:'',
    phone:'',
    roomType: '',
    checkInDate: '',
    checkOutDate: '',
    guests: '',
    preferences: ''
  };

  roomTypes = ['Standard Queen','Standard King', 'Standard','Deluxe','Super Deluxe','Deluxe','Suites'];
  // numberOfGuests = [1, 2, 3, 4, 5];

constructor(private http: HttpClient, private bookingservice:BookingService, private router:Router) { }

onSubmit(): void {
  console.log(this.booking)
  const booking = {
    name: this.user.name,
    email: this.user.email,
    phone: this.user.phone,
    roomType: this.user.roomType,
    checkInDate: this.user.checkInDate,
    checkOutDate: this.user.checkOutDate,
    guests: this.user.guests,
    preferences: this.user.preferences
  };
  console.log(booking);
  const url = `https://8080-fdedbdfabffebceaeaadbdbabf.project.examly.io/bookings`;
  this.http.post(url,booking)
  //   .subscribe(createdUser => {
  //     console.log('User created:', createdUser);
  //   });
}

}
