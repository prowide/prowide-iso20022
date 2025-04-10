
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Basic valuation details of a collateral position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicCollateralValuation1Details", propOrder = {
    "valtnHrcut",
    "hrcutSrc"
})
public class BasicCollateralValuation1Details {

    @XmlElement(name = "ValtnHrcut", required = true)
    protected BigDecimal valtnHrcut;
    @XmlElement(name = "HrcutSrc")
    protected PartyIdentification15 hrcutSrc;

    /**
     * Gets the value of the valtnHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValtnHrcut() {
        return valtnHrcut;
    }

    /**
     * Sets the value of the valtnHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BasicCollateralValuation1Details setValtnHrcut(BigDecimal value) {
        this.valtnHrcut = value;
        return this;
    }

    /**
     * Gets the value of the hrcutSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification15 }
     *     
     */
    public PartyIdentification15 getHrcutSrc() {
        return hrcutSrc;
    }

    /**
     * Sets the value of the hrcutSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification15 }
     *     
     */
    public BasicCollateralValuation1Details setHrcutSrc(PartyIdentification15 value) {
        this.hrcutSrc = value;
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
