### paciente-app

Microsserviço desenvolvido para cadastro e autenticação de pacientes para o projeto **Health&Med** - HACKATHON SOAT 2024.


**Sobre o projeto**

* Spring-boot 3 com Java 17
* Banco de dados MariaDB
* Path: /paciente-app
* Porta: 8080


**Requisitos para executar**

- Criação do banco de dados

```
$ docker run --detach --name mariadb-paciente-db -p 3306:3306 --env MARIADB_DATABASE=pacientedb --env  MARIADB_USER=mariadb --env MARIADB_PASSWORD=root --env MARIADB_ROOT_PASSWORD=root mariadb:latest
```

**Executar**

```
$ mvn clean install
```

```
$ spring-boot:run
```

**Swagger**

[Link Swagger](http://localhost:8080/paciente-app/swagger-ui/swagger-ui/index.html)
