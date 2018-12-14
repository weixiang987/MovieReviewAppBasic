package com.example.a171349k.moviereviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun displaycheckBoxes(v: View) {
        if (chkboxNSFAA.isChecked == true) {
            if (chkboxViolence.visibility == View.GONE || chkboxLanguageused.visibility == View.GONE) {
                chkboxViolence.visibility = View.VISIBLE
                chkboxLanguageused.visibility = View.VISIBLE
            }
            else {
                if(chkboxViolence.visibility == View.VISIBLE || chkboxLanguageused.visibility == View.GONE) {
                    chkboxViolence.visibility = View.GONE
                    chkboxLanguageused.visibility = View.GONE
                }
            }
        }
    }

    fun btnAddMovie(v: View) {
        var captureName: String = etName.text.toString()
        var captureDescription: String = etDescription.text.toString()
        var captureReleasedate: String = etReleasedate.text.toString()
        var language = ""
        if (rbtnEnglish.isChecked) {
            language = "English"
        } else if (rbtnChinese.isChecked) {
            language = "Chinese"
        } else if (rbtnMalay.isChecked) {
            language = "Malay"
        } else {
            language = "Tamil"
        }
        var check: Boolean = false
        var nsfaa: Boolean = false
        var nsfaViol: Boolean = false
        var nsfaViolence: String = ""
        var nsfaLang: Boolean = false
        var nsfaLanguage: String = ""
        if (nsfaViol == true) {
            nsfaViolence = "Violence"
        }
        if (nsfaLang == true) {
            nsfaLanguage = "Language"
        }

        if (nsfaa == false) {
            Toast.makeText(
                this,
                "Title =  ${captureName} \n Overview = ${captureDescription} \n  Release date = ${captureReleasedate} \n Language = ${language} \n Suitable for all ages = ${nsfaa}" ,Toast.LENGTH_LONG
            ).show()
        } else {
            if (nsfaViol == true && nsfaLang == true) {
                Toast.makeText(
                    this,
                    "Title =  ${captureName} \n Overview = ${captureDescription} \n  Release date = ${captureReleasedate} \n Language = ${language} \n Suitable for all ages = ${nsfaa} \n Reason: \n ${nsfaViolence} \n ${nsfaLanguage}", Toast.LENGTH_LONG
                )
            } else if (nsfaViol == true && nsfaLang == false) {
                Toast.makeText(
                    this,
                    "Title =  ${captureName} \n Overview = ${captureDescription} \n  Release date = ${captureReleasedate} \n Language = ${language} \n Suitable for all ages = ${nsfaa} \n Reason: \n ${nsfaViolence}", Toast.LENGTH_LONG
                )
            } else if (nsfaViol == false && nsfaLang == true){
                Toast.makeText(
                    this,
                    "Title =  ${captureName} \n Overview = ${captureDescription} \n  Release date = ${captureReleasedate} \n Language = ${language} \n Suitable for all ages = ${nsfaa} \n Reason: \n ${nsfaViolence}", Toast.LENGTH_LONG)
                }
            else {
                Toast.makeText(this, "Title =  ${captureName} \n Overview = ${captureDescription} \n  Release date = ${captureReleasedate} \n Language = ${language} \n Suitable for all ages = ${nsfaa}", Toast.LENGTH_LONG)
            }
        }
    }
}
