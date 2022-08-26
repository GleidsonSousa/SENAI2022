const express = require('express');
const cors = require('cors');
const mysql = require('mysql');

const app = express();

const con = mysql.createConnection({
    user: 'root',
    host: 'localhost',
    database: 'clientes'
});

app.get('/clientes/clientes', (req, res) => {
    let string = `Select * from vw_clientes`;
    con.query(string,(err, result)=>{
        if(err == null){
            res.json(result);
        }
    });
});

app.listen(5000, () => {
    console.log("Respondendo na porta oni...oni-chan :3  5000");
});