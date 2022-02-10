package com.decline.noteapp.app_features.presentation.notes

import com.decline.noteapp.app_features.domain.model.Note

data class NotesState(
    val notes: List<Note> = emptyList()
)