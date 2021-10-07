function login() {
  // API URL
  const url2 = "http://localhost:8080/api/users";
  let user = document.forms["formLogin"]["correo"].value;
  let password = document.forms["formLogin"]["password"].value;
  // Llamamos a la funcion
  fetch("js/json/users.json")
    .then((response) => response.json())
    .then((data) => {
      console.log(data[0]);

      console.log(data[0].email);
      console.log(data[0].password);

      if (data[0].email == user && data[0].password == password) {
        alert("Credenciales correctas");
        window.location.href = "./Menu-admin/index.html";
      } else {
        alert("Credenciales incorrectas");
      }
    })
    .catch((err) => console.log(err));
}
