package edu.n2.exercise_1;

public class IndianDiaryFactory implements DiaryFactory {

	@Override
	public Address getAddress() {
		Address address = new IndianAddress();
		address.requestAddressData();
		return address;}
	
	@Override
	public PhoneNumber getPhoneNumber() {
		PhoneNumber phoneNumber = new IndianPhoneNumber();
		phoneNumber.requestPhoneData();
		return phoneNumber;
	}
}
