package peaksoft.service.serviceImpl;

import peaksoft.database.Database;
import peaksoft.models.Medicine;
import peaksoft.models.Pharmacy;
import peaksoft.service.MedicineService;

public class MedicineServiceImpl implements MedicineService {
    @Override
    public void createMedicineByPharmacyId(Long pharmacyId, Medicine medicine) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId() == pharmacyId){
                pharmacy.getMedicines().add(medicine);
                System.out.println("Success!");
                break;
            }
        }
    }
}
