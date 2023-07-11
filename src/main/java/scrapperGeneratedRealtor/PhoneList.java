
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
    "phone_1",
    "phone_2",
    "phone_3"
})
@Generated("jsonschema2pojo")
public class PhoneList {

    @JsonProperty("phone_1")
    private Phone1 phone1;
    @JsonProperty("phone_2")
    private Phone2 phone2;
    @JsonProperty("phone_3")
    private Phone3 phone3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("phone_1")
    public Phone1 getPhone1() {
        return phone1;
    }

    @JsonProperty("phone_1")
    public void setPhone1(Phone1 phone1) {
        this.phone1 = phone1;
    }

    @JsonProperty("phone_2")
    public Phone2 getPhone2() {
        return phone2;
    }

    @JsonProperty("phone_2")
    public void setPhone2(Phone2 phone2) {
        this.phone2 = phone2;
    }

    @JsonProperty("phone_3")
    public Phone3 getPhone3() {
        return phone3;
    }

    @JsonProperty("phone_3")
    public void setPhone3(Phone3 phone3) {
        this.phone3 = phone3;
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
        sb.append(PhoneList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phone1");
        sb.append('=');
        sb.append(((this.phone1 == null)?"<null>":this.phone1));
        sb.append(',');
        sb.append("phone2");
        sb.append('=');
        sb.append(((this.phone2 == null)?"<null>":this.phone2));
        sb.append(',');
        sb.append("phone3");
        sb.append('=');
        sb.append(((this.phone3 == null)?"<null>":this.phone3));
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
        result = ((result* 31)+((this.phone2 == null)? 0 :this.phone2 .hashCode()));
        result = ((result* 31)+((this.phone3 == null)? 0 :this.phone3 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.phone1 == null)? 0 :this.phone1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhoneList) == false) {
            return false;
        }
        PhoneList rhs = ((PhoneList) other);
        return (((((this.phone2 == rhs.phone2)||((this.phone2 != null)&&this.phone2 .equals(rhs.phone2)))&&((this.phone3 == rhs.phone3)||((this.phone3 != null)&&this.phone3 .equals(rhs.phone3))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.phone1 == rhs.phone1)||((this.phone1 != null)&&this.phone1 .equals(rhs.phone1))));
    }

}
