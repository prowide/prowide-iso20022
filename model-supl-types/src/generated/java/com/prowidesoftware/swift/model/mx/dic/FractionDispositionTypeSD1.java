
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
 * Provides additional information regarding corporate action securities movement fraction disposition details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FractionDispositionTypeSD1", propOrder = {
    "plcAndNm",
    "frctnlSctyRule",
    "rndgFctr"
})
public class FractionDispositionTypeSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "FrctnlSctyRule")
    @XmlSchemaType(name = "string")
    protected FractionalSecurityRule1Code frctnlSctyRule;
    @XmlElement(name = "RndgFctr")
    protected BigDecimal rndgFctr;

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
    public FractionDispositionTypeSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the frctnlSctyRule property.
     * 
     * @return
     *     possible object is
     *     {@link FractionalSecurityRule1Code }
     *     
     */
    public FractionalSecurityRule1Code getFrctnlSctyRule() {
        return frctnlSctyRule;
    }

    /**
     * Sets the value of the frctnlSctyRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalSecurityRule1Code }
     *     
     */
    public FractionDispositionTypeSD1 setFrctnlSctyRule(FractionalSecurityRule1Code value) {
        this.frctnlSctyRule = value;
        return this;
    }

    /**
     * Gets the value of the rndgFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndgFctr() {
        return rndgFctr;
    }

    /**
     * Sets the value of the rndgFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FractionDispositionTypeSD1 setRndgFctr(BigDecimal value) {
        this.rndgFctr = value;
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
