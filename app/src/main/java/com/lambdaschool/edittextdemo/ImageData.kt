package com.lambdaschool.edittextdemo

import android.net.Uri
import java.io.Serializable

class ImageData(picUri: Uri) : Serializable {
    var name: String = ""
    var uriString: String = ""

    fun getUri():Uri {
        return Uri.parse(uriString)
    }

    fun setUriString(fullUri : Uri){
        uriString = fullUri.toString()
        setImageName()  //this is just to make sure the name is updated when the uri is
    }

    fun setImageName(){
        val path = uriString!!.split("/".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        name = path[path.size - 1]
    }
}