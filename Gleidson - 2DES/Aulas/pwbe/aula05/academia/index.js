const express = require('express');
const mysql = require('mysql');
const cors = require('cors');

const app = express();

const con = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database: 'academia'
});

app.get('/academia/alunos', (req,res) => {

    let string = "SELECT * FROM vw_alunos";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/academia/aparelhos', (req,res) => {

    let string = "SELECT * FROM aparelhos";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/academia/exercicios', (req,res) => {

    let string = "SELECT * FROM exercicios";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/academia/fichas', (req,res) => {

    let string = "SELECT * FROM fichas";
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.listen(5000, () => {
    console.log("Respondendo na porta oni...oni-chan :3  5000");
});
