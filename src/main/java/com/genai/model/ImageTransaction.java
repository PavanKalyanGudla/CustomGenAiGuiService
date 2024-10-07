package com.genai.model;

import java.util.Arrays;

public class ImageTransaction {
	private int transactionId;
    private String dateOfChat;
    private String userid;
    private String question;
    private byte[] answer;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getDateOfChat() {
		return dateOfChat;
	}
	public void setDateOfChat(String dateOfChat) {
		this.dateOfChat = dateOfChat;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public byte[] getAnswer() {
		return answer;
	}
	public void setAnswer(byte[] answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ImageTransaction [transactionId=" + transactionId + ", dateOfChat=" + dateOfChat + ", userid=" + userid
				+ ", question=" + question + ", answer=" + Arrays.toString(answer) + "]";
	}
}
