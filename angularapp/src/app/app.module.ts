import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
=======

<<<<<<< HEAD
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { BookingComponent } from './booking/booking.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatOptionModule} from '@angular/material/core';
import {MatLineModule} from '@angular/material/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';

const routes: Routes = [
  {path:'',component:BookingComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent
=======
>>>>>>> 53a7fe76ea24bcd7d05a276c5880565f246b0a69
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';

const routes: Routes = [

];
=======

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
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { CustomerComponent } from './customer/customer.component';


>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
@NgModule({
  declarations: [
    AppComponent

<<<<<<< HEAD
=======
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { CustomerComponent } from './customer/customer.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    CancellationComponent,
<<<<<<< HEAD
    CustomerComponent
>>>>>>> c78b0e057d0fddb0d072e213281d69fcf07a4cd7
>>>>>>> 53a7fe76ea24bcd7d05a276c5880565f246b0a69
=======
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent,
    AdminDashboardComponent,
    CustomerComponent,
    BookingComponent,
    AdminDashboardComponent,
    PaymentComponent,
    SucessComponent,
>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
  ],
  imports: [
    RouterModule,
    BrowserModule,
<<<<<<< HEAD
    FormsModule,
    RouterModule,
    HttpClientModule,
<<<<<<< HEAD
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatTabsModule,
    ReactiveFormsModule,
    NoopAnimationsModule,
    MatButtonModule
],
=======
    AppRoutingModule,
<<<<<<< HEAD
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    MatInputModule,
    MatButtonModule,
    MatFormFieldModule,
    MatOptionModule,
    MatLineModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
=======

    FormsModule,
    HttpClientModule
>>>>>>> c78b0e057d0fddb0d072e213281d69fcf07a4cd7
  ],
>>>>>>> 53a7fe76ea24bcd7d05a276c5880565f246b0a69
  providers: [],
=======
    AppRoutingModule,
     ReactiveFormsModule,
    CommonModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    NgChartsModule,
    ModalModule.forRoot(),
    MatTabsModule,
    MatButtonModule,
    MatCardModule,
    MatSnackBarModule
  ],
  providers: [CustomerService],
>>>>>>> 6120d8a7af0dfc6e0ba75df0003c7fe594d06190
  bootstrap: [AppComponent]
})

export class AppModule { }

