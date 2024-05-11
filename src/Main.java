import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1, guest2;
        Room room1, room2, room3;
        Booking booking1, booking2,  booking3, booking4, booking5;
        ListOfBookings listOgBookings = new ListOfBookings();

        guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());


        room1 = new Room(1, 1, true, true, 1000);
        room2 = new Room(2, 1, true, true, 1000);
        room3 = new Room(3, 3, false, true, 2400);

//  musi byt alespon jeden "hlavni" host, protoze konstruktor bez hlavnihio hosta neexistuje
//        booking1 = new Booking(room1, LocalDate.of(2021, 7, 19),
//                LocalDate.of(2021, 7, 26), Stay.VACATION);

        booking1 = new Booking(guest1, room1, LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26), Stay.VACATION);

        listOgBookings.addBooking(booking1);

        List<Guest> list2 = new ArrayList<>();
        list2.add(guest2);

        booking2 = new Booking(guest1, list2, room3, LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14), Stay.VACATION);

        listOgBookings.addBooking(booking2);

        booking3 = new Booking(guest1, room2); //druha rezervace pro Adelu
        booking4 = new Booking(guest1, list2, room3); //druha rezervace na pokoj 3
        booking5 = new Booking(guest2, room3, LocalDate.of(2023, 5, 5), LocalDate.of(2023, 5, 15), Stay.WORK); //treti rezervace na pokoj 3

        listOgBookings.addBooking(booking3);
        listOgBookings.addBooking(booking4);
        listOgBookings.addBooking(booking5);

        listOgBookings.writelistOfBookings();
    }


}
