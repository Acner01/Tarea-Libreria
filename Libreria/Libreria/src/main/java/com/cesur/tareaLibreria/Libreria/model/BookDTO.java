package com.cesur.tareaLibreria.Libreria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class BookDTO {
	private Integer id;
	private String titulo;
	private String autor;
	private Boolean reservado;
	private String code;
}
