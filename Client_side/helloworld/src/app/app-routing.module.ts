import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HomeComponent } from './components/home/home.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { RegUsersComponent } from './components/reg-users/reg-users.component';
import { UserFormsComponent } from './components/user-forms/user-forms.component';

const routes: Routes = [{path:"",component:HomeComponent},{path:"register", component:UserFormsComponent},
{path:"about", component:AboutComponent},{path:"contact", component:ContactusComponent},{path:"reg",
component:RegUsersComponent},{path:"pipe", component:PipesComponent}]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
