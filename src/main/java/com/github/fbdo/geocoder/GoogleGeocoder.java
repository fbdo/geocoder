/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fbdo.geocoder;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author <a href="mailto:fabio.braga@gmail.com">Fabio Oliveira</a>
 */
public class GoogleGeocoder implements Geocoder {

    private static final String GMAP_URL = "http://maps.googleapis.com/maps/api/geocode/json?sensor=false";

    private static final Logger LOG = Logger.getLogger(GoogleGeocoder.class.getName());

    @Override
    public Response geocode(String address) {

        try {
            LOG.fine("Geocoding address " + address);
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL(
                    new StringBuffer(GMAP_URL).append("&address=").append(URLEncoder.encode(address, "UTF-8")).toString());

            return mapper.readValue(url.openStream(), Response.class);
        } catch (MalformedURLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } catch (IOException ioe) {
            LOG.log(Level.SEVERE, null, ioe);
        }
        return null;
    }

    @Override
    public Response inverseGeocode(float lat, float lng) {
        try {
            LOG.fine("Reverse geocoding location: [" + lat + ", " + lng + "]");
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL(new StringBuffer(GMAP_URL).append("&latlng=").append(lat).append(",").append(lng).toString());
            return mapper.readValue(url.openStream(), Response.class);
        } catch (MalformedURLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } catch (IOException ioe) {
            LOG.log(Level.SEVERE, null, ioe);
        }
        return null;
    }
}
