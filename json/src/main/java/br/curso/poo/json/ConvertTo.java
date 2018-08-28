package br.curso.poo.json;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;

public class ConvertTo {

	private ConvertTo() { }
	
	private static ConvertTo instance;
	
	//Exemplo de design pattern
	public static ConvertTo getInstance() {
		if (instance == null) {
			synchronized (ConvertTo.class) {
				if (instance == null) {
					ConvertTo instance = new ConvertTo();
					ConvertTo.instance = instance;
				}
			}
		}
		return instance;
	}
	
	//Exemplo de Java Reflection
	@SuppressWarnings("rawtypes")
	public File json(Object obj, String filePath) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		String jsonString = "{\n";
		for (int i = 0; i < fields.length; i++) {
			boolean addComma = i < (fields.length - 1);
			Field field = fields[i];
			field.setAccessible(true);
			jsonString += "   " + field.getName() + ": ";
			Class<?> fieldType = field.getType();
			if (fieldType == Short.class || fieldType == short.class) {
				jsonString += field.getShort(obj);
			} else if (fieldType == Integer.class || fieldType == int.class) {
				jsonString += field.getInt(obj);
			} else if (fieldType == Long.class || fieldType == long.class) {
				jsonString += field.getLong(obj);			
			} else if (fieldType == Float.class || fieldType == float.class) {
				jsonString += field.getFloat(obj);
			} else if (fieldType == Double.class || fieldType == double.class) {
				jsonString += field.getDouble(obj);
			} else if (fieldType == Character.class || fieldType == char.class) {
				jsonString += "\"" + replaceQuotes(field.getChar(obj)) + "\"";
			} else if (fieldType == String.class) {
				jsonString += "\"" + replaceQuotes((String)field.get(obj)) + "\"";
			} else if (fieldType == List.class) {
				List<?> list = (List)field.get(obj);
				jsonString += "[\n";
				for (int j = 0; j < list.size(); j++) {
					boolean addListComma = j < (list.size() - 1);
					jsonString += json(list.get(j));
					if (addListComma) {
						jsonString += ",\n";
					} else {
						jsonString += "\n";
					}
				}
				jsonString += "   ]";
			}
			if (addComma) {
				jsonString += ",\n";
			} else {
				jsonString += "\n";
			}
		}
		jsonString += "}";
		File file = new File(filePath);
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
		writer.write(jsonString);
		writer.close();
		return file;
	}
	
	private String json (Object obj) throws Exception {
		Field[] fields = obj.getClass().getDeclaredFields();
		String jsonString = "      {\n";
		for (int i = 0; i < fields.length; i++) {
			boolean addComma = i < (fields.length - 1);
			Field field = fields[i];
			field.setAccessible(true);
			jsonString += "         " + field.getName() + ": ";
			Class<?> fieldType = field.getType();
			if (fieldType == Short.class || fieldType == short.class) {
				jsonString += field.getShort(obj);
			} else if (fieldType == Integer.class || fieldType == int.class) {
				jsonString += field.getInt(obj);
			} else if (fieldType == Long.class || fieldType == long.class) {
				jsonString += field.getLong(obj);			
			} else if (fieldType == Float.class || fieldType == float.class) {
				jsonString += field.getFloat(obj);
			} else if (fieldType == Double.class || fieldType == double.class) {
				jsonString += field.getDouble(obj);
			} else if (fieldType == Character.class || fieldType == char.class) {
				jsonString += "\"" + replaceQuotes(field.getChar(obj)) + "\"";
			} else if (fieldType == String.class) {
				jsonString += "\"" + replaceQuotes((String)field.get(obj)) + "\"";
			}
			if (addComma) {
				jsonString += ",\n";
			} else {
				jsonString += "\n";
			}
		}
		jsonString += "      }";
		return jsonString;
	}
	
	private String replaceQuotes(String txt) {
		if (txt == null) {
			return "";
		}
		return txt.replaceAll("\"", "\\\"").replaceAll("'", "\'");
	}

	private String replaceQuotes(Character character) {
		if (character == null) {
			return "";
		}
		return character.charValue() == '\'' ? "\'" : character.charValue() == '"' ? "\"" : String.valueOf(character.charValue());
	}
}