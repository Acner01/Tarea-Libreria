package com.cesur.tareaLibreria.Libreria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

	private Integer id;
	private String nombre;
	private String correoElectronico;
}
