const express = require('express');
const router = express.Router();

const user = require("./controllers/usuariosController");

router.get("/users", user.listarUsuarioss);
router.post("/users", user.cadastrarUsuarios);
router.delete("/users", user.excluirUsuarios);

module.exports = router;