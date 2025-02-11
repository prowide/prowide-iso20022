
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the billing price of a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingPrice1", propOrder = {
    "ccy",
    "unitPric",
    "mtd",
    "rule"
})
public class BillingPrice1 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "UnitPric")
    protected AmountAndDirection34 unitPric;
    @XmlElement(name = "Mtd")
    @XmlSchemaType(name = "string")
    protected BillingChargeMethod1Code mtd;
    @XmlElement(name = "Rule")
    protected String rule;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingPrice1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingPrice1 setUnitPric(AmountAndDirection34 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link BillingChargeMethod1Code }
     *     
     */
    public BillingChargeMethod1Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingChargeMethod1Code }
     *     
     */
    public BillingPrice1 setMtd(BillingChargeMethod1Code value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingPrice1 setRule(String value) {
        this.rule = value;
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
