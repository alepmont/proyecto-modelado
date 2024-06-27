package com.modelado.dao;

import java.util.List;

import com.modelado.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {

	
	
	List<Usuario> obtenerUsuarios();

}
