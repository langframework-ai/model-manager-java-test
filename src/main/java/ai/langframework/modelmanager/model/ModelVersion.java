/*
 * CORE-ModelManager-API
 * Created by AWS Lambda
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.langframework.modelmanager.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ai.langframework.modelmanager.client.JSON;

/**
 * ModelVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-12T18:29:29.971491900+05:00[Asia/Karachi]", comments = "Generator version: 7.10.0")
public class ModelVersion {
  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  @javax.annotation.Nullable
  private String versionNumber;

  public static final String SERIALIZED_NAME_CONTEXT_WINDOW = "contextWindow";
  @SerializedName(SERIALIZED_NAME_CONTEXT_WINDOW)
  @javax.annotation.Nullable
  private Integer contextWindow;

  public static final String SERIALIZED_NAME_MAX_OUTPUT_TOKENS = "maxOutputTokens";
  @SerializedName(SERIALIZED_NAME_MAX_OUTPUT_TOKENS)
  @javax.annotation.Nullable
  private Integer maxOutputTokens;

  public static final String SERIALIZED_NAME_TRAINING_DATA = "trainingData";
  @SerializedName(SERIALIZED_NAME_TRAINING_DATA)
  @javax.annotation.Nullable
  private String trainingData;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public ModelVersion() {
  }

  public ModelVersion versionNumber(@javax.annotation.Nullable String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Get versionNumber
   * @return versionNumber
   */
  @javax.annotation.Nullable
  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(@javax.annotation.Nullable String versionNumber) {
    this.versionNumber = versionNumber;
  }


  public ModelVersion contextWindow(@javax.annotation.Nullable Integer contextWindow) {
    this.contextWindow = contextWindow;
    return this;
  }

  /**
   * Get contextWindow
   * @return contextWindow
   */
  @javax.annotation.Nullable
  public Integer getContextWindow() {
    return contextWindow;
  }

  public void setContextWindow(@javax.annotation.Nullable Integer contextWindow) {
    this.contextWindow = contextWindow;
  }


  public ModelVersion maxOutputTokens(@javax.annotation.Nullable Integer maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
    return this;
  }

  /**
   * Get maxOutputTokens
   * @return maxOutputTokens
   */
  @javax.annotation.Nullable
  public Integer getMaxOutputTokens() {
    return maxOutputTokens;
  }

  public void setMaxOutputTokens(@javax.annotation.Nullable Integer maxOutputTokens) {
    this.maxOutputTokens = maxOutputTokens;
  }


  public ModelVersion trainingData(@javax.annotation.Nullable String trainingData) {
    this.trainingData = trainingData;
    return this;
  }

  /**
   * Get trainingData
   * @return trainingData
   */
  @javax.annotation.Nullable
  public String getTrainingData() {
    return trainingData;
  }

  public void setTrainingData(@javax.annotation.Nullable String trainingData) {
    this.trainingData = trainingData;
  }


  public ModelVersion description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelVersion modelVersion = (ModelVersion) o;
    return Objects.equals(this.versionNumber, modelVersion.versionNumber) &&
        Objects.equals(this.contextWindow, modelVersion.contextWindow) &&
        Objects.equals(this.maxOutputTokens, modelVersion.maxOutputTokens) &&
        Objects.equals(this.trainingData, modelVersion.trainingData) &&
        Objects.equals(this.description, modelVersion.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionNumber, contextWindow, maxOutputTokens, trainingData, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelVersion {\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    contextWindow: ").append(toIndentedString(contextWindow)).append("\n");
    sb.append("    maxOutputTokens: ").append(toIndentedString(maxOutputTokens)).append("\n");
    sb.append("    trainingData: ").append(toIndentedString(trainingData)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("versionNumber");
    openapiFields.add("contextWindow");
    openapiFields.add("maxOutputTokens");
    openapiFields.add("trainingData");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModelVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelVersion is not found in the empty JSON string", ModelVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("versionNumber") != null && !jsonObj.get("versionNumber").isJsonNull()) && !jsonObj.get("versionNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionNumber").toString()));
      }
      if ((jsonObj.get("trainingData") != null && !jsonObj.get("trainingData").isJsonNull()) && !jsonObj.get("trainingData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trainingData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trainingData").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelVersion>() {
           @Override
           public void write(JsonWriter out, ModelVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModelVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModelVersion
   * @throws IOException if the JSON string is invalid with respect to ModelVersion
   */
  public static ModelVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelVersion.class);
  }

  /**
   * Convert an instance of ModelVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

