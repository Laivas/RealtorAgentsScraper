
package scrapperGeneratedRealtor;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facebook",
    "twitter"
})
@Generated("jsonschema2pojo")
public class SocialMedia__1 {

    @JsonProperty("facebook")
    private Facebook__1 facebook;
    @JsonProperty("twitter")
    private Twitter__1 twitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("facebook")
    public Facebook__1 getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(Facebook__1 facebook) {
        this.facebook = facebook;
    }

    @JsonProperty("twitter")
    public Twitter__1 getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(Twitter__1 twitter) {
        this.twitter = twitter;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SocialMedia__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("facebook");
        sb.append('=');
        sb.append(((this.facebook == null)?"<null>":this.facebook));
        sb.append(',');
        sb.append("twitter");
        sb.append('=');
        sb.append(((this.twitter == null)?"<null>":this.twitter));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.twitter == null)? 0 :this.twitter.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.facebook == null)? 0 :this.facebook.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocialMedia__1) == false) {
            return false;
        }
        SocialMedia__1 rhs = ((SocialMedia__1) other);
        return ((((this.twitter == rhs.twitter)||((this.twitter!= null)&&this.twitter.equals(rhs.twitter)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.facebook == rhs.facebook)||((this.facebook!= null)&&this.facebook.equals(rhs.facebook))));
    }

}
