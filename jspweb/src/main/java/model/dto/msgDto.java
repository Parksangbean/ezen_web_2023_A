package model.dto;

public class msgDto {
	private String frommid; // 보낸사람
	private String msg; // 보낸 내용
	
	public msgDto() {}

	public msgDto(String frommid, String msg) {
		super();
		this.frommid = frommid;
		this.msg = msg;
	}

	public String getFrommid() {
		return frommid;
	}

	public void setFrommid(String frommid) {
		this.frommid = frommid;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "msgDto [frommid=" + frommid + ", msg=" + msg + "]";
	}


	
	
}
