package com.lambdaschool.abstractionintpoly.model

/*
{
    name: "Chewbacca",
    height: "228",
    mass: "112",
    hair_color: "brown",
    skin_color: "unknown",
    eye_color: "blue",
    url: "https://swapi.co/api/people/13/"
}
 */

// TODO 2: S05M02-2 Add class which inherits from parent class
data class Person (val height: String, val mass: String, val hairColor: String, val skinColor: String, val eyeColor: String

): SwApiObject(){
    override fun info(): String ="$eyeColor,  $height"
    override fun toString(): String{
        return "$mass, $skinColor"
    }
}

