package com.onvif.onvifcamera_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.onvif.onvifcamera_android.Onvif.OnvifDevice
import com.onvif.onvifcamera_android.Onvif.currentDevice


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //currentDevice = OnvifDevice("60.191.94.122:8086","admin", "admin321")

        currentDevice = OnvifDevice("60.191.94.122:8086","admin", "admin321")
        currentDevice.getDeviceInformation()

    }
}
