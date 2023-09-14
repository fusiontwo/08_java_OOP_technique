package step8_01.technique;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 멤버변수 초기화
class GoodsDTO {
	String goodsCd;
	String goodsNm;
	int goodsPrice;
	
	void setData(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	// 생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	// 상속을 배우면 public과 super()를 빼도 된다는 걸 알게 됨.
//	public GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
//		super();  // super는 상속과 관련
//		this.goodsCd = goodsCd;
//		this.goodsNm = goodsNm;
//		this.goodsPrice = goodsPrice;
//	}

	GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println(this.goodsCd + " / " + this.goodsNm + " / " + this.goodsPrice);
	}

}

public class TechniqueEx04_02 {

	public static void main(String[] args) {

		// (before)
//		GoodsDTO temp = new GoodsDTO();
//		temp.goodsCd = "0x001";
//		temp.goodsNm = "맨투맨";
//		temp.goodsPrice = 40000;
//		
//		temp.setData("0x001", "맨투맨", 40000);
		
		// (after) 생성자 사용
		GoodsDTO goods1 = new GoodsDTO("0x001", "맨투맨", 40000);
		goods1.printData();
		
		GoodsDTO goods2 = new GoodsDTO("0x002", "조거팬츠", 30000);
		goods2.printData();
		
		GoodsDTO goods3 = new GoodsDTO("0x003", "바람막이", 70000);
		goods3.printData();
		
		// 생성자 사용 예시
		Scanner scan = new Scanner(System.in);  // System.in이 주어져야 사용 가능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // 날짜가 주어져야 사용 가능
		DecimalFormat df = new DecimalFormat("#,##0");  // 패턴이 주어져야 사용 가능
	}

}
