package bookingdetails;

import java.util.Date;

public class TicketInfo {

	private int ticketNumber;
	private int numberOfSeats;
	private Date departureTime;
	
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "TicketInfo [ticketNumber=" + ticketNumber + ", numberOfSeats=" + numberOfSeats + ", departureTime="
				+ departureTime + "]";
	}
	
	
}
