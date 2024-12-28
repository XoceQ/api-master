CREATE TABLE medicos (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         nombre VARCHAR(100) NOT NULL,
                         email VARCHAR(100) NOT NULL UNIQUE,
                         documento VARCHAR(15) NOT NULL UNIQUE,  -- He aumentado el tamaño del documento en caso de que sea mayor que 6
                         especialidad VARCHAR(100) NOT NULL,
                         calle VARCHAR(100) NOT NULL,
                         distrito VARCHAR(100) NOT NULL,
                         complemento VARCHAR(100) DEFAULT NULL,  -- Se puede definir como NULL si no siempre se proporciona
                         numero VARCHAR(20) DEFAULT NULL,        -- Se puede definir como NULL si no siempre se proporciona
                         ciudad VARCHAR(100) NOT NULL,
                         PRIMARY KEY (id)
);
