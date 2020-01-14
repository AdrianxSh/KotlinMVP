package com.example.kotlinloginsimplemvp.Model

interface IUser {
    val email:String
    val password:String
    fun isDataValid():Int

}