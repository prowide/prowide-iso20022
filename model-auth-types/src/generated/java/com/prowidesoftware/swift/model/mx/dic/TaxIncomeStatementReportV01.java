
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
 * The TaxIncomeStatementReport message is sent by the registry to the market infrastructure or from the market infrastructure to the participant to provide the requesting participant (the account owner) with a statement of an investor’s annual income.
 * 
 * Usage: The message is used to provide the tax income statement to the Australian Tax Office (ATO). The ATO Standard Income Statement data set is inclusive of all investors and all financial instruments. The registry or market infrastructure will provide a (series of) message(s) that mirror the ATO income statement sections.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeStatementReportV01", propOrder = {
    "hdr",
    "cmonData",
    "partA",
    "partB",
    "partC",
    "splmtryData"
})
public class TaxIncomeStatementReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected TaxIncomeHeader1 hdr;
    @XmlElement(name = "CmonData")
    protected TaxIncomeCommonData1 cmonData;
    @XmlElement(name = "PartA")
    protected TaxIncomePartA1 partA;
    @XmlElement(name = "PartB")
    protected TaxIncomePartB1 partB;
    @XmlElement(name = "PartC")
    protected TaxIncomePartC1 partC;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeHeader1 }
     *     
     */
    public TaxIncomeHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeHeader1 }
     *     
     */
    public TaxIncomeStatementReportV01 setHdr(TaxIncomeHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cmonData property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeCommonData1 }
     *     
     */
    public TaxIncomeCommonData1 getCmonData() {
        return cmonData;
    }

    /**
     * Sets the value of the cmonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeCommonData1 }
     *     
     */
    public TaxIncomeStatementReportV01 setCmonData(TaxIncomeCommonData1 value) {
        this.cmonData = value;
        return this;
    }

    /**
     * Gets the value of the partA property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomePartA1 }
     *     
     */
    public TaxIncomePartA1 getPartA() {
        return partA;
    }

    /**
     * Sets the value of the partA property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomePartA1 }
     *     
     */
    public TaxIncomeStatementReportV01 setPartA(TaxIncomePartA1 value) {
        this.partA = value;
        return this;
    }

    /**
     * Gets the value of the partB property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomePartB1 }
     *     
     */
    public TaxIncomePartB1 getPartB() {
        return partB;
    }

    /**
     * Sets the value of the partB property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomePartB1 }
     *     
     */
    public TaxIncomeStatementReportV01 setPartB(TaxIncomePartB1 value) {
        this.partB = value;
        return this;
    }

    /**
     * Gets the value of the partC property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomePartC1 }
     *     
     */
    public TaxIncomePartC1 getPartC() {
        return partC;
    }

    /**
     * Sets the value of the partC property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomePartC1 }
     *     
     */
    public TaxIncomeStatementReportV01 setPartC(TaxIncomePartC1 value) {
        this.partC = value;
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
    public TaxIncomeStatementReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
