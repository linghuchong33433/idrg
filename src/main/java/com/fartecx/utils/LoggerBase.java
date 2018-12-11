/**
 * 为了简化logger的使用，特制定本类，子类需从此基类派生，然后调用‘logger’对象来记录日志。
 */
package com.fartecx.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Michael
 *
 */
public abstract class LoggerBase {
	
	protected Logger logger = null;
	
	public LoggerBase(){
		
	   logger= LoggerFactory.getLogger(getClass().getName());
	}
}

