package mchehab.com.databindinglistview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> list = new ArrayList<>();
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        list.add(new Person("Name1", "Name2","https://www.w3schools.com/bootstrap/paris.jpg",
                23));
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new CustomAdapter(this, list));
    }
}