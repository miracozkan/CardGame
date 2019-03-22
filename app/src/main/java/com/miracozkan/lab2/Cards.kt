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


class Cards(context: Context?, number: Int) : ImageView(context) {
    var isOpen: Boolean = false
    var idBg = -1
    var mTag: Int = -1
    var mId = -1

    init {
        minimumHeight = 150
        minimumWidth = 150
        idBg = R.drawable.ic_android_black_24dp
        setBackgroundResource(idBg)
        when (number) {
            1 -> {
                mTag = R.drawable.ic_blogger
                isOpen = false
                mId = 1
                id = mId
            }
            19 -> {
                mTag = R.drawable.ic_blogger
                isOpen = false
                mId = 19
                id = mId
            }
            2 -> {
                mTag = R.drawable.ic_facebook
                isOpen = false
                mId = 2
                id = mId
            }
            20 -> {
                mTag = R.drawable.ic_facebook
                isOpen = false
                mId = 20
                id = mId

            }
            3 -> {
                mTag = R.drawable.ic_google_plus
                mId = 3
                id = mId
                isOpen = false

            }
            21 -> {
                mTag = R.drawable.ic_google_plus
                mId = 21
                id = mId
                isOpen = false

            }
            22 -> {
                mTag = R.drawable.ic_instagram
                mId = 22
                id = mId
                isOpen = false

            }
            4 -> {
                mTag = R.drawable.ic_instagram
                mId = 4
                id = mId
                isOpen = false

            }
            23 -> {
                mTag = R.drawable.ic_line
                mId = 23
                id = mId
                isOpen = false

            }
            5 -> {
                mTag = R.drawable.ic_line
                mId = 5
                id = mId
                isOpen = false

            }
            6 -> {
                mTag = R.drawable.ic_linkedin
                mId = 6
                id = mId
                isOpen = false

            }
            24 -> {
                mTag = R.drawable.ic_linkedin
                mId = 24
                id = mId
                isOpen = false

            }
            7 -> {
                mTag = R.drawable.ic_pinterest
                mId = 7
                id = mId
                isOpen = false
            }
            25 -> {
                mTag = R.drawable.ic_pinterest
                mId = 25
                id = mId
                isOpen = false
            }
            8 -> {
                mTag = R.drawable.ic_skype
                mId = 8
                id = mId
                isOpen = false
            }
            26 -> {
                mTag = R.drawable.ic_skype
                mId = 26
                id = mId
                isOpen = false
            }
            27 -> {
                mTag = R.drawable.ic_telegram
                mId = 27
                id = mId
                isOpen = false
            }
            9 -> {
                mTag = R.drawable.ic_telegram
                mId = 9
                id = mId
                isOpen = false
            }
            10 -> {
                mTag = R.drawable.ic_twitter
                mId = 10
                id = mId
                isOpen = false
            }
            28 -> {
                mTag = R.drawable.ic_twitter
                mId = 28
                id = mId
                isOpen = false
            }
            11 -> {
                mTag = R.drawable.ic_viber
                var a = 11
                id = a
                isOpen = false
            }
            29 -> {
                mTag = R.drawable.ic_viber
                mId = 29
                id = mId
                isOpen = false
            }
            12 -> {
                mTag = R.drawable.ic_vk
                mId = 12
                id = mId
                isOpen = false
            }
            30 -> {
                mTag = R.drawable.ic_vk
                mId = 30
                id = mId
                isOpen = false
            }
            13 -> {
                mTag = R.drawable.ic_whatsapp
                mId = 13
                id = mId
                isOpen = false
            }
            31 -> {
                mTag = R.drawable.ic_whatsapp
                mId = 31
                id = mId
                isOpen = false
            }
            14 -> {
                mTag = R.drawable.ic_youtube
                mId = 14
                id = mId
                isOpen = false
            }
            32 -> {
                mTag = R.drawable.ic_youtube
                mId = 32
                id = mId
                isOpen = false
            }
            33 -> {
                mTag = R.drawable.ic_myspace
                mId = 33
                id = mId
                isOpen = false
            }
            15 -> {
                mTag = R.drawable.ic_myspace
                isOpen = false
                mId = 15
                id = mId
            }
            34 -> {
                mTag = R.drawable.ic_rss
                mId = 34
                id = mId
                isOpen = false
            }
            16 -> {
                mTag = R.drawable.ic_rss
                mId = 16
                id = mId
                isOpen = false
            }
            35 -> {
                mTag = R.drawable.ic_tumblr
                mId = 35
                id = mId
                isOpen = false
            }
            17 -> {
                mTag = R.drawable.ic_tumblr
                isOpen = false
                mId = 17
                id = mId
            }
            18 -> {
                mTag = R.drawable.ic_dribbble
                mId = 18
                id = mId
                isOpen = false
            }
            36 -> {
                mTag = R.drawable.ic_dribbble
                mId = 36
                id = mId
                isOpen = false
            }
        }
    }
}

