import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CustomerComponent } from './user/user.component';
import { PaymentServiceComponent } from './payment-service/payment-service.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { BookingServiceComponent } from './booking-service/booking-service.component';
import { MyBookingComponent } from './my-booking/my-booking.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';

const routes: Routes = [
  {path:'user',component:CustomerComponent},
  {path:'payment',component:PaymentServiceComponent},
  {path:'bookings/:bookingId/cancellations',component:CancellationComponent},
  {path:'bookingform',component:BookingFormComponent},
  {path:'bookingservice',component:BookingServiceComponent},
  {path:"rooms",component:RoomcustomerComponent},
  {path:'mybooking',component:MyBookingComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }