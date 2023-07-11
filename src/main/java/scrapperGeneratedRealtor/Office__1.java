
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
    "name",
    "mls",
    "phones",
    "phone_list",
    "photo",
    "slogan",
    "website",
    "video",
    "fulfillment_id",
    "address",
    "nrds_id",
    "feed_licenses",
    "licenses",
    "party_id"
})
@Generated("jsonschema2pojo")
public class Office__1 {

    @JsonProperty("name")
    private String name;
    @JsonProperty("mls")
    private List<Ml__3> mls = new ArrayList<Ml__3>();
    @JsonProperty("phones")
    private List<Phone__2> phones = new ArrayList<Phone__2>();
    @JsonProperty("phone_list")
    private PhoneList__1 phoneList;
    @JsonProperty("photo")
    private Photo__4 photo;
    @JsonProperty("slogan")
    private Object slogan;
    @JsonProperty("website")
    private Object website;
    @JsonProperty("video")
    private Object video;
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    @JsonProperty("address")
    private Address__3 address;
    @JsonProperty("nrds_id")
    private String nrdsId;
    @JsonProperty("feed_licenses")
    private List<Object> feedLicenses = new ArrayList<Object>();
    @JsonProperty("licenses")
    private List<Object> licenses = new ArrayList<Object>();
    @JsonProperty("party_id")
    private String partyId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("mls")
    public List<Ml__3> getMls() {
        return mls;
    }

    @JsonProperty("mls")
    public void setMls(List<Ml__3> mls) {
        this.mls = mls;
    }

    @JsonProperty("phones")
    public List<Phone__2> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone__2> phones) {
        this.phones = phones;
    }

    @JsonProperty("phone_list")
    public PhoneList__1 getPhoneList() {
        return phoneList;
    }

    @JsonProperty("phone_list")
    public void setPhoneList(PhoneList__1 phoneList) {
        this.phoneList = phoneList;
    }

    @JsonProperty("photo")
    public Photo__4 getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Photo__4 photo) {
        this.photo = photo;
    }

    @JsonProperty("slogan")
    public Object getSlogan() {
        return slogan;
    }

    @JsonProperty("slogan")
    public void setSlogan(Object slogan) {
        this.slogan = slogan;
    }

    @JsonProperty("website")
    public Object getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(Object website) {
        this.website = website;
    }

    @JsonProperty("video")
    public Object getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Object video) {
        this.video = video;
    }

    @JsonProperty("fulfillment_id")
    public Integer getFulfillmentId() {
        return fulfillmentId;
    }

    @JsonProperty("fulfillment_id")
    public void setFulfillmentId(Integer fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    @JsonProperty("address")
    public Address__3 getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address__3 address) {
        this.address = address;
    }

    @JsonProperty("nrds_id")
    public String getNrdsId() {
        return nrdsId;
    }

    @JsonProperty("nrds_id")
    public void setNrdsId(String nrdsId) {
        this.nrdsId = nrdsId;
    }

    @JsonProperty("feed_licenses")
    public List<Object> getFeedLicenses() {
        return feedLicenses;
    }

    @JsonProperty("feed_licenses")
    public void setFeedLicenses(List<Object> feedLicenses) {
        this.feedLicenses = feedLicenses;
    }

    @JsonProperty("licenses")
    public List<Object> getLicenses() {
        return licenses;
    }

    @JsonProperty("licenses")
    public void setLicenses(List<Object> licenses) {
        this.licenses = licenses;
    }

    @JsonProperty("party_id")
    public String getPartyId() {
        return partyId;
    }

    @JsonProperty("party_id")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
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
        sb.append(Office__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("mls");
        sb.append('=');
        sb.append(((this.mls == null)?"<null>":this.mls));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("phoneList");
        sb.append('=');
        sb.append(((this.phoneList == null)?"<null>":this.phoneList));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("slogan");
        sb.append('=');
        sb.append(((this.slogan == null)?"<null>":this.slogan));
        sb.append(',');
        sb.append("website");
        sb.append('=');
        sb.append(((this.website == null)?"<null>":this.website));
        sb.append(',');
        sb.append("video");
        sb.append('=');
        sb.append(((this.video == null)?"<null>":this.video));
        sb.append(',');
        sb.append("fulfillmentId");
        sb.append('=');
        sb.append(((this.fulfillmentId == null)?"<null>":this.fulfillmentId));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("nrdsId");
        sb.append('=');
        sb.append(((this.nrdsId == null)?"<null>":this.nrdsId));
        sb.append(',');
        sb.append("feedLicenses");
        sb.append('=');
        sb.append(((this.feedLicenses == null)?"<null>":this.feedLicenses));
        sb.append(',');
        sb.append("licenses");
        sb.append('=');
        sb.append(((this.licenses == null)?"<null>":this.licenses));
        sb.append(',');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
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
        result = ((result* 31)+((this.fulfillmentId == null)? 0 :this.fulfillmentId.hashCode()));
        result = ((result* 31)+((this.feedLicenses == null)? 0 :this.feedLicenses.hashCode()));
        result = ((result* 31)+((this.website == null)? 0 :this.website.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.nrdsId == null)? 0 :this.nrdsId.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.phoneList == null)? 0 :this.phoneList.hashCode()));
        result = ((result* 31)+((this.video == null)? 0 :this.video.hashCode()));
        result = ((result* 31)+((this.licenses == null)? 0 :this.licenses.hashCode()));
        result = ((result* 31)+((this.mls == null)? 0 :this.mls.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        result = ((result* 31)+((this.slogan == null)? 0 :this.slogan.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Office__1) == false) {
            return false;
        }
        Office__1 rhs = ((Office__1) other);
        return ((((((((((((((((this.fulfillmentId == rhs.fulfillmentId)||((this.fulfillmentId!= null)&&this.fulfillmentId.equals(rhs.fulfillmentId)))&&((this.feedLicenses == rhs.feedLicenses)||((this.feedLicenses!= null)&&this.feedLicenses.equals(rhs.feedLicenses))))&&((this.website == rhs.website)||((this.website!= null)&&this.website.equals(rhs.website))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.nrdsId == rhs.nrdsId)||((this.nrdsId!= null)&&this.nrdsId.equals(rhs.nrdsId))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.phoneList == rhs.phoneList)||((this.phoneList!= null)&&this.phoneList.equals(rhs.phoneList))))&&((this.video == rhs.video)||((this.video!= null)&&this.video.equals(rhs.video))))&&((this.licenses == rhs.licenses)||((this.licenses!= null)&&this.licenses.equals(rhs.licenses))))&&((this.mls == rhs.mls)||((this.mls!= null)&&this.mls.equals(rhs.mls))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId))))&&((this.slogan == rhs.slogan)||((this.slogan!= null)&&this.slogan.equals(rhs.slogan))));
    }

}
