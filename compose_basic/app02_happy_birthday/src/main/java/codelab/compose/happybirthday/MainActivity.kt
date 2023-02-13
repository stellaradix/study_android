package codelab.compose.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import codelab.compose.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			HappyBirthdayTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					color = MaterialTheme.colorScheme.background
				) {
					BirthdayGreetingWithText("Happy Birthday Sam!", "- from Emma")
				}
			}
		}
	}
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
	Column {
		Text(
			text = message,
			fontSize = 30.sp,
		)

		Text(
			text = from,
			fontSize = 24.sp
		)
	}
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
	HappyBirthdayTheme {
		BirthdayGreetingWithText("Happy Birthday Sam!", "- from Emma")
	}
}