import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CancellationComponent } from './cancellation/cancellation.component';
import { CustomerComponent } from './customer/customer.component';

const routes: Routes = [{path:'bookings/:bookingId/cancellations',component:CancellationComponent},
{path: 'component', component: CustomerComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
