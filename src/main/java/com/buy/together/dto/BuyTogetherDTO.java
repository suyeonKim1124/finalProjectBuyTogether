package com.buy.together.dto;

import java.util.Date;
import java.util.List;

import com.buy.together.domain.AttachedPhoto;

public class BuyTogetherDTO {

	private int buyTogether_number;
	private String title;
	private String content;
	private Date writedate;
	private Date updatedate;
	private Date duedate;
	private int joinin_number;
	private int price;
	private double longitude;
	private double latitude;
	private String buytogether_address_sido;
	private String buytogether_address_sigungu;
	private String category;
	private String nickname;
	private int reputation;
	private String hunting_status;
	private String hunting_type;
	private List<AttachedPhoto> path;

	public BuyTogetherDTO() {

	}

	public int getBuyTogether_number() {
		return buyTogether_number;
	}

	public void setBuyTogether_number(int buyTogether_number) {
		this.buyTogether_number = buyTogether_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWriteDate(Date writedate) {
		this.writedate = writedate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public int getJoinin_number() {
		return joinin_number;
	}

	public void setJoinin_number(int joinin_number) {
		this.joinin_number = joinin_number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getBuytogether_address_sido() {
		return buytogether_address_sido;
	}

	public void setBuytogether_address_road_address(String buytogether_address_sido) {
		this.buytogether_address_sido = buytogether_address_sido;
	}

	public String getBuytogether_address_sigungu() {
		return buytogether_address_sigungu;
	}

	public void setBuytogether_address_sigungu(String buytogether_address_sigungu) {
		this.buytogether_address_sigungu = buytogether_address_sigungu;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getHunting_status() {
		return hunting_status;
	}

	public void setHunting_status(String hunting_status) {
		this.hunting_status = hunting_status;
	}

	public String getHunting_type() {
		return hunting_type;
	}

	public void setHunting_type(String hunting_type) {
		this.hunting_type = hunting_type;
	}

	public List<AttachedPhoto> getPath() {
		return path;
	}

	public void setPath(List<AttachedPhoto> path) {
		this.path = path;
	}
	
}
