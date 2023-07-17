import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ReportsComponent } from './pages/reports/reports.component';
import { AdminComponent } from './pages/admin/admin.component';
import { NotificationComponent } from './pages/notification/notification.component';
import { CustomerServiceComponent } from './pages/customer-service/customer-service.component';
import { RoomadminComponent } from './room-service/roomadmin/roomadmin.component';
import { UpdateroomComponent } from './room-service/updateroom/updateroom.component';


const routes: Routes = [
  {path:'',component:DashboardComponent},
  {path:'dashboard',component:DashboardComponent},
  {path:'reports',component:ReportsComponent},
  {path:'admin',component:AdminComponent},
  {path:'notification',component:NotificationComponent},
  { path:'customer-service', component: CustomerServiceComponent },
  {path:'roomadmin',component:RoomadminComponent},
  {path:'updateroom/:id',component:UpdateroomComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }