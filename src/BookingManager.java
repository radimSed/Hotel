import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> listOfBookings = new ArrayList<>();

    public void addBooking(Booking booking){
        this.listOfBookings.add(booking);
    }

    public Booking getBooking(int index){
        return this.listOfBookings.get(index);
    }

    public List<Booking> getBookings(){
        List<Booking> returnList = new ArrayList<>();
        returnList.addAll(this.listOfBookings);
        return returnList;
    }

    public void clearBookings(){
        this.listOfBookings.clear();
    }

    public int getNumberOfWorkingBookings(){
        int numberOfWorkingBookings = 0;
        for(Booking booking : listOfBookings){
            if (booking.getTypeOfStay() == TypeOfStay.WORK){
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }

    public float getAverageNumberOfGuests(){
        float averageNumberOfGuests = 0.0f;
        int numberOfReservations, totalNumberOfGuests = 0;

        if ((numberOfReservations = this.listOfBookings.size()) > 0) {
            for (Booking booking : this.listOfBookings) {
                totalNumberOfGuests += booking.getNumberOfGuests();
            }
            averageNumberOfGuests = (float) totalNumberOfGuests / numberOfReservations;
        }
        return averageNumberOfGuests;
    }
}
