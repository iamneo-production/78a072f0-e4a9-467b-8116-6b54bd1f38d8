import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { ReportsComponent } from './pages/reports/reports.component';
import { AdminComponent } from './pages/admin/admin.component';
import { NotificationComponent } from './pages/notification/notification.component';
import { CustomerServiceComponent } from './pages/customer-service/customer-service.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CustomerService } from './customer.service';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {MatTabsModule} from '@angular/material/tabs';
import { RoomadminComponent } from './room-service/roomadmin/roomadmin.component';
import { UpdateroomComponent } from './room-service/updateroom/updateroom.component';
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { CancellationComponent } from './cancellation/cancellation.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    ReportsComponent,
    AdminComponent,
    NotificationComponent,
    CustomerServiceComponent;
    UpdateroomComponent,
    CancellationComponent,
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent
   
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule,
    ReactiveFormsModule,
    CommonModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
     MatButtonModule,
    MatCardModule,
    BrowserModule,
    AppRoutingModule,
    NoopAnimationsModule,
    MatTabsModule,
    MatButtonModule,
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
