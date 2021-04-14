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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.Tabel;
import org.openapitools.client.model.TabelCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabellenApi {
    private ApiClient localVarApiClient;

    public TabellenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TabellenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getTabel
     * @param tabelidentificatie De identificatie van een landelijke tabel. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getTabelCall(String tabelidentificatie, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tabellen/{tabelidentificatie}"
            .replaceAll("\\{" + "tabelidentificatie" + "\\}", localVarApiClient.escapeString(tabelidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTabelValidateBeforeCall(String tabelidentificatie, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tabelidentificatie' is set
        if (tabelidentificatie == null) {
            throw new ApiException("Missing the required parameter 'tabelidentificatie' when calling getTabel(Async)");
        }
        

        okhttp3.Call localVarCall = getTabelCall(tabelidentificatie, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het ophalen van de gegevens van een enkele landelijke tabel
     * @param tabelidentificatie De identificatie van een landelijke tabel. (required)
     * @return Tabel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public Tabel getTabel(String tabelidentificatie) throws ApiException {
        ApiResponse<Tabel> localVarResp = getTabelWithHttpInfo(tabelidentificatie);
        return localVarResp.getData();
    }

    /**
     * 
     * Het ophalen van de gegevens van een enkele landelijke tabel
     * @param tabelidentificatie De identificatie van een landelijke tabel. (required)
     * @return ApiResponse&lt;Tabel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Tabel> getTabelWithHttpInfo(String tabelidentificatie) throws ApiException {
        okhttp3.Call localVarCall = getTabelValidateBeforeCall(tabelidentificatie, null);
        Type localVarReturnType = new TypeToken<Tabel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het ophalen van de gegevens van een enkele landelijke tabel
     * @param tabelidentificatie De identificatie van een landelijke tabel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getTabelAsync(String tabelidentificatie, final ApiCallback<Tabel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTabelValidateBeforeCall(tabelidentificatie, _callback);
        Type localVarReturnType = new TypeToken<Tabel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTabellen
     * @param tabelidentificatie De identificatie van een landelijke tabel. (optional)
     * @param omschrijving De naam van de tabel. &lt;br&gt; Bij het zoeken mag er gebruik worden gemaakt van &lt;b&gt;[wildcards](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/master/features/wildcard.feature)&lt;/b&gt;.&lt;br&gt;Zoeken is &lt;b&gt;[case-Insensitive](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/case_insensitive.feature)&lt;/b&gt;&lt;/a&gt; (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getTabellenCall(String tabelidentificatie, String omschrijving, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tabellen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tabelidentificatie != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tabelidentificatie", tabelidentificatie));
        }

        if (omschrijving != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("omschrijving", omschrijving));
        }

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTabellenValidateBeforeCall(String tabelidentificatie, String omschrijving, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getTabellenCall(tabelidentificatie, omschrijving, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het ophalen van een collectie landelijke tabellen.
     * @param tabelidentificatie De identificatie van een landelijke tabel. (optional)
     * @param omschrijving De naam van de tabel. &lt;br&gt; Bij het zoeken mag er gebruik worden gemaakt van &lt;b&gt;[wildcards](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/master/features/wildcard.feature)&lt;/b&gt;.&lt;br&gt;Zoeken is &lt;b&gt;[case-Insensitive](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/case_insensitive.feature)&lt;/b&gt;&lt;/a&gt; (optional)
     * @return TabelCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public TabelCollectie getTabellen(String tabelidentificatie, String omschrijving) throws ApiException {
        ApiResponse<TabelCollectie> localVarResp = getTabellenWithHttpInfo(tabelidentificatie, omschrijving);
        return localVarResp.getData();
    }

    /**
     * 
     * Het ophalen van een collectie landelijke tabellen.
     * @param tabelidentificatie De identificatie van een landelijke tabel. (optional)
     * @param omschrijving De naam van de tabel. &lt;br&gt; Bij het zoeken mag er gebruik worden gemaakt van &lt;b&gt;[wildcards](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/master/features/wildcard.feature)&lt;/b&gt;.&lt;br&gt;Zoeken is &lt;b&gt;[case-Insensitive](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/case_insensitive.feature)&lt;/b&gt;&lt;/a&gt; (optional)
     * @return ApiResponse&lt;TabelCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<TabelCollectie> getTabellenWithHttpInfo(String tabelidentificatie, String omschrijving) throws ApiException {
        okhttp3.Call localVarCall = getTabellenValidateBeforeCall(tabelidentificatie, omschrijving, null);
        Type localVarReturnType = new TypeToken<TabelCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het ophalen van een collectie landelijke tabellen.
     * @param tabelidentificatie De identificatie van een landelijke tabel. (optional)
     * @param omschrijving De naam van de tabel. &lt;br&gt; Bij het zoeken mag er gebruik worden gemaakt van &lt;b&gt;[wildcards](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/master/features/wildcard.feature)&lt;/b&gt;.&lt;br&gt;Zoeken is &lt;b&gt;[case-Insensitive](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/case_insensitive.feature)&lt;/b&gt;&lt;/a&gt; (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getTabellenAsync(String tabelidentificatie, String omschrijving, final ApiCallback<TabelCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTabellenValidateBeforeCall(tabelidentificatie, omschrijving, _callback);
        Type localVarReturnType = new TypeToken<TabelCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}