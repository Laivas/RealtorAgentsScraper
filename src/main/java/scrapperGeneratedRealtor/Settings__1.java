
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
    "share_contacts",
    "full_access",
    "display_listings",
    "far_override",
    "show_stream",
    "terms_of_use",
    "has_dotrealtor",
    "display_sold_listings",
    "display_price_range",
    "display_ratings",
    "loaded_from_sb",
    "broker_data_feed_opt_out",
    "unsubscribe",
    "new_feature_popup_closed",
    "profile_wizard",
    "cfb_wizard_step",
    "recommendations"
})
@Generated("jsonschema2pojo")
public class Settings__1 {

    @JsonProperty("share_contacts")
    private Boolean shareContacts;
    @JsonProperty("full_access")
    private Boolean fullAccess;
    @JsonProperty("display_listings")
    private Boolean displayListings;
    @JsonProperty("far_override")
    private Boolean farOverride;
    @JsonProperty("show_stream")
    private Boolean showStream;
    @JsonProperty("terms_of_use")
    private Boolean termsOfUse;
    @JsonProperty("has_dotrealtor")
    private Boolean hasDotrealtor;
    @JsonProperty("display_sold_listings")
    private Boolean displaySoldListings;
    @JsonProperty("display_price_range")
    private Boolean displayPriceRange;
    @JsonProperty("display_ratings")
    private Boolean displayRatings;
    @JsonProperty("loaded_from_sb")
    private Boolean loadedFromSb;
    @JsonProperty("broker_data_feed_opt_out")
    private Boolean brokerDataFeedOptOut;
    @JsonProperty("unsubscribe")
    private Unsubscribe__1 unsubscribe;
    @JsonProperty("new_feature_popup_closed")
    private NewFeaturePopupClosed__1 newFeaturePopupClosed;
    @JsonProperty("profile_wizard")
    private ProfileWizard__1 profileWizard;
    @JsonProperty("cfb_wizard_step")
    private String cfbWizardStep;
    @JsonProperty("recommendations")
    private Recommendations__1 recommendations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("share_contacts")
    public Boolean getShareContacts() {
        return shareContacts;
    }

    @JsonProperty("share_contacts")
    public void setShareContacts(Boolean shareContacts) {
        this.shareContacts = shareContacts;
    }

    @JsonProperty("full_access")
    public Boolean getFullAccess() {
        return fullAccess;
    }

    @JsonProperty("full_access")
    public void setFullAccess(Boolean fullAccess) {
        this.fullAccess = fullAccess;
    }

    @JsonProperty("display_listings")
    public Boolean getDisplayListings() {
        return displayListings;
    }

    @JsonProperty("display_listings")
    public void setDisplayListings(Boolean displayListings) {
        this.displayListings = displayListings;
    }

    @JsonProperty("far_override")
    public Boolean getFarOverride() {
        return farOverride;
    }

    @JsonProperty("far_override")
    public void setFarOverride(Boolean farOverride) {
        this.farOverride = farOverride;
    }

    @JsonProperty("show_stream")
    public Boolean getShowStream() {
        return showStream;
    }

    @JsonProperty("show_stream")
    public void setShowStream(Boolean showStream) {
        this.showStream = showStream;
    }

    @JsonProperty("terms_of_use")
    public Boolean getTermsOfUse() {
        return termsOfUse;
    }

    @JsonProperty("terms_of_use")
    public void setTermsOfUse(Boolean termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    @JsonProperty("has_dotrealtor")
    public Boolean getHasDotrealtor() {
        return hasDotrealtor;
    }

    @JsonProperty("has_dotrealtor")
    public void setHasDotrealtor(Boolean hasDotrealtor) {
        this.hasDotrealtor = hasDotrealtor;
    }

    @JsonProperty("display_sold_listings")
    public Boolean getDisplaySoldListings() {
        return displaySoldListings;
    }

    @JsonProperty("display_sold_listings")
    public void setDisplaySoldListings(Boolean displaySoldListings) {
        this.displaySoldListings = displaySoldListings;
    }

    @JsonProperty("display_price_range")
    public Boolean getDisplayPriceRange() {
        return displayPriceRange;
    }

    @JsonProperty("display_price_range")
    public void setDisplayPriceRange(Boolean displayPriceRange) {
        this.displayPriceRange = displayPriceRange;
    }

    @JsonProperty("display_ratings")
    public Boolean getDisplayRatings() {
        return displayRatings;
    }

    @JsonProperty("display_ratings")
    public void setDisplayRatings(Boolean displayRatings) {
        this.displayRatings = displayRatings;
    }

    @JsonProperty("loaded_from_sb")
    public Boolean getLoadedFromSb() {
        return loadedFromSb;
    }

    @JsonProperty("loaded_from_sb")
    public void setLoadedFromSb(Boolean loadedFromSb) {
        this.loadedFromSb = loadedFromSb;
    }

    @JsonProperty("broker_data_feed_opt_out")
    public Boolean getBrokerDataFeedOptOut() {
        return brokerDataFeedOptOut;
    }

    @JsonProperty("broker_data_feed_opt_out")
    public void setBrokerDataFeedOptOut(Boolean brokerDataFeedOptOut) {
        this.brokerDataFeedOptOut = brokerDataFeedOptOut;
    }

    @JsonProperty("unsubscribe")
    public Unsubscribe__1 getUnsubscribe() {
        return unsubscribe;
    }

    @JsonProperty("unsubscribe")
    public void setUnsubscribe(Unsubscribe__1 unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    @JsonProperty("new_feature_popup_closed")
    public NewFeaturePopupClosed__1 getNewFeaturePopupClosed() {
        return newFeaturePopupClosed;
    }

    @JsonProperty("new_feature_popup_closed")
    public void setNewFeaturePopupClosed(NewFeaturePopupClosed__1 newFeaturePopupClosed) {
        this.newFeaturePopupClosed = newFeaturePopupClosed;
    }

    @JsonProperty("profile_wizard")
    public ProfileWizard__1 getProfileWizard() {
        return profileWizard;
    }

    @JsonProperty("profile_wizard")
    public void setProfileWizard(ProfileWizard__1 profileWizard) {
        this.profileWizard = profileWizard;
    }

    @JsonProperty("cfb_wizard_step")
    public String getCfbWizardStep() {
        return cfbWizardStep;
    }

    @JsonProperty("cfb_wizard_step")
    public void setCfbWizardStep(String cfbWizardStep) {
        this.cfbWizardStep = cfbWizardStep;
    }

    @JsonProperty("recommendations")
    public Recommendations__1 getRecommendations() {
        return recommendations;
    }

    @JsonProperty("recommendations")
    public void setRecommendations(Recommendations__1 recommendations) {
        this.recommendations = recommendations;
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
        sb.append(Settings__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shareContacts");
        sb.append('=');
        sb.append(((this.shareContacts == null)?"<null>":this.shareContacts));
        sb.append(',');
        sb.append("fullAccess");
        sb.append('=');
        sb.append(((this.fullAccess == null)?"<null>":this.fullAccess));
        sb.append(',');
        sb.append("displayListings");
        sb.append('=');
        sb.append(((this.displayListings == null)?"<null>":this.displayListings));
        sb.append(',');
        sb.append("farOverride");
        sb.append('=');
        sb.append(((this.farOverride == null)?"<null>":this.farOverride));
        sb.append(',');
        sb.append("showStream");
        sb.append('=');
        sb.append(((this.showStream == null)?"<null>":this.showStream));
        sb.append(',');
        sb.append("termsOfUse");
        sb.append('=');
        sb.append(((this.termsOfUse == null)?"<null>":this.termsOfUse));
        sb.append(',');
        sb.append("hasDotrealtor");
        sb.append('=');
        sb.append(((this.hasDotrealtor == null)?"<null>":this.hasDotrealtor));
        sb.append(',');
        sb.append("displaySoldListings");
        sb.append('=');
        sb.append(((this.displaySoldListings == null)?"<null>":this.displaySoldListings));
        sb.append(',');
        sb.append("displayPriceRange");
        sb.append('=');
        sb.append(((this.displayPriceRange == null)?"<null>":this.displayPriceRange));
        sb.append(',');
        sb.append("displayRatings");
        sb.append('=');
        sb.append(((this.displayRatings == null)?"<null>":this.displayRatings));
        sb.append(',');
        sb.append("loadedFromSb");
        sb.append('=');
        sb.append(((this.loadedFromSb == null)?"<null>":this.loadedFromSb));
        sb.append(',');
        sb.append("brokerDataFeedOptOut");
        sb.append('=');
        sb.append(((this.brokerDataFeedOptOut == null)?"<null>":this.brokerDataFeedOptOut));
        sb.append(',');
        sb.append("unsubscribe");
        sb.append('=');
        sb.append(((this.unsubscribe == null)?"<null>":this.unsubscribe));
        sb.append(',');
        sb.append("newFeaturePopupClosed");
        sb.append('=');
        sb.append(((this.newFeaturePopupClosed == null)?"<null>":this.newFeaturePopupClosed));
        sb.append(',');
        sb.append("profileWizard");
        sb.append('=');
        sb.append(((this.profileWizard == null)?"<null>":this.profileWizard));
        sb.append(',');
        sb.append("cfbWizardStep");
        sb.append('=');
        sb.append(((this.cfbWizardStep == null)?"<null>":this.cfbWizardStep));
        sb.append(',');
        sb.append("recommendations");
        sb.append('=');
        sb.append(((this.recommendations == null)?"<null>":this.recommendations));
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
        result = ((result* 31)+((this.loadedFromSb == null)? 0 :this.loadedFromSb.hashCode()));
        result = ((result* 31)+((this.profileWizard == null)? 0 :this.profileWizard.hashCode()));
        result = ((result* 31)+((this.displayPriceRange == null)? 0 :this.displayPriceRange.hashCode()));
        result = ((result* 31)+((this.fullAccess == null)? 0 :this.fullAccess.hashCode()));
        result = ((result* 31)+((this.brokerDataFeedOptOut == null)? 0 :this.brokerDataFeedOptOut.hashCode()));
        result = ((result* 31)+((this.newFeaturePopupClosed == null)? 0 :this.newFeaturePopupClosed.hashCode()));
        result = ((result* 31)+((this.hasDotrealtor == null)? 0 :this.hasDotrealtor.hashCode()));
        result = ((result* 31)+((this.recommendations == null)? 0 :this.recommendations.hashCode()));
        result = ((result* 31)+((this.showStream == null)? 0 :this.showStream.hashCode()));
        result = ((result* 31)+((this.displayListings == null)? 0 :this.displayListings.hashCode()));
        result = ((result* 31)+((this.termsOfUse == null)? 0 :this.termsOfUse.hashCode()));
        result = ((result* 31)+((this.unsubscribe == null)? 0 :this.unsubscribe.hashCode()));
        result = ((result* 31)+((this.cfbWizardStep == null)? 0 :this.cfbWizardStep.hashCode()));
        result = ((result* 31)+((this.shareContacts == null)? 0 :this.shareContacts.hashCode()));
        result = ((result* 31)+((this.displayRatings == null)? 0 :this.displayRatings.hashCode()));
        result = ((result* 31)+((this.displaySoldListings == null)? 0 :this.displaySoldListings.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.farOverride == null)? 0 :this.farOverride.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settings__1) == false) {
            return false;
        }
        Settings__1 rhs = ((Settings__1) other);
        return (((((((((((((((((((this.loadedFromSb == rhs.loadedFromSb)||((this.loadedFromSb!= null)&&this.loadedFromSb.equals(rhs.loadedFromSb)))&&((this.profileWizard == rhs.profileWizard)||((this.profileWizard!= null)&&this.profileWizard.equals(rhs.profileWizard))))&&((this.displayPriceRange == rhs.displayPriceRange)||((this.displayPriceRange!= null)&&this.displayPriceRange.equals(rhs.displayPriceRange))))&&((this.fullAccess == rhs.fullAccess)||((this.fullAccess!= null)&&this.fullAccess.equals(rhs.fullAccess))))&&((this.brokerDataFeedOptOut == rhs.brokerDataFeedOptOut)||((this.brokerDataFeedOptOut!= null)&&this.brokerDataFeedOptOut.equals(rhs.brokerDataFeedOptOut))))&&((this.newFeaturePopupClosed == rhs.newFeaturePopupClosed)||((this.newFeaturePopupClosed!= null)&&this.newFeaturePopupClosed.equals(rhs.newFeaturePopupClosed))))&&((this.hasDotrealtor == rhs.hasDotrealtor)||((this.hasDotrealtor!= null)&&this.hasDotrealtor.equals(rhs.hasDotrealtor))))&&((this.recommendations == rhs.recommendations)||((this.recommendations!= null)&&this.recommendations.equals(rhs.recommendations))))&&((this.showStream == rhs.showStream)||((this.showStream!= null)&&this.showStream.equals(rhs.showStream))))&&((this.displayListings == rhs.displayListings)||((this.displayListings!= null)&&this.displayListings.equals(rhs.displayListings))))&&((this.termsOfUse == rhs.termsOfUse)||((this.termsOfUse!= null)&&this.termsOfUse.equals(rhs.termsOfUse))))&&((this.unsubscribe == rhs.unsubscribe)||((this.unsubscribe!= null)&&this.unsubscribe.equals(rhs.unsubscribe))))&&((this.cfbWizardStep == rhs.cfbWizardStep)||((this.cfbWizardStep!= null)&&this.cfbWizardStep.equals(rhs.cfbWizardStep))))&&((this.shareContacts == rhs.shareContacts)||((this.shareContacts!= null)&&this.shareContacts.equals(rhs.shareContacts))))&&((this.displayRatings == rhs.displayRatings)||((this.displayRatings!= null)&&this.displayRatings.equals(rhs.displayRatings))))&&((this.displaySoldListings == rhs.displaySoldListings)||((this.displaySoldListings!= null)&&this.displaySoldListings.equals(rhs.displaySoldListings))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.farOverride == rhs.farOverride)||((this.farOverride!= null)&&this.farOverride.equals(rhs.farOverride))));
    }

}
