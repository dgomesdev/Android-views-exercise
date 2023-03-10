package dev.dgomes.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.dgomes.views.databinding.ActivityTextFieldsBinding

class TextFieldsActivity : AppCompatActivity() {
        private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(binding.root)

        binding.inputError.error = "Mandatory field!"
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TextFieldsActivity::class.java)
    }

}
