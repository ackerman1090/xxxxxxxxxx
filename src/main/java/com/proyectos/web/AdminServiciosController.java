package com.proyectos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.servicios.InformacionDataFtpService;

@RestController
public class AdminServiciosController {

	@Autowired
	InformacionDataFtpService informacionDataFtpService;
    @GetMapping(path="/servicios/{numero_transaccion}/{tipo_archivo}")
	public String generateJson(@PathVariable("numero_transaccion") Long numeroTransaccion, 
            @PathVariable("tipo_archivo") int tipoArchivo) {
		
    	return getInformacionDataFtpService().generateJson(numeroTransaccion, tipoArchivo);
	}
	public InformacionDataFtpService getInformacionDataFtpService() {
		return informacionDataFtpService;
	}
    
}
