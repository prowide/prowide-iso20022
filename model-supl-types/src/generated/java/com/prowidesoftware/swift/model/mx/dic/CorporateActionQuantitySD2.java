
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
 * Specifies corporate action quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionQuantitySD2", propOrder = {
    "plcAndNm",
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantitySD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity22Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity22Choice incrmtlDnmtn;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionQuantitySD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public CorporateActionQuantitySD2 setBaseDnmtn(FinancialInstrumentQuantity22Choice value) {
        this.baseDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public FinancialInstrumentQuantity22Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity22Choice }
     *     
     */
    public CorporateActionQuantitySD2 setIncrmtlDnmtn(FinancialInstrumentQuantity22Choice value) {
        this.incrmtlDnmtn = value;
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
