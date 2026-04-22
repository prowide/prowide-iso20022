
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
 * Contains authentication related data. such as 3DS authentication data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAuthenticationData1", propOrder = {
    "acctBasedDgtlSgntr",
    "crdhldrCertSrlNb",
    "accptrCertSrlNb",
    "msgVrsn",
    "xid",
    "authntcnVal",
    "authntcnCd",
    "msgCtgy",
    "authntcnMrchntNm",
    "brwsrIPAdr",
    "dvcInf",
    "purchsAmt",
    "purchsCcy",
    "purchsDtTm",
    "adrMtchInd",
    "intrmyTxIdr",
    "authntcnSvrTxIdr",
    "authntcnSts",
    "applIPAdr",
    "shppgInd",
    "sdkApplId",
    "dvcId",
    "dvcTp",
    "rcrngTxSetp",
    "thrdPtyId",
    "thrdPtyRskScore",
    "ssnId",
    "ipAdrVlctyCnt",
    "dvcIdVlctyCnt",
    "dataQlty",
    "prgrmm",
    "prvtData",
    "ntlData"
})
public class CardAuthenticationData1 {

    @XmlElement(name = "AcctBasedDgtlSgntr")
    protected String acctBasedDgtlSgntr;
    @XmlElement(name = "CrdhldrCertSrlNb")
    protected byte[] crdhldrCertSrlNb;
    @XmlElement(name = "AccptrCertSrlNb")
    protected byte[] accptrCertSrlNb;
    @XmlElement(name = "MsgVrsn")
    protected String msgVrsn;
    @XmlElement(name = "XID")
    protected byte[] xid;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "AuthntcnCd")
    protected String authntcnCd;
    @XmlElement(name = "MsgCtgy")
    protected String msgCtgy;
    @XmlElement(name = "AuthntcnMrchntNm")
    protected String authntcnMrchntNm;
    @XmlElement(name = "BrwsrIPAdr")
    protected String brwsrIPAdr;
    @XmlElement(name = "DvcInf")
    protected String dvcInf;
    @XmlElement(name = "PurchsAmt")
    protected String purchsAmt;
    @XmlElement(name = "PurchsCcy")
    protected String purchsCcy;
    @XmlElement(name = "PurchsDtTm")
    protected String purchsDtTm;
    @XmlElement(name = "AdrMtchInd")
    protected String adrMtchInd;
    @XmlElement(name = "IntrmyTxIdr")
    protected String intrmyTxIdr;
    @XmlElement(name = "AuthntcnSvrTxIdr")
    protected String authntcnSvrTxIdr;
    @XmlElement(name = "AuthntcnSts")
    protected String authntcnSts;
    @XmlElement(name = "ApplIPAdr")
    protected String applIPAdr;
    @XmlElement(name = "ShppgInd")
    protected String shppgInd;
    @XmlElement(name = "SDKApplId")
    protected String sdkApplId;
    @XmlElement(name = "DvcId")
    protected List<String> dvcId;
    @XmlElement(name = "DvcTp")
    protected List<String> dvcTp;
    @XmlElement(name = "RcrngTxSetp")
    protected String rcrngTxSetp;
    @XmlElement(name = "ThrdPtyId")
    protected String thrdPtyId;
    @XmlElement(name = "ThrdPtyRskScore")
    protected String thrdPtyRskScore;
    @XmlElement(name = "SsnId")
    protected String ssnId;
    @XmlElement(name = "IPAdrVlctyCnt")
    protected String ipAdrVlctyCnt;
    @XmlElement(name = "DvcIdVlctyCnt")
    protected String dvcIdVlctyCnt;
    @XmlElement(name = "DataQlty")
    protected Boolean dataQlty;
    @XmlElement(name = "Prgrmm")
    protected String prgrmm;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the acctBasedDgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBasedDgtlSgntr() {
        return acctBasedDgtlSgntr;
    }

    /**
     * Sets the value of the acctBasedDgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAcctBasedDgtlSgntr(String value) {
        this.acctBasedDgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrCertSrlNb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCrdhldrCertSrlNb() {
        return crdhldrCertSrlNb;
    }

    /**
     * Sets the value of the crdhldrCertSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardAuthenticationData1 setCrdhldrCertSrlNb(byte[] value) {
        this.crdhldrCertSrlNb = value;
        return this;
    }

    /**
     * Gets the value of the accptrCertSrlNb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccptrCertSrlNb() {
        return accptrCertSrlNb;
    }

    /**
     * Sets the value of the accptrCertSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardAuthenticationData1 setAccptrCertSrlNb(byte[] value) {
        this.accptrCertSrlNb = value;
        return this;
    }

    /**
     * Gets the value of the msgVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgVrsn() {
        return msgVrsn;
    }

    /**
     * Sets the value of the msgVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setMsgVrsn(String value) {
        this.msgVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardAuthenticationData1 setXID(byte[] value) {
        this.xid = value;
        return this;
    }

    /**
     * Gets the value of the authntcnVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Sets the value of the authntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardAuthenticationData1 setAuthntcnVal(byte[] value) {
        this.authntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the authntcnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnCd() {
        return authntcnCd;
    }

    /**
     * Sets the value of the authntcnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAuthntcnCd(String value) {
        this.authntcnCd = value;
        return this;
    }

    /**
     * Gets the value of the msgCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCtgy() {
        return msgCtgy;
    }

    /**
     * Sets the value of the msgCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setMsgCtgy(String value) {
        this.msgCtgy = value;
        return this;
    }

    /**
     * Gets the value of the authntcnMrchntNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnMrchntNm() {
        return authntcnMrchntNm;
    }

    /**
     * Sets the value of the authntcnMrchntNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAuthntcnMrchntNm(String value) {
        this.authntcnMrchntNm = value;
        return this;
    }

    /**
     * Gets the value of the brwsrIPAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrwsrIPAdr() {
        return brwsrIPAdr;
    }

    /**
     * Sets the value of the brwsrIPAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setBrwsrIPAdr(String value) {
        this.brwsrIPAdr = value;
        return this;
    }

    /**
     * Gets the value of the dvcInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcInf() {
        return dvcInf;
    }

    /**
     * Sets the value of the dvcInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setDvcInf(String value) {
        this.dvcInf = value;
        return this;
    }

    /**
     * Gets the value of the purchsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsAmt() {
        return purchsAmt;
    }

    /**
     * Sets the value of the purchsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setPurchsAmt(String value) {
        this.purchsAmt = value;
        return this;
    }

    /**
     * Gets the value of the purchsCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsCcy() {
        return purchsCcy;
    }

    /**
     * Sets the value of the purchsCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setPurchsCcy(String value) {
        this.purchsCcy = value;
        return this;
    }

    /**
     * Gets the value of the purchsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsDtTm() {
        return purchsDtTm;
    }

    /**
     * Sets the value of the purchsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setPurchsDtTm(String value) {
        this.purchsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the adrMtchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrMtchInd() {
        return adrMtchInd;
    }

    /**
     * Sets the value of the adrMtchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAdrMtchInd(String value) {
        this.adrMtchInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmyTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrmyTxIdr() {
        return intrmyTxIdr;
    }

    /**
     * Sets the value of the intrmyTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setIntrmyTxIdr(String value) {
        this.intrmyTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the authntcnSvrTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnSvrTxIdr() {
        return authntcnSvrTxIdr;
    }

    /**
     * Sets the value of the authntcnSvrTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAuthntcnSvrTxIdr(String value) {
        this.authntcnSvrTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the authntcnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnSts() {
        return authntcnSts;
    }

    /**
     * Sets the value of the authntcnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setAuthntcnSts(String value) {
        this.authntcnSts = value;
        return this;
    }

    /**
     * Gets the value of the applIPAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIPAdr() {
        return applIPAdr;
    }

    /**
     * Sets the value of the applIPAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setApplIPAdr(String value) {
        this.applIPAdr = value;
        return this;
    }

    /**
     * Gets the value of the shppgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShppgInd() {
        return shppgInd;
    }

    /**
     * Sets the value of the shppgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setShppgInd(String value) {
        this.shppgInd = value;
        return this;
    }

    /**
     * Gets the value of the sdkApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDKApplId() {
        return sdkApplId;
    }

    /**
     * Sets the value of the sdkApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setSDKApplId(String value) {
        this.sdkApplId = value;
        return this;
    }

    /**
     * Gets the value of the dvcId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dvcId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDvcId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dvcId property.
     */
    public List<String> getDvcId() {
        if (dvcId == null) {
            dvcId = new ArrayList<>();
        }
        return this.dvcId;
    }

    /**
     * Gets the value of the dvcTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dvcTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDvcTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dvcTp property.
     */
    public List<String> getDvcTp() {
        if (dvcTp == null) {
            dvcTp = new ArrayList<>();
        }
        return this.dvcTp;
    }

    /**
     * Gets the value of the rcrngTxSetp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrngTxSetp() {
        return rcrngTxSetp;
    }

    /**
     * Sets the value of the rcrngTxSetp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setRcrngTxSetp(String value) {
        this.rcrngTxSetp = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThrdPtyId() {
        return thrdPtyId;
    }

    /**
     * Sets the value of the thrdPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setThrdPtyId(String value) {
        this.thrdPtyId = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyRskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThrdPtyRskScore() {
        return thrdPtyRskScore;
    }

    /**
     * Sets the value of the thrdPtyRskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setThrdPtyRskScore(String value) {
        this.thrdPtyRskScore = value;
        return this;
    }

    /**
     * Gets the value of the ssnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnId() {
        return ssnId;
    }

    /**
     * Sets the value of the ssnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setSsnId(String value) {
        this.ssnId = value;
        return this;
    }

    /**
     * Gets the value of the ipAdrVlctyCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdrVlctyCnt() {
        return ipAdrVlctyCnt;
    }

    /**
     * Sets the value of the ipAdrVlctyCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setIPAdrVlctyCnt(String value) {
        this.ipAdrVlctyCnt = value;
        return this;
    }

    /**
     * Gets the value of the dvcIdVlctyCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcIdVlctyCnt() {
        return dvcIdVlctyCnt;
    }

    /**
     * Sets the value of the dvcIdVlctyCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setDvcIdVlctyCnt(String value) {
        this.dvcIdVlctyCnt = value;
        return this;
    }

    /**
     * Gets the value of the dataQlty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataQlty() {
        return dataQlty;
    }

    /**
     * Sets the value of the dataQlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardAuthenticationData1 setDataQlty(Boolean value) {
        this.dataQlty = value;
        return this;
    }

    /**
     * Gets the value of the prgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmm() {
        return prgrmm;
    }

    /**
     * Sets the value of the prgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAuthenticationData1 setPrgrmm(String value) {
        this.prgrmm = value;
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
     * Adds a new item to the dvcId list.
     * @see #getDvcId()
     * 
     */
    public CardAuthenticationData1 addDvcId(String dvcId) {
        getDvcId().add(dvcId);
        return this;
    }

    /**
     * Adds a new item to the dvcTp list.
     * @see #getDvcTp()
     * 
     */
    public CardAuthenticationData1 addDvcTp(String dvcTp) {
        getDvcTp().add(dvcTp);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public CardAuthenticationData1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public CardAuthenticationData1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
