package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class TC031_FileIOstream {
	FileInputStream srcFile;
	FileOutputStream destFile;
	

	public void initFIle(String srcPath , String destPath) {
		// TODO Auto-generated method stub
		try {
			srcFile = new FileInputStream(srcPath);
			destFile = new FileOutputStream(destPath);
			
		}catch(FileNotFoundException e) {
			System.out.println("Exception : "+e.getMessage());
			
		}
	}
	public void copyFile() {
		try {
			int i = srcFile.read();
			while(i != -1) {
				destFile.write(i);
				i = srcFile.read();
			}
		}catch(IOException e) {
			System.out.println("Exception : "+ e.getMessage());
		}
	}
	public void closeFile() {
		try {
			srcFile.close();
			destFile.close();
		}catch(IOException e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		String sourceFile = "Source.txt";
		String destFile = "Dest.txt";
		TC031_FileIOstream fileIo = new TC031_FileIOstream();
		fileIo.initFIle(sourceFile, destFile);
		fileIo.copyFile();
		fileIo.closeFile();
		
		}

}
