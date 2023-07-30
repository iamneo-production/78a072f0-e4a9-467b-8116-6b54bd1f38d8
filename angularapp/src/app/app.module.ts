import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';

import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { CustomerComponent } from './customer/customer.component';
import { CancellationComponent } from './cancellation/cancellation.component';
import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { AppRoutingModule } from './app-routing.module';
import { BookingComponent } from './booking/booking.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerServiceComponent } from './customer-service/customer-service.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NotificationComponent } from './notification/notification.component';
import { ReportComponent } from './report/report.component';
import { HistoryComponent } from './history/history.component';
import { AdminhistoryComponent } from './admin-history/admin-history.component';
import { PaymentComponent } from './payment/payment.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminregisterComponent } from './adminregister/adminregister.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { LandingpageComponent } from './landingpage/landingpage.component';



@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent,
    CancellationComponent,
    BookingComponent,
    AdminDashboardComponent,
    AdminComponent,
    CustomerServiceComponent,
    DashboardComponent,
    NotificationComponent,
    ReportComponent,
    AdminhistoryComponent,
    HistoryComponent,
    PaymentComponent,
    UserDashboardComponent,
    AdminloginComponent,
    AdminregisterComponent,
    LoginComponent,
    RegisterComponent,
    LandingpageComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,

    NoopAnimationsModule,
    MatTabsModule,
    MatButtonModule,
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
