
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
 * DTC (The Depository Trust Company) Tax Relief service election details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCTaxReliefSD2", propOrder = {
    "plcAndNm",
    "dtcTaxRlfCtgy",
    "instrQty"
})
public class DTCTaxReliefSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCTaxRlfCtgy", required = true)
    protected DTCTaxReliefSD1 dtcTaxRlfCtgy;
    @XmlElement(name = "InstrQty", required = true)
    protected FinancialInstrumentQuantity15Choice instrQty;

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
    public DTCTaxReliefSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcTaxRlfCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link DTCTaxReliefSD1 }
     *     
     */
    public DTCTaxReliefSD1 getDTCTaxRlfCtgy() {
        return dtcTaxRlfCtgy;
    }

    /**
     * Sets the value of the dtcTaxRlfCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCTaxReliefSD1 }
     *     
     */
    public DTCTaxReliefSD2 setDTCTaxRlfCtgy(DTCTaxReliefSD1 value) {
        this.dtcTaxRlfCtgy = value;
        return this;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public DTCTaxReliefSD2 setInstrQty(FinancialInstrumentQuantity15Choice value) {
        this.instrQty = value;
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
