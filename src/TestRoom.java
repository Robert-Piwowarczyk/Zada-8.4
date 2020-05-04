public class TestRoom {
    public static void main(String[] args) {
        GuestRoom guestRoom = new GuestRoom("10m",
                21.0, 1,-1);
        Kitchen kitchen = new Kitchen("10m",20.0,
                2,-2);


        System.out.println(guestRoom.lowerTemperature(Room));
        System.out.println(kitchen.lowerTemperature(Room));
    }
}
