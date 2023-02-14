package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			HappyBirthdayTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					color = MaterialTheme.colorScheme.background
				) {
					BirthdayGreetingWithImage(
						stringResource(R.string.happy_birthday_text),
						stringResource(R.string.signature_text)
					)
				}
			}
		}
	}
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Top,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(
			text = message,
			fontSize = 30.sp,
			modifier = Modifier.padding(top = 16.dp)
		)

		Text(
			text = from,
			fontSize = 24.sp,
			modifier = Modifier
				.padding(top = 16.dp, end = 16.dp)
				.align(alignment = Alignment.End)
		)
	}
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
	val image = painterResource(R.drawable.androidparty)
	Box {
		Image(
			painter = image,
			contentDescription = null,
			contentScale = ContentScale.Crop
		)

		BirthdayGreetingWithText(
			message = message,
			from = from
		)
	}
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
	HappyBirthdayTheme {
		BirthdayGreetingWithImage(
			stringResource(R.string.happy_birthday_text),
			stringResource(R.string.signature_text)
		)
	}
}