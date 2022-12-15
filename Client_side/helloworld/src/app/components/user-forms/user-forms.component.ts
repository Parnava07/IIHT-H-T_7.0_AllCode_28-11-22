import { Component, OnInit } from '@angular/core';
import User from 'src/app/entity/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-forms',
  templateUrl: './user-forms.component.html',
  styleUrls: ['./user-forms.component.css']
})
export class UserFormsComponent implements OnInit {

  title: String = 'Please Fill the below form';

  user: User = new User();

  save() {
    const observables = this.userService.saveUser(this.user);
    observables.subscribe(
      (response: any) => {
        console.log(response);

      }, function (error) {
        console.log(error);
        alert("Something went wrong, Please try again!")
      }
    )
    // console.log('Hello ' + this.user.firstname + '' +
    // this.user.lastname);
    // console.log('Your Email Id is ' + this.user.email);   
  }

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }

}
