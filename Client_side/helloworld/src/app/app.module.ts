import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { UserFormsComponent } from './components/user-forms/user-forms.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { AboutComponent } from './components/about/about.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HttpClientModule } from '@angular/common/http';
import { RegUsersComponent } from './components/reg-users/reg-users.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { EllipsisPipe } from './pipe/ellipsis.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UserFormsComponent,
    NavbarComponent,
    AboutComponent,
    ContactusComponent,
    RegUsersComponent,
    PipesComponent,
    EllipsisPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NoopAnimationsModule,
    MatListModule,
    MatMenuModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
