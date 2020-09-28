
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMManageUsersResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMManageUsersResponse", propOrder = {
    "actionCode",
    "hsmUserList"
})
public class SwHSMManageUsersResponse {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "HSMUserList")
    protected List<SwHSMUserList> hsmUserList;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManageUsersResponse setActionCode(String value) {
        this.actionCode = value;
        return this;
    }

    /**
     * Gets the value of the hsmUserList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmUserList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMUserList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMUserList }
     * 
     * 
     */
    public List<SwHSMUserList> getHSMUserList() {
        if (hsmUserList == null) {
            hsmUserList = new ArrayList<SwHSMUserList>();
        }
        return this.hsmUserList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the hSMUserList list.
     * @see #getHSMUserList()
     * 
     */
    public SwHSMManageUsersResponse addHSMUserList(SwHSMUserList hSMUserList) {
        getHSMUserList().add(hSMUserList);
        return this;
    }

}
