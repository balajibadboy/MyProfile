package com.personalinfo;

public class TestProfile {
	
public static  void printProfile(IProfile profile)
{
	profile.myBasicInfo();
	profile.myHobbies();
	}
public static void main(String args[]) 
{
IProfile myProfile=new FriendProfileProfile();
//IProfile myProfile1=new BalajiProfile();
//printProfile(myProfile1);
printProfile(myProfile);
}
}
