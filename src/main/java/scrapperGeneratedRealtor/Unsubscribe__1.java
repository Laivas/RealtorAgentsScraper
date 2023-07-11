
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
    "autorecs",
    "recapprove",
    "account_notify"
})
@Generated("jsonschema2pojo")
public class Unsubscribe__1 {

    @JsonProperty("autorecs")
    private Boolean autorecs;
    @JsonProperty("recapprove")
    private Boolean recapprove;
    @JsonProperty("account_notify")
    private Boolean accountNotify;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("autorecs")
    public Boolean getAutorecs() {
        return autorecs;
    }

    @JsonProperty("autorecs")
    public void setAutorecs(Boolean autorecs) {
        this.autorecs = autorecs;
    }

    @JsonProperty("recapprove")
    public Boolean getRecapprove() {
        return recapprove;
    }

    @JsonProperty("recapprove")
    public void setRecapprove(Boolean recapprove) {
        this.recapprove = recapprove;
    }

    @JsonProperty("account_notify")
    public Boolean getAccountNotify() {
        return accountNotify;
    }

    @JsonProperty("account_notify")
    public void setAccountNotify(Boolean accountNotify) {
        this.accountNotify = accountNotify;
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
        sb.append(Unsubscribe__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("autorecs");
        sb.append('=');
        sb.append(((this.autorecs == null)?"<null>":this.autorecs));
        sb.append(',');
        sb.append("recapprove");
        sb.append('=');
        sb.append(((this.recapprove == null)?"<null>":this.recapprove));
        sb.append(',');
        sb.append("accountNotify");
        sb.append('=');
        sb.append(((this.accountNotify == null)?"<null>":this.accountNotify));
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
        result = ((result* 31)+((this.autorecs == null)? 0 :this.autorecs.hashCode()));
        result = ((result* 31)+((this.recapprove == null)? 0 :this.recapprove.hashCode()));
        result = ((result* 31)+((this.accountNotify == null)? 0 :this.accountNotify.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Unsubscribe__1) == false) {
            return false;
        }
        Unsubscribe__1 rhs = ((Unsubscribe__1) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.autorecs == rhs.autorecs)||((this.autorecs!= null)&&this.autorecs.equals(rhs.autorecs))))&&((this.recapprove == rhs.recapprove)||((this.recapprove!= null)&&this.recapprove.equals(rhs.recapprove))))&&((this.accountNotify == rhs.accountNotify)||((this.accountNotify!= null)&&this.accountNotify.equals(rhs.accountNotify))));
    }

}
