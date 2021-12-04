package me.ibrahimsn.smoothbottombar.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import me.ibrahimsn.smoothbottombar.ui.model.NoteDao
import me.ibrahimsn.smoothbottombar.ui.model.NoteDatabase
import me.ibrahimsn.smoothbottombar.ui.model.NoteRepository
import me.ibrahimsn.smoothbottombar.ui.model.notes

class SecondViewModel(application: Application): AndroidViewModel(application) {

    private val repository : NoteRepository = TODO()



}