package ua.lviv.lgs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ApplicationAnnotation {
	
	public static void main(String[] args) throws Exception {
		
		List<String> annotationStudentList = getAnnotation(Student.class);
		
		for (String string : annotationStudentList) {
			System.out.println(string);
		}
		
		writeToFile(annotationStudentList, new File("Annotation.txt"));
		
	}
	
	public static List<String> getAnnotation(Class<?> customClass) {
		
		List<String> annotationValues = new ArrayList<String>();
		
		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(StudentAnnotation.class) instanceof StudentAnnotation) {
				annotationValues.add(field.getType() + " " + field.getName() + " -> " + field.getAnnotation(StudentAnnotation.class).value());
			}
		}
		
		return annotationValues;
		
	}
	
	public static void writeToFile(List<String> list, File file) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.close();
		os.close();
	}

}
