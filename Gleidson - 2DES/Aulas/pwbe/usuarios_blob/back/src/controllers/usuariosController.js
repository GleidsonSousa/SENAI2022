const Usuarios = require('../models/Usuarios');
const con = require('../dao/dbUsuarios');
const multer = require('multer');
const upload = multer().single('foto')

const cadastrarUsuarios = async (req, res) => {
    upload(req, res, (err) => {
        if (err)
            res.status(500).json({ error: 1, payload: err }).end();
        else {
            let string = Usuarios.toCreate(req.body, req.file);
            con.query(string, (err, result) => {
                if (err == null) {
                    res.status(201).json(Usuarios).end();
                    
                } else {
                    res.status(500).json(err).end();
                }
            });
        }
    });
}

const listarUsuarioss = (req, res) => {
    let string = Usuarios.toReadAll();
    con.query(string, (err, result) => {
        if (err == null) {
            res.json(Usuarios.toAscii(result)).end();
        }
    });
}

const excluirUsuarios = (req, res) => {
    let string = Usuarios.toDel(req.body);
    con.query(string, (err, result) => {
        if (err == null)
            if (result.affectedRows > 0)
                res.status(200).end();
            else
                res.status(404).end();
        else
            res.status(400).json(err).end();
    });
}

module.exports = {
    listarUsuarioss,
    cadastrarUsuarios,
    excluirUsuarios
}