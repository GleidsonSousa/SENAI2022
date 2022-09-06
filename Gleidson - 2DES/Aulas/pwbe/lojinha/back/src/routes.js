const Express = require('express');

const router = Express.Router();

const ProdutosController = require("./controllers/ProdutosController");

router.get("/produtos", ProdutosController.listarProdutos);
router.get("/produto/:cod", ProdutosController.listaProduto);
router.post("/produtos", ProdutosController.cadastrarProduto);
router.delete("/produto", ProdutosController.excluirProduto);
router.put("/produto", ProdutosController.editarProduto);

const FuncionariosController = require("./controllers/FuncionariosController");

router.get("/funcionarios", FuncionariosController.listarFuncs);
router.get("/funcionarios/:matricula", FuncionariosController.listaFuncs);

module.exports = router;