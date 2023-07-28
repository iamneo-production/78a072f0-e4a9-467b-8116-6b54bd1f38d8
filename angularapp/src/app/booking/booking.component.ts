import { Component } from '@angular/core';
import { HttpClient} from '@angular/common/http';

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
  this.http.post(url,booking)
  //   .subscribe(createdUser => {
  //     console.log('User created:', createdUser);
  //   });
}

}
