package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(5, 10); // Theater with 5 rows and 10 seats per row

        HashMap<Integer, Integer> customerList = new HashMap<>();

        customerList.put(1, 2);
        customerList.put(2, 10);
        customerList.put(3, 7);
        customerList.put(4, 1);
        customerList.put(5, 4);
        customerList.put(6, 3);
        customerList.put(7, 4);
        customerList.put(8, 10);
        customerList.put(9, 12);
        customerList.put(10, 5);


        // Iterate through the HashMap entries
        customerList.forEach((customerNumber, desiredTickets) -> {
            Thread reservationThread = new Thread(new Reservation(theater, desiredTickets));
            reservationThread.start();
        });
    }
}
