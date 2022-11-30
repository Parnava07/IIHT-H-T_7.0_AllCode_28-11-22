class Employee {
    constructor(companyName) {
        this.companyName = "Cognizant";
    }
}

class Developers extends Employee {
    constructor(empName, ex, dept, position, joiningDate, location, emailId, salary) {
        super();
        this.empName = empName;
        this.ex = ex;
        this.dept = dept;
        this.position = position;
        this.joiningDate = joiningDate;
        this.location = location;
        this.emailId = emailId;
        this.salary = salary;
    }
}

let d1 = new Developers("Alex", 3, "Java", "TA", "09/11/2022", "kolkata", "alex1@gmail.com", 30000)
console.log(d1.companyName + "-" + d1.empName + " " + d1.ex + " " + d1.dept + " " + d1.position
    + " " + d1.joiningDate + " " + d1.location + " " + d1.emailId + " " + d1.salary);