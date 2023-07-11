
package scrapperGeneratedRealtor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "matching_rows",
    "agents"
})
@Generated("jsonschema2pojo")
public class AgentsData {

    @JsonProperty("matching_rows")
    private Integer matchingRows;
    @JsonProperty("agents")
    private List<Agent__1> agents = new ArrayList<Agent__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("matching_rows")
    public Integer getMatchingRows() {
        return matchingRows;
    }

    @JsonProperty("matching_rows")
    public void setMatchingRows(Integer matchingRows) {
        this.matchingRows = matchingRows;
    }

    @JsonProperty("agents")
    public List<Agent__1> getAgents() {
        return agents;
    }

    @JsonProperty("agents")
    public void setAgents(List<Agent__1> agents) {
        this.agents = agents;
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
        sb.append(AgentsData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchingRows");
        sb.append('=');
        sb.append(((this.matchingRows == null)?"<null>":this.matchingRows));
        sb.append(',');
        sb.append("agents");
        sb.append('=');
        sb.append(((this.agents == null)?"<null>":this.agents));
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
        result = ((result* 31)+((this.matchingRows == null)? 0 :this.matchingRows.hashCode()));
        result = ((result* 31)+((this.agents == null)? 0 :this.agents.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgentsData) == false) {
            return false;
        }
        AgentsData rhs = ((AgentsData) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.matchingRows == rhs.matchingRows)||((this.matchingRows!= null)&&this.matchingRows.equals(rhs.matchingRows))))&&((this.agents == rhs.agents)||((this.agents!= null)&&this.agents.equals(rhs.agents))));
    }

}
