package com.challenge.klm.auth;

import com.mashape.unirest.http.exceptions.UnirestException;

public interface Authentication {
    String getToken() throws UnirestException;
}
