import { Component, OnInit } from '@angular/core';
import User from 'src/app/entity/user';

@Component({
  selector: 'app-user-forms',
  templateUrl: './user-forms.component.html',
  styleUrls: ['./user-forms.component.css']
})
export class UserFormsComponent implements OnInit {

  title: String = 'Please Fill the below form';

  user: User = new User();

  save(){
    console.log('Hello ' + this.user.firstname + '' +
    this.user.lastname);
    console.log('Your Email Id is ' + this.user.email);   
  }

  constructor() { }

  ngOnInit(): void {
  }

}
