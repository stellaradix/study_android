# Build Compose

build.gradle :Project

```
plugins {
	id 'com.android.application' version ... apply false
	id 'com.android.library' version ... apply false
	id 'org.jetbrains.kotlin.android' version ... apply false
}
```

build.gradle :Module

```
android {
	...
	kotlinOptions {
		jvmTarget = ...
	}

	buildFeatures {
		compose true
	}

	composeOptions {
		// match Compose-Kotlin Compatibility Map
		kotlinCompilerExtensionVersion ...
	}
}

dependencies {
	/* androidx.core - for Kotlin */
	implementation "androidx.core:core-ktx:..."

	/* androidx.compose */
	def composeBom = platform "androidx.compose:compose-bom:..."
	implementation composeBom
	androidTestImplementation composeBom

	// Compose UI
	implementation 'androidx.compose.material3:material3'
	implementation 'androidx.compose.ui:ui'

	// Compose UI Preview support
	implementation 'androidx.compose.ui:ui-tooling-preview'
	debugImplementation 'androidx.compose.ui:ui-tooling'

	// Compose UI Test
	androidTestImplementation 'androidx.compose.ui:ui-test-junit4'
	debugImplementation 'androidx.compose.ui:ui-test-manifest'

	/* androidx */
	implementation "androidx.activity:activity-compose:..."

	/* Google material design */
	implementation "com.google.android.material:material:..."
}
```

# Composable Function

The `setContent()` function is used to define layout through `@Composable` functions.

-   `@Composable` annotation before function.
-   function names are capitalized.
-   function can`t return anything.

```
@Composable
fun ComposableFunctionName(parameter: Type) { ... }
```

# Preview Function

`@Preview` function be to see app looks like without having to build entire app.

-   `@Preview` annotation before `@Composable` function.
-   parameter `showBackground`: Add background to app preview

```
@Preview(
	showBackground = true
)
```

# Composable UI properties

-   color : hold Color object value

```
ComposableFunctionName(
	color = Color.Magenta
) { ... }
```

-   modifier : augment or decorate composable

```
ComposableFunctionName(
	modifier = Modifier.padding(24.dp)
) { ... }
```
