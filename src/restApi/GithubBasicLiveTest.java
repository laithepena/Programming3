package restApi;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;


import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.hamcrest.Matchers;
import org.junit.Test;

//import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.*;
//import static org.hamcrest.Matchers.equalTo;
//import org.junit.Test;
import static org.junit.Assert.*;


//https://github.com/eugenp/tutorials/blob/master/rest-testing/src/test/java/org/baeldung/rest/GithubBasicLiveTest.java
public class GithubBasicLiveTest {

    // simple request - response

    @Test
    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived() throws ClientProtocolException, IOException {
        // Given
        final String name = randomAlphabetic(8);
        
        System.out.println("name "+name); //mzBcbRFR
        final HttpUriRequest request = new HttpGet("https://api.github.com/users/" + name);

        // When
        final HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
System.out.println(httpResponse.getStatusLine().getStatusCode());
System.out.println(HttpStatus.SC_NOT_FOUND);
        // Then

if(httpResponse.getStatusLine().getStatusCode()==HttpStatus.SC_NOT_FOUND){
	System.out.println("PASS");
}
 //    assertThat("eugenp", Matchers.is(resource.getLogin()));
      // assertThat(httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_NOT_FOUND));
assertThat(httpResponse.getStatusLine().getStatusCode(),Matchers.is(HttpStatus.SC_NOT_FOUND));
 //assertSame(httpResponse.getStatusLine().getStatusCode(),HttpStatus.SC_NOT_FOUND);
        //System.out.println
    }

    @Test
    public void givenRequestWithNoAcceptHeader_whenRequestIsExecuted_thenDefaultResponseContentTypeIsJson() throws ClientProtocolException, IOException {
        // Given
        final String jsonMimeType = "application/json";
        final HttpUriRequest request = new HttpGet("https://api.github.com/users/eugenp");

        // When
        final HttpResponse response = HttpClientBuilder.create().build().execute(request);

        // Then
        final String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
        assertEquals(jsonMimeType, mimeType);
    }

    @Test
    public void givenUserExists_whenUserInformationIsRetrieved_thenRetrievedResourceIsCorrect() throws ClientProtocolException, IOException {
        // Given
        final HttpUriRequest request = new HttpGet("https://api.github.com/users/eugenp");

        // When
        final HttpResponse response = HttpClientBuilder.create().build().execute(request);

        // Then
        final GitHubUser resource = RetrieveUtil.retrieveResourceFromResponse(response, GitHubUser.class);
        System.out.println("login  "+resource.getLogin());
        assertThat("eugenp", Matchers.is(resource.getLogin()));
    }

}