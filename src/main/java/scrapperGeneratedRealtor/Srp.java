
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
    "selectedFilterObj",
    "fliterGlobalSlugArray"
})
@Generated("jsonschema2pojo")
public class Srp {

    @JsonProperty("selectedFilterObj")
    private SelectedFilterObj selectedFilterObj;
    @JsonProperty("fliterGlobalSlugArray")
    private List<String> fliterGlobalSlugArray = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("selectedFilterObj")
    public SelectedFilterObj getSelectedFilterObj() {
        return selectedFilterObj;
    }

    @JsonProperty("selectedFilterObj")
    public void setSelectedFilterObj(SelectedFilterObj selectedFilterObj) {
        this.selectedFilterObj = selectedFilterObj;
    }

    @JsonProperty("fliterGlobalSlugArray")
    public List<String> getFliterGlobalSlugArray() {
        return fliterGlobalSlugArray;
    }

    @JsonProperty("fliterGlobalSlugArray")
    public void setFliterGlobalSlugArray(List<String> fliterGlobalSlugArray) {
        this.fliterGlobalSlugArray = fliterGlobalSlugArray;
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
        sb.append(Srp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("selectedFilterObj");
        sb.append('=');
        sb.append(((this.selectedFilterObj == null)?"<null>":this.selectedFilterObj));
        sb.append(',');
        sb.append("fliterGlobalSlugArray");
        sb.append('=');
        sb.append(((this.fliterGlobalSlugArray == null)?"<null>":this.fliterGlobalSlugArray));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.selectedFilterObj == null)? 0 :this.selectedFilterObj.hashCode()));
        result = ((result* 31)+((this.fliterGlobalSlugArray == null)? 0 :this.fliterGlobalSlugArray.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Srp) == false) {
            return false;
        }
        Srp rhs = ((Srp) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.selectedFilterObj == rhs.selectedFilterObj)||((this.selectedFilterObj!= null)&&this.selectedFilterObj.equals(rhs.selectedFilterObj))))&&((this.fliterGlobalSlugArray == rhs.fliterGlobalSlugArray)||((this.fliterGlobalSlugArray!= null)&&this.fliterGlobalSlugArray.equals(rhs.fliterGlobalSlugArray))));
    }

}
