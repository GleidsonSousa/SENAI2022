const express = require('express');
const mysql =  require('mysql');
const app = express();

const con = mysql.createConnection({
    user: 'root',
    host:'localhost',
    database:'pedidos'
});
app.use(express.json());

app.get('/pedidos',(req,res)=>{
    
    
    //let priNome = req.query.priNome;
   // let sobrenome = req.query.sobrenome;
   // let endereco = req.query.endereco;

    let id = req.query.id;
    let telefones = req.query.telefones;

   // let string = `insert into clientes value(null,'${priNome} ','${sobrenome}','${endereco}')`;
    let string2 = `insert into telefones value(${id},'${telefones}')`;
    con.query(string2,(err,result)=>{   
        if(err ==  null){
            res.json("Dados Recebidos com Sucesso, e enviados para o Banco de Dados");
        }else{
            res.json("Dados Recebidos com Sucesso, porém não conseguimos realizar o envio para o Banco de Dados");
        }  
        
    });


});


app.listen(3000, ()=>{
    console.log("opa!!");
   
    
});