package com.jaleny.bookcatalogue.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun LableView(title :String){

        Text(
            text = "Search for books",
            style = typography.labelMedium,
            textAlign = TextAlign.Start,
            color = colorScheme.onPrimary
        )
    }


    @ExperimentalComposeUiApi
    @Composable
    fun TextInputField(label: String, value: String, onValueChanged: (String) -> Unit) {
        val keyboardController = LocalSoftwareKeyboardController.current

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            value = value,
            onValueChange = {
                onValueChanged(it)
            },

            label = { LableView(title = label) },
            textStyle = typography.bodyLarge,
            colors = com.jaleny.bookcatalogue.components.textFieldColors(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                }
            )
        )

    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFieldColors() = androidx.compose.material3.TextFieldDefaults.textFieldColors(
    disabledTextColor = colorScheme.onPrimary,
    focusedLabelColor = colorScheme.primary,
    focusedIndicatorColor = colorScheme.primary,
    unfocusedIndicatorColor = Color.Black,
    cursorColor = colorScheme.primary,
    disabledPlaceholderColor = colorScheme.onPrimary
)