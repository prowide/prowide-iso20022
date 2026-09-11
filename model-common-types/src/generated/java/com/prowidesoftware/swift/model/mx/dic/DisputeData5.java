
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
 * Data to be present in a dispute.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData5", propOrder = {
    "cycl",
    "cond",
    "sts",
    "prtl",
    "agtBndlCaseRef",
    "agtCaseRef",
    "acqrrCaseRef",
    "issrCaseRef",
    "dcmnttnSts",
    "rjctRsn",
    "chrgbckElgblty",
    "msgTxt",
    "prvtData",
    "ntlData"
})
public class DisputeData5 {

    @XmlElement(name = "Cycl")
    protected String cycl;
    @XmlElement(name = "Cond")
    protected String cond;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "Prtl")
    protected Boolean prtl;
    @XmlElement(name = "AgtBndlCaseRef")
    protected String agtBndlCaseRef;
    @XmlElement(name = "AgtCaseRef")
    protected String agtCaseRef;
    @XmlElement(name = "AcqrrCaseRef")
    protected String acqrrCaseRef;
    @XmlElement(name = "IssrCaseRef")
    protected String issrCaseRef;
    @XmlElement(name = "DcmnttnSts")
    protected String dcmnttnSts;
    @XmlElement(name = "RjctRsn")
    protected List<String> rjctRsn;
    @XmlElement(name = "ChrgbckElgblty")
    protected String chrgbckElgblty;
    @XmlElement(name = "MsgTxt")
    protected String msgTxt;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the cycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycl() {
        return cycl;
    }

    /**
     * Sets the value of the cycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setCycl(String value) {
        this.cycl = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setCond(String value) {
        this.cond = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the prtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtl() {
        return prtl;
    }

    /**
     * Sets the value of the prtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DisputeData5 setPrtl(Boolean value) {
        this.prtl = value;
        return this;
    }

    /**
     * Gets the value of the agtBndlCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtBndlCaseRef() {
        return agtBndlCaseRef;
    }

    /**
     * Sets the value of the agtBndlCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setAgtBndlCaseRef(String value) {
        this.agtBndlCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the agtCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtCaseRef() {
        return agtCaseRef;
    }

    /**
     * Sets the value of the agtCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setAgtCaseRef(String value) {
        this.agtCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the acqrrCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrCaseRef() {
        return acqrrCaseRef;
    }

    /**
     * Sets the value of the acqrrCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setAcqrrCaseRef(String value) {
        this.acqrrCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the issrCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCaseRef() {
        return issrCaseRef;
    }

    /**
     * Sets the value of the issrCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setIssrCaseRef(String value) {
        this.issrCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the dcmnttnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcmnttnSts() {
        return dcmnttnSts;
    }

    /**
     * Sets the value of the dcmnttnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setDcmnttnSts(String value) {
        this.dcmnttnSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rjctRsn property.
     */
    public List<String> getRjctRsn() {
        if (rjctRsn == null) {
            rjctRsn = new ArrayList<>();
        }
        return this.rjctRsn;
    }

    /**
     * Gets the value of the chrgbckElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgbckElgblty() {
        return chrgbckElgblty;
    }

    /**
     * Sets the value of the chrgbckElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setChrgbckElgblty(String value) {
        this.chrgbckElgblty = value;
        return this;
    }

    /**
     * Gets the value of the msgTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgTxt() {
        return msgTxt;
    }

    /**
     * Sets the value of the msgTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData5 setMsgTxt(String value) {
        this.msgTxt = value;
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
     * Adds a new item to the rjctRsn list.
     * @see #getRjctRsn()
     * 
     */
    public DisputeData5 addRjctRsn(String rjctRsn) {
        getRjctRsn().add(rjctRsn);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public DisputeData5 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public DisputeData5 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
