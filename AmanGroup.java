package com.test.circle;

public class AmanGroup {
	
	private String aman="Aman";
	private String group="Group";
	
	public AmanGroup(){}
	
	public String getAman() {
		return aman;
	}
	public void setAman(String aman) {
		this.aman = aman;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void counter(){
		for (int i = 0; i < 100; i++) {
			if(i%3==0 && i%5==0){
				System.out.println(aman+group);
			}else if(i%5==0){
				System.out.println(group);
			}else if(i%3==0){
				System.out.println(aman);
				
			}else{
				System.out.println(i);
			}
			
		}
	}

}
