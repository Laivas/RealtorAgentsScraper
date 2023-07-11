
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
    "agent_left_nav_avatar_to_profile",
    "listingmanager-movephoto",
    "listingmanager-shared-dismissed"
})
@Generated("jsonschema2pojo")
public class NewFeaturePopupClosed__1 {

    @JsonProperty("agent_left_nav_avatar_to_profile")
    private Boolean agentLeftNavAvatarToProfile;
    @JsonProperty("listingmanager-movephoto")
    private Boolean listingmanagerMovephoto;
    @JsonProperty("listingmanager-shared-dismissed")
    private Boolean listingmanagerSharedDismissed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("agent_left_nav_avatar_to_profile")
    public Boolean getAgentLeftNavAvatarToProfile() {
        return agentLeftNavAvatarToProfile;
    }

    @JsonProperty("agent_left_nav_avatar_to_profile")
    public void setAgentLeftNavAvatarToProfile(Boolean agentLeftNavAvatarToProfile) {
        this.agentLeftNavAvatarToProfile = agentLeftNavAvatarToProfile;
    }

    @JsonProperty("listingmanager-movephoto")
    public Boolean getListingmanagerMovephoto() {
        return listingmanagerMovephoto;
    }

    @JsonProperty("listingmanager-movephoto")
    public void setListingmanagerMovephoto(Boolean listingmanagerMovephoto) {
        this.listingmanagerMovephoto = listingmanagerMovephoto;
    }

    @JsonProperty("listingmanager-shared-dismissed")
    public Boolean getListingmanagerSharedDismissed() {
        return listingmanagerSharedDismissed;
    }

    @JsonProperty("listingmanager-shared-dismissed")
    public void setListingmanagerSharedDismissed(Boolean listingmanagerSharedDismissed) {
        this.listingmanagerSharedDismissed = listingmanagerSharedDismissed;
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
        sb.append(NewFeaturePopupClosed__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("agentLeftNavAvatarToProfile");
        sb.append('=');
        sb.append(((this.agentLeftNavAvatarToProfile == null)?"<null>":this.agentLeftNavAvatarToProfile));
        sb.append(',');
        sb.append("listingmanagerMovephoto");
        sb.append('=');
        sb.append(((this.listingmanagerMovephoto == null)?"<null>":this.listingmanagerMovephoto));
        sb.append(',');
        sb.append("listingmanagerSharedDismissed");
        sb.append('=');
        sb.append(((this.listingmanagerSharedDismissed == null)?"<null>":this.listingmanagerSharedDismissed));
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
        result = ((result* 31)+((this.listingmanagerMovephoto == null)? 0 :this.listingmanagerMovephoto.hashCode()));
        result = ((result* 31)+((this.listingmanagerSharedDismissed == null)? 0 :this.listingmanagerSharedDismissed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.agentLeftNavAvatarToProfile == null)? 0 :this.agentLeftNavAvatarToProfile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewFeaturePopupClosed__1) == false) {
            return false;
        }
        NewFeaturePopupClosed__1 rhs = ((NewFeaturePopupClosed__1) other);
        return (((((this.listingmanagerMovephoto == rhs.listingmanagerMovephoto)||((this.listingmanagerMovephoto!= null)&&this.listingmanagerMovephoto.equals(rhs.listingmanagerMovephoto)))&&((this.listingmanagerSharedDismissed == rhs.listingmanagerSharedDismissed)||((this.listingmanagerSharedDismissed!= null)&&this.listingmanagerSharedDismissed.equals(rhs.listingmanagerSharedDismissed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.agentLeftNavAvatarToProfile == rhs.agentLeftNavAvatarToProfile)||((this.agentLeftNavAvatarToProfile!= null)&&this.agentLeftNavAvatarToProfile.equals(rhs.agentLeftNavAvatarToProfile))));
    }

}
