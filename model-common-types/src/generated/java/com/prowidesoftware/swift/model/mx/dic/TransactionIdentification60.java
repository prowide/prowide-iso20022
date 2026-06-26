
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the transaction for network management.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification60", propOrder = {
    "lclDt",
    "lclTm",
    "tmZone",
    "purchsIdrTp",
    "purchsIdr",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprt",
    "lifeCyclId",
    "authstnSeqNb",
    "presntmntSeqNb",
    "presntmntSeqCnt",
    "authntcnTkn",
    "lifeCyclIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "issrRefData",
    "prvtData",
    "ntlData"
})
public class TransactionIdentification60 {

    @XmlElement(name = "LclDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lclDt;
    @XmlElement(name = "LclTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime lclTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "PurchsIdrTp")
    @XmlSchemaType(name = "string")
    protected PurchaseIdentifierType3Code purchsIdrTp;
    @XmlElement(name = "PurchsIdr")
    protected String purchsIdr;
    @XmlElement(name = "TrnsmssnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprt")
    @XmlSchemaType(name = "string")
    protected LifeCycleSupport1Code lifeCyclSpprt;
    @XmlElement(name = "LifeCyclId")
    protected String lifeCyclId;
    @XmlElement(name = "AuthstnSeqNb")
    protected String authstnSeqNb;
    @XmlElement(name = "PresntmntSeqNb")
    protected String presntmntSeqNb;
    @XmlElement(name = "PresntmntSeqCnt")
    protected String presntmntSeqCnt;
    @XmlElement(name = "AuthntcnTkn")
    protected String authntcnTkn;
    @XmlElement(name = "LifeCyclIdMssng")
    protected String lifeCyclIdMssng;
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "IssrRefData")
    protected String issrRefData;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the lclDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLclDt() {
        return lclDt;
    }

    /**
     * Sets the value of the lclDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setLclDt(LocalDate value) {
        this.lclDt = value;
        return this;
    }

    /**
     * Gets the value of the lclTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getLclTm() {
        return lclTm;
    }

    /**
     * Sets the value of the lclTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setLclTm(OffsetTime value) {
        this.lclTm = value;
        return this;
    }

    /**
     * Gets the value of the tmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the tmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setTmZone(String value) {
        this.tmZone = value;
        return this;
    }

    /**
     * Gets the value of the purchsIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseIdentifierType3Code }
     *     
     */
    public PurchaseIdentifierType3Code getPurchsIdrTp() {
        return purchsIdrTp;
    }

    /**
     * Sets the value of the purchsIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseIdentifierType3Code }
     *     
     */
    public TransactionIdentification60 setPurchsIdrTp(PurchaseIdentifierType3Code value) {
        this.purchsIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the purchsIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsIdr() {
        return purchsIdr;
    }

    /**
     * Sets the value of the purchsIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setPurchsIdr(String value) {
        this.purchsIdr = value;
        return this;
    }

    /**
     * Gets the value of the trnsmssnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Sets the value of the trnsmssnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setTrnsmssnDtTm(OffsetDateTime value) {
        this.trnsmssnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sysTracAudtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Sets the value of the sysTracAudtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Sets the value of the rtrvlRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public LifeCycleSupport1Code getLifeCyclSpprt() {
        return lifeCyclSpprt;
    }

    /**
     * Sets the value of the lifeCyclSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public TransactionIdentification60 setLifeCyclSpprt(LifeCycleSupport1Code value) {
        this.lifeCyclSpprt = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclId() {
        return lifeCyclId;
    }

    /**
     * Sets the value of the lifeCyclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setLifeCyclId(String value) {
        this.lifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the authstnSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnSeqNb() {
        return authstnSeqNb;
    }

    /**
     * Sets the value of the authstnSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setAuthstnSeqNb(String value) {
        this.authstnSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the presntmntSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqNb() {
        return presntmntSeqNb;
    }

    /**
     * Sets the value of the presntmntSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setPresntmntSeqNb(String value) {
        this.presntmntSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the presntmntSeqCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqCnt() {
        return presntmntSeqCnt;
    }

    /**
     * Sets the value of the presntmntSeqCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setPresntmntSeqCnt(String value) {
        this.presntmntSeqCnt = value;
        return this;
    }

    /**
     * Gets the value of the authntcnTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTkn() {
        return authntcnTkn;
    }

    /**
     * Sets the value of the authntcnTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setAuthntcnTkn(String value) {
        this.authntcnTkn = value;
        return this;
    }

    /**
     * Gets the value of the lifeCyclIdMssng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclIdMssng() {
        return lifeCyclIdMssng;
    }

    /**
     * Sets the value of the lifeCyclIdMssng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setLifeCyclIdMssng(String value) {
        this.lifeCyclIdMssng = value;
        return this;
    }

    /**
     * Gets the value of the acqrrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefData() {
        return acqrrRefData;
    }

    /**
     * Sets the value of the acqrrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setAcqrrRefData(String value) {
        this.acqrrRefData = value;
        return this;
    }

    /**
     * Gets the value of the acqrrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefNb() {
        return acqrrRefNb;
    }

    /**
     * Sets the value of the acqrrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setAcqrrRefNb(String value) {
        this.acqrrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the issrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrRefData() {
        return issrRefData;
    }

    /**
     * Sets the value of the issrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionIdentification60 setIssrRefData(String value) {
        this.issrRefData = value;
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
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public TransactionIdentification60 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public TransactionIdentification60 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
