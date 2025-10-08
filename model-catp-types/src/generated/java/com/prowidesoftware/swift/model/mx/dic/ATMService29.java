
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Service allowed on the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService29", propOrder = {
    "svcTp",
    "svcVarnt",
    "lmts"
})
public class ATMService29 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType13Code svcTp;
    @XmlElement(name = "SvcVarnt")
    protected List<ATMService18> svcVarnt;
    @XmlElement(name = "Lmts")
    protected List<ATMTransactionAmounts6> lmts;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType13Code }
     *     
     */
    public ATMServiceType13Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType13Code }
     *     
     */
    public ATMService29 setSvcTp(ATMServiceType13Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the svcVarnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcVarnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcVarnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService18 }
     * 
     * 
     */
    public List<ATMService18> getSvcVarnt() {
        if (svcVarnt == null) {
            svcVarnt = new ArrayList<ATMService18>();
        }
        return this.svcVarnt;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts6 }
     * 
     * 
     */
    public List<ATMTransactionAmounts6> getLmts() {
        if (lmts == null) {
            lmts = new ArrayList<ATMTransactionAmounts6>();
        }
        return this.lmts;
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
     * Adds a new item to the svcVarnt list.
     * @see #getSvcVarnt()
     * 
     */
    public ATMService29 addSvcVarnt(ATMService18 svcVarnt) {
        getSvcVarnt().add(svcVarnt);
        return this;
    }

    /**
     * Adds a new item to the lmts list.
     * @see #getLmts()
     * 
     */
    public ATMService29 addLmts(ATMTransactionAmounts6 lmts) {
        getLmts().add(lmts);
        return this;
    }

}
