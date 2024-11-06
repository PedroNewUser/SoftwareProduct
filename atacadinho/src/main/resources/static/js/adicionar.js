document.addEventListener('DOMContentLoaded', () => {
    listUsers();
});

async function listUsers() {
    try {
        const response = await fetch("http://localhost:8090/produto/listproduct");
        if (!response.ok) {
            throw new Error('Erro ao buscar usuários');
        }

        const users = await response.json();
        const tableBody = document.getElementById('user-table-body');
        //tableBody.innerHTML = ''; // Limpa a tabela antes de inserir os dados

        users.forEach(user => {
            const row = document.createElement('tr');

            row.innerHTML = `
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.cpf_cnpj}</td>
                <td>
                    <button class="table-button" onclick="redirectToUpdate(${user.id})">Atualizar</button>
                </td>
            `;

            tableBody.appendChild(row);
        });
    } catch (error) {
        alert(error.message);
    }
}

function redirectToUpdate(id) {
    window.location.href = `http://localhost:3000/atualizar?id=${id}`;
}
