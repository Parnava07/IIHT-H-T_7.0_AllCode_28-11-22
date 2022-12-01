function Car(color,model,cost,fuelType){
    this.color=color;
    this.model=model;
    this.cost=cost;
    this.fuelType=fuelType;
    let runningCostPerYear=30000;

    this.getCarDetails = function(){
        console.log("color :" + this.color );
        console.log("model :" + this.model );
        console.log("cost :" + this.cost );
        console.log("fueltype :" + this.fuelType );
        console.log("Running cost per year :" + this.runningCostPerYear);
    }
    this.totalCostOfOwnership = function(){
        console.log(this.runningCostPerYear + cost);
    }
}
let MercedesCclass = new Car("Red","C class",5000000,"Petrol");
MercedesCclass.getCarDetails();
MercedesCclass.runningCostPerYear=90000;
console.log(MercedesCclass.totalCostOfOwnership());
