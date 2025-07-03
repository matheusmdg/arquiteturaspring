package io.github.matheusmdg.arquiteturaspring;

import io.github.matheusmdg.arquiteturaspring.todos.TodoEntity;
import io.github.matheusmdg.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

// singleton
@Lazy(false)
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // ->  1 instância limpa para toda a aplicação
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope("request")  -> não guarda estado
//@Scope("session")  -> seção de um único usuário
//@Scope("application")  -> seção para todos os usuários
//@Scope("prototype")
public class BeanGerenciado {

    private String idUsuarioLogado;

    @Autowired
    private TodoValidator validator;

    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
