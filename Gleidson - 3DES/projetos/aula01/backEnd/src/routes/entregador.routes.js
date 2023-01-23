const express = require('express');
const router = express.Router();

const RotaEntregadores = require("../controllers/entregadoresControllers");

router.get("/respostas/read", RotaEntregadores.listarEntregas);
router.get("/respostas/read/id", RotaEntregadores.listarId);

module.exports = router