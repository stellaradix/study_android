# UI (User Interface)

-   On screen items: text, images, buttons, and may other types of elements
-   How App items lay out on screen
-   How App items be presented to users
-   How Users interact with App items
-   Each of UI elements be called `UI component`

# Annotation

-   Means attached extra information to code
-   Extra infomation help tools like compiler, and developer understand code
-   can take parameters: provide extra information

# Text component

```
Text (
	text :String,
	fontSize :TextUnit
)
```

### TextUnit

-   sp: scalable pixels `ex) 24.sp`
-   dp: density-independent pixels `ex) 24.dp`

# UI Hierarchy

-   Based on containment: one component can contain one or more conponents
-   parent component: containing other UI elements
-   child component: contained UI element

![column_row](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-text-composables/img/d7df7c362f507d6b_856.png)
