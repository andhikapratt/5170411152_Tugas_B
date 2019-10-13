package cobakotlin.example.com.listviewicon2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val language    = arrayOf<String>("Soekarno","Soeharto",
                                                    "Habibie","Gusdur",
                                                    "Megawati","SBY","Jokowi")

    val imageId = arrayOf<Int>(
        R.drawable.soekarno,
        R.drawable.harto,
        R.drawable.havivi,
        R.drawable.gusdur,
        R.drawable.mega,
        R.drawable.sby,
        R.drawable.jokowi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this,language,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            var a = Integer.parseInt(itemIdAtPos.toString())
            var pr = a+1

            if (a.equals(0)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(1)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(2)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(3)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(4)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(5)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else if (a.equals(6)){
                Toast.makeText(this, "Ini Bapak $itemAtPos , Presiden ke $pr", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Pilihan Tidak Ada", Toast.LENGTH_LONG).show()
            }
        }
    }
}
