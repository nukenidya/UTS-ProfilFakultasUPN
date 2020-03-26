package com.example.uts1

import android.content.Intent
import android.graphics.Paint.UNDERLINE_TEXT_FLAG
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas.*
import kotlinx.android.synthetic.main.detail_fakultas.imageList

class FakultasDetail : AppCompatActivity() {

    val listdatalink = arrayOf(
        "http://febis.upnjatim.ac.id/",//0
        "http://faperta.upnjatim.ac.id/",//1
        "http://ft.upnjatim.ac.id/",//2
        "http://fisip.upnjatim.ac.id/",//3
        "https://fik.upnjatim.ac.id/",//4
        "http://fad.upnjatim.ac.id/",//5
        "http://fhukum.upnjatim.ac.id/",//6
        "https://github.com/nukenidya" //7
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var gambar = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var judul = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var linkfak = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_CC)

            imageList.setImageResource(gambar)
            judulList.text = judul
            deskripsiFak.text = deskripsi

            if (judul=="Fakultas Ekonomi dan Bisnis") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                    imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[0])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Pertanian") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[1])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Teknik") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[2])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Ilmu Sosial dan Politik") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[3])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Ilmu Komputer") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[4])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Arsitektur & Desain") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[5])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="Fakultas Hukum") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[6])
                    startActivity(showDetailActivityIntent)
                }
            }

            if (judul=="About Me!") {

                setTitle(judul)
                judulList.setPaintFlags(UNDERLINE_TEXT_FLAG)
                judulList.setOnClickListener {
                    val showDetailActivityIntent = Intent(this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, linkfak)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, WebFakultas::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[7])
                    startActivity(showDetailActivityIntent)
                }
            }
            }
        }
    }

