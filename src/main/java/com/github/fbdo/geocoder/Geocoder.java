/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fbdo.geocoder;

/**
 * @author fbdo
 */
public interface Geocoder {

    Response geocode(String addressLine);

    Response inverseGeocode(float lat, float lng);
}
