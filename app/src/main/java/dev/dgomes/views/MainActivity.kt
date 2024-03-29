package dev.dgomes.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.dgomes.views.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        insertListeners()
    }

    private fun insertListeners() {
        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(this))
        }

        binding.cvTextFields.setOnClickListener {
            startActivity(TextFieldsActivity.createIntent(this))
        }

        binding.cvBottomSheets.setOnClickListener {
            ModalBottomSheet.start(supportFragmentManager)
        }

        binding.cvTopAppBar.setOnClickListener {
            startActivity(TopBarActivity.createIntent(this))
        }

        binding.cvBottomAppBar.setOnClickListener {
            startActivity(BottomBarActivity.createIntent(this))
        }

        binding.cvSnackBar.setOnClickListener {
            startActivity(SnackBarActivity.createIntent(this))
        }

        binding.cvBottomNavigation.setOnClickListener {
            startActivity(BottomNavigationActivity.createIntent(this))
        }
    }
}