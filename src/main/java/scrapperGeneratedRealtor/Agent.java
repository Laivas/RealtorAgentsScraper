
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
    "address",
    "advertiser_id",
    "agent_rating",
    "background_photo",
    "broker",
    "description",
    "designations",
    "first_month",
    "first_name",
    "first_year",
    "has_photo",
    "href",
    "id",
    "is_realtor",
    "languages",
    "last_name",
    "last_updated",
    "marketing_area_cities",
    "mls",
    "nar_only",
    "nick_name",
    "nrds_id",
    "office",
    "party_id",
    "person_name",
    "phones",
    "photo",
    "recommendations_count",
    "review_count",
    "role",
    "served_areas",
    "settings",
    "slogan",
    "specializations",
    "title",
    "types",
    "user_languages",
    "web_url",
    "zips",
    "full_name",
    "name",
    "agent_type",
    "social_media",
    "feed_licenses",
    "for_sale_price",
    "recently_sold",
    "agent_team_details",
    "lang",
    "mls_history",
    "video",
    "areas_of_business",
    "product_code",
    "products",
    "raw_products",
    "data_flags"
})
@Generated("jsonschema2pojo")
public class Agent {

    @JsonProperty("address")
    private Address address;
    @JsonProperty("advertiser_id")
    private Integer advertiserId;
    @JsonProperty("agent_rating")
    private Integer agentRating;
    @JsonProperty("background_photo")
    private BackgroundPhoto backgroundPhoto;
    @JsonProperty("broker")
    private Broker broker;
    @JsonProperty("description")
    private String description;
    @JsonProperty("designations")
    private List<Designation> designations = new ArrayList<Designation>();
    @JsonProperty("first_month")
    private Integer firstMonth;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("first_year")
    private Integer firstYear;
    @JsonProperty("has_photo")
    private Boolean hasPhoto;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_realtor")
    private Boolean isRealtor;
    @JsonProperty("languages")
    private List<String> languages = new ArrayList<String>();
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("marketing_area_cities")
    private List<MarketingAreaCity> marketingAreaCities = new ArrayList<MarketingAreaCity>();
    @JsonProperty("mls")
    private List<Ml> mls = new ArrayList<Ml>();
    @JsonProperty("nar_only")
    private Integer narOnly;
    @JsonProperty("nick_name")
    private String nickName;
    @JsonProperty("nrds_id")
    private String nrdsId;
    @JsonProperty("office")
    private Office office;
    @JsonProperty("party_id")
    private Integer partyId;
    @JsonProperty("person_name")
    private String personName;
    @JsonProperty("phones")
    private List<Phone__1> phones = new ArrayList<Phone__1>();
    @JsonProperty("photo")
    private Photo__2 photo;
    @JsonProperty("recommendations_count")
    private Integer recommendationsCount;
    @JsonProperty("review_count")
    private Integer reviewCount;
    @JsonProperty("role")
    private String role;
    @JsonProperty("served_areas")
    private List<ServedArea> servedAreas = new ArrayList<ServedArea>();
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("slogan")
    private String slogan;
    @JsonProperty("specializations")
    private List<Specialization> specializations = new ArrayList<Specialization>();
    @JsonProperty("title")
    private String title;
    @JsonProperty("types")
    private String types;
    @JsonProperty("user_languages")
    private List<String> userLanguages = new ArrayList<String>();
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("zips")
    private List<String> zips = new ArrayList<String>();
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("agent_type")
    private List<String> agentType = new ArrayList<String>();
    @JsonProperty("social_media")
    private SocialMedia socialMedia;
    @JsonProperty("feed_licenses")
    private List<Object> feedLicenses = new ArrayList<Object>();
    @JsonProperty("for_sale_price")
    private ForSalePrice forSalePrice;
    @JsonProperty("recently_sold")
    private RecentlySold recentlySold;
    @JsonProperty("agent_team_details")
    private AgentTeamDetails agentTeamDetails;
    @JsonProperty("lang")
    private Lang lang;
    @JsonProperty("mls_history")
    private List<MlsHistory> mlsHistory = new ArrayList<MlsHistory>();
    @JsonProperty("video")
    private String video;
    @JsonProperty("areas_of_business")
    private List<Object> areasOfBusiness = new ArrayList<Object>();
    @JsonProperty("product_code")
    private Object productCode;
    @JsonProperty("products")
    private Object products;
    @JsonProperty("raw_products")
    private Object rawProducts;
    @JsonProperty("data_flags")
    private Object dataFlags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("advertiser_id")
    public Integer getAdvertiserId() {
        return advertiserId;
    }

    @JsonProperty("advertiser_id")
    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    @JsonProperty("agent_rating")
    public Integer getAgentRating() {
        return agentRating;
    }

    @JsonProperty("agent_rating")
    public void setAgentRating(Integer agentRating) {
        this.agentRating = agentRating;
    }

    @JsonProperty("background_photo")
    public BackgroundPhoto getBackgroundPhoto() {
        return backgroundPhoto;
    }

    @JsonProperty("background_photo")
    public void setBackgroundPhoto(BackgroundPhoto backgroundPhoto) {
        this.backgroundPhoto = backgroundPhoto;
    }

    @JsonProperty("broker")
    public Broker getBroker() {
        return broker;
    }

    @JsonProperty("broker")
    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("designations")
    public List<Designation> getDesignations() {
        return designations;
    }

    @JsonProperty("designations")
    public void setDesignations(List<Designation> designations) {
        this.designations = designations;
    }

    @JsonProperty("first_month")
    public Integer getFirstMonth() {
        return firstMonth;
    }

    @JsonProperty("first_month")
    public void setFirstMonth(Integer firstMonth) {
        this.firstMonth = firstMonth;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("first_year")
    public Integer getFirstYear() {
        return firstYear;
    }

    @JsonProperty("first_year")
    public void setFirstYear(Integer firstYear) {
        this.firstYear = firstYear;
    }

    @JsonProperty("has_photo")
    public Boolean getHasPhoto() {
        return hasPhoto;
    }

    @JsonProperty("has_photo")
    public void setHasPhoto(Boolean hasPhoto) {
        this.hasPhoto = hasPhoto;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("is_realtor")
    public Boolean getIsRealtor() {
        return isRealtor;
    }

    @JsonProperty("is_realtor")
    public void setIsRealtor(Boolean isRealtor) {
        this.isRealtor = isRealtor;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("marketing_area_cities")
    public List<MarketingAreaCity> getMarketingAreaCities() {
        return marketingAreaCities;
    }

    @JsonProperty("marketing_area_cities")
    public void setMarketingAreaCities(List<MarketingAreaCity> marketingAreaCities) {
        this.marketingAreaCities = marketingAreaCities;
    }

    @JsonProperty("mls")
    public List<Ml> getMls() {
        return mls;
    }

    @JsonProperty("mls")
    public void setMls(List<Ml> mls) {
        this.mls = mls;
    }

    @JsonProperty("nar_only")
    public Integer getNarOnly() {
        return narOnly;
    }

    @JsonProperty("nar_only")
    public void setNarOnly(Integer narOnly) {
        this.narOnly = narOnly;
    }

    @JsonProperty("nick_name")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("nick_name")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("nrds_id")
    public String getNrdsId() {
        return nrdsId;
    }

    @JsonProperty("nrds_id")
    public void setNrdsId(String nrdsId) {
        this.nrdsId = nrdsId;
    }

    @JsonProperty("office")
    public Office getOffice() {
        return office;
    }

    @JsonProperty("office")
    public void setOffice(Office office) {
        this.office = office;
    }

    @JsonProperty("party_id")
    public Integer getPartyId() {
        return partyId;
    }

    @JsonProperty("party_id")
    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("person_name")
    public String getPersonName() {
        return personName;
    }

    @JsonProperty("person_name")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @JsonProperty("phones")
    public List<Phone__1> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone__1> phones) {
        this.phones = phones;
    }

    @JsonProperty("photo")
    public Photo__2 getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Photo__2 photo) {
        this.photo = photo;
    }

    @JsonProperty("recommendations_count")
    public Integer getRecommendationsCount() {
        return recommendationsCount;
    }

    @JsonProperty("recommendations_count")
    public void setRecommendationsCount(Integer recommendationsCount) {
        this.recommendationsCount = recommendationsCount;
    }

    @JsonProperty("review_count")
    public Integer getReviewCount() {
        return reviewCount;
    }

    @JsonProperty("review_count")
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("served_areas")
    public List<ServedArea> getServedAreas() {
        return servedAreas;
    }

    @JsonProperty("served_areas")
    public void setServedAreas(List<ServedArea> servedAreas) {
        this.servedAreas = servedAreas;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @JsonProperty("slogan")
    public String getSlogan() {
        return slogan;
    }

    @JsonProperty("slogan")
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @JsonProperty("specializations")
    public List<Specialization> getSpecializations() {
        return specializations;
    }

    @JsonProperty("specializations")
    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("types")
    public String getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(String types) {
        this.types = types;
    }

    @JsonProperty("user_languages")
    public List<String> getUserLanguages() {
        return userLanguages;
    }

    @JsonProperty("user_languages")
    public void setUserLanguages(List<String> userLanguages) {
        this.userLanguages = userLanguages;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @JsonProperty("zips")
    public List<String> getZips() {
        return zips;
    }

    @JsonProperty("zips")
    public void setZips(List<String> zips) {
        this.zips = zips;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("agent_type")
    public List<String> getAgentType() {
        return agentType;
    }

    @JsonProperty("agent_type")
    public void setAgentType(List<String> agentType) {
        this.agentType = agentType;
    }

    @JsonProperty("social_media")
    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    @JsonProperty("social_media")
    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    @JsonProperty("feed_licenses")
    public List<Object> getFeedLicenses() {
        return feedLicenses;
    }

    @JsonProperty("feed_licenses")
    public void setFeedLicenses(List<Object> feedLicenses) {
        this.feedLicenses = feedLicenses;
    }

    @JsonProperty("for_sale_price")
    public ForSalePrice getForSalePrice() {
        return forSalePrice;
    }

    @JsonProperty("for_sale_price")
    public void setForSalePrice(ForSalePrice forSalePrice) {
        this.forSalePrice = forSalePrice;
    }

    @JsonProperty("recently_sold")
    public RecentlySold getRecentlySold() {
        return recentlySold;
    }

    @JsonProperty("recently_sold")
    public void setRecentlySold(RecentlySold recentlySold) {
        this.recentlySold = recentlySold;
    }

    @JsonProperty("agent_team_details")
    public AgentTeamDetails getAgentTeamDetails() {
        return agentTeamDetails;
    }

    @JsonProperty("agent_team_details")
    public void setAgentTeamDetails(AgentTeamDetails agentTeamDetails) {
        this.agentTeamDetails = agentTeamDetails;
    }

    @JsonProperty("lang")
    public Lang getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(Lang lang) {
        this.lang = lang;
    }

    @JsonProperty("mls_history")
    public List<MlsHistory> getMlsHistory() {
        return mlsHistory;
    }

    @JsonProperty("mls_history")
    public void setMlsHistory(List<MlsHistory> mlsHistory) {
        this.mlsHistory = mlsHistory;
    }

    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
    }

    @JsonProperty("areas_of_business")
    public List<Object> getAreasOfBusiness() {
        return areasOfBusiness;
    }

    @JsonProperty("areas_of_business")
    public void setAreasOfBusiness(List<Object> areasOfBusiness) {
        this.areasOfBusiness = areasOfBusiness;
    }

    @JsonProperty("product_code")
    public Object getProductCode() {
        return productCode;
    }

    @JsonProperty("product_code")
    public void setProductCode(Object productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("products")
    public Object getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(Object products) {
        this.products = products;
    }

    @JsonProperty("raw_products")
    public Object getRawProducts() {
        return rawProducts;
    }

    @JsonProperty("raw_products")
    public void setRawProducts(Object rawProducts) {
        this.rawProducts = rawProducts;
    }

    @JsonProperty("data_flags")
    public Object getDataFlags() {
        return dataFlags;
    }

    @JsonProperty("data_flags")
    public void setDataFlags(Object dataFlags) {
        this.dataFlags = dataFlags;
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
        sb.append(Agent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("advertiserId");
        sb.append('=');
        sb.append(((this.advertiserId == null)?"<null>":this.advertiserId));
        sb.append(',');
        sb.append("agentRating");
        sb.append('=');
        sb.append(((this.agentRating == null)?"<null>":this.agentRating));
        sb.append(',');
        sb.append("backgroundPhoto");
        sb.append('=');
        sb.append(((this.backgroundPhoto == null)?"<null>":this.backgroundPhoto));
        sb.append(',');
        sb.append("broker");
        sb.append('=');
        sb.append(((this.broker == null)?"<null>":this.broker));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("designations");
        sb.append('=');
        sb.append(((this.designations == null)?"<null>":this.designations));
        sb.append(',');
        sb.append("firstMonth");
        sb.append('=');
        sb.append(((this.firstMonth == null)?"<null>":this.firstMonth));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("firstYear");
        sb.append('=');
        sb.append(((this.firstYear == null)?"<null>":this.firstYear));
        sb.append(',');
        sb.append("hasPhoto");
        sb.append('=');
        sb.append(((this.hasPhoto == null)?"<null>":this.hasPhoto));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isRealtor");
        sb.append('=');
        sb.append(((this.isRealtor == null)?"<null>":this.isRealtor));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("marketingAreaCities");
        sb.append('=');
        sb.append(((this.marketingAreaCities == null)?"<null>":this.marketingAreaCities));
        sb.append(',');
        sb.append("mls");
        sb.append('=');
        sb.append(((this.mls == null)?"<null>":this.mls));
        sb.append(',');
        sb.append("narOnly");
        sb.append('=');
        sb.append(((this.narOnly == null)?"<null>":this.narOnly));
        sb.append(',');
        sb.append("nickName");
        sb.append('=');
        sb.append(((this.nickName == null)?"<null>":this.nickName));
        sb.append(',');
        sb.append("nrdsId");
        sb.append('=');
        sb.append(((this.nrdsId == null)?"<null>":this.nrdsId));
        sb.append(',');
        sb.append("office");
        sb.append('=');
        sb.append(((this.office == null)?"<null>":this.office));
        sb.append(',');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
        sb.append(',');
        sb.append("personName");
        sb.append('=');
        sb.append(((this.personName == null)?"<null>":this.personName));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("recommendationsCount");
        sb.append('=');
        sb.append(((this.recommendationsCount == null)?"<null>":this.recommendationsCount));
        sb.append(',');
        sb.append("reviewCount");
        sb.append('=');
        sb.append(((this.reviewCount == null)?"<null>":this.reviewCount));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("servedAreas");
        sb.append('=');
        sb.append(((this.servedAreas == null)?"<null>":this.servedAreas));
        sb.append(',');
        sb.append("settings");
        sb.append('=');
        sb.append(((this.settings == null)?"<null>":this.settings));
        sb.append(',');
        sb.append("slogan");
        sb.append('=');
        sb.append(((this.slogan == null)?"<null>":this.slogan));
        sb.append(',');
        sb.append("specializations");
        sb.append('=');
        sb.append(((this.specializations == null)?"<null>":this.specializations));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("userLanguages");
        sb.append('=');
        sb.append(((this.userLanguages == null)?"<null>":this.userLanguages));
        sb.append(',');
        sb.append("webUrl");
        sb.append('=');
        sb.append(((this.webUrl == null)?"<null>":this.webUrl));
        sb.append(',');
        sb.append("zips");
        sb.append('=');
        sb.append(((this.zips == null)?"<null>":this.zips));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("agentType");
        sb.append('=');
        sb.append(((this.agentType == null)?"<null>":this.agentType));
        sb.append(',');
        sb.append("socialMedia");
        sb.append('=');
        sb.append(((this.socialMedia == null)?"<null>":this.socialMedia));
        sb.append(',');
        sb.append("feedLicenses");
        sb.append('=');
        sb.append(((this.feedLicenses == null)?"<null>":this.feedLicenses));
        sb.append(',');
        sb.append("forSalePrice");
        sb.append('=');
        sb.append(((this.forSalePrice == null)?"<null>":this.forSalePrice));
        sb.append(',');
        sb.append("recentlySold");
        sb.append('=');
        sb.append(((this.recentlySold == null)?"<null>":this.recentlySold));
        sb.append(',');
        sb.append("agentTeamDetails");
        sb.append('=');
        sb.append(((this.agentTeamDetails == null)?"<null>":this.agentTeamDetails));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("mlsHistory");
        sb.append('=');
        sb.append(((this.mlsHistory == null)?"<null>":this.mlsHistory));
        sb.append(',');
        sb.append("video");
        sb.append('=');
        sb.append(((this.video == null)?"<null>":this.video));
        sb.append(',');
        sb.append("areasOfBusiness");
        sb.append('=');
        sb.append(((this.areasOfBusiness == null)?"<null>":this.areasOfBusiness));
        sb.append(',');
        sb.append("productCode");
        sb.append('=');
        sb.append(((this.productCode == null)?"<null>":this.productCode));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("rawProducts");
        sb.append('=');
        sb.append(((this.rawProducts == null)?"<null>":this.rawProducts));
        sb.append(',');
        sb.append("dataFlags");
        sb.append('=');
        sb.append(((this.dataFlags == null)?"<null>":this.dataFlags));
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
        result = ((result* 31)+((this.userLanguages == null)? 0 :this.userLanguages.hashCode()));
        result = ((result* 31)+((this.mlsHistory == null)? 0 :this.mlsHistory.hashCode()));
        result = ((result* 31)+((this.office == null)? 0 :this.office.hashCode()));
        result = ((result* 31)+((this.dataFlags == null)? 0 :this.dataFlags.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.recommendationsCount == null)? 0 :this.recommendationsCount.hashCode()));
        result = ((result* 31)+((this.designations == null)? 0 :this.designations.hashCode()));
        result = ((result* 31)+((this.reviewCount == null)? 0 :this.reviewCount.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        result = ((result* 31)+((this.settings == null)? 0 :this.settings.hashCode()));
        result = ((result* 31)+((this.feedLicenses == null)? 0 :this.feedLicenses.hashCode()));
        result = ((result* 31)+((this.nickName == null)? 0 :this.nickName.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.rawProducts == null)? 0 :this.rawProducts.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.hasPhoto == null)? 0 :this.hasPhoto.hashCode()));
        result = ((result* 31)+((this.narOnly == null)? 0 :this.narOnly.hashCode()));
        result = ((result* 31)+((this.isRealtor == null)? 0 :this.isRealtor.hashCode()));
        result = ((result* 31)+((this.mls == null)? 0 :this.mls.hashCode()));
        result = ((result* 31)+((this.webUrl == null)? 0 :this.webUrl.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.slogan == null)? 0 :this.slogan.hashCode()));
        result = ((result* 31)+((this.agentRating == null)? 0 :this.agentRating.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.agentType == null)? 0 :this.agentType.hashCode()));
        result = ((result* 31)+((this.forSalePrice == null)? 0 :this.forSalePrice.hashCode()));
        result = ((result* 31)+((this.backgroundPhoto == null)? 0 :this.backgroundPhoto.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.zips == null)? 0 :this.zips.hashCode()));
        result = ((result* 31)+((this.video == null)? 0 :this.video.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.areasOfBusiness == null)? 0 :this.areasOfBusiness.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.firstMonth == null)? 0 :this.firstMonth.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.agentTeamDetails == null)? 0 :this.agentTeamDetails.hashCode()));
        result = ((result* 31)+((this.firstYear == null)? 0 :this.firstYear.hashCode()));
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.specializations == null)? 0 :this.specializations.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.nrdsId == null)? 0 :this.nrdsId.hashCode()));
        result = ((result* 31)+((this.marketingAreaCities == null)? 0 :this.marketingAreaCities.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.broker == null)? 0 :this.broker.hashCode()));
        result = ((result* 31)+((this.servedAreas == null)? 0 :this.servedAreas.hashCode()));
        result = ((result* 31)+((this.advertiserId == null)? 0 :this.advertiserId.hashCode()));
        result = ((result* 31)+((this.personName == null)? 0 :this.personName.hashCode()));
        result = ((result* 31)+((this.recentlySold == null)? 0 :this.recentlySold.hashCode()));
        result = ((result* 31)+((this.productCode == null)? 0 :this.productCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Agent) == false) {
            return false;
        }
        Agent rhs = ((Agent) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.userLanguages == rhs.userLanguages)||((this.userLanguages!= null)&&this.userLanguages.equals(rhs.userLanguages)))&&((this.mlsHistory == rhs.mlsHistory)||((this.mlsHistory!= null)&&this.mlsHistory.equals(rhs.mlsHistory))))&&((this.office == rhs.office)||((this.office!= null)&&this.office.equals(rhs.office))))&&((this.dataFlags == rhs.dataFlags)||((this.dataFlags!= null)&&this.dataFlags.equals(rhs.dataFlags))))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.recommendationsCount == rhs.recommendationsCount)||((this.recommendationsCount!= null)&&this.recommendationsCount.equals(rhs.recommendationsCount))))&&((this.designations == rhs.designations)||((this.designations!= null)&&this.designations.equals(rhs.designations))))&&((this.reviewCount == rhs.reviewCount)||((this.reviewCount!= null)&&this.reviewCount.equals(rhs.reviewCount))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId))))&&((this.settings == rhs.settings)||((this.settings!= null)&&this.settings.equals(rhs.settings))))&&((this.feedLicenses == rhs.feedLicenses)||((this.feedLicenses!= null)&&this.feedLicenses.equals(rhs.feedLicenses))))&&((this.nickName == rhs.nickName)||((this.nickName!= null)&&this.nickName.equals(rhs.nickName))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.rawProducts == rhs.rawProducts)||((this.rawProducts!= null)&&this.rawProducts.equals(rhs.rawProducts))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.hasPhoto == rhs.hasPhoto)||((this.hasPhoto!= null)&&this.hasPhoto.equals(rhs.hasPhoto))))&&((this.narOnly == rhs.narOnly)||((this.narOnly!= null)&&this.narOnly.equals(rhs.narOnly))))&&((this.isRealtor == rhs.isRealtor)||((this.isRealtor!= null)&&this.isRealtor.equals(rhs.isRealtor))))&&((this.mls == rhs.mls)||((this.mls!= null)&&this.mls.equals(rhs.mls))))&&((this.webUrl == rhs.webUrl)||((this.webUrl!= null)&&this.webUrl.equals(rhs.webUrl))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.slogan == rhs.slogan)||((this.slogan!= null)&&this.slogan.equals(rhs.slogan))))&&((this.agentRating == rhs.agentRating)||((this.agentRating!= null)&&this.agentRating.equals(rhs.agentRating))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role))))&&((this.agentType == rhs.agentType)||((this.agentType!= null)&&this.agentType.equals(rhs.agentType))))&&((this.forSalePrice == rhs.forSalePrice)||((this.forSalePrice!= null)&&this.forSalePrice.equals(rhs.forSalePrice))))&&((this.backgroundPhoto == rhs.backgroundPhoto)||((this.backgroundPhoto!= null)&&this.backgroundPhoto.equals(rhs.backgroundPhoto))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.zips == rhs.zips)||((this.zips!= null)&&this.zips.equals(rhs.zips))))&&((this.video == rhs.video)||((this.video!= null)&&this.video.equals(rhs.video))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.areasOfBusiness == rhs.areasOfBusiness)||((this.areasOfBusiness!= null)&&this.areasOfBusiness.equals(rhs.areasOfBusiness))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.firstMonth == rhs.firstMonth)||((this.firstMonth!= null)&&this.firstMonth.equals(rhs.firstMonth))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.agentTeamDetails == rhs.agentTeamDetails)||((this.agentTeamDetails!= null)&&this.agentTeamDetails.equals(rhs.agentTeamDetails))))&&((this.firstYear == rhs.firstYear)||((this.firstYear!= null)&&this.firstYear.equals(rhs.firstYear))))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.specializations == rhs.specializations)||((this.specializations!= null)&&this.specializations.equals(rhs.specializations))))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.nrdsId == rhs.nrdsId)||((this.nrdsId!= null)&&this.nrdsId.equals(rhs.nrdsId))))&&((this.marketingAreaCities == rhs.marketingAreaCities)||((this.marketingAreaCities!= null)&&this.marketingAreaCities.equals(rhs.marketingAreaCities))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.broker == rhs.broker)||((this.broker!= null)&&this.broker.equals(rhs.broker))))&&((this.servedAreas == rhs.servedAreas)||((this.servedAreas!= null)&&this.servedAreas.equals(rhs.servedAreas))))&&((this.advertiserId == rhs.advertiserId)||((this.advertiserId!= null)&&this.advertiserId.equals(rhs.advertiserId))))&&((this.personName == rhs.personName)||((this.personName!= null)&&this.personName.equals(rhs.personName))))&&((this.recentlySold == rhs.recentlySold)||((this.recentlySold!= null)&&this.recentlySold.equals(rhs.recentlySold))))&&((this.productCode == rhs.productCode)||((this.productCode!= null)&&this.productCode.equals(rhs.productCode))));
    }

}
