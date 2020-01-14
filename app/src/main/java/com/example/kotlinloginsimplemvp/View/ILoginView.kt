package com.example.kotlinloginsimplemvp.View

interface ILoginView {

    fun onLoginSuccess(message :String)
    fun onLoginError(message: String)


}