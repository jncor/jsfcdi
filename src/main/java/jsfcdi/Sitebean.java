package jsfcdi;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped; // SCOPE !
import javax.inject.Named; // DECLARATION !
import javax.inject.Inject; // INJECTION !
import java.io.Serializable;

@Named(value="meusite")
@ApplicationScoped
public class Sitebean implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	Info myinfo;
	private int usage;
	
	public Sitebean() {
		
	}

	@PostConstruct
	public void posConstruct() {
		usage = 0;
	}
	
	public Info getMyinfo() {
		return myinfo;
	}

	public void setMyinfo(Info myinfo) {
		this.myinfo = myinfo;
		
	}
	
	public String getUsageInfo() {
		return "<p> Usage of info: " + this.usage;
	}
	
	public String send() {
		this.usage++;
		return "index";
	}
	
}
