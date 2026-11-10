package com.office.diary;

public class DiaryDto {
	
	/*
	 * 멤버 필드
	 */
	
	private String diaryTitle;
	private String diaryBody;
	
	/*
	 * 생성자
	 */
	
	public DiaryDto() {
		// TODO Auto-generated constructor stub
	}

	public DiaryDto(String diaryTitle, String diaryBody) {
		this.diaryTitle = diaryTitle;
		this.diaryBody = diaryBody;
	}
	
	/*
	 * Getters and Setters
	 */
	
	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryBody() {
		return diaryBody;
	}

	public void setDiaryBody(String diaryBody) {
		this.diaryBody = diaryBody;
	}
	
	
	
}
