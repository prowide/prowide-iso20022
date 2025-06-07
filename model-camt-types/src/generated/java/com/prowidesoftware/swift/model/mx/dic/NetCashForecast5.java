
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "NetCashForecast5", propOrder = {
    "cshSttlmDt",
    "netAmt",
    "netUnitsNb",
    "flowDrctn"
})
public class NetCashForecast5 {

    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "NetAmt")
    protected ActiveOrHistoricCurrencyAndAmount netAmt;
    @XmlElement(name = "NetUnitsNb")
    protected FinancialInstrumentQuantity1 netUnitsNb;
    @XmlElement(name = "FlowDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected FlowDirectionType1Code flowDrctn;

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public NetCashForecast5 setCshSttlmDt(XMLGregorianCalendar value) {
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
    public NetCashForecast5 setNetAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public NetCashForecast5 setNetUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public NetCashForecast5 setFlowDrctn(FlowDirectionType1Code value) {
        this.flowDrctn = value;
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
