
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
    "is_team_member",
    "team_advertiser_id"
})
@Generated("jsonschema2pojo")
public class AgentTeamDetails__1 {

    @JsonProperty("is_team_member")
    private Boolean isTeamMember;
    @JsonProperty("team_advertiser_id")
    private Integer teamAdvertiserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("is_team_member")
    public Boolean getIsTeamMember() {
        return isTeamMember;
    }

    @JsonProperty("is_team_member")
    public void setIsTeamMember(Boolean isTeamMember) {
        this.isTeamMember = isTeamMember;
    }

    @JsonProperty("team_advertiser_id")
    public Integer getTeamAdvertiserId() {
        return teamAdvertiserId;
    }

    @JsonProperty("team_advertiser_id")
    public void setTeamAdvertiserId(Integer teamAdvertiserId) {
        this.teamAdvertiserId = teamAdvertiserId;
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
        sb.append(AgentTeamDetails__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isTeamMember");
        sb.append('=');
        sb.append(((this.isTeamMember == null)?"<null>":this.isTeamMember));
        sb.append(',');
        sb.append("teamAdvertiserId");
        sb.append('=');
        sb.append(((this.teamAdvertiserId == null)?"<null>":this.teamAdvertiserId));
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
        result = ((result* 31)+((this.teamAdvertiserId == null)? 0 :this.teamAdvertiserId.hashCode()));
        result = ((result* 31)+((this.isTeamMember == null)? 0 :this.isTeamMember.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AgentTeamDetails__1) == false) {
            return false;
        }
        AgentTeamDetails__1 rhs = ((AgentTeamDetails__1) other);
        return ((((this.teamAdvertiserId == rhs.teamAdvertiserId)||((this.teamAdvertiserId!= null)&&this.teamAdvertiserId.equals(rhs.teamAdvertiserId)))&&((this.isTeamMember == rhs.isTeamMember)||((this.isTeamMember!= null)&&this.isTeamMember.equals(rhs.isTeamMember))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
