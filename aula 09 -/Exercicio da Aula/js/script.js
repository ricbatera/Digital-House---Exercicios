document.getElementById('btn-enviar').addEventListener('click', (ev)=>{
    ev.preventDefault();
    const nome = document.getElementById('nome').value;
    const sobrenome = document.getElementById('sobrenome').value;
    const endereco = document.getElementById('endereco').value;
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    const confSenha = document.getElementById('conf-senha').value;

    if(nome == "" || sobrenome == "" || endereco == "" || email == "" || senha == "" || confSenha == ""){
        alert('Por favor prencha todos os campos!');
        return false;
    }
    if(senha !== confSenha){
        alert('As senhas não coincidem');
        return false;
    }

    console.log(`${nome} ${sobrenome}`);
    console.log(`Endereço: ${endereco}`);
    console.log(`Email: ${email}`);
    console.log(`senha: ${senha} (isso não é bom)`);
    console.log(`confirmação da da senha: ${confSenha}(isso também não é bom)`);
})