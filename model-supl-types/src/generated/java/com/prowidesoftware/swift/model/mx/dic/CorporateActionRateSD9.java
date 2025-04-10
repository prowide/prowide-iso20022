
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
 * Provides additional information regarding corporate action details rates and amounts details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRateSD9", propOrder = {
    "plcAndNm",
    "dfrrdIntrstRate",
    "amrcnOrGblDpstRctRatio"
})
public class CorporateActionRateSD9 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "DfrrdIntrstRate")
    protected BigDecimal dfrrdIntrstRate;
    @XmlElement(name = "AmrcnOrGblDpstRctRatio")
    protected CorporateActionRateSD2 amrcnOrGblDpstRctRatio;

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
    public CorporateActionRateSD9 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDfrrdIntrstRate() {
        return dfrrdIntrstRate;
    }

    /**
     * Sets the value of the dfrrdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRateSD9 setDfrrdIntrstRate(BigDecimal value) {
        this.dfrrdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the amrcnOrGblDpstRctRatio property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRateSD2 }
     *     
     */
    public CorporateActionRateSD2 getAmrcnOrGblDpstRctRatio() {
        return amrcnOrGblDpstRctRatio;
    }

    /**
     * Sets the value of the amrcnOrGblDpstRctRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRateSD2 }
     *     
     */
    public CorporateActionRateSD9 setAmrcnOrGblDpstRctRatio(CorporateActionRateSD2 value) {
        this.amrcnOrGblDpstRctRatio = value;
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
