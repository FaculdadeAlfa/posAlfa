package br.com.alfa.desmonte.service.impl;

import br.com.alfa.desmonte.model.Parametro;
import br.com.alfa.desmonte.service.ParametroService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ParametroServiceImpl implements ParametroService, Serializable {

    private static final long serialVersionUID = 1L;

    public List<Parametro> listarTodos() {
        return null;
    }

    @Override
    public Parametro buscarParametroPorNome(String parametro) {
        return new Parametro();
    }

    public void adicionar(Parametro entity) {

    }

    public void atualizar(Parametro entity) {
    }

    public void remover(Parametro entity) {
    }
}