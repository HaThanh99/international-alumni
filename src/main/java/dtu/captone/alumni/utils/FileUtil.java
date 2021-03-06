package dtu.captone.alumni.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import dtu.captone.alumni.constant.CommonConstants;

public class FileUtil {


	public static String upload(MultipartFile multipartFile, HttpServletRequest request) throws IllegalStateException, IOException {
		String webPath = request.getServletContext().getRealPath("");
		String dirPath = webPath + CommonConstants.DIR_UPLOAD;
		if (new File(dirPath).exists()) {
			new File(dirPath).mkdir();
		}
		String fileName = multipartFile.getOriginalFilename();
		System.out.println(fileName);
		String pathFile = dirPath + File.separator + fileName;
				multipartFile.transferTo(new File(pathFile));
				System.out.println(pathFile);
		return fileName;
	}
	
	public static void delete(String nameFile, HttpServletRequest request) throws IllegalStateException, IOException {
		String dirFile = request.getServletContext().getRealPath("") + CommonConstants.DIR_UPLOAD;
		File file = new File(dirFile + File.separator + nameFile);
		if (file.exists()) {
			file.delete();
		}
	}
}
