package peaksoft.service;

import peaksoft.models.Pharmacy;

import java.util.ArrayList;

public interface PharmacyService {
    // CRUD

    //Create
    void createPharmacy(Pharmacy pharmacy);
    // Read
    ArrayList<Pharmacy> getAllPharmacy();
    Pharmacy getById(Long id);

    // Update
    void updatePharmacy(Long id,Pharmacy newPharmacy);
    //Delete
    void deletePharmacy(Long id);

}
