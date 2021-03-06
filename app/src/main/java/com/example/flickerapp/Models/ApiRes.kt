package com.example.flickerapp.Models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

//SerializableName because of JSON object keys (which is our REST API response) needs to match with SerializableName which must to be correct  to assign Model properties for
data class ApiRes (
    @SerializedName("photos")
    val photos :Photos,

    @SerializedName("stat")
    val stat :String
)


data class Photos(
    @SerializedName("page")
    val page :Int,

    @SerializedName("pages")
    val pages :Int,

    @SerializedName("perpage")
    val perpage:Int,

    @SerializedName("total")
    val total:Int,

    @SerializedName("photo")
    val photo : ArrayList<Photo>

)

//This is extends from  Serializable for Intent to get that class from the activity to use like "getSerializableExtra()"
data class Photo (
    @SerializedName("id")
    val id:String,

    @SerializedName("owner")
    val owner :String,

    @SerializedName("secret")
    val secret : String,

    @SerializedName("server")
    val server :String,

    @SerializedName("farm")
    val farm :Int,

    @SerializedName("title")
    val title : String,

    @SerializedName("ispublic")
    val ispublic : Int,

    @SerializedName("isfriend")
    val isfriend : Int,

    @SerializedName("isfamily")
    val isfamily :Int
):Serializable{}




