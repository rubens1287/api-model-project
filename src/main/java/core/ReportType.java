package core;

import io.qameta.allure.Allure;
import io.restassured.response.Response;

public interface ReportType {

    static void reportToAllureHeaderAndBodyResponse(Response response){
        Allure.addAttachment(AllureTypeFile.RESPONSE_HEADERS,response.getHeaders().toString());
        Allure.addAttachment(AllureTypeFile.RESPONSE_BODY,response.getBody().prettyPrint());
    }

    static void reportToAllureUriRequest(String uri){
        Allure.addAttachment(AllureTypeFile.REQUEST,uri);
    }

}
