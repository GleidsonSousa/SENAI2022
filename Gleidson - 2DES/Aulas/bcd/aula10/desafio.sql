start transaction;
	delete from pedidos;
    delete from itens_pedido;
	insert into pedidos values
    (27,101,curdate(),curtime(),null);
	select * from pedidos;
    insert into itens_Pedido values(27,2,2,(select valor from Pizzas where pizza_id = 2));
    insert into itens_Pedido values(27,6,1, (select valor from Pizzas where pizza_id = 6));
    insert into itens_Pedido values(27,25,3, (select valor from Pizzas where pizza_id = 6));
    	select * from Itens_Pedido;

commit;
-- Ver se realmente as altereções foram efetivamente aplicadas

update Pedidos set valor=(select sum(quantidade * valor) from Itens_Pedido where pedido_id = 27) where pedido_id = 27;
select * from pedidos;

drop procedure if exists insere_dados;
	delete from pedidos where pedido_id = 27;
    delete from itens_Pedido where pedido_id = 27;
    select * from pedidos;
    select * from Itens_Pedido;

delimiter //
create procedure insere_dados()
	begin
	declare erro_sql tinyint default false;
	declare continue handler for sqlexception set erro_sql = true;
	start transaction;
	insert into pedidos values(27,101,curdate(),curtime(),null);
	select * from pedidos;
    insert into itens_Pedido values(27,2,2,(select valor from Pizzas where pizza_id = 2));
    insert into itens_Pedido values(27,6,1, (select valor from Pizzas where pizza_id = 6));
    insert into itens_Pedido values(27,25,3, (select valor from Pizzas where pizza_id = 6));
    	select * from Itens_Pedido;
        update Pedidos set valor=(select sum(quantidade * valor) from Itens_Pedido where pedido_id = 27) where pedido_id = 27;
        	select * from pedidos;

        
        if erro_sql = false then
			commit;
			select 'Transação efetivada com sucesso' as Resultado;
		else
			rollback;
			select 'Erro na transação' as Resultado;
		end if;
end//
delimiter ;

-- Chamar o procedimento armazenado
call insere_dados();