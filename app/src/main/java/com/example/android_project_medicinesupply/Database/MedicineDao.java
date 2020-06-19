package com.example.android_project_medicinesupply.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MedicineDao {
    @Insert
    void insertMedicine(Medicine medicine);

    @Query("UPDATE Medicine SET quantity=:quantity WHERE id=:id")
    void updateQuantity(int quantity, int id);

    @Query("SELECT * FROM Medicine WHERE id=:idMedicine")
    Medicine selectMedicine(int idMedicine);

    @Query("SELECT * FROM Medicine")
    List<Medicine> selectAllMedicines();
}
