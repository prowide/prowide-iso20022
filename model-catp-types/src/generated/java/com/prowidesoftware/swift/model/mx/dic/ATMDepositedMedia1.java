
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Deposited media put in the safe.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDepositedMedia1", propOrder = {
    "acctSeqNb",
    "mdiaTp",
    "mdiaCtgy",
    "mdiaItms"
})
public class ATMDepositedMedia1 {

    @XmlElement(name = "AcctSeqNb")
    protected BigDecimal acctSeqNb;
    @XmlElement(name = "MdiaTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMMediaType2Code mdiaTp;
    @XmlElement(name = "MdiaCtgy")
    @XmlSchemaType(name = "string")
    protected ATMMediaType3Code mdiaCtgy;
    @XmlElement(name = "MdiaItms", required = true)
    protected List<ATMDepositedMedia2> mdiaItms;

    /**
     * Gets the value of the acctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSeqNb() {
        return acctSeqNb;
    }

    /**
     * Sets the value of the acctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMDepositedMedia1 setAcctSeqNb(BigDecimal value) {
        this.acctSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMMediaType2Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType2Code }
     *     
     */
    public ATMDepositedMedia1 setMdiaTp(ATMMediaType2Code value) {
        this.mdiaTp = value;
        return this;
    }

    /**
     * Gets the value of the mdiaCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMMediaType3Code getMdiaCtgy() {
        return mdiaCtgy;
    }

    /**
     * Sets the value of the mdiaCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMDepositedMedia1 setMdiaCtgy(ATMMediaType3Code value) {
        this.mdiaCtgy = value;
        return this;
    }

    /**
     * Gets the value of the mdiaItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdiaItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMdiaItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMDepositedMedia2 }
     * 
     * 
     */
    public List<ATMDepositedMedia2> getMdiaItms() {
        if (mdiaItms == null) {
            mdiaItms = new ArrayList<ATMDepositedMedia2>();
        }
        return this.mdiaItms;
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
     * Adds a new item to the mdiaItms list.
     * @see #getMdiaItms()
     * 
     */
    public ATMDepositedMedia1 addMdiaItms(ATMDepositedMedia2 mdiaItms) {
        getMdiaItms().add(mdiaItms);
        return this;
    }

}
