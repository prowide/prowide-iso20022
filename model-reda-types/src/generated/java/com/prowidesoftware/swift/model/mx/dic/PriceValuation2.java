
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Calculation of the net asset value for an investment fund/fund class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceValuation2", propOrder = {
    "id",
    "valtnDtTm",
    "tradDtTm",
    "finInstrmDtls",
    "ttlNAV",
    "ttlUnitsNb",
    "nxtValtnDtTm",
    "prvsValtnDtTm",
    "valtnCycl",
    "sspdInd",
    "pricDtls",
    "valtnSttstcs"
})
public class PriceValuation2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ValtnDtTm")
    protected DateAndDateTimeChoice valtnDtTm;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument5 finInstrmDtls;
    @XmlElement(name = "TtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> ttlNAV;
    @XmlElement(name = "TtlUnitsNb")
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "NxtValtnDtTm")
    protected DateAndDateTimeChoice nxtValtnDtTm;
    @XmlElement(name = "PrvsValtnDtTm")
    protected DateAndDateTimeChoice prvsValtnDtTm;
    @XmlElement(name = "ValtnCycl", required = true)
    @XmlSchemaType(name = "string")
    protected ValuationTiming1Code valtnCycl;
    @XmlElement(name = "SspdInd")
    protected boolean sspdInd;
    @XmlElement(name = "PricDtls")
    protected List<UnitPrice6> pricDtls;
    @XmlElement(name = "ValtnSttstcs")
    protected List<ValuationStatistics2> valtnSttstcs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceValuation2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceValuation2 setValtnDtTm(DateAndDateTimeChoice value) {
        this.valtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceValuation2 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument5 }
     *     
     */
    public FinancialInstrument5 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument5 }
     *     
     */
    public PriceValuation2 setFinInstrmDtls(FinancialInstrument5 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getTtlNAV() {
        if (ttlNAV == null) {
            ttlNAV = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
        }
        return this.ttlNAV;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public PriceValuation2 setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the nxtValtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNxtValtnDtTm() {
        return nxtValtnDtTm;
    }

    /**
     * Sets the value of the nxtValtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceValuation2 setNxtValtnDtTm(DateAndDateTimeChoice value) {
        this.nxtValtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsValtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrvsValtnDtTm() {
        return prvsValtnDtTm;
    }

    /**
     * Sets the value of the prvsValtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceValuation2 setPrvsValtnDtTm(DateAndDateTimeChoice value) {
        this.prvsValtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the valtnCycl property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public ValuationTiming1Code getValtnCycl() {
        return valtnCycl;
    }

    /**
     * Sets the value of the valtnCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public PriceValuation2 setValtnCycl(ValuationTiming1Code value) {
        this.valtnCycl = value;
        return this;
    }

    /**
     * Gets the value of the sspdInd property.
     * 
     */
    public boolean isSspdInd() {
        return sspdInd;
    }

    /**
     * Sets the value of the sspdInd property.
     * 
     */
    public PriceValuation2 setSspdInd(boolean value) {
        this.sspdInd = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice6 }
     * 
     * 
     */
    public List<UnitPrice6> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<UnitPrice6>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the valtnSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valtnSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationStatistics2 }
     * 
     * 
     */
    public List<ValuationStatistics2> getValtnSttstcs() {
        if (valtnSttstcs == null) {
            valtnSttstcs = new ArrayList<ValuationStatistics2>();
        }
        return this.valtnSttstcs;
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
     * Adds a new item to the ttlNAV list.
     * @see #getTtlNAV()
     * 
     */
    public PriceValuation2 addTtlNAV(ActiveOrHistoricCurrencyAndAmount ttlNAV) {
        getTtlNAV().add(ttlNAV);
        return this;
    }

    /**
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public PriceValuation2 addPricDtls(UnitPrice6 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the valtnSttstcs list.
     * @see #getValtnSttstcs()
     * 
     */
    public PriceValuation2 addValtnSttstcs(ValuationStatistics2 valtnSttstcs) {
        getValtnSttstcs().add(valtnSttstcs);
        return this;
    }

}
