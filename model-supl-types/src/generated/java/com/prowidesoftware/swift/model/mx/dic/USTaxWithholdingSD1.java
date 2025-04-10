
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * US tax withholding election details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USTaxWithholdingSD1", propOrder = {
    "plcAndNm",
    "nraTaxCd",
    "whldgTaxRate",
    "qty"
})
public class USTaxWithholdingSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "NRATaxCd", required = true)
    @XmlSchemaType(name = "string")
    protected NRATax1Code nraTaxCd;
    @XmlElement(name = "WhldgTaxRate")
    protected RateFormat6Choice whldgTaxRate;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity15Choice qty;

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
    public USTaxWithholdingSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the nraTaxCd property.
     * 
     * @return
     *     possible object is
     *     {@link NRATax1Code }
     *     
     */
    public NRATax1Code getNRATaxCd() {
        return nraTaxCd;
    }

    /**
     * Sets the value of the nraTaxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NRATax1Code }
     *     
     */
    public USTaxWithholdingSD1 setNRATaxCd(NRATax1Code value) {
        this.nraTaxCd = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat6Choice }
     *     
     */
    public RateFormat6Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat6Choice }
     *     
     */
    public USTaxWithholdingSD1 setWhldgTaxRate(RateFormat6Choice value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public USTaxWithholdingSD1 setQty(FinancialInstrumentQuantity15Choice value) {
        this.qty = value;
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
