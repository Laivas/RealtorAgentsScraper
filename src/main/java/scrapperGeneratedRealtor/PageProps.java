
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
    "query",
    "jsonld",
    "pageData",
    "isGoogleBot",
    "isServerReq",
    "featureFlagDatafile"
})
@Generated("jsonschema2pojo")
public class PageProps {

    @JsonProperty("query")
    private Query query;
    @JsonProperty("jsonld")
    private Jsonld jsonld;
    @JsonProperty("pageData")
    private PageData pageData;
    @JsonProperty("isGoogleBot")
    private Boolean isGoogleBot;
    @JsonProperty("isServerReq")
    private Boolean isServerReq;
    @JsonProperty("featureFlagDatafile")
    private String featureFlagDatafile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("query")
    public Query getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query query) {
        this.query = query;
    }

    @JsonProperty("jsonld")
    public Jsonld getJsonld() {
        return jsonld;
    }

    @JsonProperty("jsonld")
    public void setJsonld(Jsonld jsonld) {
        this.jsonld = jsonld;
    }

    @JsonProperty("pageData")
    public PageData getPageData() {
        return pageData;
    }

    @JsonProperty("pageData")
    public void setPageData(PageData pageData) {
        this.pageData = pageData;
    }

    @JsonProperty("isGoogleBot")
    public Boolean getIsGoogleBot() {
        return isGoogleBot;
    }

    @JsonProperty("isGoogleBot")
    public void setIsGoogleBot(Boolean isGoogleBot) {
        this.isGoogleBot = isGoogleBot;
    }

    @JsonProperty("isServerReq")
    public Boolean getIsServerReq() {
        return isServerReq;
    }

    @JsonProperty("isServerReq")
    public void setIsServerReq(Boolean isServerReq) {
        this.isServerReq = isServerReq;
    }

    @JsonProperty("featureFlagDatafile")
    public String getFeatureFlagDatafile() {
        return featureFlagDatafile;
    }

    @JsonProperty("featureFlagDatafile")
    public void setFeatureFlagDatafile(String featureFlagDatafile) {
        this.featureFlagDatafile = featureFlagDatafile;
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
        sb.append(PageProps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("jsonld");
        sb.append('=');
        sb.append(((this.jsonld == null)?"<null>":this.jsonld));
        sb.append(',');
        sb.append("pageData");
        sb.append('=');
        sb.append(((this.pageData == null)?"<null>":this.pageData));
        sb.append(',');
        sb.append("isGoogleBot");
        sb.append('=');
        sb.append(((this.isGoogleBot == null)?"<null>":this.isGoogleBot));
        sb.append(',');
        sb.append("isServerReq");
        sb.append('=');
        sb.append(((this.isServerReq == null)?"<null>":this.isServerReq));
        sb.append(',');
        sb.append("featureFlagDatafile");
        sb.append('=');
        sb.append(((this.featureFlagDatafile == null)?"<null>":this.featureFlagDatafile));
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
        result = ((result* 31)+((this.isGoogleBot == null)? 0 :this.isGoogleBot.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.isServerReq == null)? 0 :this.isServerReq.hashCode()));
        result = ((result* 31)+((this.jsonld == null)? 0 :this.jsonld.hashCode()));
        result = ((result* 31)+((this.pageData == null)? 0 :this.pageData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.featureFlagDatafile == null)? 0 :this.featureFlagDatafile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageProps) == false) {
            return false;
        }
        PageProps rhs = ((PageProps) other);
        return ((((((((this.isGoogleBot == rhs.isGoogleBot)||((this.isGoogleBot!= null)&&this.isGoogleBot.equals(rhs.isGoogleBot)))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.isServerReq == rhs.isServerReq)||((this.isServerReq!= null)&&this.isServerReq.equals(rhs.isServerReq))))&&((this.jsonld == rhs.jsonld)||((this.jsonld!= null)&&this.jsonld.equals(rhs.jsonld))))&&((this.pageData == rhs.pageData)||((this.pageData!= null)&&this.pageData.equals(rhs.pageData))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.featureFlagDatafile == rhs.featureFlagDatafile)||((this.featureFlagDatafile!= null)&&this.featureFlagDatafile.equals(rhs.featureFlagDatafile))));
    }

}
