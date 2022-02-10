package com.decline.noteapp.app_features.data.local


import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ContactsContract.CommonDataKinds.Note::class],
    version = 1

)
abstract class  NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao


}