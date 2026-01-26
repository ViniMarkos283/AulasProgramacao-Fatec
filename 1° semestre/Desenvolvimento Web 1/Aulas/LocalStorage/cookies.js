function reserva(){
 
let email = document.querySelector("#email").value
let nome = document.querySelector("#users").value
let origem = document.querySelector("#origem").value
let destino = document.querySelector("#destino").value
let dtini = document.querySelector("#startdate").value
let dtfn = document.querySelector("#enddate").value

let cliente = [email, nome, origem, destino, dtini, dtfn ]

let sn = JSON.stringify(cliente)

createCookie("reserva", sn, 10)

let url = "/reserva.html"
window.open(url, '_blank')

   
}

function reservado(){

 //let clientes = JSON.parse(documente.cookie("reserva4"))

// alert("JSON" + clientes)

 var todos_os_cookies = document.cookie

 let cook = JSON.parse(getCookie("reserva"))

// Veja que beleza dos dados separados por ponto e vírgula
//alert(todos_os_cookies);
//alert(cook[1])

document.querySelector("#remail").innerHTML = cook[0]
document.querySelector("#rusers").innerHTML = cook[1]
document.querySelector("#rorigem").innerHTML = cook[2]
document.querySelector("#rdestino").innerHTML = cook[3]
document.querySelector("#rstartdate").innerHTML = cook[4]
document.querySelector("#renddate").innerHTML = cook[5]


}

//Insere p cookie w3c
function createCookie(fieldname, fieldvalue, expiry) {
    var date = new Date();
    date.setTime(date.getTime()+ (expiry*24*60*60*1000));
    var expires = "expires=" + date.toGMTString();
    document.cookie = fieldname + "=" + fieldvalue + 
                      ";" + expires + ";path=/";
}

function apagaCookies(){
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";        
    }
    voltaForm()
}

//Verifica cookie e trás caso ache w3c
function getCookie(cname) {
    let name = cname + "=";
    let ca = document.cookie.split(";");
    for (let i = 0; i < ca.length; i++) {
      let c = ca[i];
      while (c.charAt(0) == " ") {
        c = c.substring(1);
      }
      if (c.indexOf(name) == 0) {
        return c.substring(name.length, c.length);
      }
    }
    return "";
}

function voltaForm(){
    let url = "/localStorage.html"
    window.open(url, '_blank')
}

C:\Users\Bruno\Documents\FATEC\Aplicações_JS\bd2\localStorage.html