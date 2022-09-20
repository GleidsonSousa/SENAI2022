const mysql = require('mysql');

const conDB = mysql.createConnection({
    "host": "localhost",
    "user": "root",
    "database": "renasparking"
});

function listarClientes(req, res) {
    let query = "SELECT * FROM clientes";

    conDB.query(query, (err, result) => {
        if(err == null) {
            res.json(result).status(200).end();
        }else {
            res.json(err).status(400).end();
        }
    })
};

function listaCliente(req, res) {
    let query = `SELECT * FROM clientes WHERE cpf = '${req.params.cpf}'`;
    
    conDB.query(query, (err, result) => {
        if(err == null) {
            res.status(200).json(result).end();
        }else {
            res.status(400).json(err).end();
        }
    })
};

function cadastrarCliente(req, res) {
    let query = `INSERT INTO clientes VALUES (DEFAULT, '${req.body.cpf}', '${req.body.nome}', '${req.body.telefone}', '${req.body.email}', '${req.body.endereco}')`;

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
    listarClientes,
    listaCliente,
    cadastrarCliente,
    excluirCliente,
    editarCliente
}