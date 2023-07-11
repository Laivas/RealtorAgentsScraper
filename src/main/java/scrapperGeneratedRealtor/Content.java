
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
    "silos",
    "localUrl",
    "inLanguage",
    "isBotAndDeviceType"
})
@Generated("jsonschema2pojo")
public class Content {

    @JsonProperty("silos")
    private String silos;
    @JsonProperty("localUrl")
    private String localUrl;
    @JsonProperty("inLanguage")
    private String inLanguage;
    @JsonProperty("isBotAndDeviceType")
    private IsBotAndDeviceType isBotAndDeviceType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("silos")
    public String getSilos() {
        return silos;
    }

    @JsonProperty("silos")
    public void setSilos(String silos) {
        this.silos = silos;
    }

    @JsonProperty("localUrl")
    public String getLocalUrl() {
        return localUrl;
    }

    @JsonProperty("localUrl")
    public void setLocalUrl(String localUrl) {
        this.localUrl = localUrl;
    }

    @JsonProperty("inLanguage")
    public String getInLanguage() {
        return inLanguage;
    }

    @JsonProperty("inLanguage")
    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    @JsonProperty("isBotAndDeviceType")
    public IsBotAndDeviceType getIsBotAndDeviceType() {
        return isBotAndDeviceType;
    }

    @JsonProperty("isBotAndDeviceType")
    public void setIsBotAndDeviceType(IsBotAndDeviceType isBotAndDeviceType) {
        this.isBotAndDeviceType = isBotAndDeviceType;
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
        sb.append(Content.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("silos");
        sb.append('=');
        sb.append(((this.silos == null)?"<null>":this.silos));
        sb.append(',');
        sb.append("localUrl");
        sb.append('=');
        sb.append(((this.localUrl == null)?"<null>":this.localUrl));
        sb.append(',');
        sb.append("inLanguage");
        sb.append('=');
        sb.append(((this.inLanguage == null)?"<null>":this.inLanguage));
        sb.append(',');
        sb.append("isBotAndDeviceType");
        sb.append('=');
        sb.append(((this.isBotAndDeviceType == null)?"<null>":this.isBotAndDeviceType));
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
        result = ((result* 31)+((this.inLanguage == null)? 0 :this.inLanguage.hashCode()));
        result = ((result* 31)+((this.isBotAndDeviceType == null)? 0 :this.isBotAndDeviceType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.silos == null)? 0 :this.silos.hashCode()));
        result = ((result* 31)+((this.localUrl == null)? 0 :this.localUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Content) == false) {
            return false;
        }
        Content rhs = ((Content) other);
        return ((((((this.inLanguage == rhs.inLanguage)||((this.inLanguage!= null)&&this.inLanguage.equals(rhs.inLanguage)))&&((this.isBotAndDeviceType == rhs.isBotAndDeviceType)||((this.isBotAndDeviceType!= null)&&this.isBotAndDeviceType.equals(rhs.isBotAndDeviceType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.silos == rhs.silos)||((this.silos!= null)&&this.silos.equals(rhs.silos))))&&((this.localUrl == rhs.localUrl)||((this.localUrl!= null)&&this.localUrl.equals(rhs.localUrl))));
    }

}
