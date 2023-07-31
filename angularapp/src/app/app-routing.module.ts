import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
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
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
