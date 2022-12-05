function display(){
    let firstName = document.getElementById("fullname").value;
    console.log("Name: "+firstName);
    let dob = document.getElementById('dob').value;
    console.log("DOB: "+dob);
    let email = document.getElementById("email").value;
    console.log("Email: "+email);
    let mobileNo = document.getElementById('mobileno').value;
    console.log("Mobile No: "+mobileNo);
    let gender = document.getElementById("gender").value;
    console.log("Gender: "+gender);
    let occupation = document.getElementById('occupation').value;
    console.log("Occupation: "+occupation);
    let idType = document.getElementById("idtype").value;
    console.log("ID Type: "+idType);
    let idNo = document.getElementById('idno').value;
    console.log("ID No: "+idNo);
    let issueAuth = document.getElementById("issueauth").value;
    console.log("Issue Authority: "+issueAuth);
    let issueDate = document.getElementById('issuedt').value;
    console.log("Issue Date: "+issueDate);
    let issueState = document.getElementById("issuest").value;
    console.log("Issue State: "+issueState);
    let expDate = document.getElementById('expdt').value;
    console.log("Expiry Date: "+expDate);
    
    location.href="thankyou.html";

  }
   