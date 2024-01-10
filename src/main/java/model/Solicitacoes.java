package model;

public class Solicitacoes {

    private String copyright;
    private String date;
    private String explanation;
    private String hdurl;
    private String mediaType;
    private String serviceVersion;
    private String title;
    private String url;


    public Solicitacoes() {
    }

    public Solicitacoes(String copyright, String date, String explanation, String hdurl, String mediaType, String serviceVersion, String title, String url) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }


    public String getCopyright() {
        return copyright;
    }

    public Solicitacoes setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Solicitacoes setDate(String date) {
        this.date = date;
        return this;
    }

    public String getExplanation() {
        return explanation;
    }

    public Solicitacoes setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    public String getHdurl() {
        return hdurl;
    }

    public Solicitacoes setHdurl(String hdurl) {
        this.hdurl = hdurl;
        return this;
    }

    public String getMediaType() {
        return mediaType;
    }

    public Solicitacoes setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public Solicitacoes setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Solicitacoes setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Solicitacoes setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return "Solicitacoes{" +
                "copyright='" + copyright + '\'' +
                ", date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", hdurl='" + hdurl + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", serviceVersion='" + serviceVersion + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
