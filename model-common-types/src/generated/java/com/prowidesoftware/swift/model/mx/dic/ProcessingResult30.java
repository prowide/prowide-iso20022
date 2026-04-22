
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
@XmlType(name = "ProcessingResult30", propOrder = {
    "rspnSrcId",
    "rspnSrcTp",
    "rspnSrcCtry",
    "rspnSrcNm",
    "rspnCd",
    "rspnRsn",
    "actnCd",
    "errDtl",
    "prvtData",
    "ntlData"
})
public class ProcessingResult30 {

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
    @XmlElement(name = "ErrDtl")
    protected List<ErrorDetails4> errDtl;
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
    public ProcessingResult30 setRspnSrcId(String value) {
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
    public ProcessingResult30 setRspnSrcTp(ATICAPartyType1Code value) {
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
    public ProcessingResult30 setRspnSrcCtry(String value) {
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
    public ProcessingResult30 setRspnSrcNm(String value) {
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
    public ProcessingResult30 setRspnCd(String value) {
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
    public ProcessingResult30 setRspnRsn(String value) {
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
    public ProcessingResult30 setActnCd(String value) {
        this.actnCd = value;
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
    public ProcessingResult30 addErrDtl(ErrorDetails4 errDtl) {
        getErrDtl().add(errDtl);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public ProcessingResult30 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public ProcessingResult30 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
