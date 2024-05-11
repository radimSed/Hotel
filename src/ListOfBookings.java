import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> listOfBookings = new ArrayList<>();

    public void addBooking(Booking booking){
        listOfBookings.add(booking);
    }

    public void writelistOfBookings(){
        for(Booking booking: listOfBookings){
            booking.showDetails();
            System.out.println("**************************************************************************");
        }
    }
}
