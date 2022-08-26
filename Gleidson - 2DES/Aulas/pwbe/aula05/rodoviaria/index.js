const express = require('express');
const mysql = require('mysql');
const cors = require('cors');

const app = express();

const con = mysql.createConnection({
    user : 'root',
    host : 'localhost',
    database: 'rodoviaria'
});

app.get('/rodoviaria/motoristas', (req,res) => {

    let string = "SELECT * FROM vw_motoristas"
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/rodoviaria/horarios', (req,res) => {

    let string = "SELECT * FROM horarios"
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/rodoviaria/linhas', (req,res) => {

    let string = "SELECT * FROM linhas"
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.get('/rodoviaria/mot_linhas', (req,res) => {

    let string = "SELECT * FROM mot_linhas"
    con.query(string, (err,ress) => {
        if(err == null) {
            res.json(ress)
        }    
    });
});

app.listen(5000, () => {
    console.log("Hi lorena")
});