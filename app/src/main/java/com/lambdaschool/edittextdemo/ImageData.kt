package com.lambdaschool.edittextdemo

import android.net.Uri
import java.io.Serializable

class ImageData(picUri: Uri) : Serializable {
    var name: String = ""
    var uriString: String = ""

    fun getImgUri(): Uri{
        return Uri.parse(uriString)
    }
    fun setImgString(uriString: String){
        this.uriString = uriString
    }
}