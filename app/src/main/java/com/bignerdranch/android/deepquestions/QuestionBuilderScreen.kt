package com.bignerdranch.android.deepquestions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController

@Composable
fun QuestionBuilderScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
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
    Column() {
        Button(
            onClick = {navController.navigate(Screen.DetailScreen.route)}) {
            Text(text = "One Question at a time!")
        }
        LazyColumn() {
            item() {
                Text(
                    text = "list of questions ",
                    style = MaterialTheme.typography.titleLarge
                )
            }
            item {
                questions.forEach {
                    QuestionCell(
                        text = stringResource(id = it.questionName),
                        onClickQuestion = {})
                }
            }
        }
    }
}