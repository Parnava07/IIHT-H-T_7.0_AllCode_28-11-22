import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import Book from 'src/app/models/book';
import { BookService } from 'src/app/services/book.service';



@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  book: Book = new Book();

  constructor(private bookService: BookService) {}

  registerForm = new FormGroup({
    bookName: new FormControl("", [Validators.required, Validators.pattern("^[a-z0-9A-Z ]*$")]),
    authorName: new FormControl("",[Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    price: new FormControl("", [Validators.required, Validators.pattern("^[0-9]+(\.[0-9]+)?$")]),
    genre: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    borrowed: new FormControl("",[Validators.required])
  });

  get BookName(): FormControl{
    return this.registerForm.get("bookName") as FormControl;
  }
  get BookAuthor(): FormControl{
    return this.registerForm.get("authorName") as FormControl;
  }
  get BookPrice(): FormControl{
    return this.registerForm.get("price") as FormControl;
  }
  get BookGenre(): FormControl{
    return this.registerForm.get("genre") as FormControl;
  }
  get BorrowedStatus(): FormControl{
    return this.registerForm.get("borrowed") as FormControl;
  }


  ngOnInit(): void {
  }

  createBook(registerForm:any) {
    const observables = this.bookService.addBook(registerForm.value);
    observables.subscribe(
      (res: any) => {
        console.log(res);
        this.registerForm.reset();
      }, function (error) {
        console.log(error);
        alert("Something went wrong !, Please try again");
      }
    )
  }

}
