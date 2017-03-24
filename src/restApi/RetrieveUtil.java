package restApi;


import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RetrieveUtil {
	//public static <T> T ;
    //  final GitHubUser resource = RetrieveUtil.retrieveResourceFromResponse(response, GitHubUser.class);

    public static <T> T retrieveResourceFromResponse(final HttpResponse response, final Class<T> clazz) throws IOException {
    	
    	
    	   	
        final String jsonFromResponse = EntityUtils.toString(response.getEntity());
        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        
        return mapper.readValue(jsonFromResponse, clazz);
        
        
    }
//
/*    List<NavItem> navigation = objectMapper.readValue(
            jsonString,
            objectMapper.getTypeFactory().constructCollectionType(
                    List.class, NavItem.class));*/
    
   	public static <T> List<T> retrieveResourceFromListResponse(HttpResponse response,final Class<T> clazz) throws ParseException, IOException {
		 final String jsonFromResponse = EntityUtils.toString(response.getEntity());
	        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        
	        
	        return mapper.readValue(jsonFromResponse,  mapper.getTypeFactory().constructCollectionType(List.class, clazz));
		//return null;
	}
    
    
    
}
