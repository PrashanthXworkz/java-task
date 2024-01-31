package com.xworkz.rapido.service;

import com.xworkz.rapido.dto.RapidoDto;

public interface RapidoService {

	boolean validateandSave(RapidoDto rapidoDto);
	void read();
}
