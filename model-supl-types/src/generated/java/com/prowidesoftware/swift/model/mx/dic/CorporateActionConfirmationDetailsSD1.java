
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides additional information regarding corporate action confirmation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionConfirmationDetailsSD1", propOrder = {
    "plcAndNm",
    "prratnRndgInd",
    "prratnFrctn"
})
public class CorporateActionConfirmationDetailsSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "PrratnRndgInd")
    @XmlSchemaType(name = "string")
    protected FractionDispositionType12Code prratnRndgInd;
    @XmlElement(name = "PrratnFrctn")
    protected BigDecimal prratnFrctn;

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
    public CorporateActionConfirmationDetailsSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the prratnRndgInd property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public FractionDispositionType12Code getPrratnRndgInd() {
        return prratnRndgInd;
    }

    /**
     * Sets the value of the prratnRndgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public CorporateActionConfirmationDetailsSD1 setPrratnRndgInd(FractionDispositionType12Code value) {
        this.prratnRndgInd = value;
        return this;
    }

    /**
     * Gets the value of the prratnFrctn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrratnFrctn() {
        return prratnFrctn;
    }

    /**
     * Sets the value of the prratnFrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionConfirmationDetailsSD1 setPrratnFrctn(BigDecimal value) {
        this.prratnFrctn = value;
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
