package com.example.tbuj.tp1

fun main(){
    val university = University("NTIC SAFI", 2023)
    val professeur = Professeur("Madam Fadil", 36, 10000)
    val stagaire = Stagaire("Ihssane", 22, 12345)
    val course = Course("kotlin")

    university.hire(professeur)
    university.enroll(stagaire)

    professeur.teach(course)
    stagaire.enroll(course)

    for (i in 0..2){
        stagaire.party()
    }
    stagaire.enroll(course)
    for (i in 0..30) {
        stagaire.learn()
    }
    stagaire.takeExam(course)
    professeur.doOralExam(course,stagaire)

    println( professeur.doOralExam(course,stagaire)) }