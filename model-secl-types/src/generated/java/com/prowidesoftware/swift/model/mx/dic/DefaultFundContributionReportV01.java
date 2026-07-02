
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
 * This message is sent by the central counterparty (CCP) to a Clearing member to report on the calculation of the default fund contribution and the potential net excess or deficit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFundContributionReportV01", propOrder = {
    "id",
    "rptParams",
    "clrMmb",
    "dfltFndDtls",
    "collDtls",
    "netXcssOrDfcit",
    "splmtryData"
})
public class DefaultFundContributionReportV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters2 rptParams;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "DfltFndDtls", required = true)
    protected List<DefaultFund1> dfltFndDtls;
    @XmlElement(name = "CollDtls", required = true)
    protected List<Collateral3> collDtls;
    @XmlElement(name = "NetXcssOrDfcit", required = true)
    protected AmountAndDirection21 netXcssOrDfcit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DefaultFundContributionReportV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters2 }
     *     
     */
    public ReportParameters2 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters2 }
     *     
     */
    public DefaultFundContributionReportV01 setRptParams(ReportParameters2 value) {
        this.rptParams = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public DefaultFundContributionReportV01 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the dfltFndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dfltFndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltFndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultFund1 }
     * 
     * 
     */
    public List<DefaultFund1> getDfltFndDtls() {
        if (dfltFndDtls == null) {
            dfltFndDtls = new ArrayList<DefaultFund1>();
        }
        return this.dfltFndDtls;
    }

    /**
     * Gets the value of the collDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collateral3 }
     * 
     * 
     */
    public List<Collateral3> getCollDtls() {
        if (collDtls == null) {
            collDtls = new ArrayList<Collateral3>();
        }
        return this.collDtls;
    }

    /**
     * Gets the value of the netXcssOrDfcit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getNetXcssOrDfcit() {
        return netXcssOrDfcit;
    }

    /**
     * Sets the value of the netXcssOrDfcit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public DefaultFundContributionReportV01 setNetXcssOrDfcit(AmountAndDirection21 value) {
        this.netXcssOrDfcit = value;
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
     * Adds a new item to the dfltFndDtls list.
     * @see #getDfltFndDtls()
     * 
     */
    public DefaultFundContributionReportV01 addDfltFndDtls(DefaultFund1 dfltFndDtls) {
        getDfltFndDtls().add(dfltFndDtls);
        return this;
    }

    /**
     * Adds a new item to the collDtls list.
     * @see #getCollDtls()
     * 
     */
    public DefaultFundContributionReportV01 addCollDtls(Collateral3 collDtls) {
        getCollDtls().add(collDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DefaultFundContributionReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
