package com.example.tbuj.tp1

////////////////university/////////////////
class University(var nom:String,var annee:Int) {
    val list_professeur = mutableListOf<Professeur>()
    val list_Student = mutableListOf<Stagaire>()

    fun hire(professeur: Professeur) {
        list_professeur.add(professeur)
    }

    fun enroll(stagaire: Stagaire) {
        list_Student.add(stagaire)
    }
}
