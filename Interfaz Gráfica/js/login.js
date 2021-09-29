function login() {
  let user = document.forms["formLogin"]["correo"].value;
  let password = document.forms["formLogin"]["password"].value;
  if (user === "admin" && password === "admin123") {
    alert("Credenciales correctas");
    window.location.href = "../Menu-admin/index.html";
  } else {
    alert("Usuario No encontrado");
  }
  return false;
}
