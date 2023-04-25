package com.java.eight.problem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemSix {

	public static void main(String[] args) {
		// R:\code\New folder\abhi.txt
		OutputStream wb = null;
		try {
			   Path path = Paths.get("R://code/New folder/abhi.txt");
			// file = new File("R:\\code\\New folder\\abhi.txt");
			//wb = new FileOutputStream(file);
	           wb = Files.newOutputStream(path, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			List<Integer> numbrs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			String result = numbrs.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(","));
			String newLine ="\n";
			wb.write(result.getBytes());
			wb.write(newLine.getBytes());
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (wb != null) {
					wb.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
