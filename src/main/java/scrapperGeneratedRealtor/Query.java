
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
    "city",
    "state_code",
    "county",
    "name",
    "selectedType",
    "postalCode",
    "langCode",
    "whichPage",
    "isDotRealtor"
})
@Generated("jsonschema2pojo")
public class Query {

    @JsonProperty("city")
    private String city;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("county")
    private Object county;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("selectedType")
    private String selectedType;
    @JsonProperty("postalCode")
    private Object postalCode;
    @JsonProperty("langCode")
    private String langCode;
    @JsonProperty("whichPage")
    private String whichPage;
    @JsonProperty("isDotRealtor")
    private Boolean isDotRealtor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    @JsonProperty("county")
    public Object getCounty() {
        return county;
    }

    @JsonProperty("county")
    public void setCounty(Object county) {
        this.county = county;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("selectedType")
    public String getSelectedType() {
        return selectedType;
    }

    @JsonProperty("selectedType")
    public void setSelectedType(String selectedType) {
        this.selectedType = selectedType;
    }

    @JsonProperty("postalCode")
    public Object getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("langCode")
    public String getLangCode() {
        return langCode;
    }

    @JsonProperty("langCode")
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @JsonProperty("whichPage")
    public String getWhichPage() {
        return whichPage;
    }

    @JsonProperty("whichPage")
    public void setWhichPage(String whichPage) {
        this.whichPage = whichPage;
    }

    @JsonProperty("isDotRealtor")
    public Boolean getIsDotRealtor() {
        return isDotRealtor;
    }

    @JsonProperty("isDotRealtor")
    public void setIsDotRealtor(Boolean isDotRealtor) {
        this.isDotRealtor = isDotRealtor;
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
        sb.append(Query.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("stateCode");
        sb.append('=');
        sb.append(((this.stateCode == null)?"<null>":this.stateCode));
        sb.append(',');
        sb.append("county");
        sb.append('=');
        sb.append(((this.county == null)?"<null>":this.county));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("selectedType");
        sb.append('=');
        sb.append(((this.selectedType == null)?"<null>":this.selectedType));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("langCode");
        sb.append('=');
        sb.append(((this.langCode == null)?"<null>":this.langCode));
        sb.append(',');
        sb.append("whichPage");
        sb.append('=');
        sb.append(((this.whichPage == null)?"<null>":this.whichPage));
        sb.append(',');
        sb.append("isDotRealtor");
        sb.append('=');
        sb.append(((this.isDotRealtor == null)?"<null>":this.isDotRealtor));
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
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.langCode == null)? 0 :this.langCode.hashCode()));
        result = ((result* 31)+((this.county == null)? 0 :this.county.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.selectedType == null)? 0 :this.selectedType.hashCode()));
        result = ((result* 31)+((this.stateCode == null)? 0 :this.stateCode.hashCode()));
        result = ((result* 31)+((this.whichPage == null)? 0 :this.whichPage.hashCode()));
        result = ((result* 31)+((this.isDotRealtor == null)? 0 :this.isDotRealtor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Query) == false) {
            return false;
        }
        Query rhs = ((Query) other);
        return (((((((((((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city)))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.langCode == rhs.langCode)||((this.langCode!= null)&&this.langCode.equals(rhs.langCode))))&&((this.county == rhs.county)||((this.county!= null)&&this.county.equals(rhs.county))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.selectedType == rhs.selectedType)||((this.selectedType!= null)&&this.selectedType.equals(rhs.selectedType))))&&((this.stateCode == rhs.stateCode)||((this.stateCode!= null)&&this.stateCode.equals(rhs.stateCode))))&&((this.whichPage == rhs.whichPage)||((this.whichPage!= null)&&this.whichPage.equals(rhs.whichPage))))&&((this.isDotRealtor == rhs.isDotRealtor)||((this.isDotRealtor!= null)&&this.isDotRealtor.equals(rhs.isDotRealtor))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
