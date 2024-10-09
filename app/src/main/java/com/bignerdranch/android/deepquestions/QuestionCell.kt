package com.bignerdranch.android.deepquestions

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.deepquestions.ui.theme.Purple80

@Preview
@Composable
private fun QuestionCellPreview() {
    QuestionCell(
        text = "what now what sldjfdlkfj lsd sdkfjsldkj flksdj fsdflksdjf ",
        onClickQuestion = {})
}

@Composable
fun QuestionCell(
    text: String,
    modifier: Modifier = Modifier,
    onClickQuestion: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable { onClickQuestion }
            .background(Purple80)
            .padding(vertical = 4.dp, horizontal = 16.dp)
            .fillMaxWidth()
    ) {
        Checkbox(checked = false, onCheckedChange = {})
        Column() {
            Text(
                text = text,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}