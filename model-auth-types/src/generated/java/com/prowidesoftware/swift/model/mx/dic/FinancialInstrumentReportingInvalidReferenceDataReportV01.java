
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The FinancialInstrumentReportingInvalidReferenceDataReport message is sent by the trading venue to the national competent authority to report on all records that have become invalid based on updates that have been received or that have passed the termination date original set for the instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentReportingInvalidReferenceDataReportV01", propOrder = {
    "dtPrd",
    "nbOfRcrds",
    "finInstrms",
    "splmtryData"
})
public class FinancialInstrumentReportingInvalidReferenceDataReportV01 {

    @XmlElement(name = "DtPrd", required = true)
    protected Period4Choice dtPrd;
    @XmlElement(name = "NbOfRcrds")
    protected BigDecimal nbOfRcrds;
    @XmlElement(name = "FinInstrms", required = true)
    protected List<SecuritiesInvalidReferenceDataReport3> finInstrms;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public FinancialInstrumentReportingInvalidReferenceDataReportV01 setDtPrd(Period4Choice value) {
        this.dtPrd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfRcrds() {
        return nbOfRcrds;
    }

    /**
     * Sets the value of the nbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentReportingInvalidReferenceDataReportV01 setNbOfRcrds(BigDecimal value) {
        this.nbOfRcrds = value;
        return this;
    }

    /**
     * Gets the value of the finInstrms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesInvalidReferenceDataReport3 }
     * 
     * 
     * @return
     *     The value of the finInstrms property.
     */
    public List<SecuritiesInvalidReferenceDataReport3> getFinInstrms() {
        if (finInstrms == null) {
            finInstrms = new ArrayList<>();
        }
        return this.finInstrms;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the finInstrms list.
     * @see #getFinInstrms()
     * 
     */
    public FinancialInstrumentReportingInvalidReferenceDataReportV01 addFinInstrms(SecuritiesInvalidReferenceDataReport3 finInstrms) {
        getFinInstrms().add(finInstrms);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FinancialInstrumentReportingInvalidReferenceDataReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
