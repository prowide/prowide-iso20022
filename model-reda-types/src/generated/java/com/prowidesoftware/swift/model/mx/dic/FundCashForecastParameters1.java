
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
 * Parameters for which a fund cash forecast report is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCashForecastParameters1", propOrder = {
    "cshFcstTp",
    "params",
    "noCrit"
})
public class FundCashForecastParameters1 {

    @XmlElement(name = "CshFcstTp", required = true)
    @XmlSchemaType(name = "string")
    protected CashForecastMessage1Code cshFcstTp;
    @XmlElement(name = "Params")
    protected FundCashForecastParameters2 params;
    @XmlElement(name = "NoCrit")
    @XmlSchemaType(name = "string")
    protected NoCriteria1Code noCrit;

    /**
     * Gets the value of the cshFcstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CashForecastMessage1Code }
     *     
     */
    public CashForecastMessage1Code getCshFcstTp() {
        return cshFcstTp;
    }

    /**
     * Sets the value of the cshFcstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashForecastMessage1Code }
     *     
     */
    public FundCashForecastParameters1 setCshFcstTp(CashForecastMessage1Code value) {
        this.cshFcstTp = value;
        return this;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FundCashForecastParameters2 }
     *     
     */
    public FundCashForecastParameters2 getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundCashForecastParameters2 }
     *     
     */
    public FundCashForecastParameters1 setParams(FundCashForecastParameters2 value) {
        this.params = value;
        return this;
    }

    /**
     * Gets the value of the noCrit property.
     * 
     * @return
     *     possible object is
     *     {@link NoCriteria1Code }
     *     
     */
    public NoCriteria1Code getNoCrit() {
        return noCrit;
    }

    /**
     * Sets the value of the noCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoCriteria1Code }
     *     
     */
    public FundCashForecastParameters1 setNoCrit(NoCriteria1Code value) {
        this.noCrit = value;
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
