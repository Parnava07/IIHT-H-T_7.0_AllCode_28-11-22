import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBookComponent } from './components/add-book/add-book.component';
import { GetBooksComponent } from './components/get-books/get-books.component';
import { HomeComponent } from './components/home/home.component';




const routes: Routes = [
  {path:"",component: HomeComponent},
  {path:"add-book",component: AddBookComponent},
  {path:"get-books",component: GetBooksComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
