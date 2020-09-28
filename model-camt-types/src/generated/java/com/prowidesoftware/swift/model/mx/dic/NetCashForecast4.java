
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Net cash movement to a fund as a result of investment funds transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetCashForecast4", propOrder = {
    "cshSttlmDt",
    "netAmt",
    "netUnitsNb",
    "flowDrctn",
    "addtlBal"
})
public class NetCashForecast4 {

    @XmlElement(name = "CshSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "NetAmt")
    protected ActiveOrHistoricCurrencyAndAmount netAmt;
    @XmlElement(name = "NetUnitsNb")
    protected FinancialInstrumentQuantity1 netUnitsNb;
    @XmlElement(name = "FlowDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected FlowDirectionType1Code flowDrctn;
    @XmlElement(name = "AddtlBal")
    protected FundBalance1 addtlBal;

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public NetCashForecast4 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public NetCashForecast4 setNetAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the netUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getNetUnitsNb() {
        return netUnitsNb;
    }

    /**
     * Sets the value of the netUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public NetCashForecast4 setNetUnitsNb(FinancialInstrumentQuantity1 value) {
        this.netUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the flowDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDirectionType1Code }
     *     
     */
    public FlowDirectionType1Code getFlowDrctn() {
        return flowDrctn;
    }

    /**
     * Sets the value of the flowDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDirectionType1Code }
     *     
     */
    public NetCashForecast4 setFlowDrctn(FlowDirectionType1Code value) {
        this.flowDrctn = value;
        return this;
    }

    /**
     * Gets the value of the addtlBal property.
     * 
     * @return
     *     possible object is
     *     {@link FundBalance1 }
     *     
     */
    public FundBalance1 getAddtlBal() {
        return addtlBal;
    }

    /**
     * Sets the value of the addtlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundBalance1 }
     *     
     */
    public NetCashForecast4 setAddtlBal(FundBalance1 value) {
        this.addtlBal = value;
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
