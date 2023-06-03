package com.example.roomdatabasedemo;
import android.app.UiAutomation;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

 @Dao
public interface MainDao {

    // Insert query
    @Insert(onConflict =REPLACE)
    void insert(MainData mainData);
     // Delete query
     @Delete
     void delete(MainData mainData);
     @Delete
     void reset(List<MainData> mainData);
     //to do

     // Update query
     @Query("UPDATE table_name SET text= :sText, population= :sPopulation, capital= :sCapital where ID=:sID")
     void update(int sID, String sText, String sPopulation, String sCapital);

     // Get all data query
     @Query("SELECT * FROM table_name")
     List<MainData> getAll();


}
