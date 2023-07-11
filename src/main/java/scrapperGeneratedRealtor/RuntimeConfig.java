
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
    "appVersion",
    "awsAccount",
    "JWT_SECRET",
    "IDENTITY_API_KEY",
    "REALTOR_MAP_KEY",
    "DOT_REALTOR_MAP_KEY",
    "RECAPTCHA_KEY",
    "RATING_REVIEW_USER_KEY",
    "PROFILE_SEARCH_API_PROSOFT_TOKEN",
    "PROFILE_DOT_REALTOR_SEARCH_TOKEN"
})
@Generated("jsonschema2pojo")
public class RuntimeConfig {

    @JsonProperty("appVersion")
    private String appVersion;
    @JsonProperty("awsAccount")
    private String awsAccount;
    @JsonProperty("JWT_SECRET")
    private String jwtSecret;
    @JsonProperty("IDENTITY_API_KEY")
    private String identityApiKey;
    @JsonProperty("REALTOR_MAP_KEY")
    private String realtorMapKey;
    @JsonProperty("DOT_REALTOR_MAP_KEY")
    private String dotRealtorMapKey;
    @JsonProperty("RECAPTCHA_KEY")
    private String recaptchaKey;
    @JsonProperty("RATING_REVIEW_USER_KEY")
    private String ratingReviewUserKey;
    @JsonProperty("PROFILE_SEARCH_API_PROSOFT_TOKEN")
    private String profileSearchApiProsoftToken;
    @JsonProperty("PROFILE_DOT_REALTOR_SEARCH_TOKEN")
    private String profileDotRealtorSearchToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("appVersion")
    public String getAppVersion() {
        return appVersion;
    }

    @JsonProperty("appVersion")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @JsonProperty("awsAccount")
    public String getAwsAccount() {
        return awsAccount;
    }

    @JsonProperty("awsAccount")
    public void setAwsAccount(String awsAccount) {
        this.awsAccount = awsAccount;
    }

    @JsonProperty("JWT_SECRET")
    public String getJwtSecret() {
        return jwtSecret;
    }

    @JsonProperty("JWT_SECRET")
    public void setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
    }

    @JsonProperty("IDENTITY_API_KEY")
    public String getIdentityApiKey() {
        return identityApiKey;
    }

    @JsonProperty("IDENTITY_API_KEY")
    public void setIdentityApiKey(String identityApiKey) {
        this.identityApiKey = identityApiKey;
    }

    @JsonProperty("REALTOR_MAP_KEY")
    public String getRealtorMapKey() {
        return realtorMapKey;
    }

    @JsonProperty("REALTOR_MAP_KEY")
    public void setRealtorMapKey(String realtorMapKey) {
        this.realtorMapKey = realtorMapKey;
    }

    @JsonProperty("DOT_REALTOR_MAP_KEY")
    public String getDotRealtorMapKey() {
        return dotRealtorMapKey;
    }

    @JsonProperty("DOT_REALTOR_MAP_KEY")
    public void setDotRealtorMapKey(String dotRealtorMapKey) {
        this.dotRealtorMapKey = dotRealtorMapKey;
    }

    @JsonProperty("RECAPTCHA_KEY")
    public String getRecaptchaKey() {
        return recaptchaKey;
    }

    @JsonProperty("RECAPTCHA_KEY")
    public void setRecaptchaKey(String recaptchaKey) {
        this.recaptchaKey = recaptchaKey;
    }

    @JsonProperty("RATING_REVIEW_USER_KEY")
    public String getRatingReviewUserKey() {
        return ratingReviewUserKey;
    }

    @JsonProperty("RATING_REVIEW_USER_KEY")
    public void setRatingReviewUserKey(String ratingReviewUserKey) {
        this.ratingReviewUserKey = ratingReviewUserKey;
    }

    @JsonProperty("PROFILE_SEARCH_API_PROSOFT_TOKEN")
    public String getProfileSearchApiProsoftToken() {
        return profileSearchApiProsoftToken;
    }

    @JsonProperty("PROFILE_SEARCH_API_PROSOFT_TOKEN")
    public void setProfileSearchApiProsoftToken(String profileSearchApiProsoftToken) {
        this.profileSearchApiProsoftToken = profileSearchApiProsoftToken;
    }

    @JsonProperty("PROFILE_DOT_REALTOR_SEARCH_TOKEN")
    public String getProfileDotRealtorSearchToken() {
        return profileDotRealtorSearchToken;
    }

    @JsonProperty("PROFILE_DOT_REALTOR_SEARCH_TOKEN")
    public void setProfileDotRealtorSearchToken(String profileDotRealtorSearchToken) {
        this.profileDotRealtorSearchToken = profileDotRealtorSearchToken;
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
        sb.append(RuntimeConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appVersion");
        sb.append('=');
        sb.append(((this.appVersion == null)?"<null>":this.appVersion));
        sb.append(',');
        sb.append("awsAccount");
        sb.append('=');
        sb.append(((this.awsAccount == null)?"<null>":this.awsAccount));
        sb.append(',');
        sb.append("jwtSecret");
        sb.append('=');
        sb.append(((this.jwtSecret == null)?"<null>":this.jwtSecret));
        sb.append(',');
        sb.append("identityApiKey");
        sb.append('=');
        sb.append(((this.identityApiKey == null)?"<null>":this.identityApiKey));
        sb.append(',');
        sb.append("realtorMapKey");
        sb.append('=');
        sb.append(((this.realtorMapKey == null)?"<null>":this.realtorMapKey));
        sb.append(',');
        sb.append("dotRealtorMapKey");
        sb.append('=');
        sb.append(((this.dotRealtorMapKey == null)?"<null>":this.dotRealtorMapKey));
        sb.append(',');
        sb.append("recaptchaKey");
        sb.append('=');
        sb.append(((this.recaptchaKey == null)?"<null>":this.recaptchaKey));
        sb.append(',');
        sb.append("ratingReviewUserKey");
        sb.append('=');
        sb.append(((this.ratingReviewUserKey == null)?"<null>":this.ratingReviewUserKey));
        sb.append(',');
        sb.append("profileSearchApiProsoftToken");
        sb.append('=');
        sb.append(((this.profileSearchApiProsoftToken == null)?"<null>":this.profileSearchApiProsoftToken));
        sb.append(',');
        sb.append("profileDotRealtorSearchToken");
        sb.append('=');
        sb.append(((this.profileDotRealtorSearchToken == null)?"<null>":this.profileDotRealtorSearchToken));
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
        result = ((result* 31)+((this.recaptchaKey == null)? 0 :this.recaptchaKey.hashCode()));
        result = ((result* 31)+((this.realtorMapKey == null)? 0 :this.realtorMapKey.hashCode()));
        result = ((result* 31)+((this.appVersion == null)? 0 :this.appVersion.hashCode()));
        result = ((result* 31)+((this.ratingReviewUserKey == null)? 0 :this.ratingReviewUserKey.hashCode()));
        result = ((result* 31)+((this.jwtSecret == null)? 0 :this.jwtSecret.hashCode()));
        result = ((result* 31)+((this.awsAccount == null)? 0 :this.awsAccount.hashCode()));
        result = ((result* 31)+((this.identityApiKey == null)? 0 :this.identityApiKey.hashCode()));
        result = ((result* 31)+((this.dotRealtorMapKey == null)? 0 :this.dotRealtorMapKey.hashCode()));
        result = ((result* 31)+((this.profileDotRealtorSearchToken == null)? 0 :this.profileDotRealtorSearchToken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.profileSearchApiProsoftToken == null)? 0 :this.profileSearchApiProsoftToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuntimeConfig) == false) {
            return false;
        }
        RuntimeConfig rhs = ((RuntimeConfig) other);
        return ((((((((((((this.recaptchaKey == rhs.recaptchaKey)||((this.recaptchaKey!= null)&&this.recaptchaKey.equals(rhs.recaptchaKey)))&&((this.realtorMapKey == rhs.realtorMapKey)||((this.realtorMapKey!= null)&&this.realtorMapKey.equals(rhs.realtorMapKey))))&&((this.appVersion == rhs.appVersion)||((this.appVersion!= null)&&this.appVersion.equals(rhs.appVersion))))&&((this.ratingReviewUserKey == rhs.ratingReviewUserKey)||((this.ratingReviewUserKey!= null)&&this.ratingReviewUserKey.equals(rhs.ratingReviewUserKey))))&&((this.jwtSecret == rhs.jwtSecret)||((this.jwtSecret!= null)&&this.jwtSecret.equals(rhs.jwtSecret))))&&((this.awsAccount == rhs.awsAccount)||((this.awsAccount!= null)&&this.awsAccount.equals(rhs.awsAccount))))&&((this.identityApiKey == rhs.identityApiKey)||((this.identityApiKey!= null)&&this.identityApiKey.equals(rhs.identityApiKey))))&&((this.dotRealtorMapKey == rhs.dotRealtorMapKey)||((this.dotRealtorMapKey!= null)&&this.dotRealtorMapKey.equals(rhs.dotRealtorMapKey))))&&((this.profileDotRealtorSearchToken == rhs.profileDotRealtorSearchToken)||((this.profileDotRealtorSearchToken!= null)&&this.profileDotRealtorSearchToken.equals(rhs.profileDotRealtorSearchToken))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.profileSearchApiProsoftToken == rhs.profileSearchApiProsoftToken)||((this.profileSearchApiProsoftToken!= null)&&this.profileSearchApiProsoftToken.equals(rhs.profileSearchApiProsoftToken))));
    }

}
