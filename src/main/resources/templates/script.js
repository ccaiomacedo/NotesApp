function clicar(){

    var senha = document.getElementById('senha').value
    var email = document.getElementById('email').value
    var username = document.getElementById('username').value
    var nome = document.getElementById('nome').value
    
    
    if(nome.length && email.length && username.length){
        senha = senha.length <=5 ? alert('senha menor que 6 digitos, informe uma mais forte!') 
        : window.location.href = 'index.html'
    }
    else{
        alert('Preencha todos os campos!')
       
    }
    
  }