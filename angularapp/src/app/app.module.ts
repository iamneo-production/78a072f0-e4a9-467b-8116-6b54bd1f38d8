import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD

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

=======
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';

import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { BookingComponent } from './booking/booking.component';
import { LandingpageComponent } from './landingpage/landingpage.component';

const routes: Routes = [
  {path:"",component:RoomcustomerComponent},
  {path:"roomadmin",component:RoomadminComponent},
  {path:"roomcustomer",component:RoomcustomerComponent},
  {path:"updateroom",component:UpdateroomComponent},
  {path:"booking",component:BookingComponent},
  {path:"landingpage",component:LandingpageComponent}
];
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
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
  
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { AdminregisterComponent } from './adminregister/adminregister.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';


const routes:Routes = [
  {path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'adminregister',component:AdminregisterComponent},
  {path:'',component:LandingpageComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    LandingpageComponent,
    AdminregisterComponent,
    AdminloginComponent,
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),

import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { CustomerComponent } from './customer/customer.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    CancellationComponent,
    CustomerComponent
=======
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent,
    BookingComponent,
    LandingpageComponent
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
<<<<<<< HEAD
    FormsModule,
    RouterModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatTabsModule,
    ReactiveFormsModule
=======

    FormsModule,
    HttpClientModule
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d
=======
    HttpClientModule,
    FormsModule,
    NoopAnimationsModule,
    MatTabsModule,
    MatButtonModule,
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }

