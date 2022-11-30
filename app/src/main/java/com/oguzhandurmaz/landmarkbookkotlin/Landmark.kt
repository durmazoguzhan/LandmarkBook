package com.oguzhandurmaz.landmarkbookkotlin

class Landmark(val name: String, val country: String, val image: Int) : java.io.Serializable {
    init {
        println("created a landmark object")
    }
}