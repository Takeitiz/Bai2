package com.example.bai2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        val firstNameEditText: EditText = findViewById(R.id.FirstNameEdit)
        val lastNameEditText: EditText = findViewById(R.id.LastNameEdit)
        val male: RadioButton = findViewById(R.id.Male)
        val female: RadioButton = findViewById(R.id.Female)
        val date: EditText = findViewById(R.id.BirthdayEdit)
        val address: EditText = findViewById(R.id.AddressEdit)
        val email: EditText = findViewById(R.id.EmailEdit)
        val terms: CheckBox = findViewById(R.id.checkBox)
        val register: Button = findViewById(R.id.button)

        register.setOnClickListener {
            if(check(firstNameEditText.text.toString(),
                lastNameEditText.text.toString(),
                date.text.toString(),
                address.text.toString(),
                email.text.toString()
            ) && (male.isChecked || female.isChecked)&& terms.isChecked) {
                Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Please fill in all fields and accept terms.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun check(firstName: String, lastName: String, date: String, address: String, email: String): Boolean {
        return firstName.isNotBlank() && lastName.isNotBlank() && date.isNotBlank() && address.isNotBlank() && email.isNotBlank()
    }

}