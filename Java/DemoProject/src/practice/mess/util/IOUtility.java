package practice.mess.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import practice.mess.pojo.MessMember;

public class IOUtility {

	public static final String FILE_PATH = "D:\\messdata.txt";

	// Read Data
	static Map<Integer, MessMember> readData() {
		try (FileInputStream fin = new FileInputStream(FILE_PATH)) {
			try (ObjectInputStream oin = new ObjectInputStream(fin)) {
				Map<Integer, MessMember> memberMap = (Map<Integer, MessMember>) oin.readObject();
				return memberMap;
			}
		} catch (IOException | ClassNotFoundException ex) {
			//System.out.println("File not found");
		}
		return null;
	}

	// Save Data
	public static void submitData(Map<Integer, MessMember> map) {
		try (FileOutputStream fout = new FileOutputStream(FILE_PATH)) {
			try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(map); // serialization
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
