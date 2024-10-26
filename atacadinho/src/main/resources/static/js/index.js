const url = "http://localhost:8090/usuario/cadastrar";

// index.js
async function testBackendConnection() {
    const response = await fetch("http://localhost:8090/test");
    if (response.ok) {
        const message = await response.text();
        console.log(message); // Deve exibir "Backend is connected!" no console
    } else {
        console.error("Erro ao conectar com o backend");
    }
}

// Chame a função para testar a conexão
testBackendConnection();

async function cadastrar(){
    let name = document.getElementById('name').value
    let email = document.getElementById('email').value
    let senha = document.getElementById('senha').value

    if(!name){
        alert("Nome é obrigatorio");
        return

    }

    let api = await fetch(url,{
        method:"POST",
        body:JSON.stringify({
            "name":name,
            "email":email,
            "senha": senha,
        }),
        headers:{
            'Content-Type':'application/json'
        }
    });

    if(api.ok){
        let resposta = await api.json();
        alert("Cadastro com sucesso !")
        window.location.href = "http://localhost:63342/atacadinho/atacadinho/src/main/resources/template/compra.html?_ijt=d35hie4m2769sp00bvjqd34e9p&_ij_reload=RELOAD_ON_SAVE"
        return;
    }
    else {
        alert("Erro ao cadastrar usuário");
    }
}