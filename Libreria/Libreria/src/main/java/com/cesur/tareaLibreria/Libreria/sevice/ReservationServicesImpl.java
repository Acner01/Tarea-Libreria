package com.cesur.tareaLibreria.Libreria.sevice;

import java.util.ArrayList;

import com.cesur.tareaLibreria.Libreria.model.ReservationDTO;

public class ReservationServicesImpl implements ReservationServise{
	ArrayList<ReservationDTO> reservas=new ArrayList();

	@Override
	public ReservationDTO reserveBook(Long bookId, Long userId) {
		
		return null;
	}

	@Override
	public Void cancelReservation(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReservationDTO> getAllReservations(Long userId) {
		
		return reservas;
	}

}
