
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
    "sort-activity",
    "sort-activelistingsLocal",
    "sort-activelistings",
    "sort-recommendations",
    "sort-soldLocal",
    "sort-sold",
    "sort-ratings"
})
@Generated("jsonschema2pojo")
public class SelectedSorted__1 {

    @JsonProperty("sort-activity")
    private String sortActivity;
    @JsonProperty("sort-activelistingsLocal")
    private String sortActivelistingsLocal;
    @JsonProperty("sort-activelistings")
    private String sortActivelistings;
    @JsonProperty("sort-recommendations")
    private String sortRecommendations;
    @JsonProperty("sort-soldLocal")
    private String sortSoldLocal;
    @JsonProperty("sort-sold")
    private String sortSold;
    @JsonProperty("sort-ratings")
    private String sortRatings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sort-activity")
    public String getSortActivity() {
        return sortActivity;
    }

    @JsonProperty("sort-activity")
    public void setSortActivity(String sortActivity) {
        this.sortActivity = sortActivity;
    }

    @JsonProperty("sort-activelistingsLocal")
    public String getSortActivelistingsLocal() {
        return sortActivelistingsLocal;
    }

    @JsonProperty("sort-activelistingsLocal")
    public void setSortActivelistingsLocal(String sortActivelistingsLocal) {
        this.sortActivelistingsLocal = sortActivelistingsLocal;
    }

    @JsonProperty("sort-activelistings")
    public String getSortActivelistings() {
        return sortActivelistings;
    }

    @JsonProperty("sort-activelistings")
    public void setSortActivelistings(String sortActivelistings) {
        this.sortActivelistings = sortActivelistings;
    }

    @JsonProperty("sort-recommendations")
    public String getSortRecommendations() {
        return sortRecommendations;
    }

    @JsonProperty("sort-recommendations")
    public void setSortRecommendations(String sortRecommendations) {
        this.sortRecommendations = sortRecommendations;
    }

    @JsonProperty("sort-soldLocal")
    public String getSortSoldLocal() {
        return sortSoldLocal;
    }

    @JsonProperty("sort-soldLocal")
    public void setSortSoldLocal(String sortSoldLocal) {
        this.sortSoldLocal = sortSoldLocal;
    }

    @JsonProperty("sort-sold")
    public String getSortSold() {
        return sortSold;
    }

    @JsonProperty("sort-sold")
    public void setSortSold(String sortSold) {
        this.sortSold = sortSold;
    }

    @JsonProperty("sort-ratings")
    public String getSortRatings() {
        return sortRatings;
    }

    @JsonProperty("sort-ratings")
    public void setSortRatings(String sortRatings) {
        this.sortRatings = sortRatings;
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
        sb.append(SelectedSorted__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sortActivity");
        sb.append('=');
        sb.append(((this.sortActivity == null)?"<null>":this.sortActivity));
        sb.append(',');
        sb.append("sortActivelistingsLocal");
        sb.append('=');
        sb.append(((this.sortActivelistingsLocal == null)?"<null>":this.sortActivelistingsLocal));
        sb.append(',');
        sb.append("sortActivelistings");
        sb.append('=');
        sb.append(((this.sortActivelistings == null)?"<null>":this.sortActivelistings));
        sb.append(',');
        sb.append("sortRecommendations");
        sb.append('=');
        sb.append(((this.sortRecommendations == null)?"<null>":this.sortRecommendations));
        sb.append(',');
        sb.append("sortSoldLocal");
        sb.append('=');
        sb.append(((this.sortSoldLocal == null)?"<null>":this.sortSoldLocal));
        sb.append(',');
        sb.append("sortSold");
        sb.append('=');
        sb.append(((this.sortSold == null)?"<null>":this.sortSold));
        sb.append(',');
        sb.append("sortRatings");
        sb.append('=');
        sb.append(((this.sortRatings == null)?"<null>":this.sortRatings));
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
        result = ((result* 31)+((this.sortActivelistings == null)? 0 :this.sortActivelistings.hashCode()));
        result = ((result* 31)+((this.sortSoldLocal == null)? 0 :this.sortSoldLocal.hashCode()));
        result = ((result* 31)+((this.sortActivelistingsLocal == null)? 0 :this.sortActivelistingsLocal.hashCode()));
        result = ((result* 31)+((this.sortRatings == null)? 0 :this.sortRatings.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sortActivity == null)? 0 :this.sortActivity.hashCode()));
        result = ((result* 31)+((this.sortRecommendations == null)? 0 :this.sortRecommendations.hashCode()));
        result = ((result* 31)+((this.sortSold == null)? 0 :this.sortSold.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SelectedSorted__1) == false) {
            return false;
        }
        SelectedSorted__1 rhs = ((SelectedSorted__1) other);
        return (((((((((this.sortActivelistings == rhs.sortActivelistings)||((this.sortActivelistings!= null)&&this.sortActivelistings.equals(rhs.sortActivelistings)))&&((this.sortSoldLocal == rhs.sortSoldLocal)||((this.sortSoldLocal!= null)&&this.sortSoldLocal.equals(rhs.sortSoldLocal))))&&((this.sortActivelistingsLocal == rhs.sortActivelistingsLocal)||((this.sortActivelistingsLocal!= null)&&this.sortActivelistingsLocal.equals(rhs.sortActivelistingsLocal))))&&((this.sortRatings == rhs.sortRatings)||((this.sortRatings!= null)&&this.sortRatings.equals(rhs.sortRatings))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sortActivity == rhs.sortActivity)||((this.sortActivity!= null)&&this.sortActivity.equals(rhs.sortActivity))))&&((this.sortRecommendations == rhs.sortRecommendations)||((this.sortRecommendations!= null)&&this.sortRecommendations.equals(rhs.sortRecommendations))))&&((this.sortSold == rhs.sortSold)||((this.sortSold!= null)&&this.sortSold.equals(rhs.sortSold))));
    }

}
