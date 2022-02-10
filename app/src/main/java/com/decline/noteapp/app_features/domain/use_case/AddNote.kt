package com.decline.noteapp.app_features.domain.use_case

import com.decline.noteapp.app_features.domain.model.Note
import com.decline.noteapp.app_features.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {


    suspend operator fun invoke(note: Note) {
        repository.insertNote(note)
    }
}