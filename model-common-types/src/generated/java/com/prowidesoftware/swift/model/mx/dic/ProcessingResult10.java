
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
 * Outcome of the processing of the authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult10", propOrder = {
    "rspnSrc",
    "rsltData",
    "apprvlCd",
    "errDtl",
    "orgnlRsltData",
    "actnReqrd",
    "actn",
    "addtlActn",
    "addtlInf"
})
public class ProcessingResult10 {

    @XmlElement(name = "RspnSrc")
    protected ApprovalEntity2 rspnSrc;
    @XmlElement(name = "RsltData", required = true)
    protected ResultData7 rsltData;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;
    @XmlElement(name = "ErrDtl")
    protected ErrorDetails2 errDtl;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData7 orgnlRsltData;
    @XmlElement(name = "ActnReqrd")
    protected Boolean actnReqrd;
    @XmlElement(name = "Actn")
    protected List<Action13> actn;
    @XmlElement(name = "AddtlActn")
    protected List<AdditionalAction1> addtlActn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation29> addtlInf;

    /**
     * Gets the value of the rspnSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public ApprovalEntity2 getRspnSrc() {
        return rspnSrc;
    }

    /**
     * Sets the value of the rspnSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public ProcessingResult10 setRspnSrc(ApprovalEntity2 value) {
        this.rspnSrc = value;
        return this;
    }

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public ProcessingResult10 setRsltData(ResultData7 value) {
        this.rsltData = value;
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
    public ProcessingResult10 setApprvlCd(String value) {
        this.apprvlCd = value;
        return this;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDetails2 }
     *     
     */
    public ErrorDetails2 getErrDtl() {
        return errDtl;
    }

    /**
     * Sets the value of the errDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDetails2 }
     *     
     */
    public ProcessingResult10 setErrDtl(ErrorDetails2 value) {
        this.errDtl = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Sets the value of the orgnlRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public ProcessingResult10 setOrgnlRsltData(ResultData7 value) {
        this.orgnlRsltData = value;
        return this;
    }

    /**
     * Gets the value of the actnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActnReqrd() {
        return actnReqrd;
    }

    /**
     * Sets the value of the actnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ProcessingResult10 setActnReqrd(Boolean value) {
        this.actnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action13 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action13> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the addtlActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAction1 }
     * 
     * 
     * @return
     *     The value of the addtlActn property.
     */
    public List<AdditionalAction1> getAddtlActn() {
        if (addtlActn == null) {
            addtlActn = new ArrayList<>();
        }
        return this.addtlActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
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
     * {@link AdditionalInformation29 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation29> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public ProcessingResult10 addActn(Action13 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the addtlActn list.
     * @see #getAddtlActn()
     * 
     */
    public ProcessingResult10 addAddtlActn(AdditionalAction1 addtlActn) {
        getAddtlActn().add(addtlActn);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ProcessingResult10 addAddtlInf(AdditionalInformation29 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
