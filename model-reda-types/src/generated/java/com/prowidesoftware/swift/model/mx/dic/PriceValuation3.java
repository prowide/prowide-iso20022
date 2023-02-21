
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
@XmlType(name = "PriceValuation3", propOrder = {
    "id",
    "valtnDtTm",
    "navDtTm",
    "finInstrmDtls",
    "fndMgmtCpny",
    "ttlNAV",
    "ttlUnitsNb",
    "nxtValtnDtTm",
    "prvsValtnDtTm",
    "valtnTp",
    "valtnFrqcy",
    "offclValtnInd",
    "sspdInd",
    "pricDtls",
    "valtnSttstcs",
    "prfrmncDtls"
})
public class PriceValuation3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "ValtnDtTm")
    protected DateAndDateTimeChoice valtnDtTm;
    @XmlElement(name = "NAVDtTm", required = true)
    protected DateAndDateTimeChoice navDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument8 finInstrmDtls;
    @XmlElement(name = "FndMgmtCpny")
    protected PartyIdentification2Choice fndMgmtCpny;
    @XmlElement(name = "TtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> ttlNAV;
    @XmlElement(name = "TtlUnitsNb")
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "NxtValtnDtTm")
    protected DateAndDateTimeChoice nxtValtnDtTm;
    @XmlElement(name = "PrvsValtnDtTm")
    protected DateAndDateTimeChoice prvsValtnDtTm;
    @XmlElement(name = "ValtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ValuationTiming1Code valtnTp;
    @XmlElement(name = "ValtnFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code valtnFrqcy;
    @XmlElement(name = "OffclValtnInd")
    protected boolean offclValtnInd;
    @XmlElement(name = "SspdInd")
    protected boolean sspdInd;
    @XmlElement(name = "PricDtls")
    protected List<UnitPrice15> pricDtls;
    @XmlElement(name = "ValtnSttstcs")
    protected List<ValuationStatistics3> valtnSttstcs;
    @XmlElement(name = "PrfrmncDtls")
    protected PerformanceFactors1 prfrmncDtls;

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
    public PriceValuation3 setId(String value) {
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
    public PriceValuation3 setValtnDtTm(DateAndDateTimeChoice value) {
        this.valtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the navDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNAVDtTm() {
        return navDtTm;
    }

    /**
     * Sets the value of the navDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PriceValuation3 setNAVDtTm(DateAndDateTimeChoice value) {
        this.navDtTm = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument8 }
     *     
     */
    public FinancialInstrument8 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument8 }
     *     
     */
    public PriceValuation3 setFinInstrmDtls(FinancialInstrument8 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PriceValuation3 setFndMgmtCpny(PartyIdentification2Choice value) {
        this.fndMgmtCpny = value;
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
    public PriceValuation3 setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public PriceValuation3 setNxtValtnDtTm(DateAndDateTimeChoice value) {
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
    public PriceValuation3 setPrvsValtnDtTm(DateAndDateTimeChoice value) {
        this.prvsValtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the valtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public ValuationTiming1Code getValtnTp() {
        return valtnTp;
    }

    /**
     * Sets the value of the valtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public PriceValuation3 setValtnTp(ValuationTiming1Code value) {
        this.valtnTp = value;
        return this;
    }

    /**
     * Gets the value of the valtnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getValtnFrqcy() {
        return valtnFrqcy;
    }

    /**
     * Sets the value of the valtnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public PriceValuation3 setValtnFrqcy(EventFrequency1Code value) {
        this.valtnFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the offclValtnInd property.
     * 
     */
    public boolean isOffclValtnInd() {
        return offclValtnInd;
    }

    /**
     * Sets the value of the offclValtnInd property.
     * 
     */
    public PriceValuation3 setOffclValtnInd(boolean value) {
        this.offclValtnInd = value;
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
    public PriceValuation3 setSspdInd(boolean value) {
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
     * {@link UnitPrice15 }
     * 
     * 
     */
    public List<UnitPrice15> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<UnitPrice15>();
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
     * {@link ValuationStatistics3 }
     * 
     * 
     */
    public List<ValuationStatistics3> getValtnSttstcs() {
        if (valtnSttstcs == null) {
            valtnSttstcs = new ArrayList<ValuationStatistics3>();
        }
        return this.valtnSttstcs;
    }

    /**
     * Gets the value of the prfrmncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceFactors1 }
     *     
     */
    public PerformanceFactors1 getPrfrmncDtls() {
        return prfrmncDtls;
    }

    /**
     * Sets the value of the prfrmncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceFactors1 }
     *     
     */
    public PriceValuation3 setPrfrmncDtls(PerformanceFactors1 value) {
        this.prfrmncDtls = value;
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

    /**
     * Adds a new item to the ttlNAV list.
     * @see #getTtlNAV()
     * 
     */
    public PriceValuation3 addTtlNAV(ActiveOrHistoricCurrencyAndAmount ttlNAV) {
        getTtlNAV().add(ttlNAV);
        return this;
    }

    /**
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public PriceValuation3 addPricDtls(UnitPrice15 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the valtnSttstcs list.
     * @see #getValtnSttstcs()
     * 
     */
    public PriceValuation3 addValtnSttstcs(ValuationStatistics3 valtnSttstcs) {
        getValtnSttstcs().add(valtnSttstcs);
        return this;
    }

}
