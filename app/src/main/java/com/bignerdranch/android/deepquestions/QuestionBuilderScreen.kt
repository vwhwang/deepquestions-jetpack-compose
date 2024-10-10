package com.bignerdranch.android.deepquestions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
    val randomQuestion = stringResource(id = questions.random().questionName)
    Column() {
        Button(
            onClick = { navController.navigate(Screen.DetailScreen.withArgs(randomQuestion)) }) {
            Text(text = "Pick a Random Question!")
        }
        LazyColumn() {
            item() {
                Text(
                    textAlign = TextAlign.Center,
                    text = "list of questions ",
                    style = MaterialTheme.typography.titleLarge
                )
            }
            item {
                questions.forEach {
                    val questionDescription = stringResource(id = it.questionName)
                    QuestionCell(
                        text = stringResource(id = it.questionName),
                        onClickQuestion = {
                            navController.navigate(Screen.DetailScreen.withArgs(questionDescription))
                        }
                    )
                }
            }
        }
    }
}