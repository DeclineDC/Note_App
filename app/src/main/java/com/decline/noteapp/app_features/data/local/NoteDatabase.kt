package com.decline.noteapp.app_features.data.local


import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase
import com.decline.noteapp.app_features.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1

)
abstract class  NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao


}