document.addEventListener('DOMContentLoaded', () => {
    const buyButtons = document.querySelectorAll('.buy-button');

    buyButtons.forEach(button => {
        button.addEventListener('click', async (event) => {
            const productCard = event.target.closest('.product-card');
            const productName = productCard.querySelector('h2').innerText;
            const quantityInput = productCard.querySelector('input[type="number"]');
            const quantity = quantityInput.value;

            const productRequestDto = {
                name: productName,
                quantidade: parseInt(quantity)
            };

            try {
                const response = await fetch('http://localhost:8090/produto/save', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(productRequestDto)
                });

                if (response.ok) {
                    const productResponseDto = await response.json();
                    alert(`Produto ${productResponseDto.name} Compra com sucesso! Quantidade: ${productResponseDto.quantidade}`);
                } else {
                    alert('Erro ao cadastrar produto');
                }
            } catch (error) {
                console.error('Erro ao fazer requisição:', error);
                alert(`Erro ao conectar com o servidor: ${error.message}`);
            }
        });
    });
});