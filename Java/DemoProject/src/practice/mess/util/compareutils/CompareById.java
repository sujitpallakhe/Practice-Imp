package practice.mess.util.compareutils;

import java.util.Comparator;

import practice.mess.pojo.MessMember;

public class CompareById implements Comparator<MessMember>{

	@Override
	public int compare(MessMember mm1, MessMember mm2) {
		return mm1.getId() - mm2.getId();
	}

}
