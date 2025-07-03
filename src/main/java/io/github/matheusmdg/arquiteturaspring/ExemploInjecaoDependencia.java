package io.github.matheusmdg.arquiteturaspring;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.SQLException;


public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        //Connection connection = dataSource.getConnection();

       // EntityManager entityManager = null;

        //TodoRepository repository = new SimpleJpaRepository<TodoEntity, Integer>(null, null);

        //TodoService todoService = new TodoService(repository, new TodoValidator());

//        BeanGerenciado beanGerenciado = new BeanGerenciado(null);
//        beanGerenciado.setValidator(todoValidator);
//        if(condicao == true)
    }
}
