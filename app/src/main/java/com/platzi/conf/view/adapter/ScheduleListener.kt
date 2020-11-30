package com.platzi.conf.view.adapter

import androidx.recyclerview.widget.RecyclerView
import com.platzi.conf.model.Conference

interface ScheduleListener  {
    fun onConferenceClicked(conference: Conference, position: RecyclerView.RecyclerListener)
}