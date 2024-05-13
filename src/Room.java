import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean haveBalcony;
    private boolean haveSeaView;
    private BigDecimal pricePerNight;

    public Room(int roomNumber, int numberOfBeds, boolean haveBalcony, boolean haveSeaView, BigDecimal pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.haveBalcony = haveBalcony;
        this.haveSeaView = haveSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean getHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public boolean getHaveSeaView() {
        return haveSeaView;
    }

    public void setHaveSeaView(boolean haveSeaView) {
        this.haveSeaView = haveSeaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
