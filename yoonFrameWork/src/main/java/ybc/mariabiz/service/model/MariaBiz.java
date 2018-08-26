package ybc.mariabiz.service.model;


/**
 * 
 * @author 윤병찬
 *
 */
public class MariaBiz{

	
	private int id = 0; 

	private String name = "";
	
	private String description = "";
	
	private String regDtm = "";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegDtm() {
		return regDtm;
	}

	public void setRegDtm(String regDtm) {
		this.regDtm = regDtm;
	}

	@Override
	public String toString() {
		return "MariaBiz [id=" + id + ", name=" + name + ", description=" + description + ", regDtm=" + regDtm + "]";
	}

	


}
