import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-forms',
  templateUrl: './user-forms.component.html',
  styleUrls: ['./user-forms.component.css']
})
export class UserFormsComponent implements OnInit {

  title: String = 'Please Fill the below form';

  firstname: String ='';
  lastname: String ='';
  age = 0;
  email: String ='';
  gender: String ='male';

  save(){
    console.log('Hello ' + this.firstname + '' +
    this.lastname);
    console.log('Your Email Id is ' + this.email);   
  }

  constructor() { }

  ngOnInit(): void {
  }

}
