package com.cesur.tareaLibreria.Libreria.sevice;

import java.util.ArrayList;

import com.cesur.tareaLibreria.Libreria.model.ReservationDTO;

public interface ReservationServise {

	ReservationDTO reserveBook(Long bookId, Long userId);
	
	Void cancelReservation(Long bookId, Long userId);
	
	ArrayList<ReservationDTO>getAllReservations(Long userId);
	
}
