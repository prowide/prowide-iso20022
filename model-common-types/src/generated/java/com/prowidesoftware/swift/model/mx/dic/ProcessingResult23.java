
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
 * Outcome of the processing of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult23", propOrder = {
    "rspnSrcId",
    "rspnSrcTp",
    "rspnSrcOthrTp",
    "rspnSrcAssgnr",
    "rspnSrcCtry",
    "rspnSrcShrtNm",
    "rspnCd",
    "errDtl",
    "addtlInf"
})
public class ProcessingResult23 {

    @XmlElement(name = "RspnSrcId")
    protected String rspnSrcId;
    @XmlElement(name = "RspnSrcTp")
    @XmlSchemaType(name = "string")
    protected PartyType26Code rspnSrcTp;
    @XmlElement(name = "RspnSrcOthrTp")
    protected String rspnSrcOthrTp;
    @XmlElement(name = "RspnSrcAssgnr")
    @XmlSchemaType(name = "string")
    protected PartyType9Code rspnSrcAssgnr;
    @XmlElement(name = "RspnSrcCtry")
    protected String rspnSrcCtry;
    @XmlElement(name = "RspnSrcShrtNm")
    protected String rspnSrcShrtNm;
    @XmlElement(name = "RspnCd", required = true)
    protected String rspnCd;
    @XmlElement(name = "ErrDtl")
    protected List<ErrorDetails3> errDtl;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalData1> addtlInf;

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
    public ProcessingResult23 setRspnSrcId(String value) {
        this.rspnSrcId = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getRspnSrcTp() {
        return rspnSrcTp;
    }

    /**
     * Sets the value of the rspnSrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public ProcessingResult23 setRspnSrcTp(PartyType26Code value) {
        this.rspnSrcTp = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcOthrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSrcOthrTp() {
        return rspnSrcOthrTp;
    }

    /**
     * Sets the value of the rspnSrcOthrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult23 setRspnSrcOthrTp(String value) {
        this.rspnSrcOthrTp = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType9Code }
     *     
     */
    public PartyType9Code getRspnSrcAssgnr() {
        return rspnSrcAssgnr;
    }

    /**
     * Sets the value of the rspnSrcAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType9Code }
     *     
     */
    public ProcessingResult23 setRspnSrcAssgnr(PartyType9Code value) {
        this.rspnSrcAssgnr = value;
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
    public ProcessingResult23 setRspnSrcCtry(String value) {
        this.rspnSrcCtry = value;
        return this;
    }

    /**
     * Gets the value of the rspnSrcShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnSrcShrtNm() {
        return rspnSrcShrtNm;
    }

    /**
     * Sets the value of the rspnSrcShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessingResult23 setRspnSrcShrtNm(String value) {
        this.rspnSrcShrtNm = value;
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
    public ProcessingResult23 setRspnCd(String value) {
        this.rspnCd = value;
        return this;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errDtl property.
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
     * {@link ErrorDetails3 }
     * 
     * 
     */
    public List<ErrorDetails3> getErrDtl() {
        if (errDtl == null) {
            errDtl = new ArrayList<ErrorDetails3>();
        }
        return this.errDtl;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalData1>();
        }
        return this.addtlInf;
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
    public ProcessingResult23 addErrDtl(ErrorDetails3 errDtl) {
        getErrDtl().add(errDtl);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ProcessingResult23 addAddtlInf(AdditionalData1 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
