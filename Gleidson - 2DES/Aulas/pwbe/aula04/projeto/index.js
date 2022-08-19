const express = require('express');
const app = express();

app.use(express.json());

app.get('/projeto',(req,res)=>{
    res.json("Busquem dessfsadfsconhecimentos");
});

app.listen(3000, ()=>{
    console.log("respondendo UIIIII, na porsdfd....ELE GOSTA ,3000 CAVALO");
    
});
