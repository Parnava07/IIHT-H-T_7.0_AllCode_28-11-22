import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { BookService } from 'src/app/services/book.service';



@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private bookService: BookService) { }

  registerForm = new FormGroup({
    book_name: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    book_author: new FormControl("",[Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    book_price: new FormControl("", [Validators.required, Validators.pattern("^[0-9]+(\.[0-9]+)?$")]),
    book_genre: new FormControl("", [Validators.required, Validators.pattern("^[a-zA-Z ]*$")]),
    borrowed_status: new FormControl("",[Validators.required])
  });

  get BookName(): FormControl{
    return this.registerForm.get("book_name") as FormControl;
  }
  get BookAuthor(): FormControl{
    return this.registerForm.get("book_author") as FormControl;
  }
  get BookPrice(): FormControl{
    return this.registerForm.get("book_price") as FormControl;
  }
  get BookGenre(): FormControl{
    return this.registerForm.get("book_genre") as FormControl;
  }
  get BorrowedStatus(): FormControl{
    return this.registerForm.get("borrowed_status") as FormControl;
  }

  register(registerForm: FormGroup) {
    console.log(this.registerForm.valid);
    this.bookService.addBook(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }

}
