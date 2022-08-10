const express = require('express');
const app = express();

app.use(express.json());

app.get('/aula01',(req,res)=>{
    res.json("Busquem dessfsadfsconhecimentos");
});

app.listen(3000, ()=>{
    console.log("respondendo UIIIII, na portsdfsada ....ELE GOSTA ,3000 CAVALO");
    
});
