package model.dto;

public class AccountbookDto {
	private int ano;
	private String atext;
	private int aprice;
	private String adate;
	
	public AccountbookDto() {}

	public AccountbookDto(int ano, String atext, int aprice, String adate) {
		super();
		this.ano = ano;
		this.atext = atext;
		this.aprice = aprice;
		this.adate = adate;
	}

	
	

	public AccountbookDto(String atext, int aprice, String adate) {
		super();
		this.atext = atext;
		this.aprice = aprice;
		this.adate = adate;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAtext() {
		return atext;
	}

	public void setAtext(String atext) {
		this.atext = atext;
	}

	public int getAprice() {
		return aprice;
	}

	public void setAprice(int aprice) {
		this.aprice = aprice;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	@Override
	public String toString() {
		return "AccountbookDto [ano=" + ano + ", atext=" + atext + ", aprice=" + aprice + ", adate=" + adate + "]";
	}

	
	
	
}
