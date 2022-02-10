package com.decline.noteapp.app_features.domain.use_case

import com.decline.noteapp.app_features.domain.model.Note
import com.decline.noteapp.app_features.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}