package jsfcdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped; // SCOPE !
import javax.inject.Named; // DECLARATION !
import javax.inject.Inject; // INJECTION !
import java.io.Serializable;
import jsfcdi.*;

@Named(value="meusite")
@ApplicationScoped
public class Sitebean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private Info myinfo;
	private int usage;
	private Integer[] array;
	private Integer[][] arrayBi;
	

	@PostConstruct
	public void posConstruct() {
		init();
		this.array = new Integer[12];
		for(int i = 0 ;i < this.array.length ; i++) {
			this.array[i] = i*2;
		}
		this.arrayBi = new Integer[5][5];
		for(int i = 0 ;i < this.arrayBi.length ; i++) {
			for (int j=0;j < this.arrayBi[0].length; j++) {
				this.arrayBi[i][j] = i*3 + j;
			}
		}
	}
	
	public void init() {
		usage = 0;
	}
	
	public Info getMyinfo() {
		return myinfo;
	}

	public void setMyinfo(Info myinfo) {
		this.myinfo = myinfo;
		
	}
	
	public String getUsageInfo() {
		// escape="false"
		return "<p> Usage of info: " + this.usage + "</p>";
	}
	
	public String send() {
		this.usage++;
		return "index";
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}

	public Integer[][] getArrayBi() {
		return arrayBi;
	}

	public void setArrayBi(Integer[][] arrayBi) {
		this.arrayBi = arrayBi;
	}
	

	
	
}
