import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const BASE_URL = 'http://localhost:5000';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }


  addBook(book:any) {
    return this.http.post(BASE_URL + "/add/book", book);
  }

  //get all books
  getAllBooks() {
    return this.http.get(BASE_URL + "/allbooks");
  }

  //delete book
  deleteBook(id: any) {
    return this.http.delete(BASE_URL + "/remove/" + id);
  }
}