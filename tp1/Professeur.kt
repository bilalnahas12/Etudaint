package com.example.tbuj.tp1

//////////////professeur/////////////////////
class Professeur( var nom:String,var age:Int,var salaire:Int){
    val list_cours = mutableListOf<Course>()

    fun teach(course:Course){
        list_cours.add(course)
    }
    fun doOralExam(course:Course,stagaire: Stagaire) :Result{
        return  stagaire.grade(course)
    }
}
