package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testGetSdAcademy() throws IOException {
        try (CloseableHttpClient httpClient = HttpClientBuilder
                .create()
                .build()) {


        }
    }

    @Test
    public void testGetSdAcademyByIp() throws IOException {
        //http://104.24.123.121

    }

    @Test
    public void testDeleteSdAcademy() throws IOException {

    }

    @Test
    public void testSendDataToSdAcademy() throws IOException {

    }

    @Test
    public void googleSearch() throws IOException {
    //    HttpGet httpGet = new HttpGet("https://www.google.pl/search?safe=off&source=hp&ei=rRbpXIbKLtLIrgSmkK7wDg&q=pogoda+gdansk");



    }

    @Test
    public void testGetPolandInfo() throws IOException {
        String address = "https://restcountries.eu/rest/v2/name/poland";
    }

    @Test
    public void testGsonParse() {
        String json = "{\"firstName\": \"Krzysztof\", \"lastName\":\"Ambroziak\"}";
        //System.out.println(lastName);
    }

    @Test
    public void testBuildSentence() throws IOException {
        //Polska ma ludności: x, graniczy z:... a po włosku to:...


    }

/*
    @Test
    public void buildJsonFromObject() {

    }

    @Test
    public void buildObjectFromJson() {

    }*/

    @Test
    public void testJackson() throws JsonProcessingException {
        Student student = new Student();
        ObjectMapper objectMapper = new ObjectMapper();
    }

    @Test
    public void sendStudentData() throws IOException {
        Student student = new Student();
        //https://protected-cove-60658.herokuapp.com/students


    }

    @Test
    public void getStudentData() throws IOException {
    //    String address = "https://protected-cove-60658.herokuapp.com/students";


      //  System.out.println(response);

    }


}
