import { Component, OnInit } from '@angular/core';
import { BookService} from 'src/app/services/book.service';



@Component({
  selector: 'app-get-books',
  templateUrl: './get-books.component.html',
  styleUrls: ['./get-books.component.css']
})
export class GetBooksComponent implements OnInit {

  bookDetails = null;
  constructor(private bookService: BookService) { }

  
  getAllBooks() {
    this.bookService.getBooks().subscribe(
      (resp) => {
        console.log(resp);
        this.bookDetails = resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  deleteBook(book: any){
    this.bookService.deleteBook(book.id).subscribe(
      (resp) => {
        console.log(resp);
        this.getAllBooks();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }

}
