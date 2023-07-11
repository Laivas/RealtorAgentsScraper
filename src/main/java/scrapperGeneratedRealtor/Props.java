
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
    "pageProps",
    "initialReduxState"
})
@Generated("jsonschema2pojo")
public class Props {

    @JsonProperty("pageProps")
    private PageProps pageProps;
    @JsonProperty("initialReduxState")
    private InitialReduxState initialReduxState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("pageProps")
    public PageProps getPageProps() {
        return pageProps;
    }

    @JsonProperty("pageProps")
    public void setPageProps(PageProps pageProps) {
        this.pageProps = pageProps;
    }

    @JsonProperty("initialReduxState")
    public InitialReduxState getInitialReduxState() {
        return initialReduxState;
    }

    @JsonProperty("initialReduxState")
    public void setInitialReduxState(InitialReduxState initialReduxState) {
        this.initialReduxState = initialReduxState;
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
        sb.append(Props.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pageProps");
        sb.append('=');
        sb.append(((this.pageProps == null)?"<null>":this.pageProps));
        sb.append(',');
        sb.append("initialReduxState");
        sb.append('=');
        sb.append(((this.initialReduxState == null)?"<null>":this.initialReduxState));
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
        result = ((result* 31)+((this.pageProps == null)? 0 :this.pageProps.hashCode()));
        result = ((result* 31)+((this.initialReduxState == null)? 0 :this.initialReduxState.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Props) == false) {
            return false;
        }
        Props rhs = ((Props) other);
        return ((((this.pageProps == rhs.pageProps)||((this.pageProps!= null)&&this.pageProps.equals(rhs.pageProps)))&&((this.initialReduxState == rhs.initialReduxState)||((this.initialReduxState!= null)&&this.initialReduxState.equals(rhs.initialReduxState))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
