// 1.	Crie uma função que recebe um número e verifica se ele é par ou ímpar. 
function parOuImpar(num){
    num % 2 == 0 ? console.log(`${num} é par!`): console.log(`${num} é ímpar!`);
}
console.log('Exercício 01')
parOuImpar(11);

// 2.	Crie uma arrow function que receba um número e verifique se é primo.
const primo = num =>{
    if(num == 2 || num == 1 || num == 3){
        return console.log(`${num} é primo`); 
    }
    for(let i = 2; i<num; i++){
        if(num % i == 0){
            return console.log(`${num} não é primo`);
        }else{
            for(let i = 3; i<num; i++){
                if(num % i ==0){
                    return console.log(`${num} não é primo`); 
                }else{
                    return console.log(`${num} é primo`); 
                }
            }
        }
    }
}
console.log('Exercício 02')
primo(99);

// 3.	Crie uma função que imprime de 10 até 1
//  e depois imprime na tela “feliz ano novo” através de uma callback

function contagemRegressiva(callback){
    for(let i =10 ; i>0 ; i--){
        console.log(i);      
    }
    callback();
}
function feliz(){
    console.log('Feliz Ano Novo!!')
}
console.log('Exercício 03')
contagemRegressiva(feliz);



// 4.	Faça o mesmo utilizando Promise com concatenação de then
function festaPromisse(msg){
    return new Promise((resolve, reject)=>{
        for(let i =10 ; i>0 ; i--){
        console.log(i);
    }
        resolve(msg);
    });
}
console.log('Exercício 04')
festaPromisse("feliz ano novo!")
.then(resposta=>{
    console.log(resposta);
})
.catch();

// 5.	Agora repita a função utilizando o método async/await

async function contagemAsyncAwait(){
    try{
        const mensagem = await festaPromisse("Feliz Ano novo!");
        console.log(mensagem);
    } catch (err){
        console.log(err);
    }
}
console.log('Exercício 05')
contagemAsyncAwait();
// 6.	Crie um array com as seguintes notas [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0],
// construa uma função para imprimir apenas as notas acima de 7

const notas =[5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

function notasAcima7(notas){
    for (let i=0; i<notas.length; i++) {
       notas[i] > 7 ? console.log(notas[i]):null;
    }
}
console.log('Exercício 06')
notasAcima7(notas);

// 7.	Crie um array de objetos onde cada objeto será um produto de supermercado e terá o nome do 
// produto e o seu respectivo preço, agora construa uma função que some todos os valores
//  e te devolva o total.

const produtos =[
    {
        produto: "coca-cola",
        preco: 8.9
    },
    {
        produto:"café forte",
        preco: 7.5
    },
    {
        produto:"pão francês",
        preco: 2.85
    },
    {
        produto: "margarina",
        preco: 6.9
    },
    {
        produto:"sorvete balde",
        preco: 20.45
    },
    {
        produto:"sabão em pó",
        preco: 6.1
    }

];

function somaPrecos(produtos){
    let soma = 0;
    for(let i = 0 ; i< produtos.length ; i++){
        let produto = produtos[i];
        soma += produto.preco;
        // console.log(produtos[i]);
    }
    console.log(`R$ ${soma.toFixed(2)}`);
}
console.log('Exercício 07')
somaPrecos(produtos);

// 8.	Em uma escola ficou definido que os alunos do 8º ano terão aulas de história
// e os alunos do 9º terão aulas de física às quartas-feiras. Você deve criar uma função
// que receba um array de objetos contendo nome e série de cada aluno e atribua a sua respectiva
//  disciplina da quarta-feira. (O array de alunos deve ser criado como você desejar contanto
//  que contenha pelo menos 5 alunos).

let alunos = [
    {
        nome: 'Paulo Edson Fiori',
        serie:'8º'
    },

    {
        nome:'Calina Sabino',
        serie:'8º'
    },

    {
        nome:'Tiago Uberaich',
        serie:'9º'
    },

    {
        nome:"Rodrigo Constantino",
        serie:'8º'
    },

    {
        nome:"Tais Yoama",
        serie:'9º'
    },
    {
        nome:"Josias de Souza",
        serie:'8º'
    },
    {
        nome:"José Maria Trindade",
        serie:'9º'
    },
    {
        nome:"Felipe Moura Brazil",
        serie:'8º'
    },
    {
        nome:"Augusto Nunes",
        serie:'9º'
    }
];

function atribuicao(alunos){
    for(let i = 0 ; i < alunos.length; i++){
        let aluno = alunos[i];
        if(aluno.serie == '8º'){
            aluno.aulaQuarta = "História"
            console.log(alunos[i]);
        }else{
            aluno.aulaQuarta = "Física"
            console.log(alunos[i]);
        }
    }
}
console.log('Exercício 08')
atribuicao(alunos);