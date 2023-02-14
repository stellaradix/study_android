package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ComposeQuadrantTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					ComposeQuadrantApp()
				}
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	Surface(
		modifier = Modifier.fillMaxSize(),
		color = MaterialTheme.colorScheme.background
	) {
		ComposeQuadrantApp()
	}
}

@Composable
fun ComposeQuadrantApp() {
	Column(Modifier.fillMaxSize()) {
		Row(Modifier.weight(1f)) {
			QuadrantBox(
				title = stringResource(R.string.text_quadrant_title),
				description = stringResource(R.string.text_quadrant_text),
				backgroundColor = Color.Green,
				modifier = Modifier.weight(1f)
			)
			QuadrantBox(
				title = stringResource(R.string.image_quadrant_title),
				description = stringResource(R.string.image_quadrant_text),
				backgroundColor = Color.Yellow,
				modifier = Modifier.weight(1f)
			)
		}
		Row(Modifier.weight(weight = 1f)) {
			QuadrantBox(
				title = stringResource(R.string.row_quadrant_title),
				description = stringResource(R.string.row_quadrant_text),
				backgroundColor = Color.Cyan,
				modifier = Modifier.weight(1f)
			)
			QuadrantBox(
				title = stringResource(R.string.column_quadrant_title),
				description = stringResource(R.string.column_quadrant_text),
				backgroundColor = Color.LightGray,
				modifier = Modifier.weight(1f)
			)
		}
	}
}

@Composable
fun QuadrantBox(
	title: String,
	description: String,
	backgroundColor: Color,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
			.fillMaxSize()
			.background(color = backgroundColor)
			.padding(16.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(
			text = title,
			fontWeight = FontWeight.Bold,
			modifier = Modifier.padding(bottom = 16.dp)
		)
		Text(
			text = description,
			textAlign = TextAlign.Justify
		)
	}
}