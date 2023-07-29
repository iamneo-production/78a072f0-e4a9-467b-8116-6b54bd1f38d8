import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
  value:any;
  title = 'booking1';
  user:any={};
  eid:number=1;
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


constructor(private http: HttpClient,private router:Router) { }

onSubmit(value:any): void {
  if(value===true){
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
      
  }
    this.router.navigate(['/payment']);
  }
  
  else{
    return console.error("invalid action");
    
  }
  // const url = `http://localhost:8080/bookings`;
  // this.http.post(url, this.booking)
  //   .subscribe(createdUser => {
  //     console.log('User created:', createdUser);
  //   });
}
}
