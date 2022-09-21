const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "renasparking"
});

function listarCarros(req, res) {
    let query = "SELECT * FROM carros";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaCarro(req, res) {
    let query = `SELECT * FROM carros WHERE placa = '${req.params.placa}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

function cadastrarCarro(req, res) {
    let query = `INSERT INTO carros VALUES (DEFAULT, '${req.body.id_cli}', '${req.body.placa}', '${req.body.marca}', '${req.body.categoria}', '${req.body.endereco}')`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(201).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function excluirCliente(req, res) {
    let query = `DELETE FROM clientes WHERE cpf = '${req.body.cpf}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

function editarCliente(req, res){
    let query = `UPDATE clientes SET cpf = '${req.body.cpf}', nome = '${req.body.nome}', telefone = '${req.body.telefone}', email = '${req.body.email}', endereco = '${req.body.endereco}' WHERE cpf = '${req.body.cpf}'`;

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(req.body).end();
        }else {
            res.status(400).json(err).end();
        }
    });
};

module.exports = {
    listarCarros,
    listaCarro,
    cadastrarCarro,
    excluirCliente,
    editarCliente
}