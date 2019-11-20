function validateNewUser() {
  var fName = document.forms["newUser"]["fName"].value;
  var lName = document.forms["newUser"]["lName"].value;
  var number = document.forms["newUser"]["number"].value;
  var email = document.forms["newUser"]["email"].value;
  var password = document.forms["newUser"]["password"].value;

  if (fName == "" && lName == "") {
    alert("Name must be filled out");
    return false;
  }

  if (number == "") {
    alert("Phone number must be filled out");
    return false;
  }

  if (email == "") {
    alert("Phone number must be filled out");
    return false;
  }

  if (password == "") {
    alert("Password must be filled out");
    return false;
  }

}
