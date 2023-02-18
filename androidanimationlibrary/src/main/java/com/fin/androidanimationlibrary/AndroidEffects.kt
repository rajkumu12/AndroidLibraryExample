package com.fin.androidanimationlibrary

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.graphics.Color
import android.view.View
import android.view.animation.Animation
import android.view.animation.TranslateAnimation




object AndroidEffects {
    fun blink(view: View) {
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor", Color.BLUE,
            Color.RED, Color.GREEN
        )
        // duration of one color
        animator.duration = 500
        animator.setEvaluator(ArgbEvaluator())
        // color will be shown in reverse manner
        animator.repeatCount = Animation.REVERSE
        // Repeat up to infinite time
        animator.repeatCount = Animation.INFINITE
        animator.start()
    }
}