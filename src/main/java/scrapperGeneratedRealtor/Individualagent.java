
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
    "loading",
    "error",
    "selectAgentData",
    "allAgentData",
    "listData",
    "agentpropertyData",
    "selectedprop",
    "selectedmarker",
    "zoom",
    "center",
    "recommendationSuccessStatus",
    "askAQuestionSuccessStatus",
    "reviewSuccessStatus",
    "selectedMarkerAgentData",
    "setonclose",
    "visibleMarkers"
})
@Generated("jsonschema2pojo")
public class Individualagent {

    @JsonProperty("status")
    private Object status;
    @JsonProperty("loading")
    private Boolean loading;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("selectAgentData")
    private Object selectAgentData;
    @JsonProperty("allAgentData")
    private Object allAgentData;
    @JsonProperty("listData")
    private Object listData;
    @JsonProperty("agentpropertyData")
    private Object agentpropertyData;
    @JsonProperty("selectedprop")
    private Object selectedprop;
    @JsonProperty("selectedmarker")
    private Object selectedmarker;
    @JsonProperty("zoom")
    private Object zoom;
    @JsonProperty("center")
    private Object center;
    @JsonProperty("recommendationSuccessStatus")
    private Object recommendationSuccessStatus;
    @JsonProperty("askAQuestionSuccessStatus")
    private Object askAQuestionSuccessStatus;
    @JsonProperty("reviewSuccessStatus")
    private Object reviewSuccessStatus;
    @JsonProperty("selectedMarkerAgentData")
    private Object selectedMarkerAgentData;
    @JsonProperty("setonclose")
    private Object setonclose;
    @JsonProperty("visibleMarkers")
    private Object visibleMarkers;
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

    @JsonProperty("loading")
    public Boolean getLoading() {
        return loading;
    }

    @JsonProperty("loading")
    public void setLoading(Boolean loading) {
        this.loading = loading;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("selectAgentData")
    public Object getSelectAgentData() {
        return selectAgentData;
    }

    @JsonProperty("selectAgentData")
    public void setSelectAgentData(Object selectAgentData) {
        this.selectAgentData = selectAgentData;
    }

    @JsonProperty("allAgentData")
    public Object getAllAgentData() {
        return allAgentData;
    }

    @JsonProperty("allAgentData")
    public void setAllAgentData(Object allAgentData) {
        this.allAgentData = allAgentData;
    }

    @JsonProperty("listData")
    public Object getListData() {
        return listData;
    }

    @JsonProperty("listData")
    public void setListData(Object listData) {
        this.listData = listData;
    }

    @JsonProperty("agentpropertyData")
    public Object getAgentpropertyData() {
        return agentpropertyData;
    }

    @JsonProperty("agentpropertyData")
    public void setAgentpropertyData(Object agentpropertyData) {
        this.agentpropertyData = agentpropertyData;
    }

    @JsonProperty("selectedprop")
    public Object getSelectedprop() {
        return selectedprop;
    }

    @JsonProperty("selectedprop")
    public void setSelectedprop(Object selectedprop) {
        this.selectedprop = selectedprop;
    }

    @JsonProperty("selectedmarker")
    public Object getSelectedmarker() {
        return selectedmarker;
    }

    @JsonProperty("selectedmarker")
    public void setSelectedmarker(Object selectedmarker) {
        this.selectedmarker = selectedmarker;
    }

    @JsonProperty("zoom")
    public Object getZoom() {
        return zoom;
    }

    @JsonProperty("zoom")
    public void setZoom(Object zoom) {
        this.zoom = zoom;
    }

    @JsonProperty("center")
    public Object getCenter() {
        return center;
    }

    @JsonProperty("center")
    public void setCenter(Object center) {
        this.center = center;
    }

    @JsonProperty("recommendationSuccessStatus")
    public Object getRecommendationSuccessStatus() {
        return recommendationSuccessStatus;
    }

    @JsonProperty("recommendationSuccessStatus")
    public void setRecommendationSuccessStatus(Object recommendationSuccessStatus) {
        this.recommendationSuccessStatus = recommendationSuccessStatus;
    }

    @JsonProperty("askAQuestionSuccessStatus")
    public Object getAskAQuestionSuccessStatus() {
        return askAQuestionSuccessStatus;
    }

    @JsonProperty("askAQuestionSuccessStatus")
    public void setAskAQuestionSuccessStatus(Object askAQuestionSuccessStatus) {
        this.askAQuestionSuccessStatus = askAQuestionSuccessStatus;
    }

    @JsonProperty("reviewSuccessStatus")
    public Object getReviewSuccessStatus() {
        return reviewSuccessStatus;
    }

    @JsonProperty("reviewSuccessStatus")
    public void setReviewSuccessStatus(Object reviewSuccessStatus) {
        this.reviewSuccessStatus = reviewSuccessStatus;
    }

    @JsonProperty("selectedMarkerAgentData")
    public Object getSelectedMarkerAgentData() {
        return selectedMarkerAgentData;
    }

    @JsonProperty("selectedMarkerAgentData")
    public void setSelectedMarkerAgentData(Object selectedMarkerAgentData) {
        this.selectedMarkerAgentData = selectedMarkerAgentData;
    }

    @JsonProperty("setonclose")
    public Object getSetonclose() {
        return setonclose;
    }

    @JsonProperty("setonclose")
    public void setSetonclose(Object setonclose) {
        this.setonclose = setonclose;
    }

    @JsonProperty("visibleMarkers")
    public Object getVisibleMarkers() {
        return visibleMarkers;
    }

    @JsonProperty("visibleMarkers")
    public void setVisibleMarkers(Object visibleMarkers) {
        this.visibleMarkers = visibleMarkers;
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
        sb.append(Individualagent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("loading");
        sb.append('=');
        sb.append(((this.loading == null)?"<null>":this.loading));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("selectAgentData");
        sb.append('=');
        sb.append(((this.selectAgentData == null)?"<null>":this.selectAgentData));
        sb.append(',');
        sb.append("allAgentData");
        sb.append('=');
        sb.append(((this.allAgentData == null)?"<null>":this.allAgentData));
        sb.append(',');
        sb.append("listData");
        sb.append('=');
        sb.append(((this.listData == null)?"<null>":this.listData));
        sb.append(',');
        sb.append("agentpropertyData");
        sb.append('=');
        sb.append(((this.agentpropertyData == null)?"<null>":this.agentpropertyData));
        sb.append(',');
        sb.append("selectedprop");
        sb.append('=');
        sb.append(((this.selectedprop == null)?"<null>":this.selectedprop));
        sb.append(',');
        sb.append("selectedmarker");
        sb.append('=');
        sb.append(((this.selectedmarker == null)?"<null>":this.selectedmarker));
        sb.append(',');
        sb.append("zoom");
        sb.append('=');
        sb.append(((this.zoom == null)?"<null>":this.zoom));
        sb.append(',');
        sb.append("center");
        sb.append('=');
        sb.append(((this.center == null)?"<null>":this.center));
        sb.append(',');
        sb.append("recommendationSuccessStatus");
        sb.append('=');
        sb.append(((this.recommendationSuccessStatus == null)?"<null>":this.recommendationSuccessStatus));
        sb.append(',');
        sb.append("askAQuestionSuccessStatus");
        sb.append('=');
        sb.append(((this.askAQuestionSuccessStatus == null)?"<null>":this.askAQuestionSuccessStatus));
        sb.append(',');
        sb.append("reviewSuccessStatus");
        sb.append('=');
        sb.append(((this.reviewSuccessStatus == null)?"<null>":this.reviewSuccessStatus));
        sb.append(',');
        sb.append("selectedMarkerAgentData");
        sb.append('=');
        sb.append(((this.selectedMarkerAgentData == null)?"<null>":this.selectedMarkerAgentData));
        sb.append(',');
        sb.append("setonclose");
        sb.append('=');
        sb.append(((this.setonclose == null)?"<null>":this.setonclose));
        sb.append(',');
        sb.append("visibleMarkers");
        sb.append('=');
        sb.append(((this.visibleMarkers == null)?"<null>":this.visibleMarkers));
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
        result = ((result* 31)+((this.recommendationSuccessStatus == null)? 0 :this.recommendationSuccessStatus.hashCode()));
        result = ((result* 31)+((this.allAgentData == null)? 0 :this.allAgentData.hashCode()));
        result = ((result* 31)+((this.setonclose == null)? 0 :this.setonclose.hashCode()));
        result = ((result* 31)+((this.visibleMarkers == null)? 0 :this.visibleMarkers.hashCode()));
        result = ((result* 31)+((this.listData == null)? 0 :this.listData.hashCode()));
        result = ((result* 31)+((this.selectedprop == null)? 0 :this.selectedprop.hashCode()));
        result = ((result* 31)+((this.center == null)? 0 :this.center.hashCode()));
        result = ((result* 31)+((this.zoom == null)? 0 :this.zoom.hashCode()));
        result = ((result* 31)+((this.loading == null)? 0 :this.loading.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.selectedmarker == null)? 0 :this.selectedmarker.hashCode()));
        result = ((result* 31)+((this.askAQuestionSuccessStatus == null)? 0 :this.askAQuestionSuccessStatus.hashCode()));
        result = ((result* 31)+((this.selectedMarkerAgentData == null)? 0 :this.selectedMarkerAgentData.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reviewSuccessStatus == null)? 0 :this.reviewSuccessStatus.hashCode()));
        result = ((result* 31)+((this.selectAgentData == null)? 0 :this.selectAgentData.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.agentpropertyData == null)? 0 :this.agentpropertyData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Individualagent) == false) {
            return false;
        }
        Individualagent rhs = ((Individualagent) other);
        return (((((((((((((((((((this.recommendationSuccessStatus == rhs.recommendationSuccessStatus)||((this.recommendationSuccessStatus!= null)&&this.recommendationSuccessStatus.equals(rhs.recommendationSuccessStatus)))&&((this.allAgentData == rhs.allAgentData)||((this.allAgentData!= null)&&this.allAgentData.equals(rhs.allAgentData))))&&((this.setonclose == rhs.setonclose)||((this.setonclose!= null)&&this.setonclose.equals(rhs.setonclose))))&&((this.visibleMarkers == rhs.visibleMarkers)||((this.visibleMarkers!= null)&&this.visibleMarkers.equals(rhs.visibleMarkers))))&&((this.listData == rhs.listData)||((this.listData!= null)&&this.listData.equals(rhs.listData))))&&((this.selectedprop == rhs.selectedprop)||((this.selectedprop!= null)&&this.selectedprop.equals(rhs.selectedprop))))&&((this.center == rhs.center)||((this.center!= null)&&this.center.equals(rhs.center))))&&((this.zoom == rhs.zoom)||((this.zoom!= null)&&this.zoom.equals(rhs.zoom))))&&((this.loading == rhs.loading)||((this.loading!= null)&&this.loading.equals(rhs.loading))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.selectedmarker == rhs.selectedmarker)||((this.selectedmarker!= null)&&this.selectedmarker.equals(rhs.selectedmarker))))&&((this.askAQuestionSuccessStatus == rhs.askAQuestionSuccessStatus)||((this.askAQuestionSuccessStatus!= null)&&this.askAQuestionSuccessStatus.equals(rhs.askAQuestionSuccessStatus))))&&((this.selectedMarkerAgentData == rhs.selectedMarkerAgentData)||((this.selectedMarkerAgentData!= null)&&this.selectedMarkerAgentData.equals(rhs.selectedMarkerAgentData))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reviewSuccessStatus == rhs.reviewSuccessStatus)||((this.reviewSuccessStatus!= null)&&this.reviewSuccessStatus.equals(rhs.reviewSuccessStatus))))&&((this.selectAgentData == rhs.selectAgentData)||((this.selectAgentData!= null)&&this.selectAgentData.equals(rhs.selectAgentData))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.agentpropertyData == rhs.agentpropertyData)||((this.agentpropertyData!= null)&&this.agentpropertyData.equals(rhs.agentpropertyData))));
    }

}
