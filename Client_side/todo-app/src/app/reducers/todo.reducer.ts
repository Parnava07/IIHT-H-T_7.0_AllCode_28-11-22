import { ActionParent } from "../actions/todo.action";
import { Todo } from "../models/Todo";

const initialState:Todo []=[
    {title:"title1"},
    {title:"title2"},
    {title:"title3"}
];

export function TodoReducer(state= initialState,action:ActionParent){
    switch(action.type){
        default:return state;
    }
}