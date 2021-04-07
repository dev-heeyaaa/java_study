package chapter9;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7 {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		File dir = new File(currentDir);
		
		File[] files = dir.listFiles();
		for(File f : files) {
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm aa");
			String lastModified = sdf.format(new Date(f.lastModified()));
			String attribute = "DIR";
			long size = f.length();
			
			if(f.isFile()) {
				attribute = f.canRead() ? "R" : " "; // 권한 표식
				attribute = f.canWrite() ? "W" : " ";
				attribute = f.isHidden() ? "H" : " ";// 숨겨진 파일
			}
			System.out.printf("%s %3s %6s %s\n", lastModified, attribute, size, name);
		}// end for

	}

}
