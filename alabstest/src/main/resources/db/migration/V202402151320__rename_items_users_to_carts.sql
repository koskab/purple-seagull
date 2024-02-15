ALTER TABLE items_users RENAME TO carts;
ALTER TABLE carts ADD shop_id BIGINT REFERENCES shops(id) NOT NULL,
         ALTER COLUMN user_id SET NOT NULL,
         ALTER COLUMN item_id SET NOT NULL,
         ADD COLUMN quantity INT NOT NULL DEFAULT 1;