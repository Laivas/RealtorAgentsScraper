
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
    "fulfillment_id",
    "designations",
    "name",
    "accent_color",
    "photo",
    "video"
})
@Generated("jsonschema2pojo")
public class Broker {

    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    @JsonProperty("designations")
    private List<Object> designations = new ArrayList<Object>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("accent_color")
    private String accentColor;
    @JsonProperty("photo")
    private Photo photo;
    @JsonProperty("video")
    private String video;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("fulfillment_id")
    public Integer getFulfillmentId() {
        return fulfillmentId;
    }

    @JsonProperty("fulfillment_id")
    public void setFulfillmentId(Integer fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    @JsonProperty("designations")
    public List<Object> getDesignations() {
        return designations;
    }

    @JsonProperty("designations")
    public void setDesignations(List<Object> designations) {
        this.designations = designations;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("accent_color")
    public String getAccentColor() {
        return accentColor;
    }

    @JsonProperty("accent_color")
    public void setAccentColor(String accentColor) {
        this.accentColor = accentColor;
    }

    @JsonProperty("photo")
    public Photo getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
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
        sb.append(Broker.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fulfillmentId");
        sb.append('=');
        sb.append(((this.fulfillmentId == null)?"<null>":this.fulfillmentId));
        sb.append(',');
        sb.append("designations");
        sb.append('=');
        sb.append(((this.designations == null)?"<null>":this.designations));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("accentColor");
        sb.append('=');
        sb.append(((this.accentColor == null)?"<null>":this.accentColor));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("video");
        sb.append('=');
        sb.append(((this.video == null)?"<null>":this.video));
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
        result = ((result* 31)+((this.designations == null)? 0 :this.designations.hashCode()));
        result = ((result* 31)+((this.accentColor == null)? 0 :this.accentColor.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.video == null)? 0 :this.video.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Broker) == false) {
            return false;
        }
        Broker rhs = ((Broker) other);
        return ((((((((this.fulfillmentId == rhs.fulfillmentId)||((this.fulfillmentId!= null)&&this.fulfillmentId.equals(rhs.fulfillmentId)))&&((this.designations == rhs.designations)||((this.designations!= null)&&this.designations.equals(rhs.designations))))&&((this.accentColor == rhs.accentColor)||((this.accentColor!= null)&&this.accentColor.equals(rhs.accentColor))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.video == rhs.video)||((this.video!= null)&&this.video.equals(rhs.video))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
