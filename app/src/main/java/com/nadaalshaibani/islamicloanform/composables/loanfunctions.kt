package com.nadaalshaibani.islamicloanform.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nadaalshaibani.islamicloanform.viewmodel.LoanViewModel

@Composable
fun IslamicLoanCalculator(viewModel: LoanViewModel = viewModel()) {


    Column {

        OutlinedTextField(
            value = viewModel.loanAmount.toString(),
            onValueChange = { viewModel.onLoanAmountChange(it.toDouble())},
            label = {Text(text = "Loan Amount")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = viewModel.periodInMonths.toString(),
            onValueChange = { viewModel.onPeriodInMonths(it.toInt()) },
            label = {Text(text = "Loan Period in Months ")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(onClick = { viewModel.calculateMonthlyInstallment() }) {
            Text(text = "Calculate")
        }
        Text(text = "Monthly Installment: ${viewModel.monthlyInstallment} KD",
            style = MaterialTheme.typography.bodyMedium)
    }
}

