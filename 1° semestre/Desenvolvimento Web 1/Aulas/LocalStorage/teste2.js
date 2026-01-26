function local(){

    let dd = [
        { "id":Date.now(),"nome":"will","senha":123 }, //0
        { "id":Date.now(),"nome":"bob","senha":2222 }, //1
        { "id":Date.now(),"nome":"ringo","senha":3333 } //2
       ]
       
       let n = JSON.stringify(dd);

       localStorage.setItem("tds", n);
   
       //let dados = localStorage.getItem("tds")
   
       let dados = JSON.parse(window.localStorage.getItem('tds'))
   
       console.log(dados[0].nome)     
    
}

function vetor(){

   // var ClienteArray = JSON.parse(localStorage.getItem('tds') || '[]')

    var ClienteArray = JSON.parse(localStorage.getItem('tds'))
    
       let user = [
                    { "id":Date.now(),"nome":"Bruno11","senha": 3255 } 
                  ]

       let user2 = { "id":Date.now(),"nome":"Bruno13","senha": 3255 } 
                  
    
     //  dd.push(user)

     ClienteArray.push(user2);
     localStorage.setItem('tds', JSON.stringify(ClienteArray));
     alert('Registro adicionado.');

    // var ver = localStorage.getItem('tds')

     let dados = JSON.parse(window.localStorage.getItem('tds'))

     alert(dados)
     console.log(dados)

      // let n = JSON.stringify(user);

     //  localStorage.setItem("tds", n);
   
       //let dados = localStorage.getItem("tds")
   
      // let dados = JSON.parse(window.localStorage.getItem('tds'))
   
      // console.log(dados[0].nome)     
    
}

function apagar(id){

  var dados = JSON.parse(localStorage.getItem('tds'))

  //localStorage.removeItem("tds")

  dados.splice(1,id)

  localStorage.setItem('tds', JSON.stringify(dados));

  alert(dados)
  console.log(dados)

  /*
  for(let i=0;dados > i;i++){
  dados.splice(i,id)
  console.log(dados)
  }
  */
  //localStorage.setItem('tds', JSON.stringify(ClienteArray));

}
