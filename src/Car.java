public class Car extends Vehicle{

    private String type;
    private int NumDoors;

    Car(){

    }

    Car(String mark, String model, boolean Registration, int Cylinders, String type, int NumDoors){

        super(mark, model, Registration, Cylinders);
        this.type = type;
        this.NumDoors = NumDoors;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumDoors(int numDoors) {
        NumDoors = numDoors;
    }

    public String getType() {
        return type;
    }

    public int getNumDoors() {
        return NumDoors;
    }

    public void print() {
        System.out.printf("Информация о Car: %s %s %s %d %s %d \n", getMark(), getModel(), isRegistration(), getCylinders(), type, NumDoors);
    }
}
