import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD
import { AppComponent } from './app.component';
import { CustomerComponent } from './user/user.component';
import { PaymentServiceComponent } from './payment-service/payment-service.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { BookingComponent } from './booking-form/booking-form.component';
import { BookingServiceComponent } from './booking-service/booking-service.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import { AdminloginComponent } from './login/adminlogin/adminlogin.component';
import { AdminregisterComponent } from './login/adminregister/adminregister.component';
import { LandingpageComponent } from './login/landingpage/landingpage.component';
import { LoginComponent } from './login/login/login.component';
import { RegisterComponent } from './login/register/register.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard/admin-dashboard.component';
import { DashboardComponent } from './admin-dashboard/pages/dashboard/dashboard.component';
import { ReportsComponent } from './admin-dashboard/pages/reports/reports.component';
import { CustomerServiceComponent } from './admin-dashboard/pages/customer-service/customer-service.component';
import { AdminComponent } from './admin-dashboard/pages/admin/admin.component';
import { SucessComponent } from './user-dashboard/sucess/sucess.component';
import { RoomadminComponent } from './room-service/roomadmin/roomadmin.component';
import { UpdateroomComponent } from './room-service/updateroom/updateroom.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard/user-dashboard.component';
import { CustomerProfileComponent } from './customer-profile/customer-profile.component';
import { PaymentComponent } from './payment/payment.component';
import { RoomcustomerComponent } from './user-dashboard/roomcustomer/roomcustomer.component';
import { BookingComponent } from './booking/booking.component';
import { CancellationComponent } from './cancellation/cancellation.component';

const routes: Routes = [
  {path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'adminregister',component:AdminregisterComponent},
  {path:'',component:LandingpageComponent},
  {path:'admin-dashboard', component:AdminDashboardComponent},
  {path:'user-dashboard',component:UserDashboardComponent},





  {
  path:'admin-dashboard',
  component:AdminDashboardComponent,
  children:[
    {path:'dashboard',component:DashboardComponent},
    {path:'reports',component:ReportsComponent},
    {path:'customer-service',component:CustomerServiceComponent},
    {path:'admin',component:AdminComponent},
    {path:'roomadmin',component:RoomadminComponent},
    {path:'updateroom/:id',component:UpdateroomComponent}
  ]
  },
  {
    path:'user-dashboard',
    component:UserDashboardComponent,
    children:[
      {path:'customer-profile',component:CustomerProfileComponent},
      {path:'payment',component:PaymentComponent},
       {path:'room-customer',component:RoomcustomerComponent} ,
      {path:'booking',component:BookingComponent},
      {path:'sucess',component:SucessComponent},
      {path:'bookings/:bookingId/cancellations',component:CancellationComponent}
    ]
  }
  
=======
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { BookingComponent } from './booking/booking.component';
import { LandingpageComponent } from './landingpage/landingpage.component';

const routes: Routes = [
  {path:"",component:RoomcustomerComponent},
  {path:"admin/rooms",component:RoomadminComponent},
  {path:"rooms",component:RoomcustomerComponent},
  {path:"updateroom/:id",component:UpdateroomComponent},
  {path:"landingpage",component:LandingpageComponent},
  {path:"booking",component:BookingComponent}
>>>>>>> 6345a7a2dcc2f5a67fa01b308865a1d4eb0773f9
];
=======

const routes: Routes = [];
>>>>>>> 53a7fe76ea24bcd7d05a276c5880565f246b0a69
=======

>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c

const routes: Routes = [
  {path:'user',component:CustomerComponent},
  {path:'payment',component:PaymentServiceComponent},
  {path:'bookings/:bookingId/cancellations',component:CancellationComponent},
  {path:'bookingform',component:BookingComponent},
  {path:'bookingservice',component:BookingServiceComponent},
  {path:"rooms",component:RoomcustomerComponent}
];

import { CancellationComponent } from './cancellation/cancellation.component';
import { CustomerComponent } from './customer/customer.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { AdminregisterComponent } from './adminregister/adminregister.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
 
const routes: Routes = [{path:'bookings/:bookingId/cancellations',component:CancellationComponent},
{path: 'component', component: CustomerComponent},{path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'adminregister',component:AdminregisterComponent},
  {path:'',component:LandingpageComponent}];

<<<<<<< HEAD
>>>>>>> 5a514ab984042dff257d7cef947e3162e507ad3d
=======
>>>>>>> c78b0e057d0fddb0d072e213281d69fcf07a4cd7
>>>>>>> 53a7fe76ea24bcd7d05a276c5880565f246b0a69

@NgModule({
  imports: [RouterModule.forRoot(routes),BrowserModule,FormsModule,
    HttpClientModule],
  providers: [],
  bootstrap: [AppComponent]
  exports: [RouterModule]
})
export class AppRoutingModule { }