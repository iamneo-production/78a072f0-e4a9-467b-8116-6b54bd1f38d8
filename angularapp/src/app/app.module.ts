import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AdminloginComponent } from './login/adminlogin/adminlogin.component';
import { AdminregisterComponent } from './login/adminregister/adminregister.component';
import { LandingpageComponent } from './login/landingpage/landingpage.component';
import { LoginComponent } from './login/login/login.component';
import { RegisterComponent } from './login/register/register.component';
import { FormsModule } from '@angular/forms';
import { RouterModule,Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { SucessComponent } from './user-dashboard/sucess/sucess.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard/admin-dashboard.component';
import { DashboardComponent } from './admin-dashboard/pages/dashboard/dashboard.component';
import { ReportsComponent } from './admin-dashboard/pages/reports/reports.component';
import { CustomerServiceComponent } from './admin-dashboard/pages/customer-service/customer-service.component';
import { PaymentComponent } from './payment/payment.component';
import { AdminComponent } from './admin-dashboard/pages/admin/admin.component';
import { RoomadminComponent } from './room-service/roomadmin/roomadmin.component';
import { UpdateroomComponent } from './room-service/updateroom/updateroom.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTabsModule} from '@angular/material/tabs';
import { UserDashboardComponent } from './user-dashboard/user-dashboard/user-dashboard.component';
import { RoomcustomerComponent } from './user-dashboard/roomcustomer/roomcustomer.component';
import { CustomerProfileComponent } from './customer-profile/customer-profile.component';
import { BookingComponent } from './booking/booking.component';
import { CancellationComponent } from './cancellation/cancellation.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    AdminregisterComponent,
    LandingpageComponent,
    LoginComponent,
    RegisterComponent,
    SucessComponent,
    AdminDashboardComponent,
    AdminComponent,
    PaymentComponent,
    DashboardComponent,
    CustomerServiceComponent,
    ReportsComponent,
    RoomadminComponent,
    UpdateroomComponent,
    UserDashboardComponent,
    RoomcustomerComponent,
    CustomerProfileComponent,
    BookingComponent,
    CancellationComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatTabsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
