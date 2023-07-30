import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
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
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
