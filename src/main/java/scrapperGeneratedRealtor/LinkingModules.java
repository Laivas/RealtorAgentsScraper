
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
    "status",
    "loading",
    "error",
    "linkingModulesData"
})
@Generated("jsonschema2pojo")
public class LinkingModules {

    @JsonProperty("status")
    private Object status;
    @JsonProperty("loading")
    private Boolean loading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("linkingModulesData")
    private Object linkingModulesData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("loading")
    public Boolean getLoading() {
        return loading;
    }

    @JsonProperty("loading")
    public void setLoading(Boolean loading) {
        this.loading = loading;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("linkingModulesData")
    public Object getLinkingModulesData() {
        return linkingModulesData;
    }

    @JsonProperty("linkingModulesData")
    public void setLinkingModulesData(Object linkingModulesData) {
        this.linkingModulesData = linkingModulesData;
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
        sb.append(LinkingModules.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("loading");
        sb.append('=');
        sb.append(((this.loading == null)?"<null>":this.loading));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("linkingModulesData");
        sb.append('=');
        sb.append(((this.linkingModulesData == null)?"<null>":this.linkingModulesData));
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
        result = ((result* 31)+((this.loading == null)? 0 :this.loading.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.linkingModulesData == null)? 0 :this.linkingModulesData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinkingModules) == false) {
            return false;
        }
        LinkingModules rhs = ((LinkingModules) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.loading == rhs.loading)||((this.loading!= null)&&this.loading.equals(rhs.loading))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.linkingModulesData == rhs.linkingModulesData)||((this.linkingModulesData!= null)&&this.linkingModulesData.equals(rhs.linkingModulesData))));
    }

}
