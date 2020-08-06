function envio(){
    let id = document.getElementById('id').value;
    let name = document.getElementById('name').value;
    let location = document.getElementById('location').value;
    
    $.ajax({
        method: "POST",
        url: "http://localhost:3000/users",
        data: { 
            "id": id,
            "name": name,
            "location": location
        },
        success: function(){
            alert("Dados inseridos com sucesso!");
        },
        error: function(){
            alert("Dados não inseridos!");
        }
    })
  
}

