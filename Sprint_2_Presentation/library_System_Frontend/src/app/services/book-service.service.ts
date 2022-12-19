import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:5000';

  public addBook(bookData) {
    return this.http.post(this.API + '/add/book', bookData);
  }

  public getBooks() {
    return this.http.get(this.API + '/allbooks');
  }

  public deleteBook(id: any) {
    return this.http.delete(this.API + '/remove/' + id);
  }
}
