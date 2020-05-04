public class Kitchen extends Room {
    private ProConditioner conditioner;

    public Kitchen(String surfaceRoom, double temperature, int roomNumber, ProConditioner conditioner) {
        super(surfaceRoom, temperature, roomNumber);
        this.conditioner = conditioner;
    }

    public ProConditioner getConditioner() {
        return conditioner;
    }

    public void setConditioner(ProConditioner conditioner) {
        this.conditioner = conditioner;
    }
}
