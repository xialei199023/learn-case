/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
package demo.learn.json.jackson;


import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author xialei
 * @version 1.0 2016年4月18日下午10:49:08
 */
public class JacksonMain {

	public String toJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(object);
		return json;
	}
	
	public MyJsonObject fromJson(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json.getBytes(), MyJsonObject.class);
	}
	
	public static void main(String[] args) throws IOException {
		JacksonMain jacksonMain = new JacksonMain();
		
		MyJsonObject myJsonObject = new MyJsonObject();
		myJsonObject.setName("xialei");
		myJsonObject.setBirthday(new Date());
		String json = jacksonMain.toJson(myJsonObject);
		System.out.println(json);
		
		MyJsonObject object = jacksonMain.fromJson(json);
		System.out.println(object);
	}
}
