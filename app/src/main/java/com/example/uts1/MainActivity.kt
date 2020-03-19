package com.example.uts1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val desk = deskripsiFakultas()
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.adapter = fakultasAdapter(desk,{fakItem : Fakultas -> fakItemClicked(fakItem)})
    }

    private fun fakItemClicked (fakItem : Fakultas) {
        val showDetailActivityIntent = Intent (this, FakultasDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakItem.image)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, fakItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakItem.description)
        startActivity(showDetailActivityIntent)
    }

    private fun deskripsiFakultas(): List<Fakultas> {
        val fakList = ArrayList<Fakultas>()
        fakList.add(
            Fakultas(R.drawable.logoupnbaru, "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur. Yang teridiri dari program studi: \n" +
                        "1. Teknik Informatika \n" +
                        "2. Sistem Informasi \n"
                )
        )
        fakList.add(
            Fakultas(R.drawable.logoupnbaru, "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur. Yang teridiri dari program studi: \n" +
                        "1. Teknik Industri \n" +
                        "2. Teknik Lingkungan \n" +
                        "3. Teknik Pangan \n" +
                        "4. Teknik Kimia \n" +
                        "5. Teknik Sipil \n"
            )
        )
        fakList.add(
            Fakultas(R.drawable.logoupnbaru, "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur. Yang teridiri dari program studi: \n" +
                        "1. Akuntansi \n" +
                        "2. Ekonomi Pembangunan \n" +
                        "3. Manajemen \n"
            )
        )
        fakList.add(
            Fakultas(R.drawable.logoupnbaru, "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur. Yang teridiri dari program studi: \n" +
                        "1. Agroteknologi \n" +
                        "2. Agribisnis \n"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fotonuke, "About Me!",
                "NAMA       \n" +
                        "Nuke Nidya\n" +
                        "\nTTL       \n" +
                        "Surabaya, 12 Oktober 1999\n" +
                        "\nALAMAT     \n" +
                        "Jl. Nangka IV no. 19 Perumnas - Kamal, Bangkalan\n" +
                        "\nEMAIL   \n" +
                        "nidyanuke12@gmail.com\n" +
                        "\nURL GITHUB \n" +
                        "https://github.com/nukenidya\n" +
                        "\nPENDIDIKAN \n" +
                        "  - SDN Banyuajuh 2 Kamal  (2005-2011)\n" +
                        "  - SMPN 2 Bangkalan           (2011-2014)\n" +
                        "  - SMAN 1 Bangkalan           (2014-2017)\n" +
                        "  - Fakultas Ilmu Komputer UPN V Jatim\n" +
                        "\nPENGHARGAAN  \n" +
                        "Juara 3 Lomba Pakibra Sekolah (2015)\n" +
                        "Juara Harapan 1 Paskibra Tingkat Provinsi (2016)\n" +
                        "Paskibraka Kabupaten Bangkalan (2015)\n" )
            )

        return fakList
    }

}

