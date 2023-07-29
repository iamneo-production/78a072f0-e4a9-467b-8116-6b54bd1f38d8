import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { CustomerComponent } from './customer/customer.component';
import { CancellationComponent } from './cancellation/cancellation.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent,
    CancellationComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NoopAnimationsModule,
    
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
