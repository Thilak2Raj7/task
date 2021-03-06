package BookMyTickets;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bookingdetails.PassengerInfo;
import bookingdetails.SeatInfo;
import bookingdetails.TicketInfo;

public class Cache {
	int ticketNumber = 0;
	Scanner scan = new Scanner(System.in);
	List<SeatInfo> obj1 = new ArrayList<SeatInfo>();
	List<SeatInfo> rac = new ArrayList<SeatInfo>();
	int waitingList=0;
	int referenceId=0;
	Map<Integer, TicketInfo> ticketObj = new HashMap<Integer, TicketInfo>();
	Map<String, List<SeatInfo>> berth = new HashMap<String, List<SeatInfo>>();
	Map<Integer,SeatInfo> filledSlot=new HashMap<Integer,SeatInfo>();
	Map<Integer, Map<Integer, PassengerInfo>> passengerObj = new HashMap<Integer, Map<Integer, PassengerInfo>>();
	
	int wlCount = 0;

	public Cache() {
		System.out.println("Enter the number of seats ");
		int seats = scan.nextInt();
		System.out.println("Enter the number of  rac seats ");
		int racSeats = scan.nextInt();
         System.out.println("Enter the waiting list");
         waitingList=scan.nextInt();
		List<Integer> listOfSeats = new ArrayList<>();
		System.out.println("i");
		for (int i = 1; i <= seats; i++) {

			System.out.println(i);
			listOfSeats.add(i);
			System.out.println(listOfSeats);
			if (listOfSeats.size() == 3) {

				for (int j = 0; j < listOfSeats.size(); j++) {
					SeatInfo seatObj = new SeatInfo();
					System.out.println("This is j" + j);

					seatObj.setSeatNumber(listOfSeats.get(j));

					if (j == 0) {
						seatObj.setBerthType("Lower");
						int seatNumber = seatObj.getSeatNumber();
						List<SeatInfo> lower = berth.get("Lower");
						if (lower == null) {
							lower = new ArrayList<>();
						}
						lower.add(seatObj);
						berth.put("Lower", lower);

						obj1.add(seatObj);

					} else if (j == 1) {

						int seatNumber = seatObj.getSeatNumber();
						List<SeatInfo> middle = berth.get("Middle");
						if (middle == null) {
							middle = new ArrayList<>();
						}

						seatObj.setBerthType("Middle");
						middle.add(seatObj);
						berth.put("Middle", middle);
						obj1.add(seatObj);

					} else if (j == 2) {

						int seatNumber = seatObj.getSeatNumber();
						List<SeatInfo> upper = berth.get("Upper");
						if (upper == null) {
							upper = new ArrayList<>();
						}

						seatObj.setBerthType("Upper");
						upper.add(seatObj);
						berth.put("Upper", upper);
						obj1.add(seatObj);

					}
				}

				listOfSeats.clear();
			}

		}
//		for (int i = 0; i < obj1.size(); i++) {
//			System.out.println(obj1.get(i));
//		}

		for (int i = 1; i <= racSeats; i++) {
			System.out.println("RAC seats");
			SeatInfo seat = new SeatInfo();
			seat.setSeatNumber(i);
			rac.add(seat);

			System.out.println(seat);
		}
		System.out.println("rac seats" + rac.size());
		System.out.println(berth);
		List<SeatInfo> lower = berth.get("Lower");
		System.out.println("Lower-" + lower.size());
		List<SeatInfo> middle = berth.get("Middle");
		System.out.println("Middle-" + middle.size());

		List<SeatInfo> upper = berth.get("Upper");
		System.out.println("Upper-" + upper.size());

	}

	public int generateTicketNumber() {
		return ++ticketNumber;

	}

	public int generateReferenceId() {
		return ++referenceId;
	}
	public String berthPreference() {
		System.out.println("Press 1 for Lower or press 2 for middle or press 3 for upper");
		int number = scan.nextInt();
		String preference = "";

		switch (number) {
		case 1:

			List<SeatInfo> lowerSeat = berth.get("Lower");
			if (!lowerSeat.isEmpty()) {
				preference = "Lower";

				berth.put("Lower", lowerSeat);
			}

			else {
				System.out.println("Lower berth is not available");
				  
				   
			}
			break;

		case 2:
			List<SeatInfo> middleSeat = berth.get("Middle");
			if (!middleSeat.isEmpty()) {
				preference = "Middle";

				berth.put("Middle", middleSeat);

			} else {
				System.out.println("Middle berth is not available");

			}
			break;

		case 3:
			List<SeatInfo> upperSeat = berth.get("Upper");
			if (!upperSeat.isEmpty()) {
				preference = "Upper";

				berth.put("Upper", upperSeat);
			} else {
				System.out.println("Upper berth is not available");

			}
			break;

		default:
			System.out
					.println("Enter valid number \n" + "Press 1 for Lower or press 2 for middle or press 3 for upper");
			berthPreference();
		}

		return preference;
	}

	public SeatInfo racBooking() {

		SeatInfo seat = rac.get(0);
		return seat;
	}

	public SeatInfo waitingList() {

		SeatInfo seat = new SeatInfo();
		++wlCount;
		return seat;
	}
	public void checkPreference()
	{
		
		
		
		
	}

	public void bookTickets() {
		System.out.println("Available ticket count" + obj1.size());
		System.out.println("Rac ticket count" + rac.size());
		System.out.println("Enter the number of tickets");
		int tickets = scan.nextInt();
		int count = 0;
		int seatNumber = 0;

		boolean available = true;
		String preference = "";

		int totalTickets = obj1.size() + rac.size() + waitingList;
		
		
		System.out.println("totaltickets" + totalTickets);
		if (tickets <= totalTickets) {
			available = true;
		}

		else {
			available = false;
			System.out.println("Ticket is not available");
			System.out.println("Available ticket count" + obj1.size());
			System.out.println("Rac ticket count" + rac.size());

		}

		if (available == true) {
			int ticketNumber = generateTicketNumber();

			for (int i = 1; i <= tickets; i++) {

				Map<Integer, PassengerInfo> fillDetails = passengerObj.get(ticketNumber);
				if (fillDetails == null) {
					fillDetails = new HashMap<Integer, PassengerInfo>();
				}
				passengerObj.put(ticketNumber, fillDetails);

				scan.nextLine();
				System.out.println("Enter the name");
				String name = scan.nextLine();
				System.out.println("Enter the age");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the gender");
				String gender = scan.nextLine();
				String status = "";
				int refId=generateReferenceId();
				if (!obj1.isEmpty()) {
					
					preference = berthPreference();
					checkPreference();
						
					
					List<SeatInfo> listObj = berth.get(preference);
					System.out.println(listObj);
					SeatInfo seat = listObj.get(0);
					
					filledSlot.put(refId,seat);
					System.out.println(seat);
					seatNumber = seat.getSeatNumber();
' 					status = "Booked";
					listObj.remove(0);
					berth.put(preference, listObj);
					obj1.remove(0);

				} else {
					if (!rac.isEmpty()) {
						SeatInfo racObj = racBooking();
						racObj.setBerthType("SideLower");
						seatNumber = racObj.getSeatNumber();
						preference = racObj.getBerthType();
						status = "RAC";
						rac.remove(0);
						filledSlot.put(refId,racObj);
					} else if (waitingList != 0) {
						SeatInfo seat = waitingList();
						status = "WL" + String.valueOf(wlCount);
						filledSlot.put(refId, seat);
						waitingList--;
					}
				}

				PassengerInfo passenger = new PassengerInfo();
				
				passenger.setSerialNumber(refId);
				passenger.setAge(age);
				passenger.setBerthPreference(preference);
				passenger.setName(name);
				passenger.setGender(gender);
				passenger.setSeatNumber(seatNumber);
				passenger.setStatus(status);
				fillDetails.put(i, passenger);
				
			}
			TicketInfo ticket = new TicketInfo();
			Date obj = new Date();

			ticket.setTicketNumber(ticketNumber);
			ticket.setDepartureTime(obj);
			ticket.setNumberOfSeats(tickets);
			ticketObj.put(ticketNumber, ticket);
			System.out.println(ticketObj);
			System.out.println(passengerObj);
		}

	}

	public void cancelTicket() {
		System.out.println("Enter the ticket number to cancel the tickets");
		int ticketNo = scan.nextInt();

		if (passengerObj.containsKey(ticketNo)) {
			Map<Integer, PassengerInfo> passenger = passengerObj.get(ticketNumber);
			for (int i = 1; i <= passenger.size(); i++) {
				PassengerInfo pass = passenger.get(i);
				System.out.println("serialNumber " + pass.getSerialNumber());
				System.out.println("name " + pass.getName());
				System.out.println("age " + pass.getAge());
				System.out.println();

			}
			boolean value = true;
			while (value == true) {
				System.out.println("Enter the serial Number you want to delete");
				int serialNumber = scan.nextInt();
				PassengerInfo detail=passenger.remove(serialNumber);
				String preference=detail.getBerthPreference();
				
				
				int seatNumber=detail.getSeatNumber();
				passenger.remove(serialNumber);
				
				passengerObj.put(ticketNumber, passenger);
				TicketInfo obj = ticketObj.get(ticketNumber);
				int seats = obj.getNumberOfSeats() - 1;
				List<SeatInfo> seatObj=berth.get(preference);
				if(seatObj==null)
				{
					seatObj=new ArrayList<>();
				}
				SeatInfo seat=filledSlot.get(serialNumber);
				seatObj.add(seat);
				berth.put(preference,seatObj);
				System.out.println("Press 1 for back option");
				int number = scan.nextInt();
				if (number == 1) {
					value = false;
				}
			}
		}
		System.out.println(passengerObj);

	}

	public void getTicketDetails() {
		System.out.println(ticketObj);
	}

	public void getDetails() {
		System.out.println(passengerObj);
		System.out.println(ticketObj);

		cancelTicket();
	}

	public void getBerthDetails() {

		List<SeatInfo> lower = berth.get("Lower");
		System.out.println(lower);
		List<SeatInfo> middle = berth.get("Middle");
		System.out.println(middle);
		List<SeatInfo> upper = berth.get("Upper");
		System.out.println(upper);
	}

}