package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ride 
{
	
	private LocalDate date;
	private String origin;
	private String destination;
	private double fare;
	private LocalTime time;
	
	
	
	public Ride()
	{
		
	}



	public Ride(LocalDate date, String origin, String destination, double fare, LocalTime time) {
		super();
		this.date = date;
		this.origin = origin;
		this.destination = destination;
		this.fare = fare;
		this.time = time;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getFare() {
		return fare;
	}



	public void setFare(double fare) {
		this.fare = fare;
	}



	public LocalTime getTime() {
		return time;
	}



	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	
	
	
	

}
