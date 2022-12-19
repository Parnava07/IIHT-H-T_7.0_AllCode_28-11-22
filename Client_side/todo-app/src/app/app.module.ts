import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StoreModule } from '@ngrx/store';
import { TodoReducer } from './reducers/todo.reducer';
import { TodocomponentComponent } from './components/todocomponent/todocomponent.component';
import { AddtodocomponentComponent } from './components/addtodocomponent/addtodocomponent.component';

@NgModule({
  declarations: [
    AppComponent,
    TodocomponentComponent,
    AddtodocomponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StoreModule.forRoot({todos:TodoReducer}) //variable -todos and todoreducer is coming from todo.reducer.ts
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
