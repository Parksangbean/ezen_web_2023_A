package model.dao;

import java.util.ArrayList;

import model.dto.AccountbookDto;

public class AccountbookDao extends Dao{
	private static AccountbookDao accountbookDao = new AccountbookDao();
	public static AccountbookDao getinstance() {return accountbookDao;}
	private AccountbookDao() {}
	
	public boolean atext(AccountbookDto accountbookDto) {
		try {
			
			String sql="insert into acountbook(atext,aprice,adate) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, accountbookDto.getAdate());
			ps.setInt(2, accountbookDto.getAprice());
			ps.setString(3, accountbookDto.getAdate());
			
			ps.execute();
			return true;
			
			
			
		}catch (Exception e) {System.out.println(e);}
		
		return false;
	}
	
	public ArrayList<AccountbookDto> aread(){
		ArrayList<AccountbookDto> list = new ArrayList<>();
		
		try {
			
			String sql ="select * from acountbook order by adate desc";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				AccountbookDto dto = new AccountbookDto(
						rs.getInt(1),rs.getString(2),rs.getInt(3),
						rs.getString(4));
				list.add(dto);
			}
			
		}catch (Exception e) { System.out.println(e);}
		return list;
	}
}
