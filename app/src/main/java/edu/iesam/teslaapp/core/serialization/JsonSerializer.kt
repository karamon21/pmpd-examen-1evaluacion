package edu.iesam.teslaapp.core.serialization

interface JsonSerializer<T> {
    fun toJson(obj: T): String
    fun fromJson(json: String): T
}
