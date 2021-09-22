function login() {
  var user = document.getElementById("correo").value;
  var password = document.getElementById("password").value;
  console.log(user);
  console.log(password);
  if (user === "admin" && password === "admin123") {
    console.log("Credenciales correctas");
    window.location.href = "../Menu.html";
  } else {
  }
}
