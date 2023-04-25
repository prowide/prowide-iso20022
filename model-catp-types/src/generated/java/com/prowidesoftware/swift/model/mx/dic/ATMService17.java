
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ATMService17", propOrder = {
    "svcTp",
    "svcVarnt",
    "lmts",
    "prefrdWdrwl"
})
public class ATMService17 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType8Code svcTp;
    @XmlElement(name = "SvcVarnt")
    protected List<ATMService18> svcVarnt;
    @XmlElement(name = "Lmts")
    protected List<ATMTransactionAmounts6> lmts;
    @XmlElement(name = "PrefrdWdrwl")
    protected ATMTransaction8 prefrdWdrwl;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType8Code }
     *     
     */
    public ATMServiceType8Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType8Code }
     *     
     */
    public ATMService17 setSvcTp(ATMServiceType8Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the svcVarnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcVarnt property.
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
     * @return
     *     The value of the svcVarnt property.
     */
    public List<ATMService18> getSvcVarnt() {
        if (svcVarnt == null) {
            svcVarnt = new ArrayList<>();
        }
        return this.svcVarnt;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lmts property.
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
     * @return
     *     The value of the lmts property.
     */
    public List<ATMTransactionAmounts6> getLmts() {
        if (lmts == null) {
            lmts = new ArrayList<>();
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
    public ATMService17 setPrefrdWdrwl(ATMTransaction8 value) {
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
     * Adds a new item to the svcVarnt list.
     * @see #getSvcVarnt()
     * 
     */
    public ATMService17 addSvcVarnt(ATMService18 svcVarnt) {
        getSvcVarnt().add(svcVarnt);
        return this;
    }

    /**
     * Adds a new item to the lmts list.
     * @see #getLmts()
     * 
     */
    public ATMService17 addLmts(ATMTransactionAmounts6 lmts) {
        getLmts().add(lmts);
        return this;
    }

}
