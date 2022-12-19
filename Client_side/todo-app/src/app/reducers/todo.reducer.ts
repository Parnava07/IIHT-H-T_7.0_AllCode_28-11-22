import { ActionParent } from "../actions/todo.action";
import { Todo } from "../models/Todo";
import { TodoActionType } from "../shared/todo-action-types.enum";

const initialState:Todo []=[
    {title:"title1"},
    {title:"title2"},
    {title:"title3"}
];

export function TodoReducer(state= initialState,action:ActionParent){
    switch(action.type){
        case TodoActionType.Add:
        return [...state,action.payload]
        default:return state;
    }
}