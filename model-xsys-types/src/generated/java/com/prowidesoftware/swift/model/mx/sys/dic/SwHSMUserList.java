
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMUserList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMUserList", propOrder = {
    "hsmUser"
})
public class SwHSMUserList {

    @XmlElement(name = "HSMUser", required = true)
    protected List<SwHSMUser> hsmUser;

    /**
     * Gets the value of the hsmUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMUser }
     * 
     * 
     */
    public List<SwHSMUser> getHSMUser() {
        if (hsmUser == null) {
            hsmUser = new ArrayList<SwHSMUser>();
        }
        return this.hsmUser;
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
     * Adds a new item to the hSMUser list.
     * @see #getHSMUser()
     * 
     */
    public SwHSMUserList addHSMUser(SwHSMUser hSMUser) {
        getHSMUser().add(hSMUser);
        return this;
    }

}
