function exibirElementoPorTag(tag){
    $(tag).show();
}

function esconderElementoPorTag(tag){
    $(tag).hide();
}

function esconderElementosPorClass(classe){
    $(`.${classe}`).hide();
}

function exibirElementosPorClass(classe){
    $(`.${classe}`).show();
}

function esconderElementosPorId(id){
    $(`#${id}`).hide();
}

function exibirElementosPorId(id){
    $(`#${id}`).show();
}