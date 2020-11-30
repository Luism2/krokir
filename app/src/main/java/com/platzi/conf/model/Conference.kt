package com.platzi.conf.model

import java.io.Serializable
import java.util.*

class Conference: Serializable {
    lateinit var title: String
    lateinit var descripcion: String
    lateinit var tag: String
    lateinit var datetime: Date
    lateinit var speaker: String

}