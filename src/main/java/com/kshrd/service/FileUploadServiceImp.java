package com.kshrd.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileUploadServiceImp implements FileUploadService {
	private String UPLOADED_FOLDER="/Users/sophally/Images/";
	@Override
	public String uploadFile(MultipartFile mutipathFile) {
		String fileName="";
		try{
			fileName=generateFileName(mutipathFile.getOriginalFilename());
			byte[] bytes = mutipathFile.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER+fileName);
			Files.write(path,bytes);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return "/resources/" + fileName;
	}
	String generateFileName(String file){
		String str = file.substring(file.lastIndexOf("."));
		String fileName=System.nanoTime()+str;
		return fileName;
	}

}
