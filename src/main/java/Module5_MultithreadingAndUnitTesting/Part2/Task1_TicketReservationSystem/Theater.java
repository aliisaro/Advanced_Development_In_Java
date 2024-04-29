package Module5_MultithreadingAndUnitTesting.Part2.Task1_TicketReservationSystem;

import java.util.HashMap;
import java.util.Map;

class Theater {
    private final Map<String, Boolean> seatsMap = new HashMap<>();
    private int rows;
    private int seatsPerRow;

    public Theater(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        for (int row = 1; row <= rows; row++) {
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                seatsMap.put(generateSeatKey(row, seat), true); // true represents available seat
            }
        }
    }

    private String generateSeatKey(int row, int seat) {
        return row + "-" + seat;
    }

    public int getRows() {
        return rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public synchronized boolean reserveSeat(int row, int seat) {
        String seatKey = generateSeatKey(row, seat);
        if (seatsMap.containsKey(seatKey) && seatsMap.get(seatKey)) {
            seatsMap.put(seatKey, false); // Mark seat as reserved
            return true;
        }
        return false; // Seat already reserved or not available
    }
}
