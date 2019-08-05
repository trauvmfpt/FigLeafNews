package entity;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;

import java.util.Calendar;

@Entity
public class Article {
    @Id
    private long id;
    private String url;
    private String title;
    private String description;
    private String content;
    private String author;
    private String thumbnail;
    private long sourceId;
    private long createdAtMLS;
    private long updatedAtMLS;
    private long deletedAtMLS;
    private int status;

    @Index
    @Load
    Ref<Category> category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Ref<Category> getCategory() {
        return category;
    }

    public void setCategory(Ref<Category> category) {
        this.category = category;
    }

    public Article() {
        this.id = Calendar.getInstance().getTimeInMillis();
        this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
        this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
        this.status = 0;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public long getCreatedAtMLS() {
        return createdAtMLS;
    }

    public void setCreatedAtMLS(long createdAtMLS) {
        this.createdAtMLS = createdAtMLS;
    }

    public long getUpdatedAtMLS() {
        return updatedAtMLS;
    }

    public void setUpdatedAtMLS(long updatedAtMLS) {
        this.updatedAtMLS = updatedAtMLS;
    }

    public long getDeletedAtMLS() {
        return deletedAtMLS;
    }

    public void setDeletedAtMLS(long deletedAtMLS) {
        this.deletedAtMLS = deletedAtMLS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public static final class Builder {
        Ref<Category> category;
        private long id;
        private String url;
        private String title;
        private String description;
        private String content;
        private String author;
        private String thumbnail;
        private long sourceId;
        private long createdAtMLS;
        private long updatedAtMLS;
        private long deletedAtMLS;
        private int status;

        private Builder() {
            this.id = Calendar.getInstance().getTimeInMillis();
            this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
            this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
            this.status = 0;
        }

        public static Builder anArticle() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder withThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }

        public Builder withSourceId(long sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder withCreatedAtMLS(long createdAtMLS) {
            this.createdAtMLS = createdAtMLS;
            return this;
        }

        public Builder withUpdatedAtMLS(long updatedAtMLS) {
            this.updatedAtMLS = updatedAtMLS;
            return this;
        }

        public Builder withDeletedAtMLS(long deletedAtMLS) {
            this.deletedAtMLS = deletedAtMLS;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder withCategory(Ref<Category> category) {
            this.category = category;
            return this;
        }

        public Article build() {
            Article article = new Article();
            article.setId(id);
            article.setUrl(url);
            article.setTitle(title);
            article.setDescription(description);
            article.setContent(content);
            article.setAuthor(author);
            article.setThumbnail(thumbnail);
            article.setSourceId(sourceId);
            article.setCreatedAtMLS(createdAtMLS);
            article.setUpdatedAtMLS(updatedAtMLS);
            article.setDeletedAtMLS(deletedAtMLS);
            article.setStatus(status);
            article.setCategory(category);
            return article;
        }
    }
}
