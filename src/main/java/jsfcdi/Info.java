package jsfcdi;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Info implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
    private String lastName;
    private int count;

    
    public Info() {
    	
    }
    
    @PostConstruct
    public void posConstr() {
    	this.firstName = "first";
    	this.lastName = "last";
    	this.count = 0;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        count++;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
    
}
