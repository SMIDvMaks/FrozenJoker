package com.fnreoz.jroek.Webocka

import android.app.Activity
import android.content.Context
import android.util.Base64
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.onesignal.OneSignal
import java.lang.NullPointerException

var kkq: String? = null
var lalq: String? = null
var lqlann7: String? = null
var nqme: String? = null
var lqksa: String? = null
var hswq: String? = null
var oytre: String? = null
lateinit var pancoskqns: Array<String>
var paunsoso = "Y29tLmZucmVvei5qcm9law=="
var fb1webocha: String? = null

class Parischokks {

    fun Payokers(lllqas: String): String {

        pancoskqns = lllqas.split("::").toTypedArray()

        try {
            kkq = pancoskqns[0]
        } catch (ea: NullPointerException) {
        }
        try {
            lalq = pancoskqns[1]
        } catch (eq: NullPointerException) {
        }
        try {
            lqlann7 = pancoskqns[2]
        } catch (er: NullPointerException) {
        }
        try {
            nqme = pancoskqns[3]
        } catch (ey: NullPointerException) {
        }
        try {
            lqksa = pancoskqns[4]
        } catch (ei: NullPointerException) {
        }
        try {
            hswq = pancoskqns[5]
        } catch (ek: NullPointerException) {
        }
        try {
            oytre = pancoskqns[6]
        } catch (eh: NullPointerException) {
        }

        OneSignal.sendTag(Liqsresa("c3ViX2FwcA=="), lalq)
        val kylina =
            (kkq + Liqsresa("P2J1bmRsZT0=") +Liqsresa(paunsoso)
                    + Liqsresa("JmFkX2lkPQ==") + adikqbhdsx + Liqsresa("JmFwcHNfaWQ9")
                    + dodoqs +
                    Liqsresa("JmRldl9rZXk9") + Liqsresa(afikfjejn) +
                    Liqsresa("JnN1YjY9") + lalq +
                    Liqsresa("JnN1Yjc9") + lqlann7 +
                    Liqsresa("JnN1YjI9") + nqme +
                    Liqsresa("JnN1YjM9") + lqksa +
                    Liqsresa("JnN1YjQ9") + hswq +
                    Liqsresa("JnN1YjU9") + oytre)
        return kylina
    }
    fun JoqFA(idepal: String, contikw: Context): String? {
        FacebookSdk.setApplicationId(idepal)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.sdkInitialize(contikw)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        AppLinkData.fetchDeferredAppLinkData(contikw) { appLinkData ->
            var apicheq = appLinkData

            if (apicheq == null) {
                apicheq = AppLinkData.createFromActivity(contikw as Activity?)
            }

            if (apicheq != null) {
                val uejq = apicheq.targetUri
                val webaiq = uejq?.query
                fb1webocha = Payokers(webaiq.toString())
            } else { }
        }

        return fb1webocha
    }

    fun Liqsresa(decisjq: String): String {
        val liqjndqq = String(Base64.decode(decisjq, Base64.DEFAULT))
        return liqjndqq
    }


}