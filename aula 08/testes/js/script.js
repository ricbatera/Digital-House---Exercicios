let h1 = document.getElementById('titulo');

h1.style.fontSize = "80px";

// let vermelho = document.querySelector('.vermelho');
// console.log(vermelho);
// vermelho.style.color = 'red';

let vermelhos = document.querySelectorAll('.vermelho');
console.log(vermelhos);
for (let i = 0 ; i< vermelhos.length; i++){
    vermelhos[i].style.color = 'red';
}

const divi = document.getElementsByTagName('div');
// console.log(divi);
console.log(divi.hasAttribute('color'));
console.log(h1.hasAttribute('color'));