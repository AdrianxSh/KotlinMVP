package com.example.kotlinloginsimplemvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinloginsimplemvp.Presenter.ILoginPresenter
import com.example.kotlinloginsimplemvp.Presenter.LoginPresenter
import com.example.kotlinloginsimplemvp.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ILoginView {

    internal lateinit var loginPresenter:ILoginPresenter
    override fun onLoginSuccess(message: String) {
        Toasty.success(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this,message,Toast.LENGTH_SHORT).show()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter=LoginPresenter(this)

        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString())
        }

    }




}
