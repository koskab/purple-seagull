ALTER TABLE carts ADD cost NUMERIC NOT NULL;
DROP INDEX carts_user_id_shop_id_item_id_idx;
CREATE UNIQUE INDEX ON carts(user_id, shop_id, item_id);