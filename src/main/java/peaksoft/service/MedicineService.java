package peaksoft.service;

import peaksoft.models.Medicine;

public interface MedicineService {

    void createMedicineByPharmacyId(Long pharmacyId, Medicine medicine);
}
