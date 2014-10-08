/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fbdo.geocoder;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="mailto:fabio.braga@gmail.com">Fabio Oliveira</a>
 */
@JsonAutoDetect()
public class Result {

    @JsonProperty("address_components")
    private AddressComponent[] addressComponents;
    @JsonProperty("formatted_address")
    private String formattedAddress;

    @JsonProperty("geometry")
    private Geometry geometry;

    @JsonProperty("types")
    private AddressType[] types;

    @JsonProperty("partial_match")
    private String partialMatch;

    public AddressComponent[] getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(AddressComponent[] addressComponents) {
        this.addressComponents = addressComponents;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public AddressType[] getTypes() {
        return types;
    }

    public void setTypes(AddressType[] types) {
        this.types = types;
    }

    public String getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(String partialMatch) {
        this.partialMatch = partialMatch;
    }


}
