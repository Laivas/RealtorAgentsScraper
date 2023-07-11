
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
    "member",
    "inactivation_date",
    "abbreviation",
    "type",
    "primary",
    "license_number"
})
@Generated("jsonschema2pojo")
public class MlsHistory {

    @JsonProperty("member")
    private Member__2 member;
    @JsonProperty("inactivation_date")
    private String inactivationDate;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("type")
    private String type;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("license_number")
    private String licenseNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("member")
    public Member__2 getMember() {
        return member;
    }

    @JsonProperty("member")
    public void setMember(Member__2 member) {
        this.member = member;
    }

    @JsonProperty("inactivation_date")
    public String getInactivationDate() {
        return inactivationDate;
    }

    @JsonProperty("inactivation_date")
    public void setInactivationDate(String inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @JsonProperty("license_number")
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @JsonProperty("license_number")
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
        sb.append(MlsHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("member");
        sb.append('=');
        sb.append(((this.member == null)?"<null>":this.member));
        sb.append(',');
        sb.append("inactivationDate");
        sb.append('=');
        sb.append(((this.inactivationDate == null)?"<null>":this.inactivationDate));
        sb.append(',');
        sb.append("abbreviation");
        sb.append('=');
        sb.append(((this.abbreviation == null)?"<null>":this.abbreviation));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("primary");
        sb.append('=');
        sb.append(((this.primary == null)?"<null>":this.primary));
        sb.append(',');
        sb.append("licenseNumber");
        sb.append('=');
        sb.append(((this.licenseNumber == null)?"<null>":this.licenseNumber));
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
        result = ((result* 31)+((this.member == null)? 0 :this.member.hashCode()));
        result = ((result* 31)+((this.licenseNumber == null)? 0 :this.licenseNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.inactivationDate == null)? 0 :this.inactivationDate.hashCode()));
        result = ((result* 31)+((this.primary == null)? 0 :this.primary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlsHistory) == false) {
            return false;
        }
        MlsHistory rhs = ((MlsHistory) other);
        return ((((((((this.member == rhs.member)||((this.member!= null)&&this.member.equals(rhs.member)))&&((this.licenseNumber == rhs.licenseNumber)||((this.licenseNumber!= null)&&this.licenseNumber.equals(rhs.licenseNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.inactivationDate == rhs.inactivationDate)||((this.inactivationDate!= null)&&this.inactivationDate.equals(rhs.inactivationDate))))&&((this.primary == rhs.primary)||((this.primary!= null)&&this.primary.equals(rhs.primary))));
    }

}
