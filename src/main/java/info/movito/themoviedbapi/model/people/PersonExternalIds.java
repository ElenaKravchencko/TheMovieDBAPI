package info.movito.themoviedbapi.model.people;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;

public class PersonExternalIds extends AbstractJsonMapping {


    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("facebook_id")
    private String facebookId;

    @JsonProperty("freebase_mid")
    private String freebaseMid;

    @JsonProperty("freebase_id")
    private String freebaseId;

    @JsonProperty("tvrage_id")
    private String tvrageId;

    @JsonProperty("twitter_id")
    private String twitterId;

    @JsonProperty("instagram_id")
    private String instagramId;


    public String getImdbId() {
        return imdbId;
    }


    public String getFacebookId() {
        return facebookId;
    }


    public String getFreebaseMid() {
        return freebaseMid;
    }


    public String getFreebaseId() {
        return freebaseId;
    }


    public String getTvrageId() {
        return tvrageId;
    }


    public String getTwitterId() {
        return twitterId;
    }


    public String getInstagramId() {
        return instagramId;
    }


    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }


    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }


    public void setFreebaseMid(String freebaseMid) {
        this.freebaseMid = freebaseMid;
    }


    public void setFreebaseId(String freebaseId) {
        this.freebaseId = freebaseId;
    }


    public void setTvrageId(String tvrageId) {
        this.tvrageId = tvrageId;
    }


    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }


    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }
}
