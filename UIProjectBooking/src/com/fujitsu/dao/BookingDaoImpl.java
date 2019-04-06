package com.fujitsu.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fujitsu.bean.Booking;


@Repository
@Transactional
public class BookingDaoImpl implements BookingDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Booking.class);
	}

	@Override
	public Booking getBookingById(int bookingId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Booking.class, bookingId);
	}

	@Override
	public void insert(Booking booking)  {
		// TODO Auto-generated method stub
		hibernateTemplate.save(booking);
		
	}

	@Override
	public void update(Booking booking)  {
		// TODO Auto-generated method stub
		hibernateTemplate.update(booking);
		
	}

	@Override
	public void delete(Booking booking)  {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(booking);
		
	}

}
