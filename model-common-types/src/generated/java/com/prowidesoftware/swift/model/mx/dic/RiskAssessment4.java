
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
 * Indicates to the card issuer the level of risk associated with the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskAssessment4", propOrder = {
    "nttyId",
    "nttyTp",
    "nttyCtry",
    "tp",
    "hghRskTx",
    "rsn",
    "rslt",
    "cond",
    "rcmmndtn",
    "prvtData",
    "ntlData"
})
public class RiskAssessment4 {

    @XmlElement(name = "NttyId")
    protected String nttyId;
    @XmlElement(name = "NttyTp")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code nttyTp;
    @XmlElement(name = "NttyCtry")
    protected String nttyCtry;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "HghRskTx")
    protected Boolean hghRskTx;
    @XmlElement(name = "Rsn")
    protected List<String> rsn;
    @XmlElement(name = "Rslt")
    protected String rslt;
    @XmlElement(name = "Cond")
    protected ATICALaxProcessing cond;
    @XmlElement(name = "Rcmmndtn")
    protected List<RecommendationAction2> rcmmndtn;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the nttyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyId() {
        return nttyId;
    }

    /**
     * Sets the value of the nttyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment4 setNttyId(String value) {
        this.nttyId = value;
        return this;
    }

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public RiskAssessment4 setNttyTp(ATICAPartyType1Code value) {
        this.nttyTp = value;
        return this;
    }

    /**
     * Gets the value of the nttyCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyCtry() {
        return nttyCtry;
    }

    /**
     * Sets the value of the nttyCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment4 setNttyCtry(String value) {
        this.nttyCtry = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment4 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the hghRskTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghRskTx() {
        return hghRskTx;
    }

    /**
     * Sets the value of the hghRskTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RiskAssessment4 setHghRskTx(Boolean value) {
        this.hghRskTx = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<String> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment4 setRslt(String value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public ATICALaxProcessing getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public RiskAssessment4 setCond(ATICALaxProcessing value) {
        this.cond = value;
        return this;
    }

    /**
     * Gets the value of the rcmmndtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcmmndtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcmmndtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationAction2 }
     * 
     * 
     * @return
     *     The value of the rcmmndtn property.
     */
    public List<RecommendationAction2> getRcmmndtn() {
        if (rcmmndtn == null) {
            rcmmndtn = new ArrayList<>();
        }
        return this.rcmmndtn;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public RiskAssessment4 addRsn(String rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the rcmmndtn list.
     * @see #getRcmmndtn()
     * 
     */
    public RiskAssessment4 addRcmmndtn(RecommendationAction2 rcmmndtn) {
        getRcmmndtn().add(rcmmndtn);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public RiskAssessment4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public RiskAssessment4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
