
package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Identifiers {

    @SerializedName("amazon")
    @Expose
    private List<String> amazon = null;
    @SerializedName("google")
    @Expose
    private List<String> google = null;
    @SerializedName("goodreads")
    @Expose
    private List<String> goodreads = null;
    @SerializedName("librarything")
    @Expose
    private List<String> librarything = null;

    public List<String> getAmazon() {
        return amazon;
    }

    public void setAmazon(List<String> amazon) {
        this.amazon = amazon;
    }

    public List<String> getGoogle() {
        return google;
    }

    public void setGoogle(List<String> google) {
        this.google = google;
    }

    public List<String> getGoodreads() {
        return goodreads;
    }

    public void setGoodreads(List<String> goodreads) {
        this.goodreads = goodreads;
    }

    public List<String> getLibrarything() {
        return librarything;
    }

    public void setLibrarything(List<String> librarything) {
        this.librarything = librarything;
    }

}
