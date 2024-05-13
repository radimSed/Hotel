import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest;
    private List<Guest> otherGuests = new ArrayList();
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private TypeOfStay typeOfStay;

    public Booking(Guest guest, List<Guest> otherGuests, Room room, LocalDate startDate, LocalDate endDate, TypeOfStay typeOfStay) {
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfStay = typeOfStay;
    }

    public Booking(Guest guest, List<Guest> otherGuests, Room room) {
        this(guest, otherGuests, room, LocalDate.now(), LocalDate.now().plusDays(6), TypeOfStay.VACATION);
    }

    public Booking(Guest guest, Room room, LocalDate startDate, LocalDate endDate, TypeOfStay typeOfStay) {
        this.guest = guest;
        this.otherGuests = null;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfStay = typeOfStay;
    }

    public Booking(Guest guest, Room room) {
        this(guest, room, LocalDate.now(), LocalDate.now().plusDays(6), TypeOfStay.VACATION);

    }
        public void showDetails(){
        System.out.println("Guest(s):");
        System.out.println(this.guest.getDescription());
        if( otherGuests != null) {
            for (Guest guest : otherGuests) {
                System.out.println(guest.getDescription());
            }
        }
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Start: " + this.startDate + ", End: " + this.endDate);
        System.out.println("Type: " + this.typeOfStay);
    }

}
