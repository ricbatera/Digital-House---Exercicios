function getFormvalue(){    
        const nome = document.getElementById('nome').value;
        const sobrenome = document.getElementById('sobrenome').value;        
        const result = document.getElementById('result');
        const p = document.createElement('p');
        p.innerHTML = `${nome} ${sobrenome}`;
        result.appendChild(p);
    
}