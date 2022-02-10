package com.decline.noteapp.app_features.presentation.notes

import com.decline.noteapp.app_features.domain.model.Note

sealed class NotesEvent {
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
}