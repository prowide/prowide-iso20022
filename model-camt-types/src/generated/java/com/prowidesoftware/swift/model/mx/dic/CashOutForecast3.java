
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOutForecast3", propOrder = {
    "cshSttlmDt",
    "subTtlAmt",
    "subTtlUnitsNb",
    "xcptnlCshFlowInd",
    "cshOutBrkdwnDtls"
})
public class CashOutForecast3 {

    @XmlElement(name = "CshSttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SubTtlAmt")
    protected ActiveOrHistoricCurrencyAndAmount subTtlAmt;
    @XmlElement(name = "SubTtlUnitsNb")
    protected FinancialInstrumentQuantity1 subTtlUnitsNb;
    @XmlElement(name = "XcptnlCshFlowInd")
    protected Boolean xcptnlCshFlowInd;
    @XmlElement(name = "CshOutBrkdwnDtls")
    protected List<FundCashOutBreakdown2> cshOutBrkdwnDtls;

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
    public CashOutForecast3 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the subTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getSubTtlAmt() {
        return subTtlAmt;
    }

    /**
     * Sets the value of the subTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CashOutForecast3 setSubTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.subTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the subTtlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getSubTtlUnitsNb() {
        return subTtlUnitsNb;
    }

    /**
     * Sets the value of the subTtlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public CashOutForecast3 setSubTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.subTtlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the xcptnlCshFlowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXcptnlCshFlowInd() {
        return xcptnlCshFlowInd;
    }

    /**
     * Sets the value of the xcptnlCshFlowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashOutForecast3 setXcptnlCshFlowInd(Boolean value) {
        this.xcptnlCshFlowInd = value;
        return this;
    }

    /**
     * Gets the value of the cshOutBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshOutBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshOutBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundCashOutBreakdown2 }
     * 
     * 
     */
    public List<FundCashOutBreakdown2> getCshOutBrkdwnDtls() {
        if (cshOutBrkdwnDtls == null) {
            cshOutBrkdwnDtls = new ArrayList<FundCashOutBreakdown2>();
        }
        return this.cshOutBrkdwnDtls;
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

    /**
     * Adds a new item to the cshOutBrkdwnDtls list.
     * @see #getCshOutBrkdwnDtls()
     * 
     */
    public CashOutForecast3 addCshOutBrkdwnDtls(FundCashOutBreakdown2 cshOutBrkdwnDtls) {
        getCshOutBrkdwnDtls().add(cshOutBrkdwnDtls);
        return this;
    }

}
