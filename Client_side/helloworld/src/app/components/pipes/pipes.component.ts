import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  employee ={
    "Name":"Lewis Hamilton",
    "BaseSalary":60000,
    "JoinedOn":Date.now(),
    "Qualification":"B-Tech",
    "About":"Developer and an artist as well as a founder of an NGO.Passion is to become a footballer",
    "WinningPercentage":45/100
  }

  constructor() { }

  ngOnInit(): void {
  }

}
