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
        return listOfBookings;
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
        float averageNumberOfGuests;
        int numberOfReservations, totalNumberOfGuests = 0;

        numberOfReservations = this.listOfBookings.size();

        for( Booking booking : this.listOfBookings){
            totalNumberOfGuests += booking.getNumberOfGuests();
        }
        averageNumberOfGuests = (float)totalNumberOfGuests/numberOfReservations;
        return averageNumberOfGuests;
    }
}
