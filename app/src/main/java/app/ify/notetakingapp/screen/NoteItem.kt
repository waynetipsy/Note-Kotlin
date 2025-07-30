package app.ify.notetakingapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.ify.notetakingapp.room.Note


@Composable
fun NoteItem(note: Note){
    Card(modifier = Modifier.fillMaxWidth()
        .padding(8. dp)){
        Column (modifier = Modifier.padding(16.dp)){
            Text(text = note.title,
             style = MaterialTheme.typography.titleMedium)

            Text(text = note.content,
                style = MaterialTheme.typography.bodyMedium

            )
        }

    }
}