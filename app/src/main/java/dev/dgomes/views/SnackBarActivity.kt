package dev.dgomes.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import dev.dgomes.views.databinding.ActivitySnackBarBinding

class SnackBarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySnackBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.showingButton.setOnClickListener {
            Snackbar.make(it, "Showing snackbar", Snackbar.LENGTH_LONG).show()
        }

        binding.actionButton.setOnClickListener { view ->
            Snackbar.make(view, "Snackbar with action", Snackbar.LENGTH_LONG)
                .setAction("Action") {
                    Snackbar.make(it, "Showing action from snackbar", Snackbar.LENGTH_LONG).show()
                }
                .show()
        }

    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, SnackBarActivity::class.java)
    }

}
