package com.fujitsu.services;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import com.fujitsu.beans.Booking;
import com.fujitsu.daos.BookingDAO;
import com.fujitsu.exceptions.ServiceExceptions;

/**
 *@author: Darshana Shinde;
 *Creation Date: 27th March 2019
 *Modification Date: 28th March 2019
 *Version: 1.0
 *Copyright of: Fujitsu Consulting India
 *Description: Service Component implementor of Bussiness Layer
 *
 */

public class BookingServiceImpl implements BookingService {

	private BookingDAO bookingDao;


	public void setBookingDao(BookingDAO bookingDao) {
		this.bookingDao = bookingDao;
	}

	@Override
	public List<Booking> findAllBookings() throws ServiceExceptions {

		try {
			return bookingDao.getAllBookings();
		} catch (SQLException e) {

			throw new ServiceExceptions("Service Error: "+e.getMessage());
		}
	}

	@Override
	public Booking findById(int bookingId) throws ServiceExceptions {

		try {
			return bookingDao.getBookingById(productId);
		} catch (SQLException e) {

			throw new ServiceExceptions("Service Error: product not found as per ID"+e.getMessage());
		}
	}

	@Override
	public void add(Booking booking) throws ServiceExceptions {
		try {
			bookingDao.insert(booking);
		} catch (SQLException e) {

			throw new ServiceExceptions("Service Error!"+e.getMessage());
		}


	}

	@Override
	public void update(Booking booking) throws ServiceExceptions {
		try {
			bookingDao.update(booking);
		} catch (SQLException e) {

			throw new ServiceExceptions("Service Error!"+e.getMessage());
		}

	}

	@Override
	public void remove(Booking booking) throws ServiceExceptions {
		try {
			bookingDao.delete(booking);
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}

	@Override
	public List<Booking> sortBookingsById() throws ServiceExceptions {

		return findAllBookings().stream().sorted().collect(Collectors.toList() );
	}

	/*@Override
	public List<Booking> sortProductsByName() throws ServiceExceptions {

		return findAllProducts().stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
	}*/

	

}
