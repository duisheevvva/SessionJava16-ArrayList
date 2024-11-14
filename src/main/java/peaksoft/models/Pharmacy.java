package peaksoft.models;

import java.util.ArrayList;

public class Pharmacy {
    private Long id;
    private String address;
    private ArrayList<Medicine> medicines = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();


    public Pharmacy() {
    }

    public Pharmacy(Long id, String address, ArrayList<Medicine> medicines, ArrayList<Employee> employees) {
        this.id = id;
        this.address = address;
        this.medicines = medicines;
        this.employees = employees;
    }

    public Pharmacy(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", medicines=" + medicines +
                ", employees=" + employees +
                '}';
    }
}
