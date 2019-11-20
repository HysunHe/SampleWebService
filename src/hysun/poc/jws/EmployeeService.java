/***************************************************************************
 *
 * PoC code for evaluating purpose only. No guarantee of quality.
 *
 ***************************************************************************/

package hysun.poc.jws;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***************************************************************************
 * <PRE>
 *  Project Name    : SampleWebService
 * 
 *  Package Name    : hysun.poc.jws
 * 
 *  File Name       : EmployeeService.java
 * 
 *  Creation Date   : 2018Äê5ÔÂ8ÈÕ
 * 
 *  Author          : Hysun He
 * 
 *  Purpose         : TODO
 * 
 *  
 *  History         : TODO
 * 
 * </PRE>
 ***************************************************************************/
@WebService(portName = "EmpOperationPort", serviceName = "EmployeeService")
public class EmployeeService {
	public Employee getEmp(String id) {
		System.out.println("*** Got id: " + id);
		return new Employee(id, "name: " + id.length());
	}
}
