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



const routes: Routes = [
  {path:'', redirectTo:'/login',pathMatch:'full'},
  {path:'landingpage',component:LandingpageComponent},
  {path:'register',component:RegisterComponent},
  {path:'adminregister',component:AdminregisterComponent},
  {path:'login',component:LoginComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'dashboard',component:DashboardComponent},
  {path:'admin',component:AdminComponent},
  {path: 'component', component: CustomerComponent},
  {path:"admin/rooms",component:RoomadminComponent},
  {path:"rooms",component:RoomcustomerComponent},
  {path:"updateroom/:id",component:UpdateroomComponent},
  {path:'cancellations',component:CancellationComponent}, 
  {path:'booking',component:BookingComponent},
  {path:'payment', component:PaymentComponent},
  { path:'customer-service', component: CustomerServiceComponent },
  {path:'report',component:ReportComponent},
  {path:'notification',component:NotificationComponent},
 {path: 'user-dashboard', component: UserDashboardComponent},
  
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
