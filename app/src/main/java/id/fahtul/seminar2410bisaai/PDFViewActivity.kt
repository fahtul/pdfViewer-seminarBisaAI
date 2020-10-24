package id.fahtul.seminar2410bisaai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import kotlinx.android.synthetic.main.activity_p_d_f_view.*

class PDFViewActivity : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_p_d_f_view)

        pdfView  = findViewById(R.id.pdfView)

        val namaFile = intent.getStringExtra("NAMAFILE")

        pdfView.fromAsset(namaFile).load()

        val actionBar = supportActionBar
        actionBar?.title = namaFile
    }
}