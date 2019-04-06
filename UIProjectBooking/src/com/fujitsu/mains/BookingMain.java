package com.fujitsu.mains;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fujitsu.bean.Booking;
import com.fujitsu.dao.BookingDao;

public class BookingMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		BookingDao bookingDao=ctx.getBean("bookingDaoImpl", BookingDao.class);
		
		
		List<Booking> bookings=bookingDao.getAllBookings();
		bookings.forEach(b->System.out.println(b));
	}
	
	
}
