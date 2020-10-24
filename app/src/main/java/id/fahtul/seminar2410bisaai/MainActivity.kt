package id.fahtul.seminar2410bisaai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modulsArray = arrayOf("animation.pdf", "DasarPemrograman.pdf", "digitv.pdf")

        rvModul.layoutManager = LinearLayoutManager(this)
        rvModul.adapter = NamaModulAdapter(this, modulsArray)
    }
}