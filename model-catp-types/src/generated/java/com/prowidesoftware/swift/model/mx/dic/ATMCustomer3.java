
package com.prowidesoftware.swift.model.mx.dic;

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
 * Customer involved in a withdrawal transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomer3", propOrder = {
    "prfl",
    "selctdLang",
    "authntcnRslt"
})
public class ATMCustomer3 {

    @XmlElement(name = "Prfl")
    protected ATMCustomerProfile1 prfl;
    @XmlElement(name = "SelctdLang")
    protected String selctdLang;
    @XmlElement(name = "AuthntcnRslt", required = true)
    protected List<TransactionVerificationResult5> authntcnRslt;

    /**
     * Gets the value of the prfl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile1 }
     *     
     */
    public ATMCustomerProfile1 getPrfl() {
        return prfl;
    }

    /**
     * Sets the value of the prfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile1 }
     *     
     */
    public ATMCustomer3 setPrfl(ATMCustomerProfile1 value) {
        this.prfl = value;
        return this;
    }

    /**
     * Gets the value of the selctdLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelctdLang() {
        return selctdLang;
    }

    /**
     * Sets the value of the selctdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomer3 setSelctdLang(String value) {
        this.selctdLang = value;
        return this;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authntcnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult5 }
     * 
     * 
     */
    public List<TransactionVerificationResult5> getAuthntcnRslt() {
        if (authntcnRslt == null) {
            authntcnRslt = new ArrayList<TransactionVerificationResult5>();
        }
        return this.authntcnRslt;
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
     * Adds a new item to the authntcnRslt list.
     * @see #getAuthntcnRslt()
     * 
     */
    public ATMCustomer3 addAuthntcnRslt(TransactionVerificationResult5 authntcnRslt) {
        getAuthntcnRslt().add(authntcnRslt);
        return this;
    }

}
