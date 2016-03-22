package com.graphhopper.converter;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Robin Boldt
 */
public class ConverterConfiguration extends Configuration
{

    //TODO Define as URL?
    @NotEmpty
    private String nominatimUrl = "http://nominatim.openstreetmap.org/search/";

    @Valid
    @NotNull
    private JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();


    @JsonProperty
    public String getNominatimUrl() {
        return nominatimUrl;
    }

    @JsonProperty
    public void setNominatimUrl(String url) {
        this.nominatimUrl = url;
    }


    @JsonProperty("jerseyClient")
    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return jerseyClient;
    }

}