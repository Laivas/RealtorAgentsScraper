
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
    "area_type",
    "_id",
    "_score",
    "city",
    "state_code",
    "counties",
    "country",
    "centroid",
    "slug_id",
    "geo_id",
    "county_needed_for_uniq"
})
@Generated("jsonschema2pojo")
public class ParserData {

    @JsonProperty("area_type")
    private String areaType;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("_score")
    private Double score;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("counties")
    private List<County__1> counties = new ArrayList<County__1>();
    @JsonProperty("country")
    private String country;
    @JsonProperty("centroid")
    private Centroid__1 centroid;
    @JsonProperty("slug_id")
    private String slugId;
    @JsonProperty("geo_id")
    private String geoId;
    @JsonProperty("county_needed_for_uniq")
    private Boolean countyNeededForUniq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("area_type")
    public String getAreaType() {
        return areaType;
    }

    @JsonProperty("area_type")
    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("_score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("_score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("counties")
    public List<County__1> getCounties() {
        return counties;
    }

    @JsonProperty("counties")
    public void setCounties(List<County__1> counties) {
        this.counties = counties;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("centroid")
    public Centroid__1 getCentroid() {
        return centroid;
    }

    @JsonProperty("centroid")
    public void setCentroid(Centroid__1 centroid) {
        this.centroid = centroid;
    }

    @JsonProperty("slug_id")
    public String getSlugId() {
        return slugId;
    }

    @JsonProperty("slug_id")
    public void setSlugId(String slugId) {
        this.slugId = slugId;
    }

    @JsonProperty("geo_id")
    public String getGeoId() {
        return geoId;
    }

    @JsonProperty("geo_id")
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @JsonProperty("county_needed_for_uniq")
    public Boolean getCountyNeededForUniq() {
        return countyNeededForUniq;
    }

    @JsonProperty("county_needed_for_uniq")
    public void setCountyNeededForUniq(Boolean countyNeededForUniq) {
        this.countyNeededForUniq = countyNeededForUniq;
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
        sb.append(ParserData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("areaType");
        sb.append('=');
        sb.append(((this.areaType == null)?"<null>":this.areaType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("counties");
        sb.append('=');
        sb.append(((this.counties == null)?"<null>":this.counties));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("centroid");
        sb.append('=');
        sb.append(((this.centroid == null)?"<null>":this.centroid));
        sb.append(',');
        sb.append("slugId");
        sb.append('=');
        sb.append(((this.slugId == null)?"<null>":this.slugId));
        sb.append(',');
        sb.append("geoId");
        sb.append('=');
        sb.append(((this.geoId == null)?"<null>":this.geoId));
        sb.append(',');
        sb.append("countyNeededForUniq");
        sb.append('=');
        sb.append(((this.countyNeededForUniq == null)?"<null>":this.countyNeededForUniq));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.slugId == null)? 0 :this.slugId.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.countyNeededForUniq == null)? 0 :this.countyNeededForUniq.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.centroid == null)? 0 :this.centroid.hashCode()));
        result = ((result* 31)+((this.areaType == null)? 0 :this.areaType.hashCode()));
        result = ((result* 31)+((this.geoId == null)? 0 :this.geoId.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.counties == null)? 0 :this.counties.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParserData) == false) {
            return false;
        }
        ParserData rhs = ((ParserData) other);
        return (((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.slugId == rhs.slugId)||((this.slugId!= null)&&this.slugId.equals(rhs.slugId))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.countyNeededForUniq == rhs.countyNeededForUniq)||((this.countyNeededForUniq!= null)&&this.countyNeededForUniq.equals(rhs.countyNeededForUniq))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.centroid == rhs.centroid)||((this.centroid!= null)&&this.centroid.equals(rhs.centroid))))&&((this.areaType == rhs.areaType)||((this.areaType!= null)&&this.areaType.equals(rhs.areaType))))&&((this.geoId == rhs.geoId)||((this.geoId!= null)&&this.geoId.equals(rhs.geoId))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.counties == rhs.counties)||((this.counties!= null)&&this.counties.equals(rhs.counties))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
