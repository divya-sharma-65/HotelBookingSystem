package com.fujitsu.dao;

import java.util.List;

import com.fujitsu.bean.Booking;

public interface BookingDao {
	
	List<Booking> getAllBookings();
	
	Booking getBookingById(int bookingId);
	
	void insert(Booking booking);
	void update(Booking booking) ;
	void delete(Booking booking) ;
	
	
	
	
	
}
