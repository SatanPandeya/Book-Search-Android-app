
package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ISBN9780980200447 {

    @SerializedName("info_url")
    @Expose
    private String infoUrl;
    @SerializedName("bib_key")
    @Expose
    private String bibKey;
    @SerializedName("preview_url")
    @Expose
    private String previewUrl;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("preview")
    @Expose
    private String preview;

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getBibKey() {
        return bibKey;
    }

    public void setBibKey(String bibKey) {
        this.bibKey = bibKey;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

}
