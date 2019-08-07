package entity;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Calendar;

@Entity
public class Source {
    @Id
    private long id;
    private String sourceName;
    private String url;
    private String linkSelector;
    private int linkLimit;
    private String titleSelector;
    private String descriptionSelector;
    private String contentSelector;
    private String authorSelector;
    private Ref<Category> category;
    private long createdAtMLS;
    private long updatedAtMLS;
    private long deletedAtMLS;
    private int status;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLinkSelector() {
        return linkSelector;
    }

    public void setLinkSelector(String linkSelector) {
        this.linkSelector = linkSelector;
    }

    public int getLinkLimit() {
        return linkLimit;
    }

    public void setLinkLimit(int linkLimit) {
        this.linkLimit = linkLimit;
    }

    public String getTitleSelector() {
        return titleSelector;
    }

    public void setTitleSelector(String titleSelector) {
        this.titleSelector = titleSelector;
    }

    public String getDescriptionSelector() {
        return descriptionSelector;
    }

    public void setDescriptionSelector(String descriptionSelector) {
        this.descriptionSelector = descriptionSelector;
    }

    public String getContentSelector() {
        return contentSelector;
    }

    public void setContentSelector(String contentSelector) {
        this.contentSelector = contentSelector;
    }

    public String getAuthorSelector() {
        return authorSelector;
    }

    public void setAuthorSelector(String authorSelector) {
        this.authorSelector = authorSelector;
    }

    public Ref<Category> getCategory() {
        return category;
    }

    public void setCategory(Ref<Category> category) {
        this.category = category;
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
        private long id;
        private String sourceName;
        private String url;
        private String linkSelector;
        private int linkLimit;
        private String titleSelector;
        private String descriptionSelector;
        private String contentSelector;
        private String authorSelector;
        private Ref<Category> category;
        private long createdAtMLS;
        private long updatedAtMLS;
        private long deletedAtMLS;
        private int status;

        private Builder() {
            this.id = Calendar.getInstance().getTimeInMillis();
            this.createdAtMLS = Calendar.getInstance().getTimeInMillis();
            this.updatedAtMLS = Calendar.getInstance().getTimeInMillis();
            this.status = 1;
        }

        public static Builder aSource() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder withLinkSelector(String linkSelector) {
            this.linkSelector = linkSelector;
            return this;
        }

        public Builder withLinkLimit(int linkLimit) {
            this.linkLimit = linkLimit;
            return this;
        }

        public Builder withTitleSelector(String titleSelector) {
            this.titleSelector = titleSelector;
            return this;
        }

        public Builder withDescriptionSelector(String descriptionSelector) {
            this.descriptionSelector = descriptionSelector;
            return this;
        }

        public Builder withContentSelector(String contentSelector) {
            this.contentSelector = contentSelector;
            return this;
        }

        public Builder withAuthorSelector(String authorSelector) {
            this.authorSelector = authorSelector;
            return this;
        }

        public Builder withCategory(Ref<Category> category) {
            this.category = category;
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

        public Source build() {
            Source source = new Source();
            source.setId(id);
            source.setSourceName(sourceName);
            source.setUrl(url);
            source.setLinkSelector(linkSelector);
            source.setLinkLimit(linkLimit);
            source.setTitleSelector(titleSelector);
            source.setDescriptionSelector(descriptionSelector);
            source.setContentSelector(contentSelector);
            source.setAuthorSelector(authorSelector);
            source.setCategory(category);
            source.setCreatedAtMLS(createdAtMLS);
            source.setUpdatedAtMLS(updatedAtMLS);
            source.setDeletedAtMLS(deletedAtMLS);
            source.setStatus(status);
            return source;
        }
    }
}
