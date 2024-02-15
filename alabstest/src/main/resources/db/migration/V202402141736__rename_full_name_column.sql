ALTER TABLE users RENAME COLUMN fullname TO full_name,
                            ADD balance NUMERIC NOT NULL DEFAULT 0;