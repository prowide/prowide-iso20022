
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "SupportingDocumentRequestOrLetter2", propOrder = {
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
public class SupportingDocumentRequestOrLetter2 {

    @XmlElement(name = "ReqOrLttrId", required = true)
    protected String reqOrLttrId;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Sndr")
    protected Party40Choice sndr;
    @XmlElement(name = "Rcvr")
    protected Party40Choice rcvr;
    @XmlElement(name = "OrgnlRefs")
    protected List<OriginalMessage4> orgnlRefs;
    @XmlElement(name = "Sbjt", required = true)
    protected String sbjt;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected SupportDocumentType1Code tp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "RspnReqrd")
    protected boolean rspnReqrd;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation3> attchmnt;
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
    public SupportingDocumentRequestOrLetter2 setReqOrLttrId(String value) {
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
    public XMLGregorianCalendar getDt() {
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
    public SupportingDocumentRequestOrLetter2 setDt(XMLGregorianCalendar value) {
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
    public SupportingDocumentRequestOrLetter2 setSndr(Party40Choice value) {
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
    public SupportingDocumentRequestOrLetter2 setRcvr(Party40Choice value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlRefs property.
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
     */
    public List<OriginalMessage4> getOrgnlRefs() {
        if (orgnlRefs == null) {
            orgnlRefs = new ArrayList<OriginalMessage4>();
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
    public SupportingDocumentRequestOrLetter2 setSbjt(String value) {
        this.sbjt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SupportDocumentType1Code }
     *     
     */
    public SupportDocumentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportDocumentType1Code }
     *     
     */
    public SupportingDocumentRequestOrLetter2 setTp(SupportDocumentType1Code value) {
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
    public SupportingDocumentRequestOrLetter2 setDesc(String value) {
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
    public SupportingDocumentRequestOrLetter2 setRspnReqrd(boolean value) {
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
    public XMLGregorianCalendar getDueDt() {
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
    public SupportingDocumentRequestOrLetter2 setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchmnt property.
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
     * {@link DocumentGeneralInformation3 }
     * 
     * 
     */
    public List<DocumentGeneralInformation3> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<DocumentGeneralInformation3>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
    public SupportingDocumentRequestOrLetter2 addOrgnlRefs(OriginalMessage4 orgnlRefs) {
        getOrgnlRefs().add(orgnlRefs);
        return this;
    }

    /**
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public SupportingDocumentRequestOrLetter2 addAttchmnt(DocumentGeneralInformation3 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SupportingDocumentRequestOrLetter2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
