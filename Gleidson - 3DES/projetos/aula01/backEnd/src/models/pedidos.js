const toCreate = (model) => {
    return `INSERT INTO produtos VALUES (DEFAULT, '${model.cliente}','${model.endereco}','${model.produto}',curDate(),curTime())`;
}

const toReadAll = () => {
    return "SELECT * FROM pedidos";
}

const toReadId = (model) => {
    return `SELECT * FROM pedidos  WHERE  id_pedido =  ${model.id_pedido}  ORDER BY id_pedido DESC`;
}


const toDelete = (model) => {
    return `DELETE FROM pedidos WHERE id_pedido = ${model.id_pedido}`;
}

const toUpdatePedido = (model)=>{
    return `UPDATE pedidos SET   cliente = '${model.cliente}', endereco = '${model.endereco}', produto = '${model.produto}' WHERE id_pedido = ${model.id_pedido}`;
    }

const toUpdateEntregador = (model)=>{
    return `UPDATE pedidos SET   hora_entrega = curTime() WHERE id_pedido = ${model.id_pedido}`;
        }

const toUpdateEntregue = (model)=>{
    return `UPDATE pedidos SET   hora_fim = curTime() WHERE id_pedido = ${model.id_pedido}`;
            }

module.exports = {
    toCreate,
    toReadAll,
    toReadId,   
    toDelete,
    toUpdatePedido,
    toUpdatePedido,
    toUpdateEntregador,
    toUpdateEntregue
}