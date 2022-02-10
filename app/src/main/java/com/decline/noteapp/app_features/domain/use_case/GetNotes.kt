package com.decline.noteapp.app_features.domain.use_case

import com.decline.noteapp.app_features.domain.model.Note
import com.decline.noteapp.app_features.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(): Flow<List<Note>> {
        return repository.getNotes()
    }
}