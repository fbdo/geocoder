/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fbdo.geocoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:fabio.braga@gmail.com">Fabio Oliveira</a>
 */
public class GoogleGeocoderIT {


    public GoogleGeocoderIT() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGeocode() throws MalformedURLException, IOException {
        GoogleGeocoder geocoder = new GoogleGeocoder();


        Response response = geocoder.geocode("1600+Amphitheatre+Parkway,+Mountain+View,+CA");


        assertEquals(Response.Status.OK, response.getStatus());
        assertEquals(1, response.getResults().length);
        assertEquals(7, response.getResults()[0].getAddressComponents().length);
        assertEquals("1600 Amphitheatre Parkway, Mountain View, CA 94043, USA", response.getResults()[0].getFormattedAddress());
        assertEquals(Geometry.Type.ROOFTOP, response.getResults()[0].getGeometry().getLocationType());
    }

    @Test
    public void testInverseGeocode() {
        GoogleGeocoder geocoder = new GoogleGeocoder();


        Response response = geocoder.inverseGeocode(-22.888976f, -47.032606f);

        assertEquals(Response.Status.OK, response.getStatus());
    }
}
