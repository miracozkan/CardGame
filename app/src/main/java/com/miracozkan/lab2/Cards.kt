package com.miracozkan.lab2

import android.content.Context
import android.widget.ImageView


// Code with ❤
//┌─────────────────────────────┐
//│ Created by Mirac OZKAN    │
//│ ─────────────────────────── │
//│ mirac.ozkan123@gmail.com  │
//│ ─────────────────────────── │
//│ 18/03/19 - 21:40          │
//└─────────────────────────────┘


class Cards(context: Context?, id: Int) : ImageView(context) {
    var isOpen: Boolean = false
    var idBg = -1
    var mTag: Int = -1

    init {
        minimumHeight = 150
        minimumWidth = 150
        idBg = R.drawable.ic_android_black_24dp
        setBackgroundResource(idBg)
        when (id) {
            1 -> {
                mTag = R.drawable.ic_baseline_touch_app
                isOpen = false
            }
            19 -> {
                mTag = R.drawable.ic_baseline_touch_app
                isOpen = false
            }

            2 -> {
                mTag = R.drawable.ic_star_half_black_24dp
                isOpen = false

            }
            20 -> {
                mTag = R.drawable.ic_star_half_black_24dp
                isOpen = false

            }
            3 -> {
                mTag = R.drawable.ic_baseline_report_problem
                isOpen = false

            }
            21 -> {
                mTag = R.drawable.ic_baseline_report_problem
                isOpen = false

            }
            22 -> {
                mTag = R.drawable.ic_add_a_photo_black_24dp
                isOpen = false

            }
            4 -> {
                mTag = R.drawable.ic_add_a_photo_black_24dp
                isOpen = false

            }
            23 -> {
                mTag = R.drawable.ic_baseline_explore_off
                isOpen = false

            }
            5 -> {
                mTag = R.drawable.ic_baseline_explore_off
                isOpen = false

            }
            6 -> {
                mTag = R.drawable.ic_baseline_home
                isOpen = false

            }
            24 -> {
                mTag = R.drawable.ic_baseline_home
                isOpen = false

            }
            7 -> {
                mTag = R.drawable.ic_baseline_3d_rotation
                isOpen = false
            }
            25 -> {
                mTag = R.drawable.ic_baseline_3d_rotation
                isOpen = false
            }
            8 -> {
                mTag = R.drawable.ic_baseline_face
                isOpen = false
            }
            26 -> {
                mTag = R.drawable.ic_baseline_face
                isOpen = false
            }
            27 -> {
                mTag = R.drawable.ic_baseline_verified_user
                isOpen = false
            }
            9 -> {
                mTag = R.drawable.ic_baseline_verified_user
                isOpen = false
            }
            10 -> {
                mTag = R.drawable.ic_baseline_pets
                isOpen = false
            }
            28 -> {
                mTag = R.drawable.ic_baseline_pets
                isOpen = false
            }
            11 -> {
                mTag = R.drawable.ic_baseline_power_settings_new
                isOpen = false
            }
            29 -> {
                mTag = R.drawable.ic_baseline_power_settings_new
                isOpen = false
            }
            12 -> {
                mTag = R.drawable.ic_baseline_http
                isOpen = false
            }
            30 -> {
                mTag = R.drawable.ic_baseline_http
                isOpen = false
            }
            13 -> {
                mTag = R.drawable.ic_baseline_code
                isOpen = false
            }
            31 -> {
                mTag = R.drawable.ic_baseline_code
                isOpen = false
            }
            14 -> {
                mTag = R.drawable.ic_baseline_thumb_up
                isOpen = false
            }
            32 -> {
                mTag = R.drawable.ic_baseline_thumb_up
                isOpen = false
            }
            33 -> {
                mTag = R.drawable.ic_baseline_backup
                isOpen = false
            }
            15 -> {
                mTag = R.drawable.ic_baseline_backup
                isOpen = false
            }
            34 -> {
                mTag = R.drawable.ic_baseline_code
                isOpen = false
            }
            16 -> {
                mTag = R.drawable.ic_baseline_code
                isOpen = false
            }
            35 -> {
                mTag = R.drawable.ic_baseline_commute
                isOpen = false
            }
            17 -> {
                mTag = R.drawable.ic_baseline_commute
                isOpen = false
            }
            18 -> {
                mTag = R.drawable.ic_baseline_thumb_up
                isOpen = false
            }
            36 -> {
                mTag = R.drawable.ic_baseline_thumb_up
                isOpen = false
            }
        }
    }
}

