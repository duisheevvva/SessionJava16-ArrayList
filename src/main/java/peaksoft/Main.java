package peaksoft;


import peaksoft.enums.Gender;
import peaksoft.enums.Position;
import peaksoft.models.Employee;
import peaksoft.models.Medicine;
import peaksoft.models.Pharmacy;
import peaksoft.service.EmployeeService;
import peaksoft.service.MedicineService;
import peaksoft.service.PharmacyService;
import peaksoft.service.serviceImpl.EmployeeServiceImpl;
import peaksoft.service.serviceImpl.MedicineServiceImpl;
import peaksoft.service.serviceImpl.PharmacyServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PharmacyService pharmacyService = new PharmacyServiceImpl();
        MedicineService medicineService = new MedicineServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        Pharmacy pharmacy1 = new Pharmacy(1L,"Vostok5");
        Pharmacy pharmacy2 = new Pharmacy(2L,"Chui125");
        Pharmacy updatePharmacy = new Pharmacy(2L,"Grajdanskaya119");

        pharmacyService.createPharmacy(pharmacy1);
        pharmacyService.createPharmacy(pharmacy2);
        System.out.println("Get all pharmacy:   ");
        System.out.println(pharmacyService.getAllPharmacy());
        System.out.println("Get pharmacy by id:   ");
        System.out.println(pharmacyService.getById(2L));
        System.out.println("Update method: ");
        pharmacyService.updatePharmacy(2L,updatePharmacy);
        System.out.println(pharmacyService.getAllPharmacy());

        System.out.println("Add medicine to Pharmacy");
        medicineService.createMedicineByPharmacyId(2L,new Medicine(1L,"Mukaltin",50,"Description", LocalDate.of(2024,1,1)));
        System.out.println(pharmacyService.getAllPharmacy());


        System.out.println("Employee~~~~~~~~");
        employeeService.createEmployee(new Employee(1L,"Fatima","f@gmail.com","70456789",2, Position.ADMIN, Gender.FEMALE));
        employeeService.assignEmployeeToPharmacy(1L,2L);
        System.out.println(pharmacyService.getAllPharmacy());


    }
}