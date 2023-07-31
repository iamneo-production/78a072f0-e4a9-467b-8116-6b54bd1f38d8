<<<<<<< HEAD
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
=======
import { Component } from '@angular/core';
import { HttpClient} from '@angular/common/http';
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent {
<<<<<<< HEAD
  value:any;
=======
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
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
<<<<<<< HEAD


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
  
  }
  
  else{
    return console.error("invalid action");
    
  }
}
=======
  // numberOfGuests = [1, 2, 3, 4, 5];


constructor(private http: HttpClient) { }

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
  const url = `http://localhost:8080/bookings`;
  this.http.post(url, this.booking)
  //   .subscribe(createdUser => {
  //     console.log('User created:', createdUser);
  //   });
}

>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
}
