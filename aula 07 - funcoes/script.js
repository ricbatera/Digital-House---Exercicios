// função básica em JS
function par(num){
    if(num %2 === 0){
        console.log('É par!')
    }
}

function par2(num){
    num % 2 == 0 ? console.log("É par!"): console.log("É Impar!");
}

function parOuImpar(){
    for(let i = 10; i<16; i++){
        if(i%2 === 0){
            console.log(`${i} é par`);
        }else{
            console.log(`${i} é ímpar`);
        }
    }
}
parOuImpar();
// par(4);
par2(11);

function a(callback){
    setTimeout(function(){
        console.log('Carregando...')
        callback();
    },3000);
}

function b(){
    console.log("Carregado!");
}

a(b);

// const pessoa = {
//     nome: "Ricardo",
//     sobrenome: "Alves Roberto",
//     idade: 37,
//     apresentacao: apresentar
// }

// function apresentar(){
//     console.log(`Olá meu nome é ${this.nome} ${this.sobrenome} e tenho ${idade} anos!`);
// }

let data = new Date();
console.log(data);