
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
    "teamloading",
    "error",
    "teamdetail",
    "seoData"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("status")
    private Object status;
    @JsonProperty("teamloading")
    private Boolean teamloading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("teamdetail")
    private Object teamdetail;
    @JsonProperty("seoData")
    private Object seoData;
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

    @JsonProperty("teamloading")
    public Boolean getTeamloading() {
        return teamloading;
    }

    @JsonProperty("teamloading")
    public void setTeamloading(Boolean teamloading) {
        this.teamloading = teamloading;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("teamdetail")
    public Object getTeamdetail() {
        return teamdetail;
    }

    @JsonProperty("teamdetail")
    public void setTeamdetail(Object teamdetail) {
        this.teamdetail = teamdetail;
    }

    @JsonProperty("seoData")
    public Object getSeoData() {
        return seoData;
    }

    @JsonProperty("seoData")
    public void setSeoData(Object seoData) {
        this.seoData = seoData;
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
        sb.append(Team.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("teamloading");
        sb.append('=');
        sb.append(((this.teamloading == null)?"<null>":this.teamloading));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("teamdetail");
        sb.append('=');
        sb.append(((this.teamdetail == null)?"<null>":this.teamdetail));
        sb.append(',');
        sb.append("seoData");
        sb.append('=');
        sb.append(((this.seoData == null)?"<null>":this.seoData));
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
        result = ((result* 31)+((this.teamdetail == null)? 0 :this.teamdetail.hashCode()));
        result = ((result* 31)+((this.seoData == null)? 0 :this.seoData.hashCode()));
        result = ((result* 31)+((this.teamloading == null)? 0 :this.teamloading.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return (((((((this.teamdetail == rhs.teamdetail)||((this.teamdetail!= null)&&this.teamdetail.equals(rhs.teamdetail)))&&((this.seoData == rhs.seoData)||((this.seoData!= null)&&this.seoData.equals(rhs.seoData))))&&((this.teamloading == rhs.teamloading)||((this.teamloading!= null)&&this.teamloading.equals(rhs.teamloading))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
