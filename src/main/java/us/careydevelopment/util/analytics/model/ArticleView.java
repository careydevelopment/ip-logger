package us.careydevelopment.util.analytics.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ArticleView {

    private Long count;
    private String title;
    private String urlSlug;
    
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrlSlug() {
        return urlSlug;
    }
    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
