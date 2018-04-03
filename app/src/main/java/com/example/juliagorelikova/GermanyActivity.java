package com.example.juliagorelikova.musicalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GermanyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("All Quiet on the Western Front", "Erich Maria Remarque", "War novel", 20));
        books.add(new Book("Heaven Has No Favorites", "Erich Maria Remarque", "Novel", 20));

        BookAdapter adapter = new BookAdapter(this, books);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
