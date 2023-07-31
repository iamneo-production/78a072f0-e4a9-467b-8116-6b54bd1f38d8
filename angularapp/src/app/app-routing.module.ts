import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { RegisterComponent } from './register/register.component';
import { AdminregisterComponent } from './adminregister/adminregister.component';
import { LoginComponent } from './login/login.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { BookingComponent } from './booking/booking.component';
import { PaymentComponent } from './payment/payment.component';
import { CustomerServiceComponent } from './customer-service/customer-service.component';
import { ReportComponent } from './report/report.component';
import { NotificationComponent } from './notification/notification.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { AuthService } from './auth.service';



const routes: Routes = [
  {path:'', redirectTo:'/login',pathMatch:'full'},
  {path:'landingpage',component:LandingpageComponent,canActivate:[AuthService]},
  {path:'register',component:RegisterComponent,canActivate:[AuthService]},
  {path:'adminregister',component:AdminregisterComponent,canActivate:[AuthService]},
  {path:'login',component:LoginComponent,canActivate:[AuthService]},
  {path:'adminlogin',component:AdminloginComponent,canActivate:[AuthService]},
  {path:'dashboard',component:DashboardComponent,canActivate:[AuthService]},
  {path:'admin',component:AdminComponent,canActivate:[AuthService]},
  {path: 'component', component: CustomerComponent,canActivate:[AuthService]},
  {path:"admin/rooms",component:RoomadminComponent,canActivate:[AuthService]},
  {path:"rooms",component:RoomcustomerComponent},
  {path:"updateroom/:id",component:UpdateroomComponent,canActivate:[AuthService]},
  {path:'cancellations',component:CancellationComponent,canActivate:[AuthService]}, 
  {path:'booking',component:BookingComponent,canActivate:[AuthService]},
  {path:'payment', component:PaymentComponent,canActivate:[AuthService]},
  { path:'customer-service', component: CustomerServiceComponent,canActivate:[AuthService] },
  {path:'report',component:ReportComponent,canActivate:[AuthService]},
  {path:'notification',component:NotificationComponent,canActivate:[AuthService]},
 {path: 'user-dashboard', component: UserDashboardComponent,canActivate:[AuthService]},
  
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
