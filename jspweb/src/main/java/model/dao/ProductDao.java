package model.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.dto.ProductDto;

public class ProductDao extends Dao{
	private static ProductDao productDao = new ProductDao();
	public static ProductDao getInstance() {return productDao;}
	private ProductDao() {}
	
	
	// 1. 제품 등록
	public boolean register(ProductDto productDto) {
		try {
			String sql="insert into product(pcno , pname , pcontent , pprice , plat , plng, mno )\r\n"
					+ " values(?,?,?,?,?,?,?)";
			// * sql insert 후 자동생성된 pk 번호를 반환하는 방법
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setInt(1, productDto.getPcno());
			ps.setString(2, productDto.getPname());
			ps.setString(3, productDto.getPcontent());
			ps.setInt(4, productDto.getPprice());
			ps.setString(5, productDto.getPlat());
			ps.setString(6, productDto.getPlng());
			ps.setInt(7, productDto.getMno());
			
			
			int count = ps.executeUpdate(); // 제품등록
			
			rs = ps.getGeneratedKeys(); // 제품등록시 생성된 식별키[pk] 반환해서 resultset[ps]에 대입
			if (rs.next()) {
			
			if(count ==1) {
				
				for(String img : productDto.getImgList().values() ) {
					
					sql = "insert into productimg(pimg , pno) values(?,?)";
					ps = conn.prepareStatement(sql);
					ps.setString(1, img);
					ps.setInt(2, rs.getInt(1));
					ps.executeUpdate();
				}
				
				return true; // 제품등록과 이미지 등록 성공했을때
			}
		}
		
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	
	
	// 0 . 제품의 해당하는 이미지 출력하는 함수
	public Map<Integer, String> getProductImg(int pno){
		try {
			Map<Integer, String > imglist = new HashMap<>();
			String sql ="select * from productimg where pno="+pno;
			
			PreparedStatement ps2 = conn.prepareStatement(sql);
			
			ResultSet rs2=  ps2.executeQuery();
			
			while(rs2.next()) {
				imglist.put(rs2.getInt("pimgno"), rs2.getString("pimg") );
				}
			return imglist;
		}catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	// 3. 선택된 제품번호에 해댱하는 제품 출력 함수
		public ProductDto findByPno(int pno){
			try {
				String sql ="select * from product p natural join pcategory pc natural join member m where p.pno="+pno;
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					ProductDto productDto = new ProductDto(
							rs.getInt("pcno") , rs.getString("pcname"),
							rs.getInt("pno"), rs.getString("pname"),
							rs.getString("pcontent"), rs.getInt("pprice") ,
							rs.getInt("pstate") , rs.getString("pdate"),
							rs.getString("plat"), rs.getString("plng"),
							rs.getInt("mno") , getProductImg(rs.getInt("pno")),
							rs.getString("mid")
							);
					return productDto;
				}
			}catch (Exception e) {System.out.println(e);}
				return null;
			
		}
		
		// 1. N개 제품들을 최신순으로 출력 함수
		public List<ProductDto> findByTop(int count){
			List<ProductDto> list = new ArrayList<>();
			try {
				String sql = "select * from product order by pdate desc limit "+count;
				ps=conn.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()) {list.add(findByPno(rs.getInt("pno"))); }return list;
			}catch (Exception e) {System.out.println(e);}
			return null;
		}
		
	//  2. 현재 카카오지도내 보고있는 동서남북 기준내 제품들을 출력 함수
	public List<ProductDto> findByLatLng(String east , String west, String south , String north){
		try { // 제품의 경도가 '동쪽' 작고 재퓸의 경도가 '서쪽' 크고 위도가 '남쪽' 크고 '북쪽' 작고
			List<ProductDto> list = new ArrayList<>();
			String sql ="select pno from product where plat >= ? and plat <= ? and plng >= ? and plng <= ? ";
			
			ps=conn.prepareStatement(sql);
			ps.setString(4, east); ps.setString(3, west); ps.setString(1, south); ps.setString(2, north);
			rs = ps.executeQuery();
			while(rs.next()) {list.add(findByPno(rs.getInt("pno") ) ); } return list;
		}catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	// 4. 모든 제품들을 출력하는 함수
	public List<ProductDto> findByAll(){
		try {
			List<ProductDto> list = new ArrayList<>();
			String sql ="select * from product";
			ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {list.add(findByPno(rs.getInt("pno") ) ); } return list;
		}catch (Exception e) {System.out.println(e);}
		
		return null;
	}
}
