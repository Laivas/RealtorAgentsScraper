
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
    "updatedCertificateState",
    "addedCertificate"
})
@Generated("jsonschema2pojo")
public class Certification {

    @JsonProperty("updatedCertificateState")
    private List<Object> updatedCertificateState = new ArrayList<Object>();
    @JsonProperty("addedCertificate")
    private List<Object> addedCertificate = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("updatedCertificateState")
    public List<Object> getUpdatedCertificateState() {
        return updatedCertificateState;
    }

    @JsonProperty("updatedCertificateState")
    public void setUpdatedCertificateState(List<Object> updatedCertificateState) {
        this.updatedCertificateState = updatedCertificateState;
    }

    @JsonProperty("addedCertificate")
    public List<Object> getAddedCertificate() {
        return addedCertificate;
    }

    @JsonProperty("addedCertificate")
    public void setAddedCertificate(List<Object> addedCertificate) {
        this.addedCertificate = addedCertificate;
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
        sb.append(Certification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("updatedCertificateState");
        sb.append('=');
        sb.append(((this.updatedCertificateState == null)?"<null>":this.updatedCertificateState));
        sb.append(',');
        sb.append("addedCertificate");
        sb.append('=');
        sb.append(((this.addedCertificate == null)?"<null>":this.addedCertificate));
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
        result = ((result* 31)+((this.updatedCertificateState == null)? 0 :this.updatedCertificateState.hashCode()));
        result = ((result* 31)+((this.addedCertificate == null)? 0 :this.addedCertificate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certification) == false) {
            return false;
        }
        Certification rhs = ((Certification) other);
        return ((((this.updatedCertificateState == rhs.updatedCertificateState)||((this.updatedCertificateState!= null)&&this.updatedCertificateState.equals(rhs.updatedCertificateState)))&&((this.addedCertificate == rhs.addedCertificate)||((this.addedCertificate!= null)&&this.addedCertificate.equals(rhs.addedCertificate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
