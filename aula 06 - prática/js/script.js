var nome = 'Ricardo Alves';
var idade = 66;
var verdadeiro = true;
var listaArray = ['maça', 'laranja', 'mamão', true];
var objeto = {
    nome: "Silvania",
    sobrenome: "da Silva",
    linda: true
}

// console.log('Olá Mundo!');
// console.log(`Meu nome é ${nome} hoje eu tenho ${idade}!`);
// console.log(typeof listaArray[2]);

if(idade >= 18 && idade <= 65){
    console.log('É obrigatório votar');
}else {
    console.log('Não é obrigado votar!');
}

var mes = 12;

switch(mes){
    case 1: console.log("Janeiro");
    break;
    case 2: console.log("Fevereiro");
    break;
    case 3: console.log("Março");
    break;
    case 4: console.log("Abril");
    break;
    case 5: console.log("Maio");
    break;
    case 6: console.log("Julho");
    break;
    case 7: console.log("Julho");
    break;
    case 8: console.log("Agosto");
    break;
    case 9: console.log("Setembro");
    break;
    case 10: console.log("Outubro");
    break;
    case 11: console.log("Novembro");
    break;
    case 12: console.log("Dezembro");
    break;
    default: console.log('Mês inválido')


}

var numero = 0;
while(numero < 3 ){
    console.log(numero);
    numero++;
}

var pares = 0;

while(pares <=10){
    if(pares % 2 == 0){
        console.log(`${pares} é um número par! 0/`)
    }else{
        console.log(`${pares} não é um número par!`)
    }
    pares++;
}

var matriz = [[1,2],[3,4]];
console.log(matriz);