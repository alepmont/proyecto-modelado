package com.modelado.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelado.models.Usuario;

@RestController
public class UsuarioController {
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
				
		return "No eres un Bot, o si?";
				
	}
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Ale","Juan","Jose");
	}
	
	@RequestMapping(value="usuarios")
	public Usuario listarUsuario() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Ale");
		usuario.setApellido("Gonz");
		usuario.setEmail("ale26gonz@gmail.com");
		usuario.setTelefono("12341234");
		
		
		return usuario;
		
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Ale");
		usuario.setApellido("Gonz");
		usuario.setEmail("ale26gonz@gmail.com");
		usuario.setTelefono("12341234");
		
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Ale");
		usuario1.setApellido("Gonz");
		usuario1.setEmail("ale26gonz@gmail.com");
		usuario1.setTelefono("12341234");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Juan");
		usuario2.setApellido("Ponz");
		usuario2.setEmail("juan26ponz@gmail.com");
		usuario2.setTelefono("1234512345");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Jose");
		usuario3.setApellido("Monz");
		usuario3.setEmail("jose26monz@gmail.com");
		usuario3.setTelefono("123123");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
	}
	
}

