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
import java.time.LocalDate;

/**
 * WaardeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-14T07:53:34.702199Z[Etc/UTC]")
public class WaardeAllOf {
  public static final String SERIALIZED_NAME_DATUM_EINDE = "datumEinde";
  @SerializedName(SERIALIZED_NAME_DATUM_EINDE)
  private LocalDate datumEinde;

  public static final String SERIALIZED_NAME_DATUM_INGANG = "datumIngang";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG)
  private LocalDate datumIngang;

  public static final String SERIALIZED_NAME_NIEUWE_CODE = "nieuweCode";
  @SerializedName(SERIALIZED_NAME_NIEUWE_CODE)
  private String nieuweCode;

  public static final String SERIALIZED_NAME_SOORT = "soort";
  @SerializedName(SERIALIZED_NAME_SOORT)
  private String soort;


  public WaardeAllOf datumEinde(LocalDate datumEinde) {
    
    this.datumEinde = datumEinde;
    return this;
  }

   /**
   * Einddatum van de geldigheid van de gegevens.
   * @return datumEinde
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Einddatum van de geldigheid van de gegevens.")

  public LocalDate getDatumEinde() {
    return datumEinde;
  }


  public void setDatumEinde(LocalDate datumEinde) {
    this.datumEinde = datumEinde;
  }


  public WaardeAllOf datumIngang(LocalDate datumIngang) {
    
    this.datumIngang = datumIngang;
    return this;
  }

   /**
   * Begindatum van de geldigheid van de gegevens
   * @return datumIngang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Begindatum van de geldigheid van de gegevens")

  public LocalDate getDatumIngang() {
    return datumIngang;
  }


  public void setDatumIngang(LocalDate datumIngang) {
    this.datumIngang = datumIngang;
  }


  public WaardeAllOf nieuweCode(String nieuweCode) {
    
    this.nieuweCode = nieuweCode;
    return this;
  }

   /**
   * Code van de nieuwegevormde gemeente waarin deze gemeente is overgegaan. Dit element komt alleen voor in de Gemeenten-tabel
   * @return nieuweCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code van de nieuwegevormde gemeente waarin deze gemeente is overgegaan. Dit element komt alleen voor in de Gemeenten-tabel")

  public String getNieuweCode() {
    return nieuweCode;
  }


  public void setNieuweCode(String nieuweCode) {
    this.nieuweCode = nieuweCode;
  }


  public WaardeAllOf soort(String soort) {
    
    this.soort = soort;
    return this;
  }

   /**
   * Soort reden beëindigen of opnemen nationaliteit. Dit element komt alleen voor in de tabel Reden opnemen - beeindigen Nationaliteit.
   * @return soort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VK", value = "Soort reden beëindigen of opnemen nationaliteit. Dit element komt alleen voor in de tabel Reden opnemen - beeindigen Nationaliteit.")

  public String getSoort() {
    return soort;
  }


  public void setSoort(String soort) {
    this.soort = soort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaardeAllOf waardeAllOf = (WaardeAllOf) o;
    return Objects.equals(this.datumEinde, waardeAllOf.datumEinde) &&
        Objects.equals(this.datumIngang, waardeAllOf.datumIngang) &&
        Objects.equals(this.nieuweCode, waardeAllOf.nieuweCode) &&
        Objects.equals(this.soort, waardeAllOf.soort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumEinde, datumIngang, nieuweCode, soort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaardeAllOf {\n");
    sb.append("    datumEinde: ").append(toIndentedString(datumEinde)).append("\n");
    sb.append("    datumIngang: ").append(toIndentedString(datumIngang)).append("\n");
    sb.append("    nieuweCode: ").append(toIndentedString(nieuweCode)).append("\n");
    sb.append("    soort: ").append(toIndentedString(soort)).append("\n");
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

