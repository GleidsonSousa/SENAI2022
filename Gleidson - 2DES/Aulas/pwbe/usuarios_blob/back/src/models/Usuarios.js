const toCreate = (dados,file) =>{
    if (file != null){
        dados.foto = file.buffer.toString('base64');
        return `insert into usuarios values ('${dados.login}','${dados.nome}','${dados.nascimento}','${dados.telefone}','${dados.avatar}')`;
    }else
        return `insert into usuarios values ('${dados.login}','${dados.nome}','${dados.nascimento}','${dados.telefone}', null)`;
}

const toReadAll = ()=>{
    return "select * from usuarios";
}

const toDel = (dados)=>{
    return `delete from usuarios where login = '${dados.login}'`
}

const toAscii = (dados)=>{
    dados.forEach(d => {
        if(d.foto != null) d.foto = d.foto.toString('ascii');
    });
    return dados;
}

module.exports = {
    toCreate,
    toReadAll,
    toDel,
    toAscii
}