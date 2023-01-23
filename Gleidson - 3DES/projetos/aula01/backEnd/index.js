const express = require('express');
const cors = require('cors');

const entregador = require('./src/routes/entregador.routes');






const app = express();
app.use(express.json());
app.use(cors());
app.use(entregador);
app.listen(4500, () => {
    console.log("Programado com  C# 🤨.");
});