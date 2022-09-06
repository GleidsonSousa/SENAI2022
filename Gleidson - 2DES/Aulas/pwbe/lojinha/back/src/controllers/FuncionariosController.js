const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "lojinha"
});

function listarFuncs(req, res) {
    let query = "SELECT * FROM funcionarios";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaFuncs(req, res) {
    let query = `SELECT * FROM funcionarios WHERE matricula = '${req.params.matricula}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

module.exports = {
    listarFuncs,
    listaFuncs
    // cadastrarProduto,
    // excluirProduto,
    // editarProduto
}