package com.newbiest.msg.security.role;

import com.newbiest.msg.Response;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by guoxunbo on 2017/9/29.
 */
@Data
public class RoleResponse extends Response {
	
	private static final long serialVersionUID = 1L;
	
	private RoleResponseBody body;

}
