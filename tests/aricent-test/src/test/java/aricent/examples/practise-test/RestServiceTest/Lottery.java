package aricent.examples.practise-test.RestServiceTest;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.path.json.JsonPath;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lottery {
private RequestSpecBuilder rsb=null;
Private String apiUrl="http://localhost:8080/lotto";
private List<Integer> expectedNumbers=new ArrayList<>(Arrays.asList(34,23,5));
@BeforeClass
public void setup(){

 rsb = new RequestSpecBuilder()
                .addHeader("Authorization", "ABCDE12345ABCDE")
                .addHeader("value", "true")
                .addHeader("encode","false");
    }
    @Test
    public void testLottery(){
    //Creating json object body
    JSONObject js=generateJsonReq("lottoId",5);
    //Posting request
    JsonPath jp=given().spec(rsb.build()).contentType("").body(js).expect().statusCode(201)
    .when().post(apiUrl).body().jsonPath;
    //Printing json response
    System.out.print(jp.prettyPrint());
    //Getting lotteryId
    String lottoId=jp.getInt("lotto.lottoId");
    //Asserting lotteryId with 5
    Assert.assertEquals(lottoId,5);
    //Getting winnerId and numbers into list as a map
    List<Map<String ,List<Integer>>> list=jp.getList("lotto.winners");
    //Asserting list size to 2
    Assert.assertEquals(list.size(),2);
    //itterating list to get values
   boolean winerId=false;
   int count=0;
   for(int i=0 ;i<list.size();i++){
   // Retriving map from list
     Map<String ,List<Integer>> map=list.get(i);
     //Itterating map for details
      for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
      String key = entry.getKey();
      //Retreving list from map using key
      List<Integer> value=entry.get(key);
      //checking for winnerId =23 
      if(value.size()==1&&value.get(0)==23){
      winerId=true;
      }
      //If winnerId matches checking for numbers 
      if(key=="numbers"&&winerId){
      
      for(int num=0;num<value.size();num++){
      for(int expNum : expectedNumbers){
      if(value.get(num)==expNum){
      System.out.println("Expected number is found in the list " +expNum );
      count++;
      break;
              }
         }
       }
     }
       
   }
   if(winerId&&count==3){
      System.out.println("WinnerId 23 contains the expected values");
      }
      else{
      System.out.println("Either winner Id 23 not found or WinnerId 23 does not contains the expected values");
      }

    }
    
    public JSONObject generateJsonReq(String input ,int val){
    Map<String, Object> data = new HashMap<String, Object>();
    data.put( input, val );
    JSONObject json = new JSONObject();
    json.putAll( data );
    System.out.printf( "JSON: %s", json.toString(2) );
    return json.toString(2);
    }
    @AfterClass
    public void teadDown(){
    System.out.println("Test completed);
    }

}


