CREATE TABLE usuarios(
	id BIGINT NOT NULL auto_increment,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);

CREATE TABLE cursos(
	id BIGINT NOT NULL auto_increment,
    curso VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,

    PRIMARY KEY(id)
);

CREATE TABLE topicos(
	id bigint NOT NULL auto_increment,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(300) NOT NULL,
    fecha_creacion DATE,
    estatus VARCHAR(100),
    id_usuario BIGINT,
    id_curso BIGINT,

    PRIMARY KEY(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_curso) REFERENCES cursos(id)
);

CREATE TABLE respuestas(
	id BIGINT PRIMARY KEY auto_increment,
    contenido VARCHAR(250),
    fecha_creacion DATE,
    id_topico BIGINT,
    id_usuario BIGINT,
    FOREIGN KEY (id_topico) REFERENCES topicos(id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);