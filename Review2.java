package com.lunodzo;

import java.nio.file.*;
import java.util.List;

public class Review2{
	public static void main(String[] args){
		try{
			Path file = FileSystems.getDefault().getPath("","file.txt");
			List<String> lines = Files.readAllLines(file);
			for(int i=0; i < lines.size(); i++){
				System.out.println(lines.get(i));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}