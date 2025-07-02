package io.github.matheusmdg.arquiteturaspring.api;

import io.github.matheusmdg.arquiteturaspring.montadora.CarroStatus;
import io.github.matheusmdg.arquiteturaspring.montadora.Chave;
import io.github.matheusmdg.arquiteturaspring.montadora.HondaHRV;
import io.github.matheusmdg.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
