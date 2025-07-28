package app.ify.notetakingapp.repo

import app.ify.notetakingapp.room.Note
import app.ify.notetakingapp.room.NoteDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


// Abstracts the data source (Room, network,..)
// Exposes clean methods to the ViewModel/UI
// Makes it easy to mock/face data during testing
// Decouples your app layers

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {

    suspend fun insertNote(note: Note){
        noteDao.insert(note)
    }

    val allNotesInDB: Flow<List<Note>> = noteDao.getAllNotes()
}