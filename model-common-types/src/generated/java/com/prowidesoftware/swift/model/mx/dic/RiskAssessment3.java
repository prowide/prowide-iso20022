
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "RiskAssessment3", propOrder = {
    "nttyId",
    "nttyTp",
    "othrNttyTp",
    "nttyAssgnr",
    "nttyCtry",
    "nttyShrtNm",
    "tp",
    "hghRskTx",
    "rsn",
    "rslt",
    "cond",
    "rcmmndtn",
    "addtlData"
})
public class RiskAssessment3 {

    @XmlElement(name = "NttyId")
    protected String nttyId;
    @XmlElement(name = "NttyTp")
    @XmlSchemaType(name = "string")
    protected PartyType28Code nttyTp;
    @XmlElement(name = "OthrNttyTp")
    protected String othrNttyTp;
    @XmlElement(name = "NttyAssgnr")
    @XmlSchemaType(name = "string")
    protected PartyType18Code nttyAssgnr;
    @XmlElement(name = "NttyCtry")
    protected String nttyCtry;
    @XmlElement(name = "NttyShrtNm")
    protected String nttyShrtNm;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "HghRskTx")
    protected Boolean hghRskTx;
    @XmlElement(name = "Rsn")
    protected List<String> rsn;
    @XmlElement(name = "Rslt")
    protected String rslt;
    @XmlElement(name = "Cond")
    protected List<AdditionalData1> cond;
    @XmlElement(name = "Rcmmndtn")
    protected List<RecommendationAction1> rcmmndtn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalRiskData1> addtlData;

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
    public RiskAssessment3 setNttyId(String value) {
        this.nttyId = value;
        return this;
    }

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType28Code }
     *     
     */
    public PartyType28Code getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType28Code }
     *     
     */
    public RiskAssessment3 setNttyTp(PartyType28Code value) {
        this.nttyTp = value;
        return this;
    }

    /**
     * Gets the value of the othrNttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNttyTp() {
        return othrNttyTp;
    }

    /**
     * Sets the value of the othrNttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment3 setOthrNttyTp(String value) {
        this.othrNttyTp = value;
        return this;
    }

    /**
     * Gets the value of the nttyAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType18Code }
     *     
     */
    public PartyType18Code getNttyAssgnr() {
        return nttyAssgnr;
    }

    /**
     * Sets the value of the nttyAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType18Code }
     *     
     */
    public RiskAssessment3 setNttyAssgnr(PartyType18Code value) {
        this.nttyAssgnr = value;
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
    public RiskAssessment3 setNttyCtry(String value) {
        this.nttyCtry = value;
        return this;
    }

    /**
     * Gets the value of the nttyShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyShrtNm() {
        return nttyShrtNm;
    }

    /**
     * Sets the value of the nttyShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskAssessment3 setNttyShrtNm(String value) {
        this.nttyShrtNm = value;
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
    public RiskAssessment3 setTp(String value) {
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
    public RiskAssessment3 setHghRskTx(Boolean value) {
        this.hghRskTx = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
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
     */
    public List<String> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<String>();
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
    public RiskAssessment3 setRslt(String value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getCond() {
        if (cond == null) {
            cond = new ArrayList<AdditionalData1>();
        }
        return this.cond;
    }

    /**
     * Gets the value of the rcmmndtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcmmndtn property.
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
     * {@link RecommendationAction1 }
     * 
     * 
     */
    public List<RecommendationAction1> getRcmmndtn() {
        if (rcmmndtn == null) {
            rcmmndtn = new ArrayList<RecommendationAction1>();
        }
        return this.rcmmndtn;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalRiskData1 }
     * 
     * 
     */
    public List<AdditionalRiskData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalRiskData1>();
        }
        return this.addtlData;
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
    public RiskAssessment3 addRsn(String rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the cond list.
     * @see #getCond()
     * 
     */
    public RiskAssessment3 addCond(AdditionalData1 cond) {
        getCond().add(cond);
        return this;
    }

    /**
     * Adds a new item to the rcmmndtn list.
     * @see #getRcmmndtn()
     * 
     */
    public RiskAssessment3 addRcmmndtn(RecommendationAction1 rcmmndtn) {
        getRcmmndtn().add(rcmmndtn);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public RiskAssessment3 addAddtlData(AdditionalRiskData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
