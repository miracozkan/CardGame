package com.miracozkan.lab2

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    private fun delayDelete(cardOne: Cards, cardTwo: Cards, delayMs: Long) {
        Handler().postDelayed({
            (cardOne).visibility = View.INVISIBLE
            (cardTwo).visibility = View.INVISIBLE
        }, delayMs)
    }

    private fun delayOpen(cardOne: Cards, cardTwo: Cards, delayMs: Long) {
        Handler().postDelayed({
            openCard(cardOne)
            openCard(cardTwo)
        }, delayMs)
    }

    private var clickedCardId: Cards? = null
    private var clickedCardId2: Cards? = null

    override fun onClick(v: View?) {

        val card: Cards = v as Cards
        openCard(card)

        if (clickedCardId == null) {
            clickedCardId = v
        } else if (clickedCardId2 == null && clickedCardId != null) {
            clickedCardId2 = v
            if ((clickedCardId2!!).mTag.toString() == (clickedCardId!!).mTag.toString()) {
                delayDelete(clickedCardId!!, clickedCardId2!!, 500)
                clickedCardId = null
                clickedCardId2 = null
            } else {
                delayOpen(clickedCardId!!, clickedCardId2!!, 500)
                clickedCardId = null
                clickedCardId2 = null
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //AddArray
        val cardsArray = arrayListOf<Cards>()
        for (index in 1..36) {
            cardsArray.add(Cards(this, index))
            cardsArray[index - 1].setOnClickListener(this)
        }
        //Shuffle
        for (index in 0..35) {
            val rnd: Int = (0..35).random()
            val swap: Cards = cardsArray[rnd]
            cardsArray[rnd] = cardsArray[index]
            cardsArray[index] = swap
        }

        //AddActivity
        for (index in 0..35) {
            lnr.addView((cardsArray[index]))
        }
    }

    //OpenCard
    private fun openCard(card: Cards) {
        if (!card.isOpen) {
            card.setBackgroundResource(card.mTag)
            card.isOpen = true
            card.isClickable = false
        } else {
            card.isOpen = false
            card.setBackgroundResource(card.idBg)
            card.isClickable = true

        }
    }
}
