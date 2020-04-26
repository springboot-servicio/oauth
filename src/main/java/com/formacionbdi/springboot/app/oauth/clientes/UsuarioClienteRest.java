package com.formacionbdi.springboot.app.oauth.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Usuario;

@FeignClient(name = "servicio-usuarios")
public interface UsuarioClienteRest {

	@GetMapping("/usuarios/search/buscarUsername")
	public Usuario findByUsername(@RequestParam String username);
}
