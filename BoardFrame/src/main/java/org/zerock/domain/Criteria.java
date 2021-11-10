package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	
	private int pageNum;
	private int amount;

	private String type;
	private String keyword;
	
	public Criteria() {
		this(1, 10);
		System.out.println("순서가 궁금하다" + pageNum);
	}
	
	public Criteria(int pageNum, int amount) {
		System.out.println("순서가 궁금하다2" + pageNum);
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public String[] getTypeArr() {
		
		return type ==null ? new String[] {} : type.split("");   //타입은 t,w 이렇게 되어있기 때문에 배열로 바꾼다. 
	}
	
	public String getListLink() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
				.queryParam("pageNum", this.pageNum)
				.queryParam("amount", this.getAmount())
				.queryParam("type", this.getType())
				.queryParam("keyword", this.getKeyword());
		return builder.toUriString();
	}
}
