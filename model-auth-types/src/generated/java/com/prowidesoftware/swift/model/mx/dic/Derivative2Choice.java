
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
 * Choice element to define a derivative instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative2Choice", propOrder = {
    "cmmdty",
    "intrstRate",
    "fx",
    "eqty",
    "ctrctForDiff",
    "cdt",
    "emssnAllwnc"
})
public class Derivative2Choice {

    @XmlElement(name = "Cmmdty")
    protected CommodityDerivate4 cmmdty;
    @XmlElement(name = "IntrstRate")
    protected InterestRateDerivative5 intrstRate;
    @XmlElement(name = "FX")
    protected ForeignExchangeDerivative2 fx;
    @XmlElement(name = "Eqty")
    protected EquityDerivative2 eqty;
    @XmlElement(name = "CtrctForDiff")
    protected ContractForDifference2 ctrctForDiff;
    @XmlElement(name = "Cdt")
    protected CreditDefaultSwapsDerivative3Choice cdt;
    @XmlElement(name = "EmssnAllwnc")
    @XmlSchemaType(name = "string")
    protected EmissionAllowanceProductType1Code emssnAllwnc;

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivate4 }
     *     
     */
    public CommodityDerivate4 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivate4 }
     *     
     */
    public Derivative2Choice setCmmdty(CommodityDerivate4 value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateDerivative5 }
     *     
     */
    public InterestRateDerivative5 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateDerivative5 }
     *     
     */
    public Derivative2Choice setIntrstRate(InterestRateDerivative5 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeDerivative2 }
     *     
     */
    public ForeignExchangeDerivative2 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeDerivative2 }
     *     
     */
    public Derivative2Choice setFX(ForeignExchangeDerivative2 value) {
        this.fx = value;
        return this;
    }

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link EquityDerivative2 }
     *     
     */
    public EquityDerivative2 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityDerivative2 }
     *     
     */
    public Derivative2Choice setEqty(EquityDerivative2 value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the ctrctForDiff property.
     * 
     * @return
     *     possible object is
     *     {@link ContractForDifference2 }
     *     
     */
    public ContractForDifference2 getCtrctForDiff() {
        return ctrctForDiff;
    }

    /**
     * Sets the value of the ctrctForDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractForDifference2 }
     *     
     */
    public Derivative2Choice setCtrctForDiff(ContractForDifference2 value) {
        this.ctrctForDiff = value;
        return this;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapsDerivative3Choice }
     *     
     */
    public CreditDefaultSwapsDerivative3Choice getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapsDerivative3Choice }
     *     
     */
    public Derivative2Choice setCdt(CreditDefaultSwapsDerivative3Choice value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionAllowanceProductType1Code }
     *     
     */
    public EmissionAllowanceProductType1Code getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionAllowanceProductType1Code }
     *     
     */
    public Derivative2Choice setEmssnAllwnc(EmissionAllowanceProductType1Code value) {
        this.emssnAllwnc = value;
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
