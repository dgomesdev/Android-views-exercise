package dev.dgomes.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import dev.dgomes.views.databinding.ActivityTopBarBinding

class TopBarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityTopBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.topBar.setNavigationOnClickListener {
            Snackbar.make(it, "Menu clicked", Snackbar.LENGTH_LONG).show()
        }

        binding.topBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.favorite -> {
                    Snackbar.make(binding.topBar, "Favorite!", Snackbar.LENGTH_LONG).show()
                    true
                }
                R.id.search -> {
                    Snackbar.make(binding.topBar, "Search!", Snackbar.LENGTH_LONG).show()
                    true
                }
                R.id.more -> {
                    Snackbar.make(binding.topBar, "More!", Snackbar.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }

    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, TopBarActivity::class.java)
    }
}
