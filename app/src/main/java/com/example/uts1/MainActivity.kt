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
        showDetailActivityIntent.putExtra(Intent.EXTRA_CC, fakItem.linkfak)
        startActivity(showDetailActivityIntent)
    }

    private fun deskripsiFakultas(): List<Fakultas> {
        val fakList = ArrayList<Fakultas>()
        fakList.add(
            Fakultas(R.drawable.febsquare, "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi UPN V Jatim merupakan salah satu fakultas tertua dan memiliki student body terbanyak dilingkungan UPN V Jatim." +
                        "\n Fakultas Ekonomi didirikan pada tahun 1956, dengan nama Akademi Administrasi Veteran (APPV). Dan sejak tanggal 4 April 2013, berdasarkan SK  Rektor Fakultas Ekonomi UPN V Jatim berubah menjadi Fakultas Ekonomi dan Bisnis" +
                        "\n Fakultas Ekonomi dan Bisnis memiliki 3 Program Studi, yaitu :" +
                        "\n 1. Akuntansi" +
                        "\n 2. Ekonomi Pembangunan" +
                        "\n 3. Manajemen \n" +
                        "\n Link Website :",
                "http://febis.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fpsquare, "Fakultas Pertanian",
                "Fakultas Pertanian UPN V Jatim berdiri sejak tahun 1968." +
                        "\n Fakultas Pertanian selalu dan terus meningkatkan kinerja atau visi dan misi serta memprioritaskan pelayanan, administrasi, manajemen kelembagaan, serta peningkatan kualitas sarana dan prasarananya." +
                        "\n Fakultas Pertanian memiliki 2 Program Studi S1 dan S@, yaitu :" +
                        "\n 1. Agroteknologi" +
                        "\n 2. Agribisnis \n" +
                        "\n Link Website :",
                "http://faperta.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.ftsquare, "Fakultas Teknik",
                "Pada awal berdirinya tahun 1968 bernama Fakultas Teknik Kimia, dengan berkembangnya ilmu pengetahuan, teknologi dan Industri. Pada tahun 1990 namanya berubah menjadi Fakultas Teknologi Industri dengan 2 (dua) Jurusan Teknik Kimia dan Teknik Industri.Pada tahun 1993 dibuka jurusan Teknologi Pangan" +
                        "\n Tahun 2003 Jurusan Teknik Informatika dan tahun 2007 Jurusan Sistem Informasi, sehingga sekarang FTI telah memiliki 5 (lima) Jurusan/program studi." +
                        "\n Pada tanggal 23 Agustus 2016 berdasarkan Peraturan Menteri Ristek dan Dikti No.38 Tahun 2015 fakultas Teknologi Indsutri (FTI) berubah menjadi Fakultas Teknik (FT) dimana Fakultas Teknik Terdiri dari 5 Prgram Studi yaitu :" +
                        "\n 1. Teknik Industri " +
                        "\n 2. Teknik Lingkungan " +
                        "\n 3. Teknik Pangan " +
                        "\n 4. Teknik Kimia " +
                        "\n 5. Teknik Sipil \n" +
                        "\n Link Website :",
                "http://ft.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fisipsquare, "Fakultas Ilmu Sosial dan Politik",
                "Keberadaan Fakultas Ilmu Sosial dan Ilmu Politik diawali dengan berdirinya Fakultas Ilmu Administrasi Negara dan Administrasi Niaga. Satu tahun kemudian Fakultas Ilmu Administrasi membuka satu jurusan baru yaitu jurusan Ilmu Komunikasi pada tahun ajaran 1994/1995. " +
                        "\n Pada tanggal 6 Mei 2005 Pergantian nama Fakultas Ilmu Administrasi UPN”Veteran” Jawa Timur menjadi Fakultas Ilmu Sosial dan Ilmu Politik." +
                        "\n Sejak tahun 2009 Fakultas Ilmu Sosial dan Ilmu Politik memiliki 4 Program Studi, yaitu :" +
                        "\n 1. Ilmu Komunikasi" +
                        "\n 2. Ilmu Administrasi Bisnis" +
                        "\n 3. Ilmu Administrasi Negara" +
                        "\n 4. Hubungan Internasional\n" +
                        "\n Link Website :",
                "http://fisip.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fiksquare, "Fakultas Ilmu Komputer",
                "Pada awalnya prodi Teknik Informatika dan Sitsem Informasi bergabung dengan Fakultas Teknik Industri sekarang berganti nama menjadi Fakultas Taknik." +
                        "\n Fakultas Ilmu Komputer memiliki 2 Program Studi, yaitu :" +
                        "\n 1. Teknik Informatika " +
                        "\n 2. Sistem Informasi \n"+
                        "\n Link Website :",
                "https://fik.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fadsquare, "Fakultas Arsitektur & Desain",
                "Perubahan Organisasi dan Tata Kerja UPN “Veteran” Jawa Timur sejak perubahan status UPNVJ menjadi PTNB sesuai Peraturan Presiden Republik Indonesia Nomor 122 Tahun 2014 tentang Pendirian Universitas Pembangunan Nasional “Veteran” Jawa Timur." +
                        "\n Perubahan itu berdampak pada perubahan OTK diantaranya adalah dihapusnya Fakultas Teknik Sipil dan Perencanaan menjadi Fakultas Arsitektur dan Desain (FAD) sebagai fakultas baru sejak Agustus 2016." +
                        "\n Fakultas Arsitektur & Desain terbentuk dari pemisahan 4 (empat) prodi Fakultas Teknik Sipil dan Perencanaaan, dimana Prodi Teknik Lingkungan dan Prodi Teknik Sipil bergabung dengan Fakultas Teknik, sedangkan Prodi Arsitektur dan Prodi Desain Komunikasi Visual menjadi fakultas tersendiri yakni Fakultas Arsitektur dan Desain." +
                        "\n Fakultas Arsitektur & Desain memiliki 2 Program Studi, yaitu :" +
                        "\n 1. Teknik Arsitektur " +
                        "\n 2. Desain Komunikasi Visual\n" +
                        "\n Link Website :",
                "http://fad.upnjatim.ac.id/"
            )
        )
        fakList.add(
            Fakultas(R.drawable.fhsquare, "Fakultas Hukum",
                "Pendirian Fakultas Hukum di lingkungan UPN “Veteran“ Jawa Timur pada awalnya merupakan prakarsa Rektor UPN “Veteran“ Jawa Timur yang saat itu dijabat oleh Brigjen. (Purn.) Suparyo Sri Indrantoro, M.Pkn. Gagasan ini ditindaklanjuti penyiapan SDM dengan menyekolahkan sdr Sutrisno, SH kejenjang Stata dua (S2) dengan harapan dikemudian hari memiliki dosen yang kompeten dan berkualitas untuk bisa mengelola program studi Ilmu Hukum." +
                        "\n Fakultas Hukum sendiri hanya memiliki 1 Program Studi yaitu Hukum\n" +
                        "\n Link Website :",
                "http://fhukum.upnjatim.ac.id/"
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
                        "\nPENDIDIKAN \n" +
                        "  - SDN Banyuajuh 2 Kamal  (2005-2011)\n" +
                        "  - SMPN 2 Bangkalan           (2011-2014)\n" +
                        "  - SMAN 1 Bangkalan           (2014-2017)\n" +
                        "  - Fakultas Ilmu Komputer UPN V Jatim\n" +
                        "\nPENGHARGAAN  \n" +
                        "Juara 3 Lomba Pakibra Sekolah (2015)\n" +
                        "Juara Harapan 1 Paskibra Tingkat Provinsi (2016)\n" +
                        "Paskibraka Kabupaten Bangkalan (2015)\n" +
                        "\nURL GITHUB" ,
                        "https://github.com/nukenidya\n"
            )
            )

        return fakList
    }

}

