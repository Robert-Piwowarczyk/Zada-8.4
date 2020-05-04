public class GuestRoom extends Room {
    private  BasicConditioner conditioner;

    public GuestRoom(String surfaceRoom, double temperature,
                     int roomNumber, BasicConditioner conditioner) {
        super(surfaceRoom, temperature, roomNumber);
        this.conditioner = conditioner;
    }

    public BasicConditioner getConditioner() {
        return conditioner;
    }

    public void setConditioner(BasicConditioner conditioner) {
        this.conditioner = conditioner;
    }
}
