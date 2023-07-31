import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD

const routes: Routes = [];
=======


const routes: Routes = [];

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

>>>>>>> c78b0e057d0fddb0d072e213281d69fcf07a4cd7

@NgModule({
  imports: [RouterModule.forRoot(routes),BrowserModule,FormsModule,
    HttpClientModule],
  providers: [],
  bootstrap: [AppComponent]
  exports: [RouterModule]
})
export class AppRoutingModule { }
