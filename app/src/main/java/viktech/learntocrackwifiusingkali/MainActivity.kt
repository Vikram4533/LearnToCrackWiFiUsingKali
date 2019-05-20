        package viktech.learntocrackwifiusingkali

        import android.content.Intent
        import android.net.Uri
        import android.os.Bundle
        import android.support.design.widget.NavigationView
        import android.support.v4.view.GravityCompat
        import android.support.v7.app.ActionBarDrawerToggle
        import android.support.v7.app.AppCompatActivity
        import android.util.Log
        import android.view.MenuItem
        import android.widget.Button
        import com.google.android.gms.ads.*
        import viktech.learntocrackwifiusingkali.R.id.toolbar
        import kotlinx.android.synthetic.main.activity_main.*
        import kotlinx.android.synthetic.main.app_bar_main2.*
        import viktech.learntocrackwifiusingkali.R.id.toolbar


        class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


           private lateinit var mInterstitialAd: InterstitialAd
            //private lateinit var mInterstitialAdv: InterstitialAd


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                setSupportActionBar(toolbar)

        //
        ////        ///////////////////////////////////////////////////////////
        ////        MobileAds.initialize(this,"ca-app-pub-8469160192751212~5700894763")
                MobileAds.initialize(this,
                       "ca-app-pub-3940256099942544~3347511713")
        /////////////////////////////////////////////////////////////////////////////////////////
        ////
        //
                    mInterstitialAd = InterstitialAd(this@MainActivity)
              //    mInterstitialAd.adUnitId = "ca-app-pub-8469160192751212/5776800748"
                mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
                     mInterstitialAd.loadAd(AdRequest.Builder().build())
                    mInterstitialAd.adListener = object : AdListener() {
                    override fun onAdClosed() {
                        mInterstitialAd.loadAd(AdRequest.Builder().build())
                    }
                  }
        ///////////////////////////////////////////////////////////////////////////////////
        ////
        //      mInterstitialAdv = InterstitialAd(this@MainActivity)
        //   //    mInterstitialAdv.adUnitId = "ca-app-pub-8469160192751212/5495868876"
        //         mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        //        mInterstitialAdv.loadAd(AdRequest.Builder().build())
        //        mInterstitialAdv.adListener = object : AdListener() {
        //            override fun onAdClosed() {
        //                mInterstitialAdv.loadAd(AdRequest.Builder().build())
        //            }
        //        }
                ///////////////////////////////////////////////////////////////
                var btn= findViewById<Button>(R.id.wepbt)
                btn.setOnClickListener() {
                    val intent = Intent(this, Wep::class.java)
                    startActivity(intent)

                }

                var btn1= findViewById<Button>(R.id.wpsbt)
                btn1.setOnClickListener(){
                    val intent = Intent(this, WPSact::class.java)
                    startActivity(intent)
                }

                var btn2= findViewById<Button>(R.id.wpabut)
                btn2.setOnClickListener() {
                    val intent = Intent(this, WPAact::class.java)
                    startActivity(intent)
                  if (mInterstitialAd.isLoaded) {
                        mInterstitialAd.show()}


                }
                var btn3= findViewById<Button>(R.id.button2)
                btn3.setOnClickListener() {
                    val intent = Intent(this, Intro::class.java)
                    startActivity(intent)


                }
                var btn4= findViewById<Button>(R.id.button3)
                btn4.setOnClickListener() {
                    val intent = Intent(this, MoMo::class.java)
                    startActivity(intent)
                   if (mInterstitialAd.isLoaded) {
                         mInterstitialAd.show()}

                }

                val toggle = ActionBarDrawerToggle(
                        this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
                drawer_layout.addDrawerListener(toggle)
                toggle.syncState()
                nav_view.setNavigationItemSelectedListener(this)


            }

            override fun onBackPressed() {
                if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
                    drawer_layout.closeDrawer(GravityCompat.START)
                } else {
                    super.onBackPressed()
                }
            }



            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                // Handle navigation view item clicks here.
                when (item.itemId) {
                    R.id.nav_gallery -> {

                        // Handle the camera action
                        val intent = Intent(this, About::class.java)
                        startActivity(intent)

                    }
                    R.id.nav_slideshow -> {

                        val intent= Intent(this, Disclaim::class.java)
                        startActivity(intent)
                    }
                    R.id.ppxyz -> {

                        val intent = Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://sites.google.com/view/viktechpp"))
                        startActivity(intent)
                    }


                }

                drawer_layout.closeDrawer(GravityCompat.START)
                return true
            }

        }
