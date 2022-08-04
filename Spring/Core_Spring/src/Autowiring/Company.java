package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*Constructor
 * byName (Type + refName)
 * byType (only Type checking)
 * default (By 	Constructor call )
 * */

public class Company {

	@Autowired
	@Qualifier("deptObj")
	Dept dept;
	
	public void companyWork() {
		if(dept == null) {
			System.err.println("No Client no work !!");
		}else {
			dept.work();
		}
	}
}
