package com.example.rofiqul2612

class LoginModel {
    var username = ""
    var password = ""

    fun loginCheck():Boolean{
        if(username.equals("rofiqul")&&password.equals("1234")){
            return true
        }else{
            return false
        }
    }
}