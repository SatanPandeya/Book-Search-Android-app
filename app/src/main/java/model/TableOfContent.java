
package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableOfContent {

    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("title")
    @Expose
    private String title;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
