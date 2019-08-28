package com.wechat.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 *	JSON工具类 
 */
public class JSONUtils {

	private final static Logger logger = LoggerFactory.getLogger(JSONUtils.class);

	private JSONUtils() {
	}

	/**
	 * 将JSON格式数据转换成对象(失败返回NULL)
	 */
	public static <T> T json2Object(final String json, final Class<T> clazz) {

		if (json == null || json.trim().isEmpty())
			return null;

		try {
			JsonMapper mapper = new JsonMapper();
			
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

			mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			
			return mapper.readValue(json, clazz);
		}catch (Exception e) {
			logger.error("json==>"+json+"转换对象异常", e);
			return null;
		}
	}

	/**
	 * 将JSON格式数据转换成Map对象(失败返回NULL)
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> json2Map(final String json) {
		return json2Object(json, Map.class);
	}

	/**
	 * 将JSON格式数据转换成List(失败返回NULL)
	 */
	@SuppressWarnings("unchecked")
	public static List<Object> json2List(final String json) {
		return json2Object(json, List.class);
	}

	/**
	 * 将JAVA对象转换成JSON字符串(失败返回NULL)
	 */
	public static String object2Json(final Object object) {

		if (object == null)
			return null;

		ObjectMapper mapper = new ObjectMapper();

		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		
		try {
			return mapper.writeValueAsString(object);
		}catch (Exception e) {
			logger.error("object==>"+object.toString()+"转换json字符串异常", e);
			return null;
		}
	}

}
