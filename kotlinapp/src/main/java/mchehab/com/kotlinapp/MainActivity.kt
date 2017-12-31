package mchehab.com.kotlinapp

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Person>()
        for (i in 0..20){
            list.add(Person("Name1", "Name2", "https://www.w3schools.com/bootstrap/paris.jpg", 23))
        }
        listView.adapter = CustomAdapter(this@MainActivity, list)
    }
}
