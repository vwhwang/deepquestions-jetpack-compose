package com.bignerdranch.android.deepquestions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.deepquestions.ui.theme.Pink80

@Composable
fun DetailScreen(string: String?) {
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
    Box(
        modifier = Modifier
            .background(Pink80)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(vertical = 4.dp, horizontal = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = string ?: "huh",
            style = MaterialTheme.typography.titleLarge
        )
    }
}
