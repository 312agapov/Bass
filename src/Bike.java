public class Bike extends Vehicle{

    private String BikeType;
    private int EngineSize;

    Bike(){

    }

    Bike(String mark, String model, boolean Registration, int Cylinders, String BikeType, int EngineSize){

        super(mark, model, Registration, Cylinders);
        this.BikeType = BikeType;
        this.EngineSize = EngineSize;
    }

    public String getBikeType() {
        return BikeType;
    }

    public void setBikeType(String bikeType) {
        BikeType = bikeType;
    }

    public int getEngineSize() {
        return EngineSize;
    }

    public void setEngineSize(int engineSize) {
        EngineSize = engineSize;
    }

    public void print() {
        System.out.printf("Информация о Bike: %s %s %s %d %s %d \n", getMark(), getModel(), isRegistration(), getCylinders(), BikeType, EngineSize);
    }
}
