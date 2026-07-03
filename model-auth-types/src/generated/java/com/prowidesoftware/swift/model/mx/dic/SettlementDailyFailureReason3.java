
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
 * Specifies the settlement failure reason as defined in the relevant regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDailyFailureReason3", propOrder = {
    "faildScties",
    "faildCsh"
})
public class SettlementDailyFailureReason3 {

    @XmlElement(name = "FaildScties", required = true)
    protected SettlementTotalData1Choice faildScties;
    @XmlElement(name = "FaildCsh", required = true)
    protected SettlementTotalData1Choice faildCsh;

    /**
     * Gets the value of the faildScties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getFaildScties() {
        return faildScties;
    }

    /**
     * Sets the value of the faildScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementDailyFailureReason3 setFaildScties(SettlementTotalData1Choice value) {
        this.faildScties = value;
        return this;
    }

    /**
     * Gets the value of the faildCsh property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getFaildCsh() {
        return faildCsh;
    }

    /**
     * Sets the value of the faildCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementDailyFailureReason3 setFaildCsh(SettlementTotalData1Choice value) {
        this.faildCsh = value;
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
