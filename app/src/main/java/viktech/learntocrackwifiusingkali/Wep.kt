package viktech.learntocrackwifiusingkali

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Wep : AppCompatActivity() {
  lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wep)
        //setSupportActionBar(toolbar)

//        MobileAds.initialize(this,"ca-app-pub-8469160192751212~5700894763")
        MobileAds.initialize(this,
           "ca-app-pub-3940256099942544~3347511713")
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }

}
