import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
        public String getDetails(){
        String startDate, endDate, birthDay;
        String details;

        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        startDate = this.startDate.format(dateFormater);
        endDate = this.endDate.format(dateFormater);
        birthDay = this.guest.getDateOfBirth().format(dateFormater);
        details = startDate + " až " + endDate + // from - to
                  ": " + this.guest.getName() + " " + this.guest.getSurname() + // name surname
                  " (" + birthDay + //date of birth
                  ") [" + this.getNumberOfGuests() + ", " + (room.getHaveSeaView() == true ? "Ano" : "Ne" ) + //number of guests, has sea view
                  "] za " + this.getPrice(); //price per stay
        return details;
    }

    public TypeOfStay getTypeOfStay(){
        return this.typeOfStay;
    }

    public int getNumberOfGuests(){
        //miniumum 1 guest per reservation is insured as without him the reservation is not possible
        int numberOfGuests = 1;

        if( this.otherGuests != null ){
            numberOfGuests += otherGuests.size();
        }
        return numberOfGuests;
    }

    public long getBookingLength(){
        return ChronoUnit.DAYS.between(this.startDate, this.endDate);
    }

    public BigDecimal getPrice(){
        long nights = this.getBookingLength();
        return this.room.getPricePerNight().multiply(BigDecimal.valueOf(nights));
    }
}
