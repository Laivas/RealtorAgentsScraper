
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
    "realsatisfied_opt_out",
    "tt_opt_out"
})
@Generated("jsonschema2pojo")
public class ProfileWizard__1 {

    @JsonProperty("realsatisfied_opt_out")
    private Boolean realsatisfiedOptOut;
    @JsonProperty("tt_opt_out")
    private Boolean ttOptOut;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("realsatisfied_opt_out")
    public Boolean getRealsatisfiedOptOut() {
        return realsatisfiedOptOut;
    }

    @JsonProperty("realsatisfied_opt_out")
    public void setRealsatisfiedOptOut(Boolean realsatisfiedOptOut) {
        this.realsatisfiedOptOut = realsatisfiedOptOut;
    }

    @JsonProperty("tt_opt_out")
    public Boolean getTtOptOut() {
        return ttOptOut;
    }

    @JsonProperty("tt_opt_out")
    public void setTtOptOut(Boolean ttOptOut) {
        this.ttOptOut = ttOptOut;
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
        sb.append(ProfileWizard__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("realsatisfiedOptOut");
        sb.append('=');
        sb.append(((this.realsatisfiedOptOut == null)?"<null>":this.realsatisfiedOptOut));
        sb.append(',');
        sb.append("ttOptOut");
        sb.append('=');
        sb.append(((this.ttOptOut == null)?"<null>":this.ttOptOut));
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
        result = ((result* 31)+((this.ttOptOut == null)? 0 :this.ttOptOut.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.realsatisfiedOptOut == null)? 0 :this.realsatisfiedOptOut.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfileWizard__1) == false) {
            return false;
        }
        ProfileWizard__1 rhs = ((ProfileWizard__1) other);
        return ((((this.ttOptOut == rhs.ttOptOut)||((this.ttOptOut!= null)&&this.ttOptOut.equals(rhs.ttOptOut)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.realsatisfiedOptOut == rhs.realsatisfiedOptOut)||((this.realsatisfiedOptOut!= null)&&this.realsatisfiedOptOut.equals(rhs.realsatisfiedOptOut))));
    }

}
