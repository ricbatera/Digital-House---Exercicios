let rodada = 1;

var matriz_jogo = Array(3);

matriz_jogo['a'] = Array(3);
matriz_jogo['b'] = Array(3);
matriz_jogo['c'] = Array(3);

matriz_jogo['a'][1] = 0;
matriz_jogo['a'][2] = 0;
matriz_jogo['a'][3] = 0;

matriz_jogo['b'][1] = 0;
matriz_jogo['b'][2] = 0;
matriz_jogo['b'][3] = 0;

matriz_jogo['c'][1] = 0;
matriz_jogo['c'][2] = 0;
matriz_jogo['c'][3] = 0;

$(document).ready(()=>{
    $('#btn_iniciar_jogo').click(()=>{
        if($('#entrada-jodador1').val()== ''){
            alert('Prencha o nome do jogador 1');
            return false;
        }
        if($('#entrada-jodador2').val()== ''){
            alert('Prencha o nome do jogador 2');
            return false;
        }
        //Setando os nomes no palco do jogo
        $('#nome1').html($('#entrada-jodador1').val());
        $('#nome2').html($('#entrada-jodador2').val());

        // alternando as "telas"
        $('#pagina_inicial').hide();
        $('#palco_jogo').show();
    });

    $('.jogada').click(function(){
        var idClicado = this.id;
        $(`#${idClicado}`).off();
        jogadaV(idClicado);
    });

    function jogadaV(id){
        let icone = "";
        let ponto = 0;

        if((rodada%2)== 1){
            icone = 'url("./imagens/marcacao_1.png")';
            ponto = -1;
        } else{
            icone = 'url("./imagens/marcacao_2.png")';
            ponto = 1;
        }
        rodada++;

        $(`#${id}`).css('background-image', icone);

        let linhaXcoluna = id.split('-');
        matriz_jogo[linhaXcoluna[0]][linhaXcoluna[1]] = ponto;
        console.log(matriz_jogo);
        verifica_combinacao();
    }

    function verifica_combinacao(){
        //verifica na horizontal linha A
        var pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['a'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha B
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['b'][i];
        }
        ganhador(pontos);
        //verifica na horizontal linha C
        pontos = 0;
        for(var i = 1; i <= 3; i++){
            pontos = pontos + matriz_jogo['c'][i];
        }
        ganhador(pontos);
        //verifica na vertical
        for(var l = 1; l <= 3; l++){
            pontos = 0;
            pontos = pontos + matriz_jogo['a'][l];
            pontos = pontos + matriz_jogo['b'][l];
            pontos = pontos + matriz_jogo['c'][l];
            ganhador(pontos);
        }
        //verificar na diagonal
        pontos = 0;
        pontos = matriz_jogo['a'][1] + matriz_jogo['b'][2] + matriz_jogo['c'][3];
        ganhador(pontos);
        pontos = 0;
        pontos = matriz_jogo['a'][3] + matriz_jogo['b'][2] + matriz_jogo['c'][1];
        ganhador(pontos);
    }
    function ganhador(pontos){
        if(pontos == -3){            
            $('#vencedor').html(`${$('#entrada-jodador1').val()} é o vencedor`);           
            $('.jogada').off();
        } else if(pontos == 3){            
            $('#vencedor').html(`${$('#entrada-jodador2').val()} é o vencedor`);            
            $('.jogada').off();
        }
    }
});