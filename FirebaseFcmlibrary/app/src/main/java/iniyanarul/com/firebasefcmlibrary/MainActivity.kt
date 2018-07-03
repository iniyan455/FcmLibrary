package iniyanarul.com.firebasefcmlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import iniyanarul.com.myfcm.FcmMessage
import iniyanarul.com.myfcm.FcmMessage.*;

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a= FcmMessage();
        a.sendNotification_toUser("Hi","Iniyan","Iniyan")
    }
}
