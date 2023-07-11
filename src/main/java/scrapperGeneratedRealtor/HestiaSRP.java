
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
    "hestiaSRPData",
    "hestialoading"
})
@Generated("jsonschema2pojo")
public class HestiaSRP {

    @JsonProperty("status")
    private Object status;
    @JsonProperty("loading")
    private Boolean loading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("hestiaSRPData")
    private Object hestiaSRPData;
    @JsonProperty("hestialoading")
    private Boolean hestialoading;
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

    @JsonProperty("hestiaSRPData")
    public Object getHestiaSRPData() {
        return hestiaSRPData;
    }

    @JsonProperty("hestiaSRPData")
    public void setHestiaSRPData(Object hestiaSRPData) {
        this.hestiaSRPData = hestiaSRPData;
    }

    @JsonProperty("hestialoading")
    public Boolean getHestialoading() {
        return hestialoading;
    }

    @JsonProperty("hestialoading")
    public void setHestialoading(Boolean hestialoading) {
        this.hestialoading = hestialoading;
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
        sb.append(HestiaSRP.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("hestiaSRPData");
        sb.append('=');
        sb.append(((this.hestiaSRPData == null)?"<null>":this.hestiaSRPData));
        sb.append(',');
        sb.append("hestialoading");
        sb.append('=');
        sb.append(((this.hestialoading == null)?"<null>":this.hestialoading));
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
        result = ((result* 31)+((this.hestiaSRPData == null)? 0 :this.hestiaSRPData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.loading == null)? 0 :this.loading.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.hestialoading == null)? 0 :this.hestialoading.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HestiaSRP) == false) {
            return false;
        }
        HestiaSRP rhs = ((HestiaSRP) other);
        return (((((((this.hestiaSRPData == rhs.hestiaSRPData)||((this.hestiaSRPData!= null)&&this.hestiaSRPData.equals(rhs.hestiaSRPData)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.loading == rhs.loading)||((this.loading!= null)&&this.loading.equals(rhs.loading))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.hestialoading == rhs.hestialoading)||((this.hestialoading!= null)&&this.hestialoading.equals(rhs.hestialoading))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
