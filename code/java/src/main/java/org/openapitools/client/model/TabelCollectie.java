/*
 * Landelijke tabellen
 * API voor het ontsluiten van landelijke tabellen die op de website van BZK worden gepubliceerd.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Tabel;

/**
 * TabelCollectie
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-14T07:53:34.702199Z[Etc/UTC]")
public class TabelCollectie {
  public static final String SERIALIZED_NAME_TABELLEN = "tabellen";
  @SerializedName(SERIALIZED_NAME_TABELLEN)
  private List<Tabel> tabellen = null;


  public TabelCollectie tabellen(List<Tabel> tabellen) {
    
    this.tabellen = tabellen;
    return this;
  }

  public TabelCollectie addTabellenItem(Tabel tabellenItem) {
    if (this.tabellen == null) {
      this.tabellen = new ArrayList<>();
    }
    this.tabellen.add(tabellenItem);
    return this;
  }

   /**
   * Get tabellen
   * @return tabellen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tabel> getTabellen() {
    return tabellen;
  }


  public void setTabellen(List<Tabel> tabellen) {
    this.tabellen = tabellen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabelCollectie tabelCollectie = (TabelCollectie) o;
    return Objects.equals(this.tabellen, tabelCollectie.tabellen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabellen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabelCollectie {\n");
    sb.append("    tabellen: ").append(toIndentedString(tabellen)).append("\n");
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

}

