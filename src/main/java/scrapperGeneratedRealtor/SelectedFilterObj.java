
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
    "rating",
    "recommendation",
    "price",
    "rep",
    "lang",
    "designation",
    "sort",
    "pg"
})
@Generated("jsonschema2pojo")
public class SelectedFilterObj {

    @JsonProperty("rating")
    private Object rating;
    @JsonProperty("recommendation")
    private Object recommendation;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("rep")
    private String rep;
    @JsonProperty("lang")
    private Object lang;
    @JsonProperty("designation")
    private String designation;
    @JsonProperty("sort")
    private String sort;
    @JsonProperty("pg")
    private Object pg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("rating")
    public Object getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Object rating) {
        this.rating = rating;
    }

    @JsonProperty("recommendation")
    public Object getRecommendation() {
        return recommendation;
    }

    @JsonProperty("recommendation")
    public void setRecommendation(Object recommendation) {
        this.recommendation = recommendation;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("rep")
    public String getRep() {
        return rep;
    }

    @JsonProperty("rep")
    public void setRep(String rep) {
        this.rep = rep;
    }

    @JsonProperty("lang")
    public Object getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(Object lang) {
        this.lang = lang;
    }

    @JsonProperty("designation")
    public String getDesignation() {
        return designation;
    }

    @JsonProperty("designation")
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @JsonProperty("sort")
    public String getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(String sort) {
        this.sort = sort;
    }

    @JsonProperty("pg")
    public Object getPg() {
        return pg;
    }

    @JsonProperty("pg")
    public void setPg(Object pg) {
        this.pg = pg;
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
        sb.append(SelectedFilterObj.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("recommendation");
        sb.append('=');
        sb.append(((this.recommendation == null)?"<null>":this.recommendation));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("rep");
        sb.append('=');
        sb.append(((this.rep == null)?"<null>":this.rep));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
        sb.append(',');
        sb.append("sort");
        sb.append('=');
        sb.append(((this.sort == null)?"<null>":this.sort));
        sb.append(',');
        sb.append("pg");
        sb.append('=');
        sb.append(((this.pg == null)?"<null>":this.pg));
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
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.pg == null)? 0 :this.pg.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.recommendation == null)? 0 :this.recommendation.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.sort == null)? 0 :this.sort.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rep == null)? 0 :this.rep.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SelectedFilterObj) == false) {
            return false;
        }
        SelectedFilterObj rhs = ((SelectedFilterObj) other);
        return ((((((((((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price)))&&((this.pg == rhs.pg)||((this.pg!= null)&&this.pg.equals(rhs.pg))))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.recommendation == rhs.recommendation)||((this.recommendation!= null)&&this.recommendation.equals(rhs.recommendation))))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.sort == rhs.sort)||((this.sort!= null)&&this.sort.equals(rhs.sort))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rep == rhs.rep)||((this.rep!= null)&&this.rep.equals(rhs.rep))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))));
    }

}
