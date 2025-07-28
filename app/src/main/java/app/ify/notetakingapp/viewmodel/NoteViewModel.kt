package app.ify.notetakingapp.viewmodel

import androidx.lifecycle.ViewModel
import app.ify.notetakingapp.repo.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository
) : ViewModel() {
}