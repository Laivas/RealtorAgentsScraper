
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
    "props",
    "page",
    "query",
    "buildId",
    "assetPrefix",
    "runtimeConfig",
    "isFallback",
    "customServer",
    "gip",
    "appGip",
    "scriptLoader"
})
@Generated("jsonschema2pojo")
public class RealtorsData {

    @JsonProperty("props")
    private Props props;
    @JsonProperty("page")
    private String page;
    @JsonProperty("query")
    private Query__1 query;
    @JsonProperty("buildId")
    private String buildId;
    @JsonProperty("assetPrefix")
    private String assetPrefix;
    @JsonProperty("runtimeConfig")
    private RuntimeConfig runtimeConfig;
    @JsonProperty("isFallback")
    private Boolean isFallback;
    @JsonProperty("customServer")
    private Boolean customServer;
    @JsonProperty("gip")
    private Boolean gip;
    @JsonProperty("appGip")
    private Boolean appGip;
    @JsonProperty("scriptLoader")
    private List<Object> scriptLoader = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("props")
    public Props getProps() {
        return props;
    }

    @JsonProperty("props")
    public void setProps(Props props) {
        this.props = props;
    }

    @JsonProperty("page")
    public String getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(String page) {
        this.page = page;
    }

    @JsonProperty("query")
    public Query__1 getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query__1 query) {
        this.query = query;
    }

    @JsonProperty("buildId")
    public String getBuildId() {
        return buildId;
    }

    @JsonProperty("buildId")
    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    @JsonProperty("assetPrefix")
    public String getAssetPrefix() {
        return assetPrefix;
    }

    @JsonProperty("assetPrefix")
    public void setAssetPrefix(String assetPrefix) {
        this.assetPrefix = assetPrefix;
    }

    @JsonProperty("runtimeConfig")
    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    @JsonProperty("runtimeConfig")
    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    @JsonProperty("isFallback")
    public Boolean getIsFallback() {
        return isFallback;
    }

    @JsonProperty("isFallback")
    public void setIsFallback(Boolean isFallback) {
        this.isFallback = isFallback;
    }

    @JsonProperty("customServer")
    public Boolean getCustomServer() {
        return customServer;
    }

    @JsonProperty("customServer")
    public void setCustomServer(Boolean customServer) {
        this.customServer = customServer;
    }

    @JsonProperty("gip")
    public Boolean getGip() {
        return gip;
    }

    @JsonProperty("gip")
    public void setGip(Boolean gip) {
        this.gip = gip;
    }

    @JsonProperty("appGip")
    public Boolean getAppGip() {
        return appGip;
    }

    @JsonProperty("appGip")
    public void setAppGip(Boolean appGip) {
        this.appGip = appGip;
    }

    @JsonProperty("scriptLoader")
    public List<Object> getScriptLoader() {
        return scriptLoader;
    }

    @JsonProperty("scriptLoader")
    public void setScriptLoader(List<Object> scriptLoader) {
        this.scriptLoader = scriptLoader;
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
        sb.append(RealtorsData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("props");
        sb.append('=');
        sb.append(((this.props == null)?"<null>":this.props));
        sb.append(',');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
        sb.append(',');
        sb.append("buildId");
        sb.append('=');
        sb.append(((this.buildId == null)?"<null>":this.buildId));
        sb.append(',');
        sb.append("assetPrefix");
        sb.append('=');
        sb.append(((this.assetPrefix == null)?"<null>":this.assetPrefix));
        sb.append(',');
        sb.append("runtimeConfig");
        sb.append('=');
        sb.append(((this.runtimeConfig == null)?"<null>":this.runtimeConfig));
        sb.append(',');
        sb.append("isFallback");
        sb.append('=');
        sb.append(((this.isFallback == null)?"<null>":this.isFallback));
        sb.append(',');
        sb.append("customServer");
        sb.append('=');
        sb.append(((this.customServer == null)?"<null>":this.customServer));
        sb.append(',');
        sb.append("gip");
        sb.append('=');
        sb.append(((this.gip == null)?"<null>":this.gip));
        sb.append(',');
        sb.append("appGip");
        sb.append('=');
        sb.append(((this.appGip == null)?"<null>":this.appGip));
        sb.append(',');
        sb.append("scriptLoader");
        sb.append('=');
        sb.append(((this.scriptLoader == null)?"<null>":this.scriptLoader));
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
        result = ((result* 31)+((this.assetPrefix == null)? 0 :this.assetPrefix.hashCode()));
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.appGip == null)? 0 :this.appGip.hashCode()));
        result = ((result* 31)+((this.buildId == null)? 0 :this.buildId.hashCode()));
        result = ((result* 31)+((this.scriptLoader == null)? 0 :this.scriptLoader.hashCode()));
        result = ((result* 31)+((this.props == null)? 0 :this.props.hashCode()));
        result = ((result* 31)+((this.gip == null)? 0 :this.gip.hashCode()));
        result = ((result* 31)+((this.runtimeConfig == null)? 0 :this.runtimeConfig.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this.isFallback == null)? 0 :this.isFallback.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customServer == null)? 0 :this.customServer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RealtorsData) == false) {
            return false;
        }
        RealtorsData rhs = ((RealtorsData) other);
        return (((((((((((((this.assetPrefix == rhs.assetPrefix)||((this.assetPrefix!= null)&&this.assetPrefix.equals(rhs.assetPrefix)))&&((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query))))&&((this.appGip == rhs.appGip)||((this.appGip!= null)&&this.appGip.equals(rhs.appGip))))&&((this.buildId == rhs.buildId)||((this.buildId!= null)&&this.buildId.equals(rhs.buildId))))&&((this.scriptLoader == rhs.scriptLoader)||((this.scriptLoader!= null)&&this.scriptLoader.equals(rhs.scriptLoader))))&&((this.props == rhs.props)||((this.props!= null)&&this.props.equals(rhs.props))))&&((this.gip == rhs.gip)||((this.gip!= null)&&this.gip.equals(rhs.gip))))&&((this.runtimeConfig == rhs.runtimeConfig)||((this.runtimeConfig!= null)&&this.runtimeConfig.equals(rhs.runtimeConfig))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this.isFallback == rhs.isFallback)||((this.isFallback!= null)&&this.isFallback.equals(rhs.isFallback))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customServer == rhs.customServer)||((this.customServer!= null)&&this.customServer.equals(rhs.customServer))));
    }

}
