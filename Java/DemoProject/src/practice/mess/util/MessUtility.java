package practice.mess.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import practice.mess.pojo.MessMember;
import practice.mess.pojo.MessPlan;
import practice.mess.util.compareutils.CompareByFirstName;
import practice.mess.util.compareutils.CompareById;

public class MessUtility {

	// Add Member
	public static void addMemberToMess(MessMember member) {
		
		// Check Validation
		boolean isValidMemberData = ValidationUtil.checkValidaData(member);
		
		if(isValidMemberData) {
			Map<Integer, MessMember> memberMap = IOUtility.readData();
			if (null == memberMap || memberMap.isEmpty()) {
				// As MAP is empty creating new map
				memberMap = new HashMap<Integer, MessMember>();
				memberMap.put(member.getId(), member);
				System.out.println("Creating File Newly");
			} else {
				// Map data already exists
				boolean isDuplicateMember = ValidationUtil.checkDuplicate(memberMap, member);
				if (!isDuplicateMember) {
					memberMap.put(member.getId(), member);
				} else {
					System.out.println("Duplicate Membership Found : " + " "+ member.getId() + " = "+ member.getFirstName() + " " + member.getLastName());
				}
			}
			IOUtility.submitData(memberMap);
		}
	}

	// Delete Member
	public static void deleteMemberFromMess(int memberId) {
		Map<Integer, MessMember> memberMap = IOUtility.readData();
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		} else {
			memberMap.remove(memberId);
			IOUtility.submitData(memberMap);
		}
	}

	// Update Member Data

	// Read Member Data
	public static void getAllData() {
		Map<Integer, MessMember> memberMap = IOUtility.readData();
		
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			Set<Entry<Integer, MessMember>> memberSet = memberMap.entrySet();
			Iterator<Entry<Integer, MessMember>> mapEntrySetItr = memberSet.iterator();
	
			while (mapEntrySetItr.hasNext()) {
				Entry<Integer, MessMember> member = mapEntrySetItr.next();
				System.out.println("Key : " + member.getKey());
				System.out.println("Value : " + member.getValue());
			}
		}
	}
	
	// Read Member Data, Sort by ID
	public static void getAllDataSortById() {
		CompareById cmpId = new CompareById();

		Map<Integer, MessMember> memberMap = IOUtility.readData();
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			Collection<MessMember> members = memberMap.values();
			List<MessMember> memberList = new ArrayList<>(members);
			Collections.sort(memberList, cmpId);
	
			Iterator<MessMember> mapEntrySetItr = memberList.iterator();
			while (mapEntrySetItr.hasNext()) {
				MessMember member = mapEntrySetItr.next();
				System.out.println("Key : " + member);
			}
		}
	}
	
	// Read Member Data, Sort by Name
	public static void getAllDataSortByFirstName() {
		CompareByFirstName cmpFirstName = new CompareByFirstName();

		Map<Integer, MessMember> memberMap = IOUtility.readData();
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			Collection<MessMember> members = memberMap.values();
			List<MessMember> memberList = new ArrayList<>(members);
			Collections.sort(memberList, cmpFirstName);
	
			 Iterator<MessMember> mapEntrySetItr = memberList.iterator();
	
			while (mapEntrySetItr.hasNext()) {
				MessMember member = mapEntrySetItr.next();
				System.out.println("Key : " + member);
			}
		}
	}

	// Get data from id
	public static void getDataFromId(int memberId) {
		Map<Integer, MessMember> memberMap = IOUtility.readData();
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			MessMember memberData = memberMap.get(memberId);
			if (null == memberData) {
				System.out.println("Data Not Exists for Member Id : " + memberId);
			} else {
				System.out.println(memberData);
			}
		}
	}

	// Get data specific plan
	public static void getDataForSpecificPlan(MessPlan plan) {
		Map<Integer, MessMember> memberMap = IOUtility.readData();
		
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			Set<Entry<Integer, MessMember>> memberSet = memberMap.entrySet();
			Iterator<Entry<Integer, MessMember>> mapEntrySetItr = memberSet.iterator();
	
			while (mapEntrySetItr.hasNext()) {
				Entry<Integer, MessMember> member = mapEntrySetItr.next();
				MessMember memberData = member.getValue();
				if (memberData.getPlan().equals(plan)) {
					System.out.println(memberData);
				}
			}
		}
	}

	// Get data by address
	public static void getDataForAddress(String address) {
		Map<Integer, MessMember> memberMap = IOUtility.readData();
		if (null == memberMap || memberMap.isEmpty()) {
			System.out.println("No data exists");
		}else {
			Set<Entry<Integer, MessMember>> memberSet = memberMap.entrySet();
			Iterator<Entry<Integer, MessMember>> mapEntrySetItr = memberSet.iterator();
	
			while (mapEntrySetItr.hasNext()) {
				Entry<Integer, MessMember> member = mapEntrySetItr.next();
				MessMember memberData = member.getValue();
				if (memberData.getAddress().equals(address)) {
					System.out.println(memberData);
				}
			}
		}
	}

}
