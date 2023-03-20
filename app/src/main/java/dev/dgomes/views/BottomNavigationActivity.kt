package dev.dgomes.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dev.dgomes.views.databinding.ActivityBottomNavigationBinding
import dev.dgomes.views.fragments.FavoriteFragment
import dev.dgomes.views.fragments.MusicFragment
import dev.dgomes.views.fragments.PlacesFragment
import dev.dgomes.views.fragments.SearchFragment

class BottomNavigationActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBottomNavigationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.favorite -> {
                    openFragment(FavoriteFragment.newInstance())
                }
                R.id.search -> {
                    openFragment(SearchFragment.newInstance())
                }
                R.id.music -> {
                    openFragment(MusicFragment.newInstance())
                }
                R.id.places -> {
                    openFragment(PlacesFragment.newInstance())
                }
            }

        }
        binding.bottomNavigation.selectedItemId = R.id.favorite
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, BottomNavigationActivity::class.java)
    }
}
