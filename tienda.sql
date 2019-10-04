

-- CREAR TABLA CLIENTES

CREATE TABLE tipo_usuarios(
    id_tipo_usuario INT NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_tipo_usuario)
)  ENGINE=InnoDB;

insert into tipo_usuarios(descripcion) 
values('Administrador');

insert into tipo_usuarios(descripcion) 
values('vendedor');

CREATE TABLE usuarios(
    id_usuario INT NOT NULL AUTO_INCREMENT,
    id_tipo_usuario int not null,
    usuario VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_usuario),
    CONSTRAINT id_tipo_usuario FOREIGN KEY(id_tipo_usuario) REFERENCES tipo_usuarios(id_tipo_usuario)
)  ENGINE=InnoDB;


CREATE TABLE clientes(
    id_cliente INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NULL,
    direccion VARCHAR(100) NULL,
    cedula varchar(13) NULL,
    PRIMARY KEY (id_cliente)
)  ENGINE=InnoDB;

 -- CREAR TABLA PAGOS
CREATE TABLE pagos(
    id_pago INT NOT NULL AUTO_INCREMENT,
    fecha date NOT NULL,
    monto DECIMAL(18,2) NOT NULL,
    id_forma_pago int not null,
    PRIMARY KEY (id_pago)
)  ENGINE=InnoDB;

-- CREAR TABLA FORMA_PAGOS
CREATE TABLE forma_pagos(
    id_forma_pago INT NOT NULL AUTO_INCREMENT,
    descripcion int null,
    detalle varchar(10) NULL,
    id_pago int not null,
    PRIMARY KEY (id_forma_pago),
    CONSTRAINT id_pago FOREIGN KEY (id_pago) REFERENCES pagos(id_pago)
)  ENGINE=InnoDB;

-- CREAR TABLA FACTURAS
CREATE TABLE facturas(
    id_factura INT NOT NULL AUTO_INCREMENT,
    fecha DATE null,
    id_cliente INT NOT NULL,
    id_forma_pago INT NOT NULL,
    PRIMARY KEY (id_factura),
    CONSTRAINT id_cliente FOREIGN KEY (id_cliente) REFERENCES clientes (id_cliente),
    CONSTRAINT id_forma_pago FOREIGN KEY (id_forma_pago) REFERENCES forma_pagos (id_forma_pago)
)  ENGINE=InnoDB;

-- CREAR TABLA CATEGORIAS
CREATE TABLE categorias(
    id_categoria INT NOT NULL AUTO_INCREMENT,
    categoria int NOT NULL,
    descripcion VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_categoria)
)  ENGINE=InnoDB;

-- CREAR TABLA PROVEEDORES
CREATE TABLE proveedores(
    id_proveedor INT NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    pais varchar(30) NOT NULL,
    ciudad varchar(30) NOT NULL,
    telefono VARCHAR(10) NOT NULL,
    direccion varchar(100) NOT NULL,
    PRIMARY KEY (id_proveedor)
)  ENGINE=InnoDB;

-- CREAR TABLA PRODUCTOS

CREATE TABLE productos (
    id_producto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45) NOT NULL,
    precio DECIMAL(18 , 2 ) NOT NULL,
    stock int not null,
    fecha_elaboracion date not null,
    fecha_vencimiento date not null,
    id_categoria int not null,
    id_proveedor int not null,
    PRIMARY KEY (id_producto),
    CONSTRAINT id_proveedor FOREIGN KEY(id_proveedor) REFERENCES proveedores(id_proveedor),
    CONSTRAINT id_categoria FOREIGN KEY (id_categoria) REFERENCES categorias (id_categoria)
)  ENGINE=InnoDB;


-- CREAR TABLA DETALLEVENTAS

CREATE  TABLE detalle_factura
 (
  id_detalle_factura INT NOT NULL AUTO_INCREMENT,
  numero_factura INT NOT NULL,
  cantidad INT NOT NULL,
  valor_total DECIMAL(18,2),
  id_producto INT NOT NULL,
  id_factura int not null,
  PRIMARY KEY (id_detalle_factura) ,
CONSTRAINT id_producto FOREIGN KEY(id_producto) REFERENCES productos(id_producto),
CONSTRAINT id_factura FOREIGN KEY(id_factura) REFERENCES facturas(id_factura)
)ENGINE=InnoDB;



--Procedimiento almacenado registrar usuario
DELIMITER $$
create procedure RegistrarUsuario
(
  in id_tipo_usuario int, 
  in usuario varchar(50),
  in password varchar(100)
)
begin
  insert into usuarios(id_tipo_usuario,usuario,password) values(id_tipo_usuario,usuario,password);
end$$ 

DELIMITER ;

--insertar usuario forma manual
--insert into usuarios (id_tipo_usuario,usuario,password) values(1,"admin","admin");

--eliminar un procedimiento almacenado
--DROP PROCEDURE IF EXISTS RegistrarUsuario;

--ver los procedimientos almacenados que se han creado
--show procedure status;

--ejecutar un procedimiento almacenado
--call RegistrarUsuario(2,"vendedor","vendedor");




DELIMITER $$
CREATE PROCEDURE consulta (IN tipoCliente INT)
BEGIN
SELECT * FROM tipo_usuarios WHERE id_tipo_usuario = tipoCliente;
END$$ 
DELIMITER ;

--call consulta(1);

DELIMITER $$
CREATE PROCEDURE consultaTotalCLientes ()
BEGIN
SELECT count(id_cliente) FROM clientes;
END$$ 
DELIMITER ;

--call consulta(1);

select tp.descripcion from usuarios u inner join tipo_usuarios tp on u.id_tipo_usuario = tp.id_tipo_usuario where u.usuario='"+usuario+"' and u.password='"+pas+"'

select tp.descripcion from usuarios u inner join tipo_usuarios tp on u.id_tipo_usuario = tp.id_tipo_usuario where u.usuario='admin' and u.password='admin';