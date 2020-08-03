function inicaJogo(){
    let url = window.location.search;
    let nivel = url.replace('?',"");
    let tempoSegundos = 0;

    if(nivel == 1){
        tempoSegundos = 120;
    }

    if(nivel == 2){
        tempoSegundos = 60;
    }

    if(nivel == 3){
        tempoSegundos = 30;
    }
    let qtdeBaloes = 20;

    document.getElementById('cronometro').innerHTML = tempoSegundos;
    document.getElementById('baloesInteiros').innerHTML = qtdeBaloes;
    document.getElementById('baloesEstourados').innerHTML = 0;

    criaBaloes(qtdeBaloes);
    contagemTempo( tempoSegundos + 1);
}
let timerId = null;

function criaBaloes(baloes){
    for(let i =1 ; i <= baloes; i++){
        let balao = document.createElement('img');
        balao.src = './imagens/balao_azul_pequeno.png';
        balao.style.margin = '10px';
        balao.id = 'b'+i;
        balao.onclick = function(){
            estourar(this);
        };
        document.getElementById('cenario').appendChild(balao);
    }
}

function contagemTempo(tempo){
    tempo = tempo - 1;

    if(tempo == -1){
        clearTimeout(timerId);
        gamerOver();
        return false;
    }
    document.getElementById('cronometro').innerHTML = tempo;

    timerId = setTimeout(()=>{
        contagemTempo(tempo);
    },1000)
}

function gamerOver(){
    alert('Você Perdeu!');    
}

function estourar(balao){
    let id_balao = balao.id
    document.getElementById(id_balao).src = './imagens/balao_azul_pequeno_estourado.png';
    pontuacao();
    
}
function pontuacao (){
    let inteiros = document.getElementById('baloesInteiros').innerText;
    let estourados = document.getElementById('baloesEstourados').innerText;

    inteiros = parseInt(inteiros);
    estourados = parseInt(estourados);

    inteiros--;
    estourados++;

    document.getElementById('baloesInteiros').innerText = inteiros;
    document.getElementById('baloesEstourados').innerText = estourados;
    situacaoJogo(inteiros)   
}

function situacaoJogo(inteiros){
    if(inteiros == 0){
        alert('Você Venceu!');        
    }
}