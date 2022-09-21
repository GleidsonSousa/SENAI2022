const express = require('express');

const router = express.Router();

const ClienteController = require("./controllers/Clientes.Controller");

router.get("/clientes", ClienteController.listarClientes);
router.get("/clientes/:cpf", ClienteController.listaCliente);
router.post("/clientes", ClienteController.cadastrarCliente);
router.delete("/clientes", ClienteController.excluirCliente);
router.put("/clientes", ClienteController.editarCliente);

module.exports = router;