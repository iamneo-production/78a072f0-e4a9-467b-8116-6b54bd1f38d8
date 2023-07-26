import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoomcustomerComponent } from './roomcustomer/roomcustomer.component';
import { RoomadminComponent } from './roomadmin/roomadmin.component';
import { UpdateroomComponent } from './updateroom/updateroom.component';

import { MatTabsModule } from '@angular/material/tabs';
import { MatButtonModule } from '@angular/material/button';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';

const routes: Routes = [
  {path:"",component:RoomcustomerComponent},
  {path:"roomadmin",component:RoomadminComponent},
  {path:"roomcustomer",component:RoomcustomerComponent},
  {path:"updateroom",component:UpdateroomComponent} 
];

@NgModule({
  declarations: [
    AppComponent,
    RoomcustomerComponent,
    RoomadminComponent,
    UpdateroomComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NoopAnimationsModule,
    MatTabsModule,
    MatButtonModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
