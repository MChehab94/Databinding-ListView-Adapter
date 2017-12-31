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
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))
        list.add(Person("Name1", "Name2", 23))

        listView.adapter = CustomAdapter(this@MainActivity, list)
    }
}
