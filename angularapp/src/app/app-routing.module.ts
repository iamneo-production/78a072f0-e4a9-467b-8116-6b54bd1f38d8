import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { CustomerComponent } from './customer/customer.component';

const routes: Routes = [
  {path: 'component', component: CustomerComponent},
  {path:"",component:RoomcustomerComponent},
  {path:"admin/rooms",component:RoomadminComponent},
  {path:"rooms",component:RoomcustomerComponent},
  {path:"updateroom/:id",component:UpdateroomComponent},
  {path: '', redirectTo: '/hotel-rooms', pathMatch: 'full' },  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
