import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { CustomerComponent } from './customer/customer.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent,

=======
import { CancellationComponent } from './cancellation/cancellation.component';
import { CustomerComponent } from './customer/customer.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    CancellationComponent,
    CustomerComponent
>>>>>>> 1fa8947874b612d1a794b45ec05fb4d5bd764111
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
<<<<<<< HEAD
    HttpClientModule,
    FormsModule,
    NoopAnimationsModule,
    
],
=======
    FormsModule,
    HttpClientModule
  ],
>>>>>>> 1fa8947874b612d1a794b45ec05fb4d5bd764111
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
