package com.fujitsu.services;

import java.util.List;

import com.fujitsu.beans.Booking;
import com.fujitsu.exceptions.ServiceExceptions;

/**
 *@author: Darshana Shinde;
 *Creation Date: 27th March 2019
 *Modification Date: 28th March 2019
 *Version: 1.0
 *Company: Fujitsu.com
 *Description: Service Component interface of Bussiness Layer
 *
 */
public interface BookingService {

	List<Booking> findAllBookings() throws ServiceExceptions;

	Product findById(int BookingId) throws ServiceExceptions;

	void add(Booking booking) throws ServiceExceptions;

	void update(Booking booking)throws ServiceExceptions;

	void remove(Booking booking)throws ServiceExceptions;
	
	
	List<Booking> sortBookingsById() throws ServiceExceptions;
	//List<Booking> sortBookingsByName() throws ServiceExceptions;
	
	
	
	
}
