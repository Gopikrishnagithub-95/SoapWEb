
package com.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.9
 * Thu Feb 28 22:18:29 IST 2019
 * Generated source version: 2.7.9
 */

@XmlRootElement(name = "addMemberResponse", namespace = "http://soap.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMemberResponse", namespace = "http://soap.com/")

public class AddMemberResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

