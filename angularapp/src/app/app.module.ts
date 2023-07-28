import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CustomerService } from './customer.service';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { CustomerComponent } from './user/user.component';
import { BookingServiceComponent } from './booking-service/booking-service.component';
import { BookingComponent } from './booking-form/booking-form.component';
import { PaymentServiceComponent } from './payment-service/payment-service.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { MyBookingComponent } from './my-booking/my-booking.component';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';


@NgModule({
  declarations: [
   AppComponent,
   CustomerComponent,
   BookingServiceComponent,
   BookingComponent,
   PaymentServiceComponent,
   CancellationComponent,
   RoomcustomerComponent,
   MyBookingComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule,
    ReactiveFormsModule,
    CommonModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    MatTabsModule,
    MatButtonModule
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
