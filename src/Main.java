import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BookingManager bookingManager = new BookingManager();

    public static void main(String[] args) {
        fillBookings();
        System.out.println("Seznam všech rezervací:");
        listOfBookings();
        System.out.println("******************************************************************************************");
        int numberOfVacationsToDisplay = 5;
        System.out.println("Prvních " + numberOfVacationsToDisplay + " dovolených:");
        listOfVacations(numberOfVacationsToDisplay);
        System.out.println("******************************************************************************************");
        System.out.println("Statistiky:");
        listOfGuestStatistics();
        System.out.println("Průměrný počet hostů na rezervaci je " + bookingManager.getAverageNumberOfGuests());
        System.out.println("Počet pracovních rezervací je " + bookingManager.getNumberOfWorkingBookings());

    }

    public static void fillBookings() {
        Room room1, room2, room3;
        room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

        Guest karel1, karel2, karolina;
        karel1 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        karel2 = new Guest("Karel", "Dvořák", LocalDate.of(1975, 1, 3));
        karolina = new Guest("Karolina", "Tmavá", LocalDate.of(2000, 1, 1), "Fyzioterapeut");

        bookingManager.addBooking(new Booking(karel1, room3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), TypeOfStay.WORK));
        bookingManager.addBooking(new Booking(karel2, room2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), TypeOfStay.VACATION));

        int day = 1;
        for (int i = 0; i < 10; i++) {
            bookingManager.addBooking(new Booking(karolina, room2, LocalDate.of(2023, 8, day), LocalDate.of(2023, 8, day + 1), TypeOfStay.VACATION));
            day += 2;
        }

        bookingManager.addBooking(new Booking(karolina, room3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), TypeOfStay.WORK));

        //few more reservations to test the program
        List<Guest> otherGuests1 = new ArrayList();
        otherGuests1.add(karel1);
        otherGuests1.add(karel2);

        List<Guest> otherGuests2 = new ArrayList();
        otherGuests2.add(karolina);

        bookingManager.addBooking(new Booking(karel1, otherGuests2, room3, LocalDate.of(2023, 12, 28), LocalDate.of(2024, 1, 2), TypeOfStay.VACATION));
        bookingManager.addBooking(new Booking(karolina, otherGuests1, room3, LocalDate.of(2024, 2, 1), LocalDate.of(2024, 2, 2), TypeOfStay.VACATION));
    }

    private static void listOfBookings(){
        for( Booking booking : bookingManager.getBookings()){
            System.out.println(booking.getDetails());
        }
    }

    private static void listOfVacations(int numberOfRequestedVacations){
        int vacations = 0;
        for( Booking booking : bookingManager.getBookings()){
            if (booking.getTypeOfStay() == TypeOfStay.VACATION){
                System.out.println(booking.getDetails());
                vacations++;
            }
            if ( vacations == numberOfRequestedVacations ){
                break;
            }
        }
    }

    private static void listOfGuestStatistics(){
        int oneGuestReservations = 0, twoGuestsReservations = 0, moreGuestsReservations = 0;
        for( Booking booking : bookingManager.getBookings()){
            int numberOfGuests = booking.getNumberOfGuests();
            switch (numberOfGuests) {
                case 1:
                    oneGuestReservations++;
                    break;
                case 2:
                    twoGuestsReservations++;
                    break;
                default:
                    moreGuestsReservations++;
                    break;
            }
        }
        System.out.println("Celkový počet rezervací s jedním hostem je " + oneGuestReservations);
        System.out.println("Celkový počet rezervací s dvěma hosty je " + twoGuestsReservations);
        System.out.println("Celkový počet rezervací s více než dvěma hosty je " + moreGuestsReservations);
    }


}
