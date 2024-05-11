import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest;
    private List<Guest> otherGuests = new ArrayList();
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private Stay stay;

    public Booking(Guest guest, List<Guest> otherGuests, Room room, LocalDate startDate, LocalDate endDate, Stay stay) {
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.stay = stay;
    }

    public Booking(Guest guest, List<Guest> otherGuests, Room room) {
        this(guest, otherGuests, room, LocalDate.now(), LocalDate.now().plusDays(6), Stay.VACATION);
    }

    public Booking(Guest guest, Room room, LocalDate startDate, LocalDate endDate, Stay stay) {
        this.guest = guest;
        this.otherGuests = null;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.stay = stay;
    }

    public Booking(Guest guest, Room room) {
        this(guest, room, LocalDate.now(), LocalDate.now().plusDays(6), Stay.VACATION);

    }
        public void showDetails(){
        System.out.println("Guest(s):");
        System.out.println(this.guest.getDescription());
        if( otherGuests != null) {
            for (Guest guest : otherGuests) {
                System.out.println(guest.getDescription());
            }
        }
        System.out.println("Room: " + room.getRoomNmbr());
        System.out.println("Start: " + this.startDate + ", End: " + this.endDate);
        System.out.println("Type: " + this.stay);
    }

}
