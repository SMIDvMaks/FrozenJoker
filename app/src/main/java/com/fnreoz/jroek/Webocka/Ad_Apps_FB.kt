package com.fnreoz.jroek.Webocka

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.fnreoz.jroek.teskqs
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.gms.common.GooglePlayServicesNotAvailableException
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*


val afikfjejn = "RmFLSnFjZ0xHRktlZ1NGNVVUeExhTQ=="
val onOAnsensa = "YmQ4NzAyYTEtY2E1NC00ZTU4LTljNWMtZGQwMTQwNzM4NGFh"
var adikqbhdsx: String? = null
var apikqhsfe: String? = null
var poroghw: String? = null
var dodoqs: String? = null

class Ad_Apps_FB : AppCompatActivity() {

    fun getikqbs(context: Context) {
        GlobalScope.launch {
            val idttteq: AdvertisingIdClient.Info
            try {
                idttteq = AdvertisingIdClient.getAdvertisingIdInfo(context)
                adikqbhdsx = idttteq.id
            } catch (elakq: GooglePlayServicesNotAvailableException) {
                elakq.printStackTrace()
            }
        }
    }

    fun starik(cijqbejg: Context) {
        dodoqs = AppsFlyerLib.getInstance().getAppsFlyerUID(cijqbejg)
        val conversData = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(p0: MutableMap<String, Any?>) {
                for (sjqh in p0.keys)
                    apikqhsfe =
                        Objects.requireNonNull(p0[teskqs.Liqsresa("YWZfc3RhdHVz")]).toString()
                if (apikqhsfe == teskqs.Liqsresa("Tm9uLW9yZ2FuaWM=")) {
                    val compiqj: String =
                        Objects.requireNonNull(p0[teskqs.Liqsresa("Y2FtcGFpZ24=")]).toString()
                    poroghw = teskqs.Payokers(compiqj)
                }
            }

            override fun onConversionDataFail(p0: String?) {}
            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
            override fun onAttributionFailure(p0: String?) {}
        }
        AppsFlyerLib.getInstance().run {
            init(teskqs.Liqsresa(afikfjejn), conversData, cijqbejg)
            start(cijqbejg)
        }
    }
}