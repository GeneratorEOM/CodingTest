package vcanus;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class _1_Bread {

	public static void main(String[] args) {
		// json 을 사용하기 위해 project - buildpath 에서 mvnrepository 에서 다운받은 json-simple-1.1.1.jar 등록
		// JSON 파싱을 위해 parser 생성
		JSONParser parser = new JSONParser();
		try {
			// 로컬경로에서 json 파일 읽어오기
			JSONArray breadJsonArray = (JSONArray)parser.parse(new FileReader("C:/bread.json"));
			
			// 읽어온 jsonArray 를 jsonObject 로 반복 출력
			for (int i = 0; i < breadJsonArray.size(); i++) {
				// array 안의 object 를 출력하기 위해 담는다.
				JSONObject jsonObj = (JSONObject) breadJsonArray.get(i);
				
				System.out.println("breadType: " + jsonObj.get("breadType"));
				System.out.println("recipe");
				
				// recipe 안의 key 가 전부 다르다. get(key)로 가져올 수 있는데 key 를 지정하지 않고 어떻게 자동으로 리스트를 출력할 수 있을까?
				// keySet() 을 사용하여 key 값을 모두 가져온 다음 해당하는 값을 출력하게끔 만든다.
				jsonObj = (JSONObject) jsonObj.get("recipe");
			
				Iterator<String> recipeKeyList = jsonObj.keySet().iterator();
				
				// key 값이 존재하면 hasNext() == true 이므로 반복 
				while (recipeKeyList.hasNext()) {
					String recipekey = (String) recipeKeyList.next();
					System.out.println(recipekey + ": " + jsonObj.get(recipekey));					
				}				
				System.out.println();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


