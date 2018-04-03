package com.example.juliagorelikova.musicalapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {
    private static final String LOG_TAG = BookAdapter.class.getSimpleName();

    /**
     *
     * @param context The current context. Used to inflate the layout file.
     * @param Book A List of Books objects to display in a list
     */
    public BookAdapter(Activity context, ArrayList<Book> Book) {
        super(context, 0, Book);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current Book object and
        // set this text on the name TextView
        nameTextView.setText(currentBook.getName());

        TextView authorTextView = (TextView)listItemView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentBook.getAuthor());

        TextView genreTextView = (TextView)listItemView.findViewById(R.id.genre_text_view);
        genreTextView.setText(currentBook.getGenre());

        TextView centuryTextView = (TextView)listItemView.findViewById(R.id.century_text_view);
        centuryTextView.setText(currentBook.getCentury());

        return listItemView;


    }


}
