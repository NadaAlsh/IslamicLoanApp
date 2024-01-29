package com.nadaalshaibani.islamicloanform.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.reflect.KProperty


class LoanViewModel : ViewModel(){
    var loanAmount by mutableStateOf(0.0)
    private set
    var periodInMonths by mutableStateOf(0)
    private set
    var monthlyInstallment by mutableStateOf(0.0)
    private set

    fun onLoanAmountChange(newLoanAmount: Double){
        loanAmount = newLoanAmount
    }
    fun onPeriodInMonths(newPeriodInMonths: Int){
        periodInMonths = newPeriodInMonths
    }
    fun calculateMonthlyInstallment(){
       monthlyInstallment = loanAmount / periodInMonths
    }

}

