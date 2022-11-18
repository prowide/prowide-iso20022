
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
 * Measure of the total capital requirement all the clearing members are required to hold against their default fund contributions to a central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HypotheticalCapitalMeasure1", propOrder = {
    "amt",
    "dfltWtrfllId"
})
public class HypotheticalCapitalMeasure1 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DfltWtrfllId", required = true)
    protected String dfltWtrfllId;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public HypotheticalCapitalMeasure1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dfltWtrfllId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfltWtrfllId() {
        return dfltWtrfllId;
    }

    /**
     * Sets the value of the dfltWtrfllId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HypotheticalCapitalMeasure1 setDfltWtrfllId(String value) {
        this.dfltWtrfllId = value;
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
