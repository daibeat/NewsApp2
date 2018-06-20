package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/**
 * An {@link NewsAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link NewsApp} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<NewsApp> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter (Context context, List<NewsApp> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        NewsApp currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getNews_title());

        // Find the TextView with view ID section
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);
        sectionTextView.setText(currentNews.getNews_section());
        //Find the TextView with ID date
        TextView dateTextView = listItemView.findViewById(R.id.date);

        //Find the url
        TextView urlTextView = (TextView) listItemView.findViewById(R.id.url);
        urlTextView.setText(currentNews.getWebUrl());

        // Display the category of the current news in that TextView
        SimpleDateFormat dateFormatJSON = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EE dd MMM yyyy", Locale.ENGLISH);

        try {
            Date dateNews = dateFormatJSON.parse(currentNews.getWebPublicationDate());

            String date = dateFormat2.format(dateNews);
            dateTextView.setText(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}

