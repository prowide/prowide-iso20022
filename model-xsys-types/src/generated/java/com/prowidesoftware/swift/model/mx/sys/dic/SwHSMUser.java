
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
 * Java class for HSMUser complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMUser", propOrder = {
    "username",
    "dateModified",
    "pswdExpiresIndicator",
    "pswdExpiryDate",
    "role"
})
public class SwHSMUser {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "DateModified")
    protected String dateModified;
    @XmlElement(name = "PswdExpiresIndicator")
    protected String pswdExpiresIndicator;
    @XmlElement(name = "PswdExpiryDate")
    protected String pswdExpiryDate;
    @XmlElement(name = "Role")
    protected List<String> role;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMUser setUsername(String value) {
        this.username = value;
        return this;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMUser setDateModified(String value) {
        this.dateModified = value;
        return this;
    }

    /**
     * Gets the value of the pswdExpiresIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdExpiresIndicator() {
        return pswdExpiresIndicator;
    }

    /**
     * Sets the value of the pswdExpiresIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMUser setPswdExpiresIndicator(String value) {
        this.pswdExpiresIndicator = value;
        return this;
    }

    /**
     * Gets the value of the pswdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdExpiryDate() {
        return pswdExpiryDate;
    }

    /**
     * Sets the value of the pswdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMUser setPswdExpiryDate(String value) {
        this.pswdExpiryDate = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
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
     * Adds a new item to the role list.
     * @see #getRole()
     * 
     */
    public SwHSMUser addRole(String role) {
        getRole().add(role);
        return this;
    }

}
