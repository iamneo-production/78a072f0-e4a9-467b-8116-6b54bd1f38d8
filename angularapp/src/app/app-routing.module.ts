import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { PaymentServiceComponent } from './payment-service/payment-service.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { BookingServiceComponent } from './booking-service/booking-service.component';
import { RoomDetailsComponent} from './room-details/room-details.component';
import { MyBookingComponent } from './my-booking/my-booking.component';

const routes: Routes = [
  {path:'user',component:UserComponent},
  {path:'payment',component:PaymentServiceComponent},
  {path:'cancel',component:CancellationComponent},
  {path:'bookingform',component:BookingFormComponent},
  {path:'bookingservice',component:BookingServiceComponent},
  {path:'room',component:RoomDetailsComponent},
  {path:'mybooking',component:MyBookingComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }