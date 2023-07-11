
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
    "farprofileloading",
    "profileloading",
    "error",
    "agentdetail",
    "socialloading",
    "profileData",
    "feedbackData",
    "recommendationData",
    "loading",
    "socialUpdateData",
    "fetchCheckinsData",
    "recommendationPostloading",
    "shareProfileResponse",
    "shareProfileloading",
    "seoData",
    "clickDetectorData",
    "validateSpamResponse",
    "reviewRatingResponseStatus"
})
@Generated("jsonschema2pojo")
public class Profile {

    @JsonProperty("status")
    private Object status;
    @JsonProperty("farprofileloading")
    private Boolean farprofileloading;
    @JsonProperty("profileloading")
    private Boolean profileloading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("agentdetail")
    private Object agentdetail;
    @JsonProperty("socialloading")
    private Boolean socialloading;
    @JsonProperty("profileData")
    private Object profileData;
    @JsonProperty("feedbackData")
    private Object feedbackData;
    @JsonProperty("recommendationData")
    private Object recommendationData;
    @JsonProperty("loading")
    private Object loading;
    @JsonProperty("socialUpdateData")
    private Object socialUpdateData;
    @JsonProperty("fetchCheckinsData")
    private Object fetchCheckinsData;
    @JsonProperty("recommendationPostloading")
    private Object recommendationPostloading;
    @JsonProperty("shareProfileResponse")
    private Object shareProfileResponse;
    @JsonProperty("shareProfileloading")
    private Object shareProfileloading;
    @JsonProperty("seoData")
    private Object seoData;
    @JsonProperty("clickDetectorData")
    private Object clickDetectorData;
    @JsonProperty("validateSpamResponse")
    private Object validateSpamResponse;
    @JsonProperty("reviewRatingResponseStatus")
    private Object reviewRatingResponseStatus;
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

    @JsonProperty("farprofileloading")
    public Boolean getFarprofileloading() {
        return farprofileloading;
    }

    @JsonProperty("farprofileloading")
    public void setFarprofileloading(Boolean farprofileloading) {
        this.farprofileloading = farprofileloading;
    }

    @JsonProperty("profileloading")
    public Boolean getProfileloading() {
        return profileloading;
    }

    @JsonProperty("profileloading")
    public void setProfileloading(Boolean profileloading) {
        this.profileloading = profileloading;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("agentdetail")
    public Object getAgentdetail() {
        return agentdetail;
    }

    @JsonProperty("agentdetail")
    public void setAgentdetail(Object agentdetail) {
        this.agentdetail = agentdetail;
    }

    @JsonProperty("socialloading")
    public Boolean getSocialloading() {
        return socialloading;
    }

    @JsonProperty("socialloading")
    public void setSocialloading(Boolean socialloading) {
        this.socialloading = socialloading;
    }

    @JsonProperty("profileData")
    public Object getProfileData() {
        return profileData;
    }

    @JsonProperty("profileData")
    public void setProfileData(Object profileData) {
        this.profileData = profileData;
    }

    @JsonProperty("feedbackData")
    public Object getFeedbackData() {
        return feedbackData;
    }

    @JsonProperty("feedbackData")
    public void setFeedbackData(Object feedbackData) {
        this.feedbackData = feedbackData;
    }

    @JsonProperty("recommendationData")
    public Object getRecommendationData() {
        return recommendationData;
    }

    @JsonProperty("recommendationData")
    public void setRecommendationData(Object recommendationData) {
        this.recommendationData = recommendationData;
    }

    @JsonProperty("loading")
    public Object getLoading() {
        return loading;
    }

    @JsonProperty("loading")
    public void setLoading(Object loading) {
        this.loading = loading;
    }

    @JsonProperty("socialUpdateData")
    public Object getSocialUpdateData() {
        return socialUpdateData;
    }

    @JsonProperty("socialUpdateData")
    public void setSocialUpdateData(Object socialUpdateData) {
        this.socialUpdateData = socialUpdateData;
    }

    @JsonProperty("fetchCheckinsData")
    public Object getFetchCheckinsData() {
        return fetchCheckinsData;
    }

    @JsonProperty("fetchCheckinsData")
    public void setFetchCheckinsData(Object fetchCheckinsData) {
        this.fetchCheckinsData = fetchCheckinsData;
    }

    @JsonProperty("recommendationPostloading")
    public Object getRecommendationPostloading() {
        return recommendationPostloading;
    }

    @JsonProperty("recommendationPostloading")
    public void setRecommendationPostloading(Object recommendationPostloading) {
        this.recommendationPostloading = recommendationPostloading;
    }

    @JsonProperty("shareProfileResponse")
    public Object getShareProfileResponse() {
        return shareProfileResponse;
    }

    @JsonProperty("shareProfileResponse")
    public void setShareProfileResponse(Object shareProfileResponse) {
        this.shareProfileResponse = shareProfileResponse;
    }

    @JsonProperty("shareProfileloading")
    public Object getShareProfileloading() {
        return shareProfileloading;
    }

    @JsonProperty("shareProfileloading")
    public void setShareProfileloading(Object shareProfileloading) {
        this.shareProfileloading = shareProfileloading;
    }

    @JsonProperty("seoData")
    public Object getSeoData() {
        return seoData;
    }

    @JsonProperty("seoData")
    public void setSeoData(Object seoData) {
        this.seoData = seoData;
    }

    @JsonProperty("clickDetectorData")
    public Object getClickDetectorData() {
        return clickDetectorData;
    }

    @JsonProperty("clickDetectorData")
    public void setClickDetectorData(Object clickDetectorData) {
        this.clickDetectorData = clickDetectorData;
    }

    @JsonProperty("validateSpamResponse")
    public Object getValidateSpamResponse() {
        return validateSpamResponse;
    }

    @JsonProperty("validateSpamResponse")
    public void setValidateSpamResponse(Object validateSpamResponse) {
        this.validateSpamResponse = validateSpamResponse;
    }

    @JsonProperty("reviewRatingResponseStatus")
    public Object getReviewRatingResponseStatus() {
        return reviewRatingResponseStatus;
    }

    @JsonProperty("reviewRatingResponseStatus")
    public void setReviewRatingResponseStatus(Object reviewRatingResponseStatus) {
        this.reviewRatingResponseStatus = reviewRatingResponseStatus;
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
        sb.append(Profile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("farprofileloading");
        sb.append('=');
        sb.append(((this.farprofileloading == null)?"<null>":this.farprofileloading));
        sb.append(',');
        sb.append("profileloading");
        sb.append('=');
        sb.append(((this.profileloading == null)?"<null>":this.profileloading));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("agentdetail");
        sb.append('=');
        sb.append(((this.agentdetail == null)?"<null>":this.agentdetail));
        sb.append(',');
        sb.append("socialloading");
        sb.append('=');
        sb.append(((this.socialloading == null)?"<null>":this.socialloading));
        sb.append(',');
        sb.append("profileData");
        sb.append('=');
        sb.append(((this.profileData == null)?"<null>":this.profileData));
        sb.append(',');
        sb.append("feedbackData");
        sb.append('=');
        sb.append(((this.feedbackData == null)?"<null>":this.feedbackData));
        sb.append(',');
        sb.append("recommendationData");
        sb.append('=');
        sb.append(((this.recommendationData == null)?"<null>":this.recommendationData));
        sb.append(',');
        sb.append("loading");
        sb.append('=');
        sb.append(((this.loading == null)?"<null>":this.loading));
        sb.append(',');
        sb.append("socialUpdateData");
        sb.append('=');
        sb.append(((this.socialUpdateData == null)?"<null>":this.socialUpdateData));
        sb.append(',');
        sb.append("fetchCheckinsData");
        sb.append('=');
        sb.append(((this.fetchCheckinsData == null)?"<null>":this.fetchCheckinsData));
        sb.append(',');
        sb.append("recommendationPostloading");
        sb.append('=');
        sb.append(((this.recommendationPostloading == null)?"<null>":this.recommendationPostloading));
        sb.append(',');
        sb.append("shareProfileResponse");
        sb.append('=');
        sb.append(((this.shareProfileResponse == null)?"<null>":this.shareProfileResponse));
        sb.append(',');
        sb.append("shareProfileloading");
        sb.append('=');
        sb.append(((this.shareProfileloading == null)?"<null>":this.shareProfileloading));
        sb.append(',');
        sb.append("seoData");
        sb.append('=');
        sb.append(((this.seoData == null)?"<null>":this.seoData));
        sb.append(',');
        sb.append("clickDetectorData");
        sb.append('=');
        sb.append(((this.clickDetectorData == null)?"<null>":this.clickDetectorData));
        sb.append(',');
        sb.append("validateSpamResponse");
        sb.append('=');
        sb.append(((this.validateSpamResponse == null)?"<null>":this.validateSpamResponse));
        sb.append(',');
        sb.append("reviewRatingResponseStatus");
        sb.append('=');
        sb.append(((this.reviewRatingResponseStatus == null)?"<null>":this.reviewRatingResponseStatus));
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
        result = ((result* 31)+((this.shareProfileResponse == null)? 0 :this.shareProfileResponse.hashCode()));
        result = ((result* 31)+((this.reviewRatingResponseStatus == null)? 0 :this.reviewRatingResponseStatus.hashCode()));
        result = ((result* 31)+((this.agentdetail == null)? 0 :this.agentdetail.hashCode()));
        result = ((result* 31)+((this.seoData == null)? 0 :this.seoData.hashCode()));
        result = ((result* 31)+((this.recommendationPostloading == null)? 0 :this.recommendationPostloading.hashCode()));
        result = ((result* 31)+((this.recommendationData == null)? 0 :this.recommendationData.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.loading == null)? 0 :this.loading.hashCode()));
        result = ((result* 31)+((this.clickDetectorData == null)? 0 :this.clickDetectorData.hashCode()));
        result = ((result* 31)+((this.feedbackData == null)? 0 :this.feedbackData.hashCode()));
        result = ((result* 31)+((this.shareProfileloading == null)? 0 :this.shareProfileloading.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.profileData == null)? 0 :this.profileData.hashCode()));
        result = ((result* 31)+((this.validateSpamResponse == null)? 0 :this.validateSpamResponse.hashCode()));
        result = ((result* 31)+((this.socialloading == null)? 0 :this.socialloading.hashCode()));
        result = ((result* 31)+((this.socialUpdateData == null)? 0 :this.socialUpdateData.hashCode()));
        result = ((result* 31)+((this.fetchCheckinsData == null)? 0 :this.fetchCheckinsData.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.farprofileloading == null)? 0 :this.farprofileloading.hashCode()));
        result = ((result* 31)+((this.profileloading == null)? 0 :this.profileloading.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Profile) == false) {
            return false;
        }
        Profile rhs = ((Profile) other);
        return (((((((((((((((((((((this.shareProfileResponse == rhs.shareProfileResponse)||((this.shareProfileResponse!= null)&&this.shareProfileResponse.equals(rhs.shareProfileResponse)))&&((this.reviewRatingResponseStatus == rhs.reviewRatingResponseStatus)||((this.reviewRatingResponseStatus!= null)&&this.reviewRatingResponseStatus.equals(rhs.reviewRatingResponseStatus))))&&((this.agentdetail == rhs.agentdetail)||((this.agentdetail!= null)&&this.agentdetail.equals(rhs.agentdetail))))&&((this.seoData == rhs.seoData)||((this.seoData!= null)&&this.seoData.equals(rhs.seoData))))&&((this.recommendationPostloading == rhs.recommendationPostloading)||((this.recommendationPostloading!= null)&&this.recommendationPostloading.equals(rhs.recommendationPostloading))))&&((this.recommendationData == rhs.recommendationData)||((this.recommendationData!= null)&&this.recommendationData.equals(rhs.recommendationData))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.loading == rhs.loading)||((this.loading!= null)&&this.loading.equals(rhs.loading))))&&((this.clickDetectorData == rhs.clickDetectorData)||((this.clickDetectorData!= null)&&this.clickDetectorData.equals(rhs.clickDetectorData))))&&((this.feedbackData == rhs.feedbackData)||((this.feedbackData!= null)&&this.feedbackData.equals(rhs.feedbackData))))&&((this.shareProfileloading == rhs.shareProfileloading)||((this.shareProfileloading!= null)&&this.shareProfileloading.equals(rhs.shareProfileloading))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.profileData == rhs.profileData)||((this.profileData!= null)&&this.profileData.equals(rhs.profileData))))&&((this.validateSpamResponse == rhs.validateSpamResponse)||((this.validateSpamResponse!= null)&&this.validateSpamResponse.equals(rhs.validateSpamResponse))))&&((this.socialloading == rhs.socialloading)||((this.socialloading!= null)&&this.socialloading.equals(rhs.socialloading))))&&((this.socialUpdateData == rhs.socialUpdateData)||((this.socialUpdateData!= null)&&this.socialUpdateData.equals(rhs.socialUpdateData))))&&((this.fetchCheckinsData == rhs.fetchCheckinsData)||((this.fetchCheckinsData!= null)&&this.fetchCheckinsData.equals(rhs.fetchCheckinsData))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.farprofileloading == rhs.farprofileloading)||((this.farprofileloading!= null)&&this.farprofileloading.equals(rhs.farprofileloading))))&&((this.profileloading == rhs.profileloading)||((this.profileloading!= null)&&this.profileloading.equals(rhs.profileloading))));
    }

}
