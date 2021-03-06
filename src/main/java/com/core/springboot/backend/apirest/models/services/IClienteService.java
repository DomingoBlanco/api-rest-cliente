package com.core.springboot.backend.apirest.models.services;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.core.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable page);
	
    public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);


}
