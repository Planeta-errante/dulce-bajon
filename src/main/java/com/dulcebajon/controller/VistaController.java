package com.dulcebajon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dulcebajon.models.Usuario;
import com.dulcebajon.models.dao.IUsuarioDao;

@Controller
public class VistaController {
	
	@GetMapping({ "/index", "/" })
	public String index() {
		return "index";
	}

	@GetMapping({ "/productos" })
	public String productos() {
		return "productos";
	}

	@GetMapping({ "/contacto" })
	public String contacto(Model model) {
		return "contacto";
	}

	@PostMapping({ "includes/formContacto" })
	public String formContacto(Model model, @RequestParam(name = "email") String email,
			@RequestParam(name = "mensaje") String mensaje) {
		model.addAttribute("email", email);
		model.addAttribute("mensaje", mensaje);
		return "includes/formContacto";
	}

	@GetMapping({ "/sucursales" })
	public String sucursales() {
		return "sucursales";
	}

	/*@GetMapping({ "/delivery" })
	public String delivery() {
		return "delivery";
	}*/

	@GetMapping({ "/tortas" })
	public String tortas() {
		return "coleccion/tortas";
	}

	@GetMapping({ "/kuchenes" })
	public String kuchenes() {
		return "coleccion/kuchenes";
	}

	@GetMapping({ "/otros" })
	public String otros() {
		return "coleccion/otros";
	}

	@GetMapping({ "/carrito" })
	public String carrito() {
		return "carrito";
	}
	
	// BD
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@GetMapping({ "/formUser" })
	public String formUser() {
		return "formUser";
	}

	@PostMapping({ "includes/formUserLogin" })
	public String formUserLogin(Model model, @RequestParam(name = "correo") String correo,
			@RequestParam(name = "password") String password) {
		model.addAttribute("correo", correo);
		model.addAttribute("password", password);
		return "includes/formUserLogin";
	}
	
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("usuarios", usuarioDao.findAll()); 
		return "/delivery";
	}

	@RequestMapping(value = "/registrarse")
	public String registrarse(Map<String, Object>model) {
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return "/registrarse";
	}
	
	@RequestMapping(value = "/registrarse", method = RequestMethod.POST)
	public String guardarRegistro(Usuario usuario) {
		usuarioDao.save(usuario);
		return "/registrarse";
	}

	@PostMapping({"includes/registroUser"})
	public String registroUser(Model model,
			@RequestParam(name= "nombre") String nombre,
			@RequestParam(name= "apellido") String apellido,
			@RequestParam(name= "correo") String correo,
			@RequestParam(name= "telefono") String telefono,
			@RequestParam(name= "password") String password) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("correo", correo);
		model.addAttribute("telefono", telefono);
		model.addAttribute("password", password);
		return "includes/registroUser";
	}

}
