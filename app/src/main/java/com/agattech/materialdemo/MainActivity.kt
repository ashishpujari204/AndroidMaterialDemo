package com.agattech.materialdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val COUNTRIES = arrayOf<String?>("Item 1", "Item 2", "Item 3", "Item 4")

        val adapter: ArrayAdapter<String?> = ArrayAdapter<String?>(
            this,
            android.R.layout.simple_spinner_item
            ,
            COUNTRIES
        )

        filled_exposed_dropdown.setOnKeyListener(null)
        filled_exposed_dropdown.setAdapter(adapter)
        btnSubmit.setOnClickListener { showMyDialog() }
    }

    private fun showMyDialog() {
        MaterialAlertDialogBuilder(this)
            .setTitle(resources.getString(R.string.app_name))
            .setMessage(resources.getString(R.string.supporting_text))
            .setCancelable(false)
            .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                // Respond to neutral button press
            }
            .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                // Respond to positive button press
            }
            .show()
    }
}