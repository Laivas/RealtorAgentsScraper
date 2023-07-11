
package scrapperGeneratedRealtor;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonIgnoreProperties(value={ "srp" }, allowGetters=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parser",
    "modal",
    "certification",
    "search",
    "didyoumean",
    "profile",
    "nearby",
    "srp",
    "askaquestion",
    "individualagent",
    "team",
    "udh",
    "hestiaSRP",
    "linkingModules",
    "geoLinks"
})
@Generated("jsonschema2pojo")
public class InitialReduxState {

    @JsonProperty("parser")
    private Parser parser;
    @JsonProperty("modal")
    private Modal modal;
    @JsonProperty("certification")
    private Certification certification;
    @JsonProperty("search")
    private Search search;
    @JsonProperty("didyoumean")
    private Didyoumean didyoumean;
    @JsonProperty("profile")
    private Profile profile;
    @JsonProperty("nearby")
    private Nearby nearby;
    @JsonProperty("srp")
    private Srp srp;
    @JsonProperty("askaquestion")
    private Askaquestion askaquestion;
    @JsonProperty("individualagent")
    private Individualagent individualagent;
    @JsonProperty("team")
    private Team team;
    @JsonProperty("udh")
    private Udh udh;
    @JsonProperty("hestiaSRP")
    private HestiaSRP hestiaSRP;
    @JsonProperty("linkingModules")
    private LinkingModules linkingModules;
    @JsonProperty("geoLinks")
    private GeoLinks geoLinks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("parser")
    public Parser getParser() {
        return parser;
    }

    @JsonProperty("parser")
    public void setParser(Parser parser) {
        this.parser = parser;
    }

    @JsonProperty("modal")
    public Modal getModal() {
        return modal;
    }

    @JsonProperty("modal")
    public void setModal(Modal modal) {
        this.modal = modal;
    }

    @JsonProperty("certification")
    public Certification getCertification() {
        return certification;
    }

    @JsonProperty("certification")
    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    @JsonProperty("search")
    public Search getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(Search search) {
        this.search = search;
    }

    @JsonProperty("didyoumean")
    public Didyoumean getDidyoumean() {
        return didyoumean;
    }

    @JsonProperty("didyoumean")
    public void setDidyoumean(Didyoumean didyoumean) {
        this.didyoumean = didyoumean;
    }

    @JsonProperty("profile")
    public Profile getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @JsonProperty("nearby")
    public Nearby getNearby() {
        return nearby;
    }

    @JsonProperty("nearby")
    public void setNearby(Nearby nearby) {
        this.nearby = nearby;
    }

    @JsonProperty("srp")
    public Srp getSrp() {
        return srp;
    }

    @JsonProperty("srp")
    public void setSrp(Srp srp) {
        this.srp = srp;
    }

    @JsonProperty("askaquestion")
    public Askaquestion getAskaquestion() {
        return askaquestion;
    }

    @JsonProperty("askaquestion")
    public void setAskaquestion(Askaquestion askaquestion) {
        this.askaquestion = askaquestion;
    }

    @JsonProperty("individualagent")
    public Individualagent getIndividualagent() {
        return individualagent;
    }

    @JsonProperty("individualagent")
    public void setIndividualagent(Individualagent individualagent) {
        this.individualagent = individualagent;
    }

    @JsonProperty("team")
    public Team getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Team team) {
        this.team = team;
    }

    @JsonProperty("udh")
    public Udh getUdh() {
        return udh;
    }

    @JsonProperty("udh")
    public void setUdh(Udh udh) {
        this.udh = udh;
    }

    @JsonProperty("hestiaSRP")
    public HestiaSRP getHestiaSRP() {
        return hestiaSRP;
    }

    @JsonProperty("hestiaSRP")
    public void setHestiaSRP(HestiaSRP hestiaSRP) {
        this.hestiaSRP = hestiaSRP;
    }

    @JsonProperty("linkingModules")
    public LinkingModules getLinkingModules() {
        return linkingModules;
    }

    @JsonProperty("linkingModules")
    public void setLinkingModules(LinkingModules linkingModules) {
        this.linkingModules = linkingModules;
    }

    @JsonProperty("geoLinks")
    public GeoLinks getGeoLinks() {
        return geoLinks;
    }

    @JsonProperty("geoLinks")
    public void setGeoLinks(GeoLinks geoLinks) {
        this.geoLinks = geoLinks;
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
        sb.append(InitialReduxState.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parser");
        sb.append('=');
        sb.append(((this.parser == null)?"<null>":this.parser));
        sb.append(',');
        sb.append("modal");
        sb.append('=');
        sb.append(((this.modal == null)?"<null>":this.modal));
        sb.append(',');
        sb.append("certification");
        sb.append('=');
        sb.append(((this.certification == null)?"<null>":this.certification));
        sb.append(',');
        sb.append("search");
        sb.append('=');
        sb.append(((this.search == null)?"<null>":this.search));
        sb.append(',');
        sb.append("didyoumean");
        sb.append('=');
        sb.append(((this.didyoumean == null)?"<null>":this.didyoumean));
        sb.append(',');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null)?"<null>":this.profile));
        sb.append(',');
        sb.append("nearby");
        sb.append('=');
        sb.append(((this.nearby == null)?"<null>":this.nearby));
        sb.append(',');
        sb.append("srp");
        sb.append('=');
        sb.append(((this.srp == null)?"<null>":this.srp));
        sb.append(',');
        sb.append("askaquestion");
        sb.append('=');
        sb.append(((this.askaquestion == null)?"<null>":this.askaquestion));
        sb.append(',');
        sb.append("individualagent");
        sb.append('=');
        sb.append(((this.individualagent == null)?"<null>":this.individualagent));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("udh");
        sb.append('=');
        sb.append(((this.udh == null)?"<null>":this.udh));
        sb.append(',');
        sb.append("hestiaSRP");
        sb.append('=');
        sb.append(((this.hestiaSRP == null)?"<null>":this.hestiaSRP));
        sb.append(',');
        sb.append("linkingModules");
        sb.append('=');
        sb.append(((this.linkingModules == null)?"<null>":this.linkingModules));
        sb.append(',');
        sb.append("geoLinks");
        sb.append('=');
        sb.append(((this.geoLinks == null)?"<null>":this.geoLinks));
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
        result = ((result* 31)+((this.askaquestion == null)? 0 :this.askaquestion.hashCode()));
        result = ((result* 31)+((this.linkingModules == null)? 0 :this.linkingModules.hashCode()));
        result = ((result* 31)+((this.profile == null)? 0 :this.profile.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.hestiaSRP == null)? 0 :this.hestiaSRP.hashCode()));
        result = ((result* 31)+((this.nearby == null)? 0 :this.nearby.hashCode()));
        result = ((result* 31)+((this.certification == null)? 0 :this.certification.hashCode()));
        result = ((result* 31)+((this.srp == null)? 0 :this.srp.hashCode()));
        result = ((result* 31)+((this.geoLinks == null)? 0 :this.geoLinks.hashCode()));
        result = ((result* 31)+((this.search == null)? 0 :this.search.hashCode()));
        result = ((result* 31)+((this.didyoumean == null)? 0 :this.didyoumean.hashCode()));
        result = ((result* 31)+((this.parser == null)? 0 :this.parser.hashCode()));
        result = ((result* 31)+((this.individualagent == null)? 0 :this.individualagent.hashCode()));
        result = ((result* 31)+((this.udh == null)? 0 :this.udh.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.modal == null)? 0 :this.modal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InitialReduxState) == false) {
            return false;
        }
        InitialReduxState rhs = ((InitialReduxState) other);
        return (((((((((((((((((this.askaquestion == rhs.askaquestion)||((this.askaquestion!= null)&&this.askaquestion.equals(rhs.askaquestion)))&&((this.linkingModules == rhs.linkingModules)||((this.linkingModules!= null)&&this.linkingModules.equals(rhs.linkingModules))))&&((this.profile == rhs.profile)||((this.profile!= null)&&this.profile.equals(rhs.profile))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.hestiaSRP == rhs.hestiaSRP)||((this.hestiaSRP!= null)&&this.hestiaSRP.equals(rhs.hestiaSRP))))&&((this.nearby == rhs.nearby)||((this.nearby!= null)&&this.nearby.equals(rhs.nearby))))&&((this.certification == rhs.certification)||((this.certification!= null)&&this.certification.equals(rhs.certification))))&&((this.srp == rhs.srp)||((this.srp!= null)&&this.srp.equals(rhs.srp))))&&((this.geoLinks == rhs.geoLinks)||((this.geoLinks!= null)&&this.geoLinks.equals(rhs.geoLinks))))&&((this.search == rhs.search)||((this.search!= null)&&this.search.equals(rhs.search))))&&((this.didyoumean == rhs.didyoumean)||((this.didyoumean!= null)&&this.didyoumean.equals(rhs.didyoumean))))&&((this.parser == rhs.parser)||((this.parser!= null)&&this.parser.equals(rhs.parser))))&&((this.individualagent == rhs.individualagent)||((this.individualagent!= null)&&this.individualagent.equals(rhs.individualagent))))&&((this.udh == rhs.udh)||((this.udh!= null)&&this.udh.equals(rhs.udh))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.modal == rhs.modal)||((this.modal!= null)&&this.modal.equals(rhs.modal))));
    }

}
