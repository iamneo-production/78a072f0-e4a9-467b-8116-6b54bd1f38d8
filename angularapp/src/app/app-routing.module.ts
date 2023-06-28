import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CancelByIdComponent } from './cancel-by-id/cancel-by-id.component';

const routes: Routes = [{path:"cancel-by-id",component:CancelByIdComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
