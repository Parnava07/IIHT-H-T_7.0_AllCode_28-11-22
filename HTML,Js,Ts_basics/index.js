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
