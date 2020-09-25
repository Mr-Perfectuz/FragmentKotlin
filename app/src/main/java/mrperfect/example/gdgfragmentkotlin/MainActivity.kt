package mrperfect.example.gdgfragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var fragmentManager: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment= FirstFragment()
        fragmentManager = supportFragmentManager
        val beginTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        beginTransaction.add(R.id.container, firstFragment)
        beginTransaction.addToBackStack(firstFragment.toString())

    }
}