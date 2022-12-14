import { Component, OnInit } from '@angular/core';
import User from 'src/app/entity/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-reg-users',
  templateUrl: './reg-users.component.html',
  styleUrls: ['./reg-users.component.css']
})
export class RegUsersComponent implements OnInit {

  users :User[] = [];

  constructor(private userService:UserService) { }

  sort(){
    this.users.sort((user1,user2) =>{
      return user1.age-user2.age;
    })
  }

  deleteRow(user, index){
    const observables = this.userService.deleteUsers(user);
    observables.subscribe((response:any)=>{
      console.log(response);
      this.users.splice(index,1);
    })
  }

  ngOnInit(): void {
    const promise = this.userService.getUsers();
    promise.subscribe((response)=>{
      console.log(response);
      this.users=response as User[];  
    })
  }

}
