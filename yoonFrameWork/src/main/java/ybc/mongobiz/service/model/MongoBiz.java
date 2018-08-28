package ybc.mongobiz.service.model;


/**
 * 
 * @author 윤병찬
 *
 */
public class MongoBiz{

	
	private String name = "";
	private String memo = "";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	@Override
	public String toString() {
		return "MongoBiz [name=" + name + ", memo=" + memo + "]";
	}

}
