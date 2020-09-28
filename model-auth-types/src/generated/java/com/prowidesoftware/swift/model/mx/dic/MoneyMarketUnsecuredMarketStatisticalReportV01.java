
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The MoneyMarketUnsecuredMarketStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report all relevant unsecured money market transactions. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketUnsecuredMarketStatisticalReportV01", propOrder = {
    "rptHdr",
    "uscrdMktRpt",
    "splmtryData"
})
public class MoneyMarketUnsecuredMarketStatisticalReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected MoneyMarketReportHeader1 rptHdr;
    @XmlElement(name = "UscrdMktRpt", required = true)
    protected UnsecuredMarketReport3Choice uscrdMktRpt;
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
    public MoneyMarketUnsecuredMarketStatisticalReportV01 setRptHdr(MoneyMarketReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the uscrdMktRpt property.
     * 
     * @return
     *     possible object is
     *     {@link UnsecuredMarketReport3Choice }
     *     
     */
    public UnsecuredMarketReport3Choice getUscrdMktRpt() {
        return uscrdMktRpt;
    }

    /**
     * Sets the value of the uscrdMktRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsecuredMarketReport3Choice }
     *     
     */
    public MoneyMarketUnsecuredMarketStatisticalReportV01 setUscrdMktRpt(UnsecuredMarketReport3Choice value) {
        this.uscrdMktRpt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
    public MoneyMarketUnsecuredMarketStatisticalReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
