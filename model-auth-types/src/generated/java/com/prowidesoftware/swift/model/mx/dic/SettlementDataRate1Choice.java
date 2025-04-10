
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
 * Specifies the volume and value percentage rates of settlement instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDataRate1Choice", propOrder = {
    "nbOfInstrs",
    "valOfInstrs"
})
public class SettlementDataRate1Choice {

    @XmlElement(name = "NbOfInstrs")
    protected BigDecimal nbOfInstrs;
    @XmlElement(name = "ValOfInstrs")
    protected BigDecimal valOfInstrs;

    /**
     * Gets the value of the nbOfInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfInstrs() {
        return nbOfInstrs;
    }

    /**
     * Sets the value of the nbOfInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementDataRate1Choice setNbOfInstrs(BigDecimal value) {
        this.nbOfInstrs = value;
        return this;
    }

    /**
     * Gets the value of the valOfInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValOfInstrs() {
        return valOfInstrs;
    }

    /**
     * Sets the value of the valOfInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementDataRate1Choice setValOfInstrs(BigDecimal value) {
        this.valOfInstrs = value;
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
