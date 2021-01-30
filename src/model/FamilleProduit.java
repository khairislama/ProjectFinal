package model;

import database.DataBaseConnection;
import database.DataBaseTableNames;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FamilleProduit {

    private int code_famille;
	private String designation_famille;
	
	public FamilleProduit() {
		super();
	}
	public FamilleProduit(int code_famille, String designation_famille) {
		super();
		this.code_famille = code_famille;
		this.designation_famille = designation_famille;
	}
	public int getCode_famille() {
		return code_famille;
	}
	public void setCode_famille(int code_famille) {
		this.code_famille = code_famille;
	}
	public String getDesignation_famille() {
		return designation_famille;
	}
	public void setDesignation_famille(String designation_famille) {
		this.designation_famille = designation_famille;
	}
}
