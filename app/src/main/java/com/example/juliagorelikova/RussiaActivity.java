package com.example.juliagorelikova.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RussiaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        //Create a list of books
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("War and Peace", "Leo Tolstoy", "Historical novel", 19 ));
        books.add(new Book("The Master and Margarita", "Mikhail Bulgakov", "Fantastic satire", 19 ));


        BookAdapter adapter = new BookAdapter(this, books);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
