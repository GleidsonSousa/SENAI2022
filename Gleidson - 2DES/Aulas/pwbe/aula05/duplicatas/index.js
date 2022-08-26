const express = require('express');
const mysql = require('mysql');
const cors = require('cors');

const app = express();

const con = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database: 'duplicatas'
});

app.get('/duplicatas/clientes', (req,res) => {

    let string = "SELECT * FROM vw_clientes";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/duplicatas/duplicatas', (req,res) => {

    let string = "SELECT * FROM duplicatas_em_aberto";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/duplicatas/duplicatas_p', (req,res) => {

    let string = "SELECT * FROM duplicatas_pagas";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.listen(5000, () => {
    console.log("Fla galerinha aq e o luan gameplyas");
});