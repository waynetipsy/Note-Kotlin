package app.ify.notetakingapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Note::class], version = 1, exportSchema = false)
  abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao() : NoteDao

    companion object{
        @Volatile
        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context) : NoteDatabase{
            return INSTANCE?: synchronized(this) {

                Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    "notes_database"
                ).build()
            }
        }
    }



}