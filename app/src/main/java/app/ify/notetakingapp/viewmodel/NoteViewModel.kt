package app.ify.notetakingapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.ify.notetakingapp.repo.NoteRepository
import app.ify.notetakingapp.room.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


 // ViewModel: Holds App/Ui Logic and data Fetches, hold &
// exposes data from repo works well with Jetpack Compose,
// Flow.. Manages coroutines using viewModelScope

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository
) : ViewModel() {

    val allNotes: Flow<List<Note>> = repository.allNotesInDB

    fun insert(note: Note) = viewModelScope.launch {
        repository.insertNote(note)
    }
}