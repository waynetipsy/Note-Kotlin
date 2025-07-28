package app.ify.notetakingapp.di

import android.content.Context
import app.ify.notetakingapp.room.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


// a hilt module is a class where you define how to build
// build and provide dependencies(objects like Room,
// Dao, repositories, retrofit, etc...)
//@Module: to register it as a Hilt component provide
// functions inside are annotated with @Provides to tell
//tell Hilt how to create instances/objects

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext
                            context: Context): NoteDatabase{
        return NoteDatabase.getDatabase(context)
    }

    @Provides
    @Singleton
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()
}