package com.bignerdranch.android.deepquestions

import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Question(@StringRes val questionName: Int , val isAnswered: Boolean)