import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

<<<<<<< HEAD
const routes: Routes = [];
=======
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ReportsComponent } from './pages/reports/reports.component';
import { AdminComponent } from './pages/admin/admin.component';
import { NotificationComponent } from './pages/notification/notification.component';
import { CustomerServiceComponent } from './pages/customer-service/customer-service.component';
import { RoomadminComponent } from './room-service/roomadmin/roomadmin.component';
import { UpdateroomComponent } from './room-service/updateroom/updateroom.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';

const routes: Routes = [
  {path:'',component:DashboardComponent},
  {path:'dashboard',component:DashboardComponent},
  {path:'reports',component:ReportsComponent},
  {path:'admin',component:AdminComponent},
  {path:'notification',component:NotificationComponent},
  { path:'customer-service', component: CustomerServiceComponent },
  {path:'roomadmin',component:RoomadminComponent},
  {path:'updateroom/:id',component:UpdateroomComponent}
  {path:'bookings/:bookingId/cancellations',component:CancellationComponent},
  {path:"",component:RoomcustomerComponent},
  {path:"admin/rooms",component:RoomadminComponent},
  {path:"rooms",component:RoomcustomerComponent},
  {path:"updateroom/:id",component:UpdateroomComponent},
  {path: '', redirectTo: '/hotel-rooms', pathMatch: 'full' },  

];
>>>>>>> f33740ef39940d9c8a55672afe185f13c71bd61a

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
<<<<<<< HEAD
export class AppRoutingModule { }
=======

export class AppRoutingModule { }


>>>>>>> f33740ef39940d9c8a55672afe185f13c71bd61a
