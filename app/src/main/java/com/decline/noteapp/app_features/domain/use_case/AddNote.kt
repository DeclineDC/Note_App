package com.decline.noteapp.app_features.domain.use_case

import com.decline.noteapp.app_features.domain.model.Note
import com.decline.noteapp.app_features.domain.repository.NoteRepository
import com.decline.noteapp.app_features.domain.util.InvalidNoteException

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}