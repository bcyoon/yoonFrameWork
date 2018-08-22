package ybc.oraclebiz.service.model;


/**
 * 
 * @author 윤병찬
 *
 */
public class OracleBiz{

	
	private String pagelayoutId = ""; 

	private String name = "";
	
	private String viewName = "";

	public String getPagelayoutId() {
		return pagelayoutId;
	}

	public void setPagelayoutId(String pagelayoutId) {
		this.pagelayoutId = pagelayoutId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	@Override
	public String toString() {
		return "OracleBiz [pagelayoutId=" + pagelayoutId + ", name=" + name + ", viewName=" + viewName + "]";
	}
	

}
