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
    private String getWebPublicationDate;
    /**
     * Website URL of the article news
     */
    private String getWebUrl;

    /**
     * Constructs a new {@link NewsApp} object
     *
     * @param newsTitle   is the title of the article
     * @param newsSection is the Section of the article news
     * @param date           is the date of publication of the news on the GUARDIAN website
     * @param webUrl            is the url of the article news
     */
    NewsApp(String newsTitle, String newsSection, String date, String webUrl) {
        news_title = newsTitle;
        news_section = newsSection;
        this.getWebPublicationDate = date;
        this.getWebUrl = webUrl;
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
    public String getWebPublicationDate() {
        return getWebPublicationDate;
    }


    /**
     * Returns the website url of the article news
     */
    public String getwebUrl() {
        return getWebUrl;
    }
}
