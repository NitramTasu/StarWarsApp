package br.com.martin.starwarsapp.data.local.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import br.com.martin.starwarsapp.data.local.entity.People

interface UserDao{

    @Insert(onConflict = REPLACE)
    fun save(people: People)

    @Query("SELECT * FROM People WHERE id = :id")
    fun load(id: Int): LiveData<People>

}