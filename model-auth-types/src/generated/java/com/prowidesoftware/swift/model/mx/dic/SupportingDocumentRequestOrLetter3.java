
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Currency control related document or letter supporting the contract registration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocumentRequestOrLetter3", propOrder = {
    "reqOrLttrId",
    "dt",
    "sndr",
    "rcvr",
    "orgnlRefs",
    "sbjt",
    "tp",
    "desc",
    "rspnReqrd",
    "dueDt",
    "attchmnt",
    "splmtryData"
})
public class SupportingDocumentRequestOrLetter3 {

    @XmlElement(name = "ReqOrLttrId", required = true)
    protected String reqOrLttrId;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dt;
    @XmlElement(name = "Sndr")
    protected Party40Choice sndr;
    @XmlElement(name = "Rcvr")
    protected Party40Choice rcvr;
    @XmlElement(name = "OrgnlRefs")
    protected List<OriginalMessage4> orgnlRefs;
    @XmlElement(name = "Sbjt", required = true)
    protected String sbjt;
    @XmlElement(name = "Tp", required = true)
    protected SupportLetterType1Choice tp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "RspnReqrd")
    protected boolean rspnReqrd;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dueDt;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqOrLttrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqOrLttrId() {
        return reqOrLttrId;
    }

    /**
     * Sets the value of the reqOrLttrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setReqOrLttrId(String value) {
        this.reqOrLttrId = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setDt(Calendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setSndr(Party40Choice value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setRcvr(Party40Choice value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalMessage4 }
     * 
     * 
     * @return
     *     The value of the orgnlRefs property.
     */
    public List<OriginalMessage4> getOrgnlRefs() {
        if (orgnlRefs == null) {
            orgnlRefs = new ArrayList<>();
        }
        return this.orgnlRefs;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjt() {
        return sbjt;
    }

    /**
     * Sets the value of the sbjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setSbjt(String value) {
        this.sbjt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SupportLetterType1Choice }
     *     
     */
    public SupportLetterType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportLetterType1Choice }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setTp(SupportLetterType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the rspnReqrd property.
     * 
     */
    public boolean isRspnReqrd() {
        return rspnReqrd;
    }

    /**
     * Sets the value of the rspnReqrd property.
     * 
     */
    public SupportingDocumentRequestOrLetter3 setRspnReqrd(boolean value) {
        this.rspnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SupportingDocumentRequestOrLetter3 setDueDt(Calendar value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the orgnlRefs list.
     * @see #getOrgnlRefs()
     * 
     */
    public SupportingDocumentRequestOrLetter3 addOrgnlRefs(OriginalMessage4 orgnlRefs) {
        getOrgnlRefs().add(orgnlRefs);
        return this;
    }

    /**
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public SupportingDocumentRequestOrLetter3 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SupportingDocumentRequestOrLetter3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
