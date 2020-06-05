package test.isavanzados.textadding

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class MainActivity : AppCompatActivity() {
    val FILE_NAME = "data.txt"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGuardarTexto.setOnClickListener {
            val value = etTexto.text.toString()
            val fos = openFileOutput(FILE_NAME, Context.MODE_APPEND)
            fos.write(value.toByteArray())
            etTexto.text.clear()
            Toast.makeText(this, "guardado en: ${filesDir}/$FILE_NAME", Toast.LENGTH_LONG ).show()
            fos?.close()
        }
    }
}
