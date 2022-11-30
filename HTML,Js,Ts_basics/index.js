var name = "Parnava"
var age = 25; //define a variable
console.log(name);
var isGraduate = true;
var laptop;
laptop = "lg";

function alertUser() {
    var favChips = "Lays Green" //this variable is defined and destroyed inside function 
    //itself so it cant be accessed outside
    alert("this user has logged in " + name);

}
alertUser();
//console.log(favChips);

//if, else, else if statements
function operators(num) {
    if (num > 20) {
        console.log("The number is greater than 20");
    }
    else if (num == 20) {
        console.log("The number is equal to 20");
    }
    else {
        console.log("The number is smaller than  20");
    }      
}
operators(86);

function creditScore(score){
    var creditLimit;
    switch(score) {
        case 800: creditLimit="Above 1 Lac";
        break;
        case 700: creditLimit="50000 - 1 Lac";
        break;
        case 600: creditLimit="10000 - 25000";
        break;
        default: creditLimit="Not Eligible";
    }
    console.log(creditLimit);
}
creditScore(800);

function counting(){
    for (let i = 1; i < 10; i++) {
        console.log(i);;
        
    }
}
counting(10);

var car = new Object();
car.brand ="Mercedes"
car.model ="C class"
car.price = 6000000

//console.log(car);
console.log(car.brand + " " + car.model + " ");

var names =["Parnava","Sayan","Babai"];
console.log(names);

//constructor
//let Car = class{}
class Car{
    //initiate any object

    constructor(brand, modelName, price){
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
    }
        print(){
            console.log("This is a :" + this.brand + " "+ 
            this.modelName + " which costs :" + this.price);
        }
    
}
var C1 = new Car("Mercedes", "A class", 4000000);
var C2 = new Car("BMW", "S class", 5000000);
C1.print();
C2.print();


class TodaysDate extends Date{ //example to make a class child class of a inbuild js class

    constructor(){
        super();
    }
    printDate(){
        console.log(this.getDate());
    }
}
let today = new TodaysDate();
today.printDate();

class AppleLaptops{ //Parent class
    constructor(brand){
        this.brand = "Apple";
    }
}
class MacBookPro extends AppleLaptops{ //child class
    constructor(model,processor,ram){
        super();
        this.model = model;
        this.processor = processor;
        this.ram = ram;

    }
}

let l1 = new MacBookPro("2021 15' MacBook Pro", "i7" , 16)
console.log(l1.brand + " " + l1.model + " " +l1.processor + " " + l1.ram);


let fruits = ["Apple","Banana","Pineapple"]

let seasonalFruits = ["Mango","Litchi"]

let allFruits = [...fruits, ...seasonalFruits]; // ... is a spread operator copies all elements of  
                                                // the array and named after the use of ...
console.log(allFruits);


//concept of arrow function is introduced
//conventional method

let count = () => {
    for (let i = 1; i < 5; i++) {
        console.log(i);
        
    }
}
count();

//there are 3 ways of declaring variable in JS
//var keyword- > this has a scope of function,it can be re declared

var num1 = 100;
var num2 = 200;
console.log(num1);

//let keyword->announced with es6, has a block scope , variable declare using let cant redeclare

let a = 100
function addNumbers(){
    a = 230;
    let b= 100;
    console.log(a+b);
}

addNumbers();
console.log(a + 1000);

//const -> It stands for constant so u cant change value directly, this also has scope of block

function addNumbers1(){
    const num2 = 250;
}

addNumbers1();
console.log(num2+100);

//Abstract function
function dogs(){
    this.dogName="Lab"
    throw new error("This is not a wild dog");
}

dogs.prototype.display = function(){
    return "This dog breed is :" + this.dogName;
}

//constructor function
function animal(dogName){
    this.dogName = dogName
}
//create an obj without using constructor
animal.prototype =Object.create(dogs.prototype)
let tommy = new animal("Sppech")
console.log(tommy.display());


