package com.example.tbuj.tp1

//////////////stagaire//////////////////////////////////
class Stagaire(var nom:String,var age:Int,var Matricule:Int){
    val list_cours = mutableListOf<Course>()
    var porcentagedecours :Double=0.0
    fun enroll(course:Course){
        list_cours.add(course)
    }
    fun takeExam(course:Course):Boolean{
        for (lecour in list_cours ){
            if(course==lecour){
                return true
            }}
        return false
    }
    fun learn(){
        if (porcentagedecours<1){
            porcentagedecours+=0.02

        }}
    fun party() {
        if (porcentagedecours>0){
            porcentagedecours-=0.02
        }}
    fun grade(course: Course):Result{
        if (takeExam(course)==true){
            if(porcentagedecours>=0.5){
                return Result.Admis
            }
            else  return Result.NonAdmis

    }
    return Result.NonAdmis
}
}
