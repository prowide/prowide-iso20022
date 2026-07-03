
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
 * Specifies the details on the settlement fails split per intra-CSD and cross-CSD instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyCSD3", propOrder = {
    "intraCSD",
    "crossCSD"
})
public class SettlementFailsDailyCSD3 {

    @XmlElement(name = "IntraCSD", required = true)
    protected SettlementFailsDailyInstructionType1Choice intraCSD;
    @XmlElement(name = "CrossCSD", required = true)
    protected SettlementFailsDailyInstructionType1Choice crossCSD;

    /**
     * Gets the value of the intraCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType1Choice getIntraCSD() {
        return intraCSD;
    }

    /**
     * Sets the value of the intraCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyCSD3 setIntraCSD(SettlementFailsDailyInstructionType1Choice value) {
        this.intraCSD = value;
        return this;
    }

    /**
     * Gets the value of the crossCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyInstructionType1Choice getCrossCSD() {
        return crossCSD;
    }

    /**
     * Sets the value of the crossCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstructionType1Choice }
     *     
     */
    public SettlementFailsDailyCSD3 setCrossCSD(SettlementFailsDailyInstructionType1Choice value) {
        this.crossCSD = value;
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
