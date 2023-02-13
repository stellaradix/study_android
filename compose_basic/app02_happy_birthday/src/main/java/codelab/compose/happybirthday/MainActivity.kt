package codelab.compose.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
					BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
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

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
	val image = painterResource(R.drawable.androidparty)
	Box {
		Image(
			painter = image,
			contentDescription = null
		)
		BirthdayGreetingWithText(message = message, from = from)
	}
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
	HappyBirthdayTheme {
		BirthdayGreetingWithImage("Happy Birthday Sam!", "- from Emma")
	}
}