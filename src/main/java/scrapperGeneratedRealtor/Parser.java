
package scrapperGeneratedRealtor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "status",
    "loading",
    "error",
    "locations",
    "repoDetails",
    "user",
    "repoLoader",
    "openSuggestion",
    "parserData"
})
@Generated("jsonschema2pojo")
public class Parser {

    @JsonProperty("status")
    private String status;
    @JsonProperty("loading")
    private Boolean loading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("locations")
    private List<Location> locations = new ArrayList<Location>();
    @JsonProperty("repoDetails")
    private Object repoDetails;
    @JsonProperty("user")
    private Object user;
    @JsonProperty("repoLoader")
    private Boolean repoLoader;
    @JsonProperty("openSuggestion")
    private Boolean openSuggestion;
    @JsonProperty("parserData")
    private ParserData parserData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("loading")
    public Boolean getLoading() {
        return loading;
    }

    @JsonProperty("loading")
    public void setLoading(Boolean loading) {
        this.loading = loading;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("repoDetails")
    public Object getRepoDetails() {
        return repoDetails;
    }

    @JsonProperty("repoDetails")
    public void setRepoDetails(Object repoDetails) {
        this.repoDetails = repoDetails;
    }

    @JsonProperty("user")
    public Object getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(Object user) {
        this.user = user;
    }

    @JsonProperty("repoLoader")
    public Boolean getRepoLoader() {
        return repoLoader;
    }

    @JsonProperty("repoLoader")
    public void setRepoLoader(Boolean repoLoader) {
        this.repoLoader = repoLoader;
    }

    @JsonProperty("openSuggestion")
    public Boolean getOpenSuggestion() {
        return openSuggestion;
    }

    @JsonProperty("openSuggestion")
    public void setOpenSuggestion(Boolean openSuggestion) {
        this.openSuggestion = openSuggestion;
    }

    @JsonProperty("parserData")
    public ParserData getParserData() {
        return parserData;
    }

    @JsonProperty("parserData")
    public void setParserData(ParserData parserData) {
        this.parserData = parserData;
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
        sb.append(Parser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("loading");
        sb.append('=');
        sb.append(((this.loading == null)?"<null>":this.loading));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("repoDetails");
        sb.append('=');
        sb.append(((this.repoDetails == null)?"<null>":this.repoDetails));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("repoLoader");
        sb.append('=');
        sb.append(((this.repoLoader == null)?"<null>":this.repoLoader));
        sb.append(',');
        sb.append("openSuggestion");
        sb.append('=');
        sb.append(((this.openSuggestion == null)?"<null>":this.openSuggestion));
        sb.append(',');
        sb.append("parserData");
        sb.append('=');
        sb.append(((this.parserData == null)?"<null>":this.parserData));
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
        result = ((result* 31)+((this.repoLoader == null)? 0 :this.repoLoader.hashCode()));
        result = ((result* 31)+((this.openSuggestion == null)? 0 :this.openSuggestion.hashCode()));
        result = ((result* 31)+((this.repoDetails == null)? 0 :this.repoDetails.hashCode()));
        result = ((result* 31)+((this.locations == null)? 0 :this.locations.hashCode()));
        result = ((result* 31)+((this.parserData == null)? 0 :this.parserData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.loading == null)? 0 :this.loading.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parser) == false) {
            return false;
        }
        Parser rhs = ((Parser) other);
        return (((((((((((this.repoLoader == rhs.repoLoader)||((this.repoLoader!= null)&&this.repoLoader.equals(rhs.repoLoader)))&&((this.openSuggestion == rhs.openSuggestion)||((this.openSuggestion!= null)&&this.openSuggestion.equals(rhs.openSuggestion))))&&((this.repoDetails == rhs.repoDetails)||((this.repoDetails!= null)&&this.repoDetails.equals(rhs.repoDetails))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.parserData == rhs.parserData)||((this.parserData!= null)&&this.parserData.equals(rhs.parserData))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.loading == rhs.loading)||((this.loading!= null)&&this.loading.equals(rhs.loading))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
