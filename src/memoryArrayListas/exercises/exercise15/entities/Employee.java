package memoryArrayListas.exercises.exercise15.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salario;

    public Employee(){

    }

    public Employee(Integer id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void increaseSalary(double percentage){
        salario += (salario * percentage) / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salario);
    }
}
