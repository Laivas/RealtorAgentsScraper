
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
    "geo_id",
    "name",
    "geo_type",
    "boundary_centroid",
    "bounding_box_centroid",
    "area_size",
    "state_code",
    "slug_id",
    "county_needed_for_uniq",
    "postal_code",
    "distance_to_edge",
    "distance_to_center",
    "parents",
    "fips"
})
@Generated("jsonschema2pojo")
public class Nearby__1 {

    @JsonProperty("geo_id")
    private String geoId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("geo_type")
    private String geoType;
    @JsonProperty("boundary_centroid")
    private BoundaryCentroid boundaryCentroid;
    @JsonProperty("bounding_box_centroid")
    private BoundingBoxCentroid boundingBoxCentroid;
    @JsonProperty("area_size")
    private Double areaSize;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("slug_id")
    private String slugId;
    @JsonProperty("county_needed_for_uniq")
    private Boolean countyNeededForUniq;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("distance_to_edge")
    private String distanceToEdge;
    @JsonProperty("distance_to_center")
    private String distanceToCenter;
    @JsonProperty("parents")
    private List<Parent> parents = new ArrayList<Parent>();
    @JsonProperty("fips")
    private String fips;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("geo_id")
    public String getGeoId() {
        return geoId;
    }

    @JsonProperty("geo_id")
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("geo_type")
    public String getGeoType() {
        return geoType;
    }

    @JsonProperty("geo_type")
    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    @JsonProperty("boundary_centroid")
    public BoundaryCentroid getBoundaryCentroid() {
        return boundaryCentroid;
    }

    @JsonProperty("boundary_centroid")
    public void setBoundaryCentroid(BoundaryCentroid boundaryCentroid) {
        this.boundaryCentroid = boundaryCentroid;
    }

    @JsonProperty("bounding_box_centroid")
    public BoundingBoxCentroid getBoundingBoxCentroid() {
        return boundingBoxCentroid;
    }

    @JsonProperty("bounding_box_centroid")
    public void setBoundingBoxCentroid(BoundingBoxCentroid boundingBoxCentroid) {
        this.boundingBoxCentroid = boundingBoxCentroid;
    }

    @JsonProperty("area_size")
    public Double getAreaSize() {
        return areaSize;
    }

    @JsonProperty("area_size")
    public void setAreaSize(Double areaSize) {
        this.areaSize = areaSize;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("slug_id")
    public String getSlugId() {
        return slugId;
    }

    @JsonProperty("slug_id")
    public void setSlugId(String slugId) {
        this.slugId = slugId;
    }

    @JsonProperty("county_needed_for_uniq")
    public Boolean getCountyNeededForUniq() {
        return countyNeededForUniq;
    }

    @JsonProperty("county_needed_for_uniq")
    public void setCountyNeededForUniq(Boolean countyNeededForUniq) {
        this.countyNeededForUniq = countyNeededForUniq;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("distance_to_edge")
    public String getDistanceToEdge() {
        return distanceToEdge;
    }

    @JsonProperty("distance_to_edge")
    public void setDistanceToEdge(String distanceToEdge) {
        this.distanceToEdge = distanceToEdge;
    }

    @JsonProperty("distance_to_center")
    public String getDistanceToCenter() {
        return distanceToCenter;
    }

    @JsonProperty("distance_to_center")
    public void setDistanceToCenter(String distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @JsonProperty("fips")
    public String getFips() {
        return fips;
    }

    @JsonProperty("fips")
    public void setFips(String fips) {
        this.fips = fips;
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
        sb.append(Nearby__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geoId");
        sb.append('=');
        sb.append(((this.geoId == null)?"<null>":this.geoId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("geoType");
        sb.append('=');
        sb.append(((this.geoType == null)?"<null>":this.geoType));
        sb.append(',');
        sb.append("boundaryCentroid");
        sb.append('=');
        sb.append(((this.boundaryCentroid == null)?"<null>":this.boundaryCentroid));
        sb.append(',');
        sb.append("boundingBoxCentroid");
        sb.append('=');
        sb.append(((this.boundingBoxCentroid == null)?"<null>":this.boundingBoxCentroid));
        sb.append(',');
        sb.append("areaSize");
        sb.append('=');
        sb.append(((this.areaSize == null)?"<null>":this.areaSize));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("slugId");
        sb.append('=');
        sb.append(((this.slugId == null)?"<null>":this.slugId));
        sb.append(',');
        sb.append("countyNeededForUniq");
        sb.append('=');
        sb.append(((this.countyNeededForUniq == null)?"<null>":this.countyNeededForUniq));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("distanceToEdge");
        sb.append('=');
        sb.append(((this.distanceToEdge == null)?"<null>":this.distanceToEdge));
        sb.append(',');
        sb.append("distanceToCenter");
        sb.append('=');
        sb.append(((this.distanceToCenter == null)?"<null>":this.distanceToCenter));
        sb.append(',');
        sb.append("parents");
        sb.append('=');
        sb.append(((this.parents == null)?"<null>":this.parents));
        sb.append(',');
        sb.append("fips");
        sb.append('=');
        sb.append(((this.fips == null)?"<null>":this.fips));
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
        result = ((result* 31)+((this.slugId == null)? 0 :this.slugId.hashCode()));
        result = ((result* 31)+((this.boundaryCentroid == null)? 0 :this.boundaryCentroid.hashCode()));
        result = ((result* 31)+((this.distanceToEdge == null)? 0 :this.distanceToEdge.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.distanceToCenter == null)? 0 :this.distanceToCenter.hashCode()));
        result = ((result* 31)+((this.fips == null)? 0 :this.fips.hashCode()));
        result = ((result* 31)+((this.countyNeededForUniq == null)? 0 :this.countyNeededForUniq.hashCode()));
        result = ((result* 31)+((this.geoType == null)? 0 :this.geoType.hashCode()));
        result = ((result* 31)+((this.boundingBoxCentroid == null)? 0 :this.boundingBoxCentroid.hashCode()));
        result = ((result* 31)+((this.geoId == null)? 0 :this.geoId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.areaSize == null)? 0 :this.areaSize.hashCode()));
        result = ((result* 31)+((this.parents == null)? 0 :this.parents.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nearby__1) == false) {
            return false;
        }
        Nearby__1 rhs = ((Nearby__1) other);
        return ((((((((((((((((this.slugId == rhs.slugId)||((this.slugId!= null)&&this.slugId.equals(rhs.slugId)))&&((this.boundaryCentroid == rhs.boundaryCentroid)||((this.boundaryCentroid!= null)&&this.boundaryCentroid.equals(rhs.boundaryCentroid))))&&((this.distanceToEdge == rhs.distanceToEdge)||((this.distanceToEdge!= null)&&this.distanceToEdge.equals(rhs.distanceToEdge))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.distanceToCenter == rhs.distanceToCenter)||((this.distanceToCenter!= null)&&this.distanceToCenter.equals(rhs.distanceToCenter))))&&((this.fips == rhs.fips)||((this.fips!= null)&&this.fips.equals(rhs.fips))))&&((this.countyNeededForUniq == rhs.countyNeededForUniq)||((this.countyNeededForUniq!= null)&&this.countyNeededForUniq.equals(rhs.countyNeededForUniq))))&&((this.geoType == rhs.geoType)||((this.geoType!= null)&&this.geoType.equals(rhs.geoType))))&&((this.boundingBoxCentroid == rhs.boundingBoxCentroid)||((this.boundingBoxCentroid!= null)&&this.boundingBoxCentroid.equals(rhs.boundingBoxCentroid))))&&((this.geoId == rhs.geoId)||((this.geoId!= null)&&this.geoId.equals(rhs.geoId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.areaSize == rhs.areaSize)||((this.areaSize!= null)&&this.areaSize.equals(rhs.areaSize))))&&((this.parents == rhs.parents)||((this.parents!= null)&&this.parents.equals(rhs.parents))));
    }

}
