package com.tahakhairy.android.graduationproject

import android.os.Bundle
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.tahakhairy.android.graduationproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    private var expandableListView: ExpandableListView? = null
    private var adapter: ExpandableListAdapter? = null
    private var titleList: List<String>? = null


//    private val data: HashMap<String, List<String>>
//        get() {
//            val listData = HashMap<String, List<String>>()
//
//            val phones = ArrayList<String>()
//            phones.add("Samsung")
//            phones.add("Apple")
//            phones.add("Xiaomi")
//            phones.add("Oppo")
//            phones.add("One Plus")
//            phones.add("Pixel")
//
//
//            val micromaxMobiles = ArrayList<String>()
//            micromaxMobiles.add("Micromax Bharat Go")
//            micromaxMobiles.add("Micromax Bharat 5 Pro")
//            micromaxMobiles.add("Micromax Bharat 5")
//            micromaxMobiles.add("Micromax Canvas 1")
//            micromaxMobiles.add("Micromax Dual 5")
//
//            val appleMobiles = ArrayList<String>()
//            appleMobiles.add("iPhone 8")
//            appleMobiles.add("iPhone 8 Plus")
//            appleMobiles.add("iPhone X")
//            appleMobiles.add("iPhone 7 Plus")
//            appleMobiles.add("iPhone 7")
//            appleMobiles.add("iPhone 6 Plus")
//
//            val samsungMobiles = ArrayList<String>()
//            samsungMobiles.add("Samsung Galaxy S9+")
//            samsungMobiles.add("Samsung Galaxy Note 7")
//            samsungMobiles.add("Samsung Galaxy Note 5 Dual")
//            samsungMobiles.add("Samsung Galaxy S8")
//            samsungMobiles.add("Samsung Galaxy A8")
//            samsungMobiles.add("Samsung Galaxy Note 4")
//
//            listData["Phones"] = phones
//            listData["Micromax"] = micromaxMobiles
//            listData["Apple"] = appleMobiles
//            listData["Samsung"] = samsungMobiles
//            listData["Handmade"] = samsungMobiles
//            listData["Home"]
//            listData["Men"]
//            listData["Kids"]
//
//            return listData
//
//        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homePageFragment, R.id.loginFragment),
            binding.drawerLayout
        )

        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.bottomNavView.setupWithNavController(navController)

        binding.navView.setupWithNavController(navController)

//        expandableListView = findViewById(R.id.expandable_menu)
//        if (expandableListView != null) {
//            val listData = data
//            titleList = ArrayList(listData.keys)
//            adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
//            expandableListView!!.setAdapter(adapter)
//
//        }


        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}