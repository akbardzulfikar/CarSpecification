package co.id.carspecification

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.app.NavUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codesgood.views.JustifiedTextView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_car_details.*


class CarDetailsActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    lateinit var itemCarName: TextView
    lateinit var itemCarDetail: JustifiedTextView
    lateinit var itemCarPhoto: ImageView
    lateinit var itemCarYear: TextView
    lateinit var toolbar: Toolbar

    var mDetail: String? = null
    var mPhoto: Int = 0
    var mName: String? = null
    var mYear: String? = null
    var mYoutube: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_details)

        toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar)

        val actionBar = actionBar
        actionBar!!.title = "Detail Car"
        actionBar.setDisplayHomeAsUpEnabled(true)

        itemCarName = findViewById(R.id.item_car_name)
        itemCarDetail = findViewById(R.id.item_car_detail)
        itemCarPhoto = findViewById(R.id.img_item_photo)
        itemCarYear = findViewById(R.id.item_car_year)

        mDetail = intent.getStringExtra(EXTRA_DETAIL)
        mName = intent.getStringExtra(EXTRA_NAME)
        mPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        mYear = intent.getStringExtra(EXTRA_YEAR)
        mYoutube = intent.getStringExtra(EXTRA_YOUTUBE)

        itemCarName.text = mName
        Glide.with(this)
            .load(mPhoto)
            .apply(RequestOptions())
            .into(itemCarPhoto)
        itemCarDetail.text = mDetail
        itemCarYear.text = mYear

        yt_view.initialize("", this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_YOUTUBE = "extra_youtube"
    }

//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }

    override fun onInitializationSuccess(
        provider: YouTubePlayer.Provider?,
        player: YouTubePlayer?,
        wasRestored: Boolean
    ) {
        showShortToast("Youtube Api Initialization")
        Log.d("CarDetail", "mYoutube : $mYoutube")
        if (!wasRestored) {
            player?.cueVideo(mYoutube)
        }
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        showShortToast("Youtube Api Initialization Failure")
    }
    fun Context.showShortToast(message: CharSequence){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}