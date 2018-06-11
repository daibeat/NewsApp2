package com.example.android.newsapp;

/**
 * An {@link NewsApp} object contains information related to a single NewsApp.
 */
public class NewsApp {
    /**
     * Article title for news
     */
    private String news_title;
    /**
     * Article section for the news
     */
    private String news_section;
    /**
     * Date of the article news
     */
    private String date;
    /**
     * Author of the article news
     */
    private String author;
    /**
     * Website URL of the article news
     */
    private String url;

    /**
     * Constructs a new {@link NewsApp} object
     *
     * @param newsTitle   is the title of the article
     * @param newsSection is the Section of the article news
     * @param date           is the date of publication of the news on the GUARDIAN website
     * @param author         is the author of the article
     * @param url            is the url of the article news
     */
    NewsApp(String newsTitle, String newsSection, String date, String author, String url) {
        news_title = newsTitle;
        news_section = newsSection;
        this.date = date;
        this.author = author;
        this.url = url;
    }

    /**
     * Returns the article title of the article news
     */
    public String getNews_title() {
        return news_title;
    }

    /**
     * Returns the article section of the article news
     */
    public String getNews_section() {
        return news_section;
    }

    /**
     * Returns the date of the article news
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the author of the article
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the website url of the article news
     */
    public String getUrl() {
        return url;
    }
}
