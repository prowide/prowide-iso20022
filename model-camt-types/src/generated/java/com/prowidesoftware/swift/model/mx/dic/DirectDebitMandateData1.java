
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
 * Describes information needed to identify a change for a static data, the time when it was performed and the user requesting the change and approving it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandateData1", propOrder = {
    "cdtr",
    "cshAcct",
    "maxAmt",
    "drctDbtMndtRef",
    "vldFr",
    "vldTo"
})
public class DirectDebitMandateData1 {

    @XmlElement(name = "Cdtr")
    protected SystemPartyIdentification8 cdtr;
    @XmlElement(name = "CshAcct")
    protected AccountIdentification4Choice cshAcct;
    @XmlElement(name = "MaxAmt", required = true)
    protected List<MaximumAmountAndType1> maxAmt;
    @XmlElement(name = "DrctDbtMndtRef")
    protected String drctDbtMndtRef;
    @XmlElement(name = "VldFr")
    protected DateAndDateTime2Choice vldFr;
    @XmlElement(name = "VldTo")
    protected DateAndDateTime2Choice vldTo;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public DirectDebitMandateData1 setCdtr(SystemPartyIdentification8 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public DirectDebitMandateData1 setCshAcct(AccountIdentification4Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaximumAmountAndType1 }
     * 
     * 
     */
    public List<MaximumAmountAndType1> getMaxAmt() {
        if (maxAmt == null) {
            maxAmt = new ArrayList<MaximumAmountAndType1>();
        }
        return this.maxAmt;
    }

    /**
     * Gets the value of the drctDbtMndtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrctDbtMndtRef() {
        return drctDbtMndtRef;
    }

    /**
     * Sets the value of the drctDbtMndtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitMandateData1 setDrctDbtMndtRef(String value) {
        this.drctDbtMndtRef = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DirectDebitMandateData1 setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldTo() {
        return vldTo;
    }

    /**
     * Sets the value of the vldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DirectDebitMandateData1 setVldTo(DateAndDateTime2Choice value) {
        this.vldTo = value;
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
     * Adds a new item to the maxAmt list.
     * @see #getMaxAmt()
     * 
     */
    public DirectDebitMandateData1 addMaxAmt(MaximumAmountAndType1 maxAmt) {
        getMaxAmt().add(maxAmt);
        return this;
    }

}
