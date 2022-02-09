package com.fnreoz.jroek.Game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.fnreoz.jroek.R
import kotlinx.android.synthetic.main.activity_ggactivity.*

class GGActivity : AppCompatActivity() {
    var handler = Handler()
    var stop = 0
    lateinit var sneg_rot: ImageView
    lateinit var zirka_rot: ImageView
    lateinit var vinograd_rot: ImageView
    var dispik = DisplayMetrics()
    var btn_click = 0
    var res1 = 0
    var res2 = 0
    var res3 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ggactivity)


        window.addFlags(1024)

        sneg_rot = findViewById(R.id.snezka)
        zirka_rot = findViewById(R.id.zirka)
        vinograd_rot = findViewById(R.id.vinograd)

        windowManager.defaultDisplay.getMetrics(dispik)
        var heig = dispik.heightPixels

        btn_start.setOnClickListener {
            btn_click++
            txt_start.visibility = TextView.INVISIBLE
            if (btn_click == 1) {
                snezka.visibility = ImageView.VISIBLE
                sneg()
                sneg_rot.setOnClickListener {
                    handler.post(object : Runnable {
                        override fun run() {
                            stop++
                            if (stop != 60) {
                                handler.postDelayed(this::run, 30)
                                val rand = (1..3).random()
                                res1 = resources.getIdentifier(
                                    "ic_slot_$rand",
                                    "drawable", "com.fnreoz.jroek"
                                )
                                princes1.setImageResource(res1)
                            } else stop = 0
                        }
                    })
                    sneg_rot.animate().translationY(-2000F).setDuration(0)
                }
            }

            if (btn_click == 2) {
                zirka.visibility = ImageView.VISIBLE
                zirka()
                zirka_rot.setOnClickListener {
                    handler.post(object : Runnable {
                        override fun run() {
                            stop++
                            if (stop != 60) {
                                handler.postDelayed(this::run, 30)
                                val rand = (1..3).random()
                                res2 = resources.getIdentifier(
                                    "ic_slot_$rand",
                                    "drawable", "com.fnreoz.jroek"
                                )
                                princes2.setImageResource(res2)
                            } else stop = 0
                        }
                    })
                    zirka_rot.animate().translationY(-2000F).setDuration(0)
                }
            }

            if (btn_click == 3) {
                vinograd.visibility = ImageView.VISIBLE
                vinograd()
                vinograd_rot.setOnClickListener {
                    handler.post(object : Runnable {
                        override fun run() {
                            stop++
                            if (stop != 60) {
                                handler.postDelayed(this::run, 30)
                                val rand = (1..3).random()
                                res3 = resources.getIdentifier(
                                    "ic_slot_$rand",
                                    "drawable", "com.fnreoz.jroek"
                                )
                                kristal.setImageResource(res3)
                            } else stop = 0
                        }
                    })
                    vinograd_rot.animate().translationY(-2000F).setDuration(0)
                        .withEndAction {
                            Handler(Looper.getMainLooper()).postDelayed({

                                if (res1 != 0 && res2 != 0 && res3 != 0) {
                                    result.visibility = TextView.VISIBLE

                                    if (res1 == res2 && res1 == res3) {
                                        result.text = " You Win Jackpot"
                                        sherik()
                                    }
                                    if (res1 == res2 || res1 == res3 || res2 == res3) {
                                        result.text = " Almost, try again please "
                                        sherik()
                                    }
                                    if (res1 != res2 && res1 != res3) {
                                        result.text = " You Lost, try again please"
                                        sherik()
                                    }
                                }
                                if (res1 == 0 || res2 == 0 || res3 == 0) {
                                    result.text = "You Lost, try again please"
                                    sherik()

                                }

                            }, 4000)
                        }
                }
            }


        }


    }

    fun sneg() {
        sneg_rot.animate().translationY(2000F).setDuration(7000).rotation(360F)
    }

    fun zirka() {
        zirka_rot.animate().translationY(2000F).setDuration(7000).rotation(360F)
    }

    fun vinograd() {
        vinograd_rot.animate().translationY(2000F).setDuration(7000).rotation(360F)
    }


    fun sherik() {
        btn_start.visibility = Button.INVISIBLE
        princes1.visibility = TextView.INVISIBLE
        princes2.visibility = TextView.INVISIBLE
        kristal.visibility = TextView.INVISIBLE
        btn_click = 0
        btn_rest.visibility = Button.VISIBLE
        btn_rest.setOnClickListener {
            result.visibility = TextView.INVISIBLE
            res1 = 0
            res2 = 0
            res3 = 0
            zirka_rot.animate().translationY(-2000F).setDuration(0)
            vinograd_rot.animate().translationY(-2000F)
                .setDuration(0)
            sneg_rot.animate().translationY(-2000F).setDuration(0)
            btn_rest.visibility = Button.INVISIBLE
            btn_start.visibility = Button.VISIBLE
            btn_start.setOnClickListener {
                btn_click++
                txt_start.visibility = TextView.INVISIBLE
                if (btn_click == 1) {
                    snezka.visibility = ImageView.VISIBLE
                    sneg()
                    sneg_rot.setOnClickListener {
                        princes1.visibility = TextView.VISIBLE
                        handler.post(object : Runnable {
                            override fun run() {
                                stop++
                                if (stop != 60) {
                                    handler.postDelayed(
                                        this::run,
                                        30
                                    )
                                    val rand = (1..3).random()
                                    res1 = resources.getIdentifier(
                                        "ic_slot_$rand",
                                        "drawable",
                                        "com.fnreoz.jroek"
                                    )
                                    princes1.setImageResource(res1)
                                } else stop = 0
                            }
                        })
                        sneg_rot.animate().translationY(-2000F)
                            .setDuration(0)
                    }
                }

                if (btn_click == 2) {
                    zirka.visibility = ImageView.VISIBLE
                    zirka()
                    zirka_rot.setOnClickListener {
                        princes2.visibility = TextView.VISIBLE
                        handler.post(object : Runnable {
                            override fun run() {
                                stop++
                                if (stop != 60) {
                                    handler.postDelayed(
                                        this::run,
                                        30
                                    )
                                    val rand = (1..3).random()
                                    res2 = resources.getIdentifier(
                                        "ic_slot_$rand",
                                        "drawable",
                                        "com.fnreoz.jroek"
                                    )
                                    princes2.setImageResource(res2)
                                } else stop = 0
                            }
                        })
                        zirka_rot.animate().translationY(-2000F)
                            .setDuration(0)
                    }
                }

                if (btn_click == 3) {
                    vinograd.visibility = ImageView.VISIBLE
                    vinograd()
                    vinograd_rot.setOnClickListener {
                        kristal.visibility = TextView.VISIBLE
                        handler.post(object : Runnable {
                            override fun run() {
                                stop++
                                if (stop != 60) {
                                    handler.postDelayed(
                                        this::run,
                                        30
                                    )
                                    val rand = (1..3).random()
                                    res3 = resources.getIdentifier(
                                        "ic_slot_$rand",
                                        "drawable",
                                        "com.fnreoz.jroek"
                                    )
                                    kristal.setImageResource(res3)
                                } else stop = 0
                            }
                        })
                        vinograd_rot.animate().translationY(-2000F)
                            .setDuration(0)
                            .withEndAction {
                                if (res1 != 0 && res2 != 0 && res3 != 0) {
                                    result.visibility = TextView.VISIBLE
                                    if (res1 == res2 && res1 == res3) {
                                        result.text = " You Win Jackpot"
                                    }
                                    if (res1 == res2 || res1 == res3 || res2 == res3) {
                                        result.text = " Almost, try again please "
                                    }
                                    if (res1 != res2 && res1 != res3) {
                                        result.text = " You Lost, try again please"
                                    }
                                    btn_start.visibility = Button.INVISIBLE
                                    restik.visibility = Button.VISIBLE
                                    restik.setOnClickListener {
                                        result.visibility = TextView.INVISIBLE
                                        txt_start.visibility = TextView.INVISIBLE
                                        btn_rest.visibility = Button.INVISIBLE
                                        res1 = 0
                                        res2 = 0
                                        res3 = 0
                                        restik.visibility = Button.INVISIBLE
                                        btn_start.visibility = Button.VISIBLE
                                        btn_start.setOnClickListener {
                                            btn_click = 0
                                            btn_click++
                                            if (btn_click == 1) {
                                                snezka.visibility = ImageView.VISIBLE
                                                sneg()
                                                sneg_rot.setOnClickListener {
                                                    handler.post(object : Runnable {
                                                        override fun run() {
                                                            stop++
                                                            if (stop != 60) {
                                                                handler.postDelayed(
                                                                    this::run,
                                                                    30
                                                                )
                                                                val rand =
                                                                    (1..3).random()
                                                                res1 =
                                                                    resources.getIdentifier(
                                                                        "ic_slot_$rand",
                                                                        "drawable",
                                                                        "com.fnreoz.jroek"
                                                                    )
                                                                princes1.setImageResource(
                                                                    res1
                                                                )
                                                            } else stop = 0
                                                        }
                                                    })
                                                    sneg_rot.animate()
                                                        .translationY(-2000F)
                                                        .setDuration(0)
                                                }
                                            }

                                            if (btn_click == 2) {
                                                zirka.visibility = ImageView.VISIBLE
                                                zirka()
                                                zirka_rot.setOnClickListener {
                                                    handler.post(object : Runnable {
                                                        override fun run() {
                                                            stop++
                                                            if (stop != 60) {
                                                                handler.postDelayed(
                                                                    this::run,
                                                                    30
                                                                )
                                                                val rand =
                                                                    (1..3).random()
                                                                res2 =
                                                                    resources.getIdentifier(
                                                                        "ic_slot_$rand",
                                                                        "drawable",
                                                                        "com.fnreoz.jroek"
                                                                    )
                                                                princes2.setImageResource(
                                                                    res2
                                                                )
                                                            } else stop = 0
                                                        }
                                                    })
                                                    zirka_rot.animate()
                                                        .translationY(-2000F)
                                                        .setDuration(0)
                                                }
                                            }

                                            if (btn_click == 3) {
                                                vinograd.visibility = ImageView.VISIBLE
                                                vinograd()
                                                vinograd_rot.setOnClickListener {
                                                    handler.post(object : Runnable {
                                                        override fun run() {
                                                            stop++
                                                            if (stop != 60) {
                                                                handler.postDelayed(
                                                                    this::run,
                                                                    30
                                                                )
                                                                val rand =
                                                                    (1..3).random()
                                                                res3 =
                                                                    resources.getIdentifier(
                                                                        "ic_slot_$rand",
                                                                        "drawable",
                                                                        "com.fnreoz.jroek"
                                                                    )
                                                                kristal.setImageResource(
                                                                    res3
                                                                )
                                                            } else stop = 0
                                                        }
                                                    })
                                                    vinograd_rot.animate()
                                                        .translationY(-2000F)
                                                        .setDuration(0)
                                                }
                                            }
                                        }

                                    }


                                }
                            }
                    }
                }
            }
        }


    }


}
