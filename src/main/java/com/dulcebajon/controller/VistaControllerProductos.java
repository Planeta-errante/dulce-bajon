package com.dulcebajon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaControllerProductos {
	
	@GetMapping({ "coleccion/tortasProductos/torta-chocolate-guinda"})
	public String tortaChocolateGuinda() {
		return "coleccion/tortasProductos/torta-chocolate-guinda";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-tres-leches"})
	public String tortaTresLeches() {
		return "coleccion/tortasProductos/torta-tres-leches";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-naranja"})
	public String tortaNaranja() {
		return "coleccion/tortasProductos/torta-naranja";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-mil-hojas"})
	public String tortaMilHojas() {
		return "coleccion/tortasProductos/torta-mil-hojas";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-manjar-nuez"})
	public String tortaManjarNuez() {
		return "coleccion/tortasProductos/torta-manjar-nuez";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-lucuma"})
	public String tortaLucuma() {
		return "coleccion/tortasProductos/torta-lucuma";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-frambuesa"})
	public String tortaFrambuesa() {
		return "coleccion/tortasProductos/torta-frambuesa";
	}
	
	@GetMapping({ "coleccion/tortasProductos/torta-chocolate-nuez"})
	public String tortaChocolateNuez() {
		return "coleccion/tortasProductos/torta-chocolate-nuez";
	}
	
	
	
	@GetMapping({ "coleccion/kuchenesProductos/kuchen-cheesecake"})
	public String kuchenCheesecake() {
		return "coleccion/kuchenesProductos/kuchen-cheesecake";
	}
	
	@GetMapping({ "coleccion/kuchenesProductos/kuchen-pastel-de-chocolate"})
	public String kuchenPastelChocolate() {
		return "coleccion/kuchenesProductos/kuchen-pastel-de-chocolate";
	}
	
	@GetMapping({ "coleccion/kuchenesProductos/kuchen-pie-de-limon"})
	public String kuchenPieLimon() {
		return "coleccion/kuchenesProductos/kuchen-pie-de-limon";
	}
	
	@GetMapping({ "coleccion/kuchenesProductos/kuchen-tarta-de-yogurt"})
	public String kuchenTartaYogurt() {
		return "coleccion/kuchenesProductos/kuchen-tarta-de-yogurt";
	}
	
	
	
	@GetMapping({ "coleccion/otrosProductos/otros-alfajores"})
	public String otrosAlfajores() {
		return "coleccion/otrosProductos/otros-alfajores";
	}
	
	@GetMapping({ "coleccion/otrosProductos/otros-barritas"})
	public String otrosBarritas() {
		return "coleccion/otrosProductos/otros-barritas";
	}
	
	@GetMapping({ "coleccion/otrosProductos/otros-galleton-avena"})
	public String otrosGalletonAvena() {
		return "coleccion/otrosProductos/otros-galleton-avena";
	}
	
}
