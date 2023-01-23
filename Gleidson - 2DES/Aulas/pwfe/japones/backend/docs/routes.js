const express = require('express');

const router = express.Router();

const LancamentosController = require("./controller/caixa");

router.get("/caixa_lancamentos", LancamentosController.listarLancamentos);
router.get("/caixa_lancamentos/:datas", LancamentosController.listaLancamento);
router.post("/caixa_lancamentos", LancamentosController.cadastrarLancamentos);

module.exports = router;