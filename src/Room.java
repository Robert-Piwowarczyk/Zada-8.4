public class Room {
    private String surfaceRoom;
    private double temperature;
    private int roomNumber;
    private double conditioner;

    public Room(String surfaceRoom, double temperature, int roomNumber,
                double conditioner) {
        this.surfaceRoom = surfaceRoom;
        this.temperature = temperature;
        this.roomNumber = roomNumber;
        this.conditioner = conditioner;
    }

    public String getSurfaceRoom() {
        return surfaceRoom;
    }

    public void setSurfaceRoom(String surfaceRoom) {
        this.surfaceRoom = surfaceRoom;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getConditioner() {
        return conditioner;
    }

    public void setConditioner(double conditioner) {
        this.conditioner = conditioner;
    }

    public void fireAirConditioner(){
        if(temperature>20);
        this.temperature = this.temperature - 0.1;
    }
    public void lowerTemperature(){
        fireAirConditioner();
    }
}
