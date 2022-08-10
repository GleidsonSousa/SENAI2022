
function nascimentos28(qtd){
    let retorno = [];
    for(i = 0 ; i < qtd; i++){
        let dia = Math.floor(Math.random()*28)+1;
        let mes = Math.floor(Math.random()*12)+1;
        let ano = Math.floor(Math.random()*1990 - 2006)+1;
        retorno[i] = dia + "/" + mes + "/" + ano;
        return retorno;
    }
}



function Nascimentos(qtd) {
    let retorno = [];
    for(i = 0; i < qtd; i++){
    var dataIni = new Date(1990, 0, 1);
    var dataFinal = new Date(2006,11,30);
    return new Date(dataIni.getTime() + Math.random() * (dataFinal.getTime() - dataIni.getTime()));
      }
var Datas = Nascimentos();
console.log(Datas);
    }
