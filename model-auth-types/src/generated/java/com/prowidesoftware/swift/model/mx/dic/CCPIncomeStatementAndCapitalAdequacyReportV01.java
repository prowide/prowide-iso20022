
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
 * The CCPIncomeStatementAndCapitalAdequacyReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the financial performance and regulatory capital holdings of the central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPIncomeStatementAndCapitalAdequacyReportV01", propOrder = {
    "incmStmt",
    "cptlRqrmnts",
    "ttlCptl",
    "lqdFinRsrcs",
    "hpthtclCptlMeasr",
    "splmtryData"
})
public class CCPIncomeStatementAndCapitalAdequacyReportV01 {

    @XmlElement(name = "IncmStmt", required = true)
    protected IncomeStatement1 incmStmt;
    @XmlElement(name = "CptlRqrmnts", required = true)
    protected CapitalRequirement1 cptlRqrmnts;
    @XmlElement(name = "TtlCptl", required = true)
    protected ActiveCurrencyAndAmount ttlCptl;
    @XmlElement(name = "LqdFinRsrcs", required = true)
    protected ActiveCurrencyAndAmount lqdFinRsrcs;
    @XmlElement(name = "HpthtclCptlMeasr", required = true)
    protected List<HypotheticalCapitalMeasure1> hpthtclCptlMeasr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the incmStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeStatement1 }
     *     
     */
    public IncomeStatement1 getIncmStmt() {
        return incmStmt;
    }

    /**
     * Sets the value of the incmStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeStatement1 }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 setIncmStmt(IncomeStatement1 value) {
        this.incmStmt = value;
        return this;
    }

    /**
     * Gets the value of the cptlRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalRequirement1 }
     *     
     */
    public CapitalRequirement1 getCptlRqrmnts() {
        return cptlRqrmnts;
    }

    /**
     * Sets the value of the cptlRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalRequirement1 }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 setCptlRqrmnts(CapitalRequirement1 value) {
        this.cptlRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the ttlCptl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCptl() {
        return ttlCptl;
    }

    /**
     * Sets the value of the ttlCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 setTtlCptl(ActiveCurrencyAndAmount value) {
        this.ttlCptl = value;
        return this;
    }

    /**
     * Gets the value of the lqdFinRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLqdFinRsrcs() {
        return lqdFinRsrcs;
    }

    /**
     * Sets the value of the lqdFinRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 setLqdFinRsrcs(ActiveCurrencyAndAmount value) {
        this.lqdFinRsrcs = value;
        return this;
    }

    /**
     * Gets the value of the hpthtclCptlMeasr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hpthtclCptlMeasr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHpthtclCptlMeasr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HypotheticalCapitalMeasure1 }
     * 
     * 
     */
    public List<HypotheticalCapitalMeasure1> getHpthtclCptlMeasr() {
        if (hpthtclCptlMeasr == null) {
            hpthtclCptlMeasr = new ArrayList<HypotheticalCapitalMeasure1>();
        }
        return this.hpthtclCptlMeasr;
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
     * Adds a new item to the hpthtclCptlMeasr list.
     * @see #getHpthtclCptlMeasr()
     * 
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 addHpthtclCptlMeasr(HypotheticalCapitalMeasure1 hpthtclCptlMeasr) {
        getHpthtclCptlMeasr().add(hpthtclCptlMeasr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPIncomeStatementAndCapitalAdequacyReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
