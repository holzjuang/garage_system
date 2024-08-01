package entities;

public class Client {
    private String name;
    private String CPF;
    private Car car;

    public Client() {
    }

    public Client(String name, String CPF, Car car) {
        this.name = name;
        this.CPF = CPF;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getName() + "\n");
        sb.append("CPF: " + getCPF() + "\n");
        sb.append("Carro: " + getCar().toString() + "\n");
        return sb.toString();
    }
}
