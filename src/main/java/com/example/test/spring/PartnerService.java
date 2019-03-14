package com.example.test.spring;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PartnerService extends Service{

    public PartnerService(String url, String key){
        super(url, key);
    }


    public String getPartners(){
        DataOutputStream dataOut = null;
        BufferedReader in = null;

        try {
            URL urlObject = new URL(this.baseUrl);

            HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
            //setting request method
            connection.setRequestMethod("GET");

            //adding headers
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept","application/json");
            //API Key for API Sandbox
            connection.setRequestProperty("APIKey",this.apiKey);

            connection.setDoInput(true);

            int responseCode = connection.getResponseCode();

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            //printing response
            return response.toString();

        } catch (Exception e) {
            return null;
        }
        finally {
            try {
                if(dataOut != null) {
                    dataOut.close();
                }
                if(in != null) {
                    in.close();
                }
          
            } catch (IOException e) {
                //do something with exception
                e.printStackTrace();
            }
        }
    }
}


