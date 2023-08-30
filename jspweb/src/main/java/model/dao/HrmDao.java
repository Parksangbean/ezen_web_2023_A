package model.dao;

import model.dto.HrmDto;

public class HrmDao extends Dao{
	private static HrmDao hrmDao = new HrmDao();
	public static HrmDao getInstance() {return hrmDao;}
	private HrmDao() {}
	
	public boolean save(HrmDto dto) {
		try {
			String sql="insert into hrm(hrmimg,hrmname,hrmphone,hrmposition) values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dto.getHrmimg());
			ps.setString(2, dto.getHrmname());
			ps.setString(3, dto.getHrmphone());
			ps.setString(4, dto.getHrmposition());
			
			int row = ps.executeUpdate();
			if(row==1)return true;
		}catch (Exception e) {System.out.println(e);}
		
		return false;
	}
}
