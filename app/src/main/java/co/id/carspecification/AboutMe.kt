package co.id.carspecification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val MyImg: ImageView = findViewById(R.id.img_item_photo)
        val mImg = "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/2020081917382533e0d91ec52ae0a15d3b7e6126fe0788.png"

        Glide.with(this)
            .load(mImg)
            .apply(RequestOptions())
            .into(MyImg)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}