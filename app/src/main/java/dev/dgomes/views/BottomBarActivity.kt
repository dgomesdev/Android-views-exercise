package dev.dgomes.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import dev.dgomes.views.databinding.ActivityBottomBarBinding

class BottomBarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBottomBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomBar.setNavigationOnClickListener {
            Snackbar.make(it, "Menu clicked", Snackbar.LENGTH_LONG).show()
        }

        binding.floatingButton.setOnClickListener {
            Snackbar.make(it, "Button clicked!", Snackbar.LENGTH_LONG).show()
        }

        binding.bottomBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.favorite -> {
                    Snackbar.make(binding.bottomBar, "Favorite!", Snackbar.LENGTH_LONG).show()
                    true
                }
                R.id.search -> {
                    Snackbar.make(binding.bottomBar, "Search!", Snackbar.LENGTH_LONG).show()
                    true
                }
                R.id.more -> {
                    Snackbar.make(binding.bottomBar, "More!", Snackbar.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }

    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent(context, BottomBarActivity::class.java)
    }

}