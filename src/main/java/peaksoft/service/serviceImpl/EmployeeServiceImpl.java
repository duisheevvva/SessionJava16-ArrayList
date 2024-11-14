package peaksoft.service.serviceImpl;

import peaksoft.database.Database;
import peaksoft.models.Employee;
import peaksoft.models.Pharmacy;
import peaksoft.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void createEmployee(Employee employee) {
        Database.employees.add(employee);
    }

    @Override
    public void assignEmployeeToPharmacy(Long employeeId, Long pharmacyId) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
                for (Employee employee: Database.employees) {
                    if (employee.getId() == employeeId){
                        pharmacy.getEmployees().add(employee);
                        System.out.println("Successfully assigned!");
                    }
                }
            }

        }
    }
}
