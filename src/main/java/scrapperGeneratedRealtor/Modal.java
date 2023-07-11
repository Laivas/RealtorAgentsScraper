
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
    "modalDisplayed",
    "modalType"
})
@Generated("jsonschema2pojo")
public class Modal {

    @JsonProperty("modalDisplayed")
    private Boolean modalDisplayed;
    @JsonProperty("modalType")
    private Object modalType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("modalDisplayed")
    public Boolean getModalDisplayed() {
        return modalDisplayed;
    }

    @JsonProperty("modalDisplayed")
    public void setModalDisplayed(Boolean modalDisplayed) {
        this.modalDisplayed = modalDisplayed;
    }

    @JsonProperty("modalType")
    public Object getModalType() {
        return modalType;
    }

    @JsonProperty("modalType")
    public void setModalType(Object modalType) {
        this.modalType = modalType;
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
        sb.append(Modal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modalDisplayed");
        sb.append('=');
        sb.append(((this.modalDisplayed == null)?"<null>":this.modalDisplayed));
        sb.append(',');
        sb.append("modalType");
        sb.append('=');
        sb.append(((this.modalType == null)?"<null>":this.modalType));
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
        result = ((result* 31)+((this.modalType == null)? 0 :this.modalType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.modalDisplayed == null)? 0 :this.modalDisplayed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Modal) == false) {
            return false;
        }
        Modal rhs = ((Modal) other);
        return ((((this.modalType == rhs.modalType)||((this.modalType!= null)&&this.modalType.equals(rhs.modalType)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.modalDisplayed == rhs.modalDisplayed)||((this.modalDisplayed!= null)&&this.modalDisplayed.equals(rhs.modalDisplayed))));
    }

}
