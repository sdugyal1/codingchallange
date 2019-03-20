package interview.jfrog.sse.codingchallenge.response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
"results",
"range"
})
public class SearchResponse {

@JsonProperty("results")
private List<Result> results = null;
@JsonProperty("range")
private Range range;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("results")
public List<Result> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<Result> results) {
this.results = results;
}

@JsonProperty("range")
public Range getRange() {
return range;
}

@JsonProperty("range")
public void setRange(Range range) {
this.range = range;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

