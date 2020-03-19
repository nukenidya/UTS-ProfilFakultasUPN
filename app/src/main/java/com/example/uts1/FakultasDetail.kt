package com.example.uts1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas.*

class FakultasDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var gambar = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var judul = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            imageList.setImageResource(gambar)
            judulList.text = judul
            deskripsiFak.text = deskripsi
        }
    }
}
