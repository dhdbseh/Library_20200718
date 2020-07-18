package kr.co.tjoeun.library_20200718

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        val myIntent = Intent(mContext, ProfilePhotoActivity)
        startActivity(myIntent)

    }

    override fun setValues() {

    }

}