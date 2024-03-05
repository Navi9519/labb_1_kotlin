package com.example.labb_1.models

import java.io.Serializable

class User(val userName: String, val userTeam: String): Serializable{
    override fun toString(): String {
        return "User(userName='$userName', userTeam='$userTeam')"
    }
}