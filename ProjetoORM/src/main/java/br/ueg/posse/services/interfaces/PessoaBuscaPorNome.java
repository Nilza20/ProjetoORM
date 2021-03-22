package br.ueg.posse.services.interfaces;

import java.util.List;

import br.ueg.posse.model.Pessoa;

public interface PessoaBuscaPorNome extends CrudService<Pessoa, Integer> {

	List<Pessoa> searchByName(String name);

}