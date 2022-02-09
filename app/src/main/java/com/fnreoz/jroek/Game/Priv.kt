package com.fnreoz.jroek.Game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fnreoz.jroek.R
import com.fnreoz.jroek.teskqs
import kotlinx.android.synthetic.main.activity_priv.*

class Priv : AppCompatActivity() {
    override fun onCreate(save: Bundle?) {
        super.onCreate(save)
        setContentView(R.layout.activity_priv)
        window.addFlags(1024)
        bebicha.loadUrl(teskqs.Liqsresa("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49a0I4Tm43RlJqRnU2NE5pMG1ReHJuaWpDVE9YV1gxZks="))
    }
}