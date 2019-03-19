package com.miracozkan.lab2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {


//    var clickedCardId: Int? = -1
//    var clickedCardId2: Int? = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = Intent(MainActivity@ this, Main2Activity::class.java)
        startActivity(i)

        /*  for (item in 1..36){

              (("imgView$item") as ImageView).setOnClickListener(this)
          }*/
//        imgCard1.setOnClickListener(this)
//        imgCard1.setmTag("Key Ver!!")
//        imgCard2.setOnClickListener(this)
//        imgCard3.setOnClickListener(this)
//        imgCard4.setOnClickListener(this)
//        imgCard5.setOnClickListener(this)
//        imgCard6.setOnClickListener(this)
//        imgCard7.setOnClickListener(this)
//        imgCard8.setOnClickListener(this)
//        imgCard9.setOnClickListener(this)
//        imgCard10.setOnClickListener(this)
//        imgCard11.setOnClickListener(this)
//        imgCard12.setOnClickListener(this)
//        imgCard13.setOnClickListener(this)
//        imgCard14.setOnClickListener(this)
//        imgCard15.setOnClickListener(this)
//        imgCard16.setOnClickListener(this)
//        imgCard17.setOnClickListener(this)
//        imgCard18.setOnClickListener(this)
//        imgCard19.setOnClickListener(this)
//        imgCard20.setOnClickListener(this)
//        imgCard21.setOnClickListener(this)
//        imgCard22.setOnClickListener(this)
//        imgCard23.setOnClickListener(this)
//        imgCard24.setOnClickListener(this)
//        imgCard25.setOnClickListener(this)
//        imgCard26.setOnClickListener(this)
//        imgCard27.setOnClickListener(this)
//        imgCard28.setOnClickListener(this)
//        imgCard29.setOnClickListener(this)
//        imgCard30.setOnClickListener(this)
//        imgCard31.setOnClickListener(this)
//        imgCard32.setOnClickListener(this)
//        imgCard33.setOnClickListener(this)
//        imgCard34.setOnClickListener(this)
//        imgCard35.setOnClickListener(this)
//        imgCard36.setOnClickListener(this)


//        shortCut(lnrMaster)

    }

    override fun onClick(v: View?) {

//        if (clickedCardId == -1) {
//            clickedCardId = v?.id
//        } else if (clickedCardId2 == -1) {
//            clickedCardId2 = v?.id
//            if (findViewById<ImageView>(clickedCardId!!).mTag.toString() == (findViewById<ImageView>(clickedCardId2!!)).mTag.toString()) {
//                findViewById<ImageView>(clickedCardId!!).visibility = View.INVISIBLE
//                findViewById<ImageView>(clickedCardId2!!).visibility = View.INVISIBLE
//            }
//
//        } else {
//            findViewById<ImageView>(clickedCardId!!).setBackgroundResource(R.drawable.ic_android_black_24dp)
//            findViewById<ImageView>(clickedCardId2!!).setBackgroundResource(R.drawable.ic_android_black_24dp)
//
//            findViewById<ImageView>(clickedCardId!!).isClickable = true
//            findViewById<ImageView>(clickedCardId2!!).isClickable = true
//
//            clickedCardId = v?.id
//            clickedCardId2 = -1
//        }

        when (v?.id) {
//            imgCard1.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_youtube_searched_for)
//                v.isClickable = false
//            }
//            imgCard2.id -> {
//                YoYo.with(Techniques.Shake).playOn(findViewById(R.id.imgCard2))
//                v.setBackgroundResource(R.drawable.ic_star_half_black_24dp)
//                v.isClickable = false
//            }
//            imgCard3.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_report_problem)
//                v.isClickable = false
//            }
//            imgCard4.id -> {
//                v.setBackgroundResource(R.drawable.ic_add_a_photo_black_24dp)
//                v.isClickable = false
//            }
//            imgCard5.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_explore_off)
//                v.isClickable = false
//            }
//            imgCard6.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_home)
//                v.isClickable = false
//            }
//            imgCard7.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_3d_rotation)
//                v.isClickable = false
//            }
//            imgCard8.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_face)
//                v.isClickable = false
//            }
//            imgCard9.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_verified_user)
//                v.isClickable = false
//            }
//            imgCard10.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_pets)
//                v.isClickable = false
//            }
//            imgCard11.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_power_settings_new)
//                v.isClickable = false
//            }
//            imgCard12.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_http)
//                v.isClickable = false
//            }
//            imgCard13.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_code)
//                v.isClickable = false
//            }
//            imgCard14.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_thumb_up)
//                v.isClickable = false
//            }
//            imgCard15.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_backup)
//                v.isClickable = false
//            }
//            imgCard16.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_code)
//                v.isClickable = false
//            }
//            imgCard17.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_commute)
//                v.isClickable = false
//            }
//            imgCard18.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_thumb_up)
//                v.isClickable = false
//            }
//            imgCard19.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_touch_app)
//                v.isClickable = false
//            }
//            imgCard20.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_3d_rotation)
//                v.isClickable = false
//            }
//            imgCard21.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_touch_app)
//                v.isClickable = false
//            }
//            imgCard22.id -> {
//                v.setBackgroundResource(R.drawable.ic_phone_black_24dp)
//                v.isClickable = false
//            }
//            imgCard23.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_face)
//                v.isClickable = false
//            }
//            imgCard24.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_explore_off)
//                v.isClickable = false
//            }
//            imgCard25.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_home)
//                v.isClickable = false
//            }
//            imgCard26.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_commute)
//                v.isClickable = false
//            }
//            imgCard27.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_backup)
//                v.isClickable = false
//            }
//            imgCard28.id -> {
//                v.setBackgroundResource(R.drawable.ic_star_half_black_24dp)
//                v.isClickable = false
//            }
//            imgCard29.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_youtube_searched_for)
//                v.isClickable = false
//                v.isClickable = false
//            }
//            imgCard30.id -> {
//                v.setBackgroundResource(R.drawable.ic_phone_black_24dp)
//                v.isClickable = false
//            }
//            imgCard31.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_report_problem)
//                v.isClickable = false
//            }
//            imgCard32.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_pets)
//                v.isClickable = false
//            }
//            imgCard33.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_verified_user)
//                v.isClickable = false
//            }
//            imgCard34.id -> {
//                v.setBackgroundResource(R.drawable.ic_add_a_photo_black_24dp)
//                v.isClickable = false
//            }
//            imgCard35.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_http)
//                v.isClickable = false
//            }
//            imgCard36.id -> {
//                v.setBackgroundResource(R.drawable.ic_baseline_power_settings_new)
//                v.isClickable = false
//            }

        }


    }
//
//      kısayol
//    private fun shortCut(view: LinearLayout) {
//        for (index in 0..view.childCount) {
//            when (view.getChildAt(index)) {
//                is LinearLayout -> {
//                    shortCut(view.getChildAt(index) as LinearLayout)
//                }
//                is ImageView -> {
//                    view.setOnClickListener(this)
//                }
//            }
//        }
//    }
}
