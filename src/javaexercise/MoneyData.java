package javaexercise;

import java.time.LocalDate;

public class MoneyData {
	int Id;
	String merchantNumber;
	String expFeeNumber;
	LocalDate fileDate;
	LocalDate repDate;
	int bankId;
	String bankName;
	double fee;
	
	public MoneyData(int id, String merchantNumber, String expFeeNumber, LocalDate fileDate, LocalDate repDate,
			int bankId, String bankName, double fee) {
		super();
		Id = id;
		this.merchantNumber = merchantNumber;
		this.expFeeNumber = expFeeNumber;
		this.fileDate = fileDate;
		this.repDate = repDate;
		this.bankId = bankId;
		this.bankName = bankName;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "MoneyData [Id=" + Id + ", merchantNumber=" + merchantNumber + ", expFeeNumber=" + expFeeNumber
				+ ", fileDate=" + fileDate + ", repDate=" + repDate + ", bankId=" + bankId + ", bankName=" + bankName
				+ ", fee=" + fee + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMerchantNumber() {
		return merchantNumber;
	}

	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}

	public String getExpFeeNumber() {
		return expFeeNumber;
	}

	public void setExpFeeNumber(String expFeeNumber) {
		this.expFeeNumber = expFeeNumber;
	}

	public LocalDate getFileDate() {
		return fileDate;
	}

	public void setFileDate(LocalDate fileDate) {
		this.fileDate = fileDate;
	}

	public LocalDate getRepDate() {
		return repDate;
	}

	public void setRepDate(LocalDate repDate) {
		this.repDate = repDate;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
}
