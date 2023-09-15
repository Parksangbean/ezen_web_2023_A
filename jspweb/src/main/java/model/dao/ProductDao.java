package model.dao;


import java.sql.Statement;
import java.util.List;

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
	
	// 2. 제품 전체 출력
	public List<ProductDto> findByTop(int count){
		return null;
	}
	//  3. 제품 개별 조회
	public List<ProductDto> findByLatLng(String east , String west, String south , String north){
		return null;
	}
	// 4. 제품 수정
	public ProductDto findByPno(int pno){
		return null;
	}
	// 5. 제품 삭제
	public List<ProductDto> findByAll(){
		return null;
	}
}
