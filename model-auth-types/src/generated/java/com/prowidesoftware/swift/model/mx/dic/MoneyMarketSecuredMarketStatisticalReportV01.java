
package com.prowidesoftware.swift.model.mx.dic;

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
 * The MoneyMarketSecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant secured money market transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketSecuredMarketStatisticalReportV01", propOrder = {
    "rptHdr",
    "scrdMktRpt",
    "splmtryData"
})
public class MoneyMarketSecuredMarketStatisticalReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected MoneyMarketReportHeader1 rptHdr;
    @XmlElement(name = "ScrdMktRpt", required = true)
    protected SecuredMarketReport3Choice scrdMktRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketReportHeader1 }
     *     
     */
    public MoneyMarketReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketReportHeader1 }
     *     
     */
    public MoneyMarketSecuredMarketStatisticalReportV01 setRptHdr(MoneyMarketReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the scrdMktRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredMarketReport3Choice }
     *     
     */
    public SecuredMarketReport3Choice getScrdMktRpt() {
        return scrdMktRpt;
    }

    /**
     * Sets the value of the scrdMktRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredMarketReport3Choice }
     *     
     */
    public MoneyMarketSecuredMarketStatisticalReportV01 setScrdMktRpt(SecuredMarketReport3Choice value) {
        this.scrdMktRpt = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MoneyMarketSecuredMarketStatisticalReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
