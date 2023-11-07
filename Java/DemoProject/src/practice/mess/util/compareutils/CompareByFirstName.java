package practice.mess.util.compareutils;

import java.util.Comparator;

import practice.mess.pojo.MessMember;

public class CompareByFirstName implements Comparator<MessMember>{

	@Override
	public int compare(MessMember mm1, MessMember mm2) {
		return mm1.getFirstName().compareTo(mm2.getFirstName());
	}

}
