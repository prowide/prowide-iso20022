
package com.prowidesoftware.swift.model.mx.dic;

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
 * Profile of the customer with the allowed services and restrictions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomerProfile7", propOrder = {
    "prflRef",
    "cstmrId",
    "prflDesc",
    "allwdSvcs"
})
public class ATMCustomerProfile7 {

    @XmlElement(name = "PrflRef")
    protected String prflRef;
    @XmlElement(name = "CstmrId")
    protected String cstmrId;
    @XmlElement(name = "PrflDesc")
    protected String prflDesc;
    @XmlElement(name = "AllwdSvcs")
    protected List<ATMService28> allwdSvcs;

    /**
     * Gets the value of the prflRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflRef() {
        return prflRef;
    }

    /**
     * Sets the value of the prflRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomerProfile7 setPrflRef(String value) {
        this.prflRef = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomerProfile7 setCstmrId(String value) {
        this.cstmrId = value;
        return this;
    }

    /**
     * Gets the value of the prflDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflDesc() {
        return prflDesc;
    }

    /**
     * Sets the value of the prflDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomerProfile7 setPrflDesc(String value) {
        this.prflDesc = value;
        return this;
    }

    /**
     * Gets the value of the allwdSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService28 }
     * 
     * 
     * @return
     *     The value of the allwdSvcs property.
     */
    public List<ATMService28> getAllwdSvcs() {
        if (allwdSvcs == null) {
            allwdSvcs = new ArrayList<>();
        }
        return this.allwdSvcs;
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
     * Adds a new item to the allwdSvcs list.
     * @see #getAllwdSvcs()
     * 
     */
    public ATMCustomerProfile7 addAllwdSvcs(ATMService28 allwdSvcs) {
        getAllwdSvcs().add(allwdSvcs);
        return this;
    }

}
