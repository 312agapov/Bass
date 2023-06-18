public class Vehicle {

    private String mark;
    private String model;
    private boolean Registration;
    private int Cylinders;
    Vehicle(){

    }
    Vehicle(String mark, String model, boolean Registration, int Cylinders){

        this.mark = mark;
        this.model = model;
        this.Registration = Registration;
        this.Cylinders = Cylinders;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistration(boolean registration) {
        Registration = registration;
    }

    public void setCylinders(int cylinders) {
        Cylinders = cylinders;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public boolean isRegistration() {
        return Registration;
    }

    public int getCylinders() {
        return Cylinders;
    }

    public void print() {
        System.out.printf("Информация о Vehicle: %s %s %s %d \n", mark, model, Registration, Cylinders);
    }
}
