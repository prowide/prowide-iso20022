
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission2", propOrder = {
    "comssn",
    "rcptId",
    "tp"
})
public class Commission2 {

    @XmlElement(name = "Comssn", required = true)
    protected AmountOrRate1Choice comssn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification23 rcptId;
    @XmlElement(name = "Tp", required = true)
    protected CommissionType1Choice tp;

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public AmountOrRate1Choice getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate1Choice }
     *     
     */
    public Commission2 setComssn(AmountOrRate1Choice value) {
        this.comssn = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23 }
     *     
     */
    public PartyIdentification23 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23 }
     *     
     */
    public Commission2 setRcptId(PartyIdentification23 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType1Choice }
     *     
     */
    public CommissionType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType1Choice }
     *     
     */
    public Commission2 setTp(CommissionType1Choice value) {
        this.tp = value;
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
