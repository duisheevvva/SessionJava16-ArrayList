package peaksoft.service.serviceImpl;

import peaksoft.database.Database;
import peaksoft.models.Pharmacy;
import peaksoft.service.PharmacyService;

import java.util.ArrayList;

public class PharmacyServiceImpl implements PharmacyService {

    @Override
    public void createPharmacy(Pharmacy pharmacy) {
        Database.pharmacies.add(pharmacy);
    }

    @Override
    public ArrayList<Pharmacy> getAllPharmacy() {
        return Database.pharmacies;
    }

    @Override
    public Pharmacy getById(Long id) { //id == 2
        for (Pharmacy pharmacy: Database.pharmacies) { //Loop ailandy pharmacy.getId=2
            if (pharmacy.getId() == id){
                return pharmacy;
            }
        }
        return null; // 1 jolu null kaitardy
    }

    @Override
    public void updatePharmacy(Long id, Pharmacy newPharmacy) {
        for (Pharmacy oldPharmacy: Database.pharmacies) {
            if (oldPharmacy.getId() == id){
                oldPharmacy.setAddress(newPharmacy.getAddress());
                System.out.println("Success!");
            }
        }
    }

    @Override
    public void deletePharmacy(Long id) {
        // TODO 1 Variant
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == id){
                Database.pharmacies.remove(pharmacy);
                System.out.println("Success!");
                break;
            }
        }

//        TODO 2 Variant
//        Pharmacy pharmacy = getById(id);
//        Database.pharmacies.remove(pharmacy);
//        System.out.println("Success!");
    }
}
