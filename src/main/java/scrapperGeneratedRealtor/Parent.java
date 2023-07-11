
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
    "name",
    "geo_id",
    "geo_type",
    "slug_id"
})
@Generated("jsonschema2pojo")
public class Parent {

    @JsonProperty("name")
    private String name;
    @JsonProperty("geo_id")
    private String geoId;
    @JsonProperty("geo_type")
    private String geoType;
    @JsonProperty("slug_id")
    private String slugId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("geo_id")
    public String getGeoId() {
        return geoId;
    }

    @JsonProperty("geo_id")
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @JsonProperty("geo_type")
    public String getGeoType() {
        return geoType;
    }

    @JsonProperty("geo_type")
    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    @JsonProperty("slug_id")
    public String getSlugId() {
        return slugId;
    }

    @JsonProperty("slug_id")
    public void setSlugId(String slugId) {
        this.slugId = slugId;
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
        sb.append(Parent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("geoId");
        sb.append('=');
        sb.append(((this.geoId == null)?"<null>":this.geoId));
        sb.append(',');
        sb.append("geoType");
        sb.append('=');
        sb.append(((this.geoType == null)?"<null>":this.geoType));
        sb.append(',');
        sb.append("slugId");
        sb.append('=');
        sb.append(((this.slugId == null)?"<null>":this.slugId));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.slugId == null)? 0 :this.slugId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.geoType == null)? 0 :this.geoType.hashCode()));
        result = ((result* 31)+((this.geoId == null)? 0 :this.geoId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parent) == false) {
            return false;
        }
        Parent rhs = ((Parent) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.slugId == rhs.slugId)||((this.slugId!= null)&&this.slugId.equals(rhs.slugId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.geoType == rhs.geoType)||((this.geoType!= null)&&this.geoType.equals(rhs.geoType))))&&((this.geoId == rhs.geoId)||((this.geoId!= null)&&this.geoId.equals(rhs.geoId))));
    }

}
