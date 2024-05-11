public class Room {
    private int roomNmbr;
    private int nmbrOfBeds;
    private boolean haveBalcony;
    private boolean haveSeaView;
    private double pricePerNight;

    public Room(int roomNmbr, int nmbrOfBeds, boolean haveBalcony, boolean haveSeaView, double pricePerNight) {
        this.roomNmbr = roomNmbr;
        this.nmbrOfBeds = nmbrOfBeds;
        this.haveBalcony = haveBalcony;
        this.haveSeaView = haveSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNmbr() {
        return roomNmbr;
    }

    public void setRoomNmbr(int roomNmbr) {
        this.roomNmbr = roomNmbr;
    }

    public int getNmbrOfBeds() {
        return nmbrOfBeds;
    }

    public void setNmbrOfBeds(int nmbrOfBeds) {
        this.nmbrOfBeds = nmbrOfBeds;
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

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
