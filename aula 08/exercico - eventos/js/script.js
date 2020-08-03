// 2.	Adicionar um botão ao html com a legenda “Cumprimentar” que, 
//ao ser clicado (onclick) mostre um alerta que diga “olá”.
function cumprimentar(){
    alert('Olá');
}

// 3.	Adicionar outro botão ao html com a legenda “Alterar Fundo” que, 
//quando clicado (onclick) troque a cor do fundo do body para verde.
function alterarFundo(){
    const body = document.getElementsByTagName("body");
    body[0].style.backgroundColor = 'green';    
}


// 4.	Adicionar à página uma imagem que, ao passar do mouse em cima ela, 
//imprima na linha de comando (“estou vendo a imagem”);
function onImagem(){
    console.log('Estou vendo a imagem...')
}


// 5.	Adicionar outra imagem à página que, quando clicada, utilizando addEventListener, 
//imprima na linha de comando (“estou clicando na imagem”).
document.getElementById('imagem2').addEventListener('click',(ev)=>{
    console.log('estou clicando na imagem');
    console.log(`X:${ev.clientX} x Y:${ev.clientY}`);
    });


// comentado, mudei a função abaixo pra atender a questão 9
// function exibeTexto(){
//     console.log('estou clicando na imagem');
//     // 9.	Fazer com que o addEventListener criado na imagem imprima em linha de comando a localização do mouse em x e y.

//     removeClique();
// }
// comentado, mudei a função acima pra atender a questão 9
// function removeClique(){
//     document.getElementById('imagem2').removeEventListener('click',exibeTexto);
// }

//     // 6.	Definir um addEventListener de forma que, quando o usuário clicar em qualquer parte do body 
//     //da página, a cor de fundo do body todo mude para vermelho. Para isso, usar o this da função do evento.
document.body.addEventListener('click',(eve)=>{
   if(eve.target.tagName == 'BODY'){
    const body = document.getElementsByTagName("body");
    body[0].style.backgroundColor = 'red';
   }   
});

// document.removeEventListener('click',(eve)=>{
//     if(eve.target.tagName == 'BODY'){
//      const body = document.getElementsByTagName("body");
//      body[0].style.backgroundColor = 'red';
//     }   
//  });



// 8.	Criar um formulário básico com um action que redirecione para www.google.com.br. Usando JavaScript, fazer com que, 
//quando o usuário clicar em Enviar, o formulário não seja enviado, mas sim que seja exibido um alert dizendo
// “Não é possível enviar”. 
document.getElementById('btn-enviar').addEventListener('click',()=>{
    alert('Não é possível enviar!')
});

document.getElementById('btn-sub').addEventListener('click',(ev)=>{
    ev.preventDefault();
    alert('não foi possivel carregar')
})

let timer = setInterval(()=>{
    alert ('tempo esgotado')
}, 10000)();

// let pausa = setInterval(()=>{
//     alert('Hora do Lanche')
// },5000)();
