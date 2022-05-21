package com.adriann.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adriann.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManager(
                        stringResource(R.string.title_text),
                        stringResource(R.string.description_text)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskManager(title: String, description: String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .wrapContentHeight(Alignment.CenterVertically)
            .wrapContentWidth(Alignment.CenterHorizontally)
    ) {
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        TaskManager(
            stringResource(R.string.title_text),
            stringResource(R.string.description_text)
        )
    }
}