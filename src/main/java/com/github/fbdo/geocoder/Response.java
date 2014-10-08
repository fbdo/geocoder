/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.fbdo.geocoder;

/**
 * @author <a href="mailto:fabio.braga@gmail.com">Fabio Oliveira</a>
 */
public class Response {

    public static enum Status {

        OK,
        ZERO_RESULTS,
        OVER_QUERY_LIMIT,
        REQUEST_DENIED,
        INVALID_REQUEST
    }

    private Status status;
    private Result[] results;

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
