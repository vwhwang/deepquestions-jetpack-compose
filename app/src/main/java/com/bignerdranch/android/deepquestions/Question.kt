package com.bignerdranch.android.deepquestions

import androidx.annotation.StringRes

data class Question(@StringRes val questionName: Int, var isAnswered: Boolean)