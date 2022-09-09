package edu.n2.exercise_1;

public class UKDiaryFactory implements DiaryFactory {

	@Override
	public Address getAddress() {
		Address address = new UKAddress();
		address.requestAddressData();
		return address;
		}
	
	@Override
	public PhoneNumber getPhoneNumber() {
		PhoneNumber phoneNumber = new UkPhoneNumber();
		phoneNumber.requestPhoneData();
		return phoneNumber;
		}
}
