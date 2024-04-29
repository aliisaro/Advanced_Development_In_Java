package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

class Reservation implements Runnable {
    private static int customerCounter = 1;
    private final Theater theater;
    private final int customerNumber;
    private final int desiredTickets;

    public Reservation(Theater theater, int desiredTickets) {
        this.theater = theater;
        this.customerNumber = customerCounter++;
        this.desiredTickets = desiredTickets;
    }

    @Override
    public void run() {
        int ticketsReserved = 0;
        for (int i = 1; i <= theater.getRows(); i++) {
            for (int j = 1; j <= theater.getSeatsPerRow(); j++) {
                if (ticketsReserved < desiredTickets && theater.reserveSeat(i, j)) {
                    ticketsReserved++;
                }
            }
        }
        System.out.println("Customer " + customerNumber + " desires " + desiredTickets + " tickets. " +
                (ticketsReserved > 0 ? "Reserved " + ticketsReserved + " tickets." : "Couldn't reserve " + desiredTickets + " tickets."));
    }
}