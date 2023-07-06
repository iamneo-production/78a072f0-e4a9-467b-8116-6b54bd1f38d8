import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CancellationComponent } from './cancellation/cancellation.component';

const routes: Routes = [{path:"canellation",component:CancellationComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
