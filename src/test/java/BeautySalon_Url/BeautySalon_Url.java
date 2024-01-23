package BeautySalon_Url;

import Utilities.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BeautySalon_Url {

        public  static RequestSpecification spec;

        public static void setUp(){
            spec = new RequestSpecBuilder()
                    //.addHeader("Authorization",generateToken())
                    .setBaseUri(ConfigReader.getProperty("beauty_url"))
                    .setContentType(ContentType.JSON)
                    .build();
        }

}
