package com.proyectos.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectos.model.InformacionDataFtp;
import com.proyectos.repository.InformacionDataFtpDao;


@Service
public class InformacionDataFtpService {

	@Autowired
	private InformacionDataFtpDao informacionDao;
	
	public String generateJson(Long numeroTransaccion, int tipoArchivo){
		if(tipoArchivo == 0) {//conexion a la carpeta comun
			Optional<InformacionDataFtp> data = getInformacionDataFtpDao().findById(numeroTransaccion);
			if(data.isPresent()) {
				return data.toString();
			}else {
				return "no hay nada!!!";
			}
		}else if(tipoArchivo == 0) {//conexion a la carpeta de errores
			return "no hay nada!!!";

		}else {
			return "no hay nada!!!";
		}
	}

	public InformacionDataFtpDao getInformacionDataFtpDao() {
		return informacionDao;
	}
	
}
