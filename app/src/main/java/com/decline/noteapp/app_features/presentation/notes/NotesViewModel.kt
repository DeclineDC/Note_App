package com.decline.noteapp.app_features.presentation.notes

import androidx.lifecycle.ViewModel
import com.decline.noteapp.app_features.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {

}