import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/Todo';

import {Store,select} from '@ngrx/store';

@Component({
  selector: 'app-todocomponent',
  templateUrl: './todocomponent.component.html',
  styleUrls: ['./todocomponent.component.css']
})
export class TodocomponentComponent implements OnInit {

  todos : Todo[];

  constructor(private store:Store<{todos : Todo[]}>) {
    store.pipe(select('todos')).subscribe((values) => {
      this.todos=values;
      console.log(values);
      
    });
   }

  ngOnInit(): void {
  }

}
