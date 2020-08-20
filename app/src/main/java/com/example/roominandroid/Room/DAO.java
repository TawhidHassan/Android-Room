package com.example.roominandroid.Room;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

/**That class call DAO (Data access object), here we make functionality for insert,update,delete (query) ***/

@Dao
public interface DAO {

    @Insert
    public void studentInsertion(Student student);


}
