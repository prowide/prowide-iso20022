
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
 * Services allowed for the customer's profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService7", propOrder = {
    "svcTp",
    "lmts",
    "prefrdWdrwl"
})
public class ATMService7 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType4Code svcTp;
    @XmlElement(name = "Lmts")
    protected List<ATMTransactionAmounts3> lmts;
    @XmlElement(name = "PrefrdWdrwl")
    protected ATMTransaction8 prefrdWdrwl;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType4Code }
     *     
     */
    public ATMServiceType4Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType4Code }
     *     
     */
    public ATMService7 setSvcTp(ATMServiceType4Code value) {
        this.svcTp = value;
        return this;
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
     * {@link ATMTransactionAmounts3 }
     * 
     * 
     */
    public List<ATMTransactionAmounts3> getLmts() {
        if (lmts == null) {
            lmts = new ArrayList<ATMTransactionAmounts3>();
        }
        return this.lmts;
    }

    /**
     * Gets the value of the prefrdWdrwl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction8 }
     *     
     */
    public ATMTransaction8 getPrefrdWdrwl() {
        return prefrdWdrwl;
    }

    /**
     * Sets the value of the prefrdWdrwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction8 }
     *     
     */
    public ATMService7 setPrefrdWdrwl(ATMTransaction8 value) {
        this.prefrdWdrwl = value;
        return this;
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
     * Adds a new item to the lmts list.
     * @see #getLmts()
     * 
     */
    public ATMService7 addLmts(ATMTransactionAmounts3 lmts) {
        getLmts().add(lmts);
        return this;
    }

}
