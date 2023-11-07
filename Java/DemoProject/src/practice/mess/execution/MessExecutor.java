package practice.mess.execution;

import java.time.LocalDate;

import practice.mess.pojo.MessMember;
import practice.mess.pojo.MessPlan;
import practice.mess.util.MessUtility;

public class MessExecutor {

	public static void main(String[] args) {

		MessMember m1 = new MessMember(1111, "Sumit", "Pallakhe", "sumit.pallakhe@gmail.com", "Brahmi@123", "Ashta",
				"784100256599", MessPlan.MONTHLY, LocalDate.parse("2023-11-08"));
		MessMember m2 = new MessMember(1910, "Sujit", "Pallakhe", "sujitpallakhe1997@gmail.com", "Brahms@123", "Pune",
				"8888914550", MessPlan.HALFYEARLY, LocalDate.parse("2023-11-07"));
		MessMember m3 = new MessMember(3323, "Brahmi", "Pallakhe", "bsp@gmail.com", "Brahmi@123", "Pune", "7841002565",
				MessPlan.MONTHLY, LocalDate.parse("2023-11-07"));
		MessMember m4 = new MessMember(1112, "Anjli", "Pallakhe", "patilanjali11.ap@gmail.com", "Brahms@123", "Pune",
				"8888914550", MessPlan.HALFYEARLY, LocalDate.parse("2023-11-07"));
		MessMember m5 = new MessMember(1212, "Anjli", "Pallakhe", "patilanjali11.ap@gmail.com", "Brahms@123", "Pune",
				"8888914550", MessPlan.HALFYEARLY, LocalDate.parse("2023-11-06"));

		MessUtility.addMemberToMess(m1);
		MessUtility.addMemberToMess(m2);
		MessUtility.addMemberToMess(m3);
		MessUtility.addMemberToMess(m4);
		MessUtility.addMemberToMess(m5);

		// MessUtility.getDataForSpecificPlan(MessPlan.MONTHLY);
		// MessUtility.getDataForAddress("Ashta");
		MessUtility.getAllData();
		// MessUtility.getAllDataSortByFirstName();
		// MessUtility.getAllDataSortById();

		// MessUtility.deleteMemberFromMess(1910);
		// MessUtility.getAllData();

		// MessUtility.getDataFromId(1111);
		// MessUtility.getDataFromId(4354);
	}

}
