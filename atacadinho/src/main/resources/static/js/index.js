
const url = "http://localhost:8090/usuario/cadastrar";
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
        window.location.href = "http://localhost:63342/SoftwareProduct/atacadinho/template/compra.html"
        return
    }
}