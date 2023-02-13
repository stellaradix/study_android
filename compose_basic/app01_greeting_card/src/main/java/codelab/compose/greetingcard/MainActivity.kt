package codelab.compose.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import codelab.compose.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			GreetingCardTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					color = MaterialTheme.colorScheme.background
				) {
					Greeting("Mason")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String) {
	Surface(
		color = Color.Magenta
	) {
		Text(
			text = "Hi, my name is $name!",
			modifier = Modifier.padding(24.dp)
		)
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	GreetingCardTheme {
		Greeting("Mason")
	}
}