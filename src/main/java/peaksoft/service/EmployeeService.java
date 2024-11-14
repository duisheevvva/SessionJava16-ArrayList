package peaksoft.service;

import peaksoft.models.Employee;

public interface EmployeeService {
    void createEmployee(Employee employee);
    void assignEmployeeToPharmacy(Long employeeId,Long pharmacyId);
}
