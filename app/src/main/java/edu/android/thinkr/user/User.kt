package edu.android.thinkr.user

import java.util.*

/**
 * @author robin
 * Created on 10/11/20
 */
data class User (
    var uid: String = "",
    var userName: String = "",
    var email: String = "",
    var phoneNo: String = "",
    var imageUrl: String = "",
    var fullName: String = ""
)