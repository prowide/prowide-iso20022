
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge21", propOrder = {
    "chrgTp",
    "chrgAmtOrRate",
    "rcptId"
})
public class Charge21 {

    @XmlElement(name = "ChrgTp", required = true)
    protected ChargeType1Choice chrgTp;
    @XmlElement(name = "ChrgAmtOrRate", required = true)
    protected AmountRate1Choice chrgAmtOrRate;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;

    /**
     * Gets the value of the chrgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType1Choice }
     *     
     */
    public ChargeType1Choice getChrgTp() {
        return chrgTp;
    }

    /**
     * Sets the value of the chrgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType1Choice }
     *     
     */
    public Charge21 setChrgTp(ChargeType1Choice value) {
        this.chrgTp = value;
        return this;
    }

    /**
     * Gets the value of the chrgAmtOrRate property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRate1Choice }
     *     
     */
    public AmountRate1Choice getChrgAmtOrRate() {
        return chrgAmtOrRate;
    }

    /**
     * Sets the value of the chrgAmtOrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRate1Choice }
     *     
     */
    public Charge21 setChrgAmtOrRate(AmountRate1Choice value) {
        this.chrgAmtOrRate = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Charge21 setRcptId(PartyIdentification2Choice value) {
        this.rcptId = value;
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

}
