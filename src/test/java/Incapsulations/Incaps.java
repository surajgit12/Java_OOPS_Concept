package Incapsulations;

public class Incaps {

	private int eid;  // instance var
	private String ename;
	
	
	//

	public void setEname(String ename) { // local variable
		this.ename = ename;
		
	//	intstanc varibale<>-------local varibvale
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

}
