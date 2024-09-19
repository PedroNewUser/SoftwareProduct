document.getElementById('cadastroForm').addEventListener('submit'), function(event) {
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const userRequestDto = {
        nome:nome, 
        email:email, 
        password:password};
    
    fetch('/cadastrar', {
        method:'POST', Headers: {
            'content-type': 'aplication/json',}, 
            body:JSON.stringify(userRequestDto)})
            .then(Response=> Response.json())
            .then(data=>{
                console.log('Sucesso!',data);
                window.location.href='./index.html'})

                .catch((error) => {
                    console.error('Errora:',error);
                });



}