
package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details {

    @SerializedName("number_of_pages")
    @Expose
    private Integer numberOfPages;
    @SerializedName("table_of_contents")
    @Expose
    private List<TableOfContent> tableOfContents = null;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("covers")
    @Expose
    private List<Integer> covers = null;
    @SerializedName("lc_classifications")
    @Expose
    private List<String> lcClassifications = null;
    @SerializedName("latest_revision")
    @Expose
    private Integer latestRevision;
    @SerializedName("ocaid")
    @Expose
    private String ocaid;
    @SerializedName("contributors")
    @Expose
    private List<Contributor> contributors = null;
    @SerializedName("source_records")
    @Expose
    private List<String> sourceRecords = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;
    @SerializedName("subjects")
    @Expose
    private List<String> subjects = null;
    @SerializedName("publish_country")
    @Expose
    private String publishCountry;
    @SerializedName("by_statement")
    @Expose
    private String byStatement;
    @SerializedName("oclc_numbers")
    @Expose
    private List<String> oclcNumbers = null;
    @SerializedName("type")
    @Expose
    private Type_ type;
    @SerializedName("physical_dimensions")
    @Expose
    private String physicalDimensions;
    @SerializedName("revision")
    @Expose
    private Integer revision;
    @SerializedName("publishers")
    @Expose
    private List<String> publishers = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("physical_format")
    @Expose
    private String physicalFormat;
    @SerializedName("last_modified")
    @Expose
    private LastModified lastModified;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("authors")
    @Expose
    private List<Author> authors = null;
    @SerializedName("publish_places")
    @Expose
    private List<String> publishPlaces = null;
    @SerializedName("pagination")
    @Expose
    private String pagination;
    @SerializedName("classifications")
    @Expose
    private Classifications classifications;
    @SerializedName("created")
    @Expose
    private Created created;
    @SerializedName("lccn")
    @Expose
    private List<String> lccn = null;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("identifiers")
    @Expose
    private Identifiers identifiers;
    @SerializedName("isbn_13")
    @Expose
    private List<String> isbn13 = null;
    @SerializedName("dewey_decimal_class")
    @Expose
    private List<String> deweyDecimalClass = null;
    @SerializedName("isbn_10")
    @Expose
    private List<String> isbn10 = null;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("works")
    @Expose
    private List<Work> works = null;

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<TableOfContent> getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(List<TableOfContent> tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<Integer> getCovers() {
        return covers;
    }

    public void setCovers(List<Integer> covers) {
        this.covers = covers;
    }

    public List<String> getLcClassifications() {
        return lcClassifications;
    }

    public void setLcClassifications(List<String> lcClassifications) {
        this.lcClassifications = lcClassifications;
    }

    public Integer getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(Integer latestRevision) {
        this.latestRevision = latestRevision;
    }

    public String getOcaid() {
        return ocaid;
    }

    public void setOcaid(String ocaid) {
        this.ocaid = ocaid;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }

    public List<String> getSourceRecords() {
        return sourceRecords;
    }

    public void setSourceRecords(List<String> sourceRecords) {
        this.sourceRecords = sourceRecords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getPublishCountry() {
        return publishCountry;
    }

    public void setPublishCountry(String publishCountry) {
        this.publishCountry = publishCountry;
    }

    public String getByStatement() {
        return byStatement;
    }

    public void setByStatement(String byStatement) {
        this.byStatement = byStatement;
    }

    public List<String> getOclcNumbers() {
        return oclcNumbers;
    }

    public void setOclcNumbers(List<String> oclcNumbers) {
        this.oclcNumbers = oclcNumbers;
    }

    public Type_ getType() {
        return type;
    }

    public void setType(Type_ type) {
        this.type = type;
    }

    public String getPhysicalDimensions() {
        return physicalDimensions;
    }

    public void setPhysicalDimensions(String physicalDimensions) {
        this.physicalDimensions = physicalDimensions;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhysicalFormat() {
        return physicalFormat;
    }

    public void setPhysicalFormat(String physicalFormat) {
        this.physicalFormat = physicalFormat;
    }

    public LastModified getLastModified() {
        return lastModified;
    }

    public void setLastModified(LastModified lastModified) {
        this.lastModified = lastModified;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<String> getPublishPlaces() {
        return publishPlaces;
    }

    public void setPublishPlaces(List<String> publishPlaces) {
        this.publishPlaces = publishPlaces;
    }

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public Classifications getClassifications() {
        return classifications;
    }

    public void setClassifications(Classifications classifications) {
        this.classifications = classifications;
    }

    public Created getCreated() {
        return created;
    }

    public void setCreated(Created created) {
        this.created = created;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Identifiers getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(List<String> isbn13) {
        this.isbn13 = isbn13;
    }

    public List<String> getDeweyDecimalClass() {
        return deweyDecimalClass;
    }

    public void setDeweyDecimalClass(List<String> deweyDecimalClass) {
        this.deweyDecimalClass = deweyDecimalClass;
    }

    public List<String> getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(List<String> isbn10) {
        this.isbn10 = isbn10;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

}
