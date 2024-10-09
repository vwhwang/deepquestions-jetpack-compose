package com.bignerdranch.android.deepquestions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.bignerdranch.android.deepquestions.ui.theme.PurpleGrey40

@Composable
fun DetailScreen() {
    val questions = listOf(
        Question(R.string.question1, false),
        Question(R.string.question2, false),
        Question(R.string.question3, false),
        Question(R.string.question4, false),
        Question(R.string.question5, false),
        Question(R.string.question6, false),
        Question(R.string.question7, false),
        Question(R.string.question8, false),
        Question(R.string.question9, false),
        Question(R.string.question10, false),
    )
    Box(modifier = Modifier.fillMaxHeight().background(PurpleGrey40),
        contentAlignment = Alignment.Center
    ) {
        QuestionCell(text = stringResource(id = questions.random().questionName)) {}
    }
}
