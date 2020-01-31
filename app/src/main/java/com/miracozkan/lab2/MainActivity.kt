package com.miracozkan.lab2

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var score: Int = 0
    private var attempt: Int = 0


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

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        val card: Cards = v as Cards
        openCard(card)

        if (clickedCardId == null) {
            clickedCardId = v
        } else if (clickedCardId2 == null && clickedCardId != null) {
            clickedCardId2 = v
            if ((clickedCardId2!!).mTag.toString() == (clickedCardId!!).mTag.toString()) {
                delayDelete(clickedCardId!!, clickedCardId2!!, 700)

                score += 10
                scoreBoard.text = "Score : $score"
                attempt++
                attempsBoard.text = "Attemps : $attempt"

                if (score == 180) {
                    startActivity(intent)
                }

                clickedCardId = null
                clickedCardId2 = null
            } else {
                delayOpen(clickedCardId!!, clickedCardId2!!, 700)

                attempt++
                attempsBoard.text = "Attemps : $attempt"

                clickedCardId = null
                clickedCardId2 = null
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        //AddImageView
        for (index in 0..35) {
            lnr.addView((cardsArray[index]))
        }
    }

    //OpenCard or CloseCard
    private fun openCard(card: Cards) {
        if (!card.isOpen) {

            YoYo.with(Techniques.FlipInX)
                .duration(700)
                .repeat(0)
                .playOn(findViewById(card.id))

            card.setBackgroundResource(card.mTag)
            card.isOpen = true
            card.isClickable = false
        } else {

            YoYo.with(Techniques.FlipInY)
                .duration(700)
                .repeat(0)
                .playOn(findViewById(card.id))

            card.isOpen = false
            card.setBackgroundResource(card.idBg)
            card.isClickable = true
        }
    }
}
