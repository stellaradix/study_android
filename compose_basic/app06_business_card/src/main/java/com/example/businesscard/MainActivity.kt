package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocalPhone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			BusinessCardTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					BusinessCardApp()
				}
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	BusinessCardTheme {
		Surface(
			modifier = Modifier.fillMaxSize(),
			color = MaterialTheme.colorScheme.background
		) {
			BusinessCardApp()
		}
	}
}

@Composable
fun BusinessCardApp() {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.background(Color(0xFF073042)),
	) {
		MainBox(
			paintImage = painterResource(R.drawable.android_logo),
			name = stringResource(R.string.business_card_name),
			specification = stringResource(R.string.business_card_spec),
			modifier = Modifier
				.fillMaxWidth()
				.weight(1f),
		)
		Divider()
		InfoBox(
			icon = Icons.Rounded.LocalPhone,
			info = stringResource(R.string.business_card_phone),
		)
		Divider()
		InfoBox(
			icon = Icons.Rounded.Share,
			info = stringResource(R.string.business_card_handle),
		)
		Divider()
		InfoBox(
			icon = Icons.Rounded.Email,
			info = stringResource(R.string.business_card_email),
		)
		Spacer(
			modifier = Modifier.height(32.dp),
		)
	}
}

@Composable
fun MainBox(
	paintImage: Painter,
	name: String,
	nameColor: Color = Color.White,
	specification: String,
	specificationColor: Color = Color(0xFF3DDC84),
	modifier: Modifier = Modifier
) {
	Column(
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = modifier
	) {
		Image(
			painter = paintImage,
			contentDescription = null,
			modifier = Modifier
				.fillMaxWidth(0.4f)
		)
		Text(
			text = name,
			color = nameColor,
			textAlign = TextAlign.Center,
			fontSize = 28.sp,
			fontWeight = FontWeight.Bold,
			modifier = Modifier
				.padding(top = 16.dp, bottom = 16.dp)
				.fillMaxWidth()
		)
		Text(
			text = specification,
			color = specificationColor,
			textAlign = TextAlign.Center,
			fontWeight = FontWeight.Bold,
			modifier = Modifier
				.fillMaxWidth(),
		)
	}
}

@Composable
fun InfoBox(
	icon: ImageVector,
	iconColor: Color = Color(0xFF3DDC84),
	info: String,
	infoColor: Color = Color.White,
	modifier: Modifier = Modifier
		.padding(start = 32.dp, end = 32.dp, top = 8.dp, bottom = 8.dp),
) {
	Row(
		modifier = modifier
			.fillMaxWidth(),
	) {
		Icon(
			imageVector = icon,
			tint = iconColor,
			contentDescription = null,
			modifier = Modifier
				.padding(end = 24.dp),
		)
		Text(
			text = info,
			color = infoColor,
			modifier = Modifier.padding(0.dp)
		)
	}
}