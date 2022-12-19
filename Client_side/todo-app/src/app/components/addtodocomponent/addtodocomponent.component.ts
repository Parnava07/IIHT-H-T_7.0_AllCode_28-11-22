import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/Todo';
import { Store } from '@ngrx/store';
import { TodoAdd } from 'src/app/actions/todo.action';


@Component({
  selector: 'app-addtodocomponent',
  templateUrl: './addtodocomponent.component.html',
  styleUrls: ['./addtodocomponent.component.css']
})
export class AddtodocomponentComponent implements OnInit {

  constructor(private store:Store<{todos:Todo[]}>) { }

  AddTodo(todo:string){
    const newTodo=new Todo();
    newTodo.title=todo;
    this.store.dispatch(new TodoAdd(newTodo))
  }

 

  ngOnInit(): void {
  }

}
