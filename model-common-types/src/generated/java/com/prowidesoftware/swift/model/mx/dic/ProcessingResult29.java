
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
 * Outcome of the processing of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult29", propOrder = {
    "rspnSrcId",
    "rspnSrcTp",
    "rspnSrcCtry",
    "rspnSrcNm",
    "rspnCd",
    "rspnRsn",
    "actnCd",
    "apprvlCd",
    "tempScrCardDataReusePrtd",
    "errDtl",
    "crdhldrRctData",
    "cardAccptrRctData",
    "crdhldrDispData",
    "cardAccptrDispData",
    "cardIssrTelNb",
    "prvtData",
    "ntlData"
})
public class ProcessingResult29 {

    @XmlElement(name = "RspnSrcId")
    protected String rspnSrcId;
    @XmlElement(name = "RspnSrcTp")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code rspnSrcTp;
    @XmlElement(name = "RspnSrcCtry")
    protected String rspnSrcCtry;
    @XmlElement(name = "RspnSrcNm")
    protected String rspnSrcNm;
    @XmlElement(name = "RspnCd", required = true)
    protected String rspnCd;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "ActnCd")
    protected String actnCd;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;
    @XmlElement(name = "TempScrCardDataReusePrtd")
    protected Boolean tempScrCardDataReusePrtd;
    @XmlElement(name = "ErrDtl")
    protected List<ErrorDetails4> errDtl;
    @XmlElement(name = "CrdhldrRctData")
    protected String crdhldrRctData;
    @XmlElement(name = "CardAccptrRctData")
    protected String cardAccptrRctData;
    @XmlElement(name = "CrdhldrDispData")
    protected String crdhldrDispData;
    @XmlElement(name = "CardAccptrDispData")
    protected String cardAccptrDispData;
    @XmlElement(name = "CardIssrTelNb")
    protected String cardIssrTelNb;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the rspnSrcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSrcId() {
        return rspnSrcId;
    }

    /**
     * Sets the value of the rspnSrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setRspnSrcId(String value) {
        this.rspnSrcId = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getRspnSrcTp() {
        return rspnSrcTp;
    }

    /**
     * Sets the value of the rspnSrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ProcessingResult29 setRspnSrcTp(ATICAPartyType1Code value) {
        this.rspnSrcTp = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSrcCtry() {
        return rspnSrcCtry;
    }

    /**
     * Sets the value of the rspnSrcCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setRspnSrcCtry(String value) {
        this.rspnSrcCtry = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSrcNm() {
        return rspnSrcNm;
    }

    /**
     * Sets the value of the rspnSrcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setRspnSrcNm(String value) {
        this.rspnSrcNm = value;
        return this;
    }

    /**
     * Gets the value of the rspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnCd() {
        return rspnCd;
    }

    /**
     * Sets the value of the rspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setRspnCd(String value) {
        this.rspnCd = value;
        return this;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setRspnRsn(String value) {
        this.rspnRsn = value;
        return this;
    }

    /**
     * Gets the value of the actnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActnCd() {
        return actnCd;
    }

    /**
     * Sets the value of the actnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setActnCd(String value) {
        this.actnCd = value;
        return this;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setApprvlCd(String value) {
        this.apprvlCd = value;
        return this;
    }

    /**
     * Gets the value of the tempScrCardDataReusePrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusePrtd() {
        return tempScrCardDataReusePrtd;
    }

    /**
     * Sets the value of the tempScrCardDataReusePrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ProcessingResult29 setTempScrCardDataReusePrtd(Boolean value) {
        this.tempScrCardDataReusePrtd = value;
        return this;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails4 }
     * 
     * 
     * @return
     *     The value of the errDtl property.
     */
    public List<ErrorDetails4> getErrDtl() {
        if (errDtl == null) {
            errDtl = new ArrayList<>();
        }
        return this.errDtl;
    }

    /**
     * Gets the value of the crdhldrRctData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrRctData() {
        return crdhldrRctData;
    }

    /**
     * Sets the value of the crdhldrRctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setCrdhldrRctData(String value) {
        this.crdhldrRctData = value;
        return this;
    }

    /**
     * Gets the value of the cardAccptrRctData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccptrRctData() {
        return cardAccptrRctData;
    }

    /**
     * Sets the value of the cardAccptrRctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setCardAccptrRctData(String value) {
        this.cardAccptrRctData = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrDispData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrDispData() {
        return crdhldrDispData;
    }

    /**
     * Sets the value of the crdhldrDispData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setCrdhldrDispData(String value) {
        this.crdhldrDispData = value;
        return this;
    }

    /**
     * Gets the value of the cardAccptrDispData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccptrDispData() {
        return cardAccptrDispData;
    }

    /**
     * Sets the value of the cardAccptrDispData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setCardAccptrDispData(String value) {
        this.cardAccptrDispData = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrTelNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrTelNb() {
        return cardIssrTelNb;
    }

    /**
     * Sets the value of the cardIssrTelNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult29 setCardIssrTelNb(String value) {
        this.cardIssrTelNb = value;
        return this;
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
     * Adds a new item to the errDtl list.
     * @see #getErrDtl()
     * 
     */
    public ProcessingResult29 addErrDtl(ErrorDetails4 errDtl) {
        getErrDtl().add(errDtl);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public ProcessingResult29 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public ProcessingResult29 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
