package com.fujitsu.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="BOOKINGS")

public class Booking implements Serializable, Comparable<Booking>
{
	@Id
	@GeneratedValue(generator="increment")
	private int bookingId;
	private LocalDate bookingdate;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private int numberOfRooms;
	private int noOfAdults;
	private int noOfChildren;
	private int customerId;
	private int hotelId;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Booking(int bookingId, LocalDate bookingdate, LocalDate checkInDate, LocalDate checkOutDate,
			LocalTime checkInTime, LocalTime checkOutTime, int numberOfRooms, int noOfAdults, int noOfChildren,
			int customerId, int hotelId) {
		super();
		this.bookingId = bookingId;
		this.bookingdate = bookingdate;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.numberOfRooms = numberOfRooms;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.customerId = customerId;
		this.hotelId = hotelId;
	}


	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(LocalDate bookingdate) {
		this.bookingdate = bookingdate;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	@Override
	public int compareTo(Booking b) {
		// TODO Auto-generated method stub
		return this.bookingId>b.bookingId?1:-1;
	}
	
	
	
	
}
 