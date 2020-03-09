import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MasterComponent} from "./master/master.component";
import {DetailsComponent} from "./details/details.component";

const routes: Routes = [
  {
    path: "master", component: MasterComponent, pathMatch: 'full'
  },
  {
    path: "details", component: DetailsComponent, pathMatch: 'full'
  },
  {
    path: "**", redirectTo: "/master", pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
