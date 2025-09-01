
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
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the attributes of a report and its content.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData6", propOrder = {
    "nm",
    "id",
    "qlfr",
    "dt",
    "tm",
    "seq",
    "ttlOcrncs",
    "frqcy",
    "crrctn",
    "conttnInd",
    "addtlData",
    "frmt",
    "othrFrmt",
    "cntt"
})
public class ReportData6 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Qlfr")
    protected String qlfr;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;
    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "TtlOcrncs")
    protected String ttlOcrncs;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency17Code frqcy;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected List<ReportContent1> cntt;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlfr() {
        return qlfr;
    }

    /**
     * Sets the value of the qlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setQlfr(String value) {
        this.qlfr = value;
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
    public ReportData6 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setTm(XMLGregorianCalendar value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setSeq(String value) {
        this.seq = value;
        return this;
    }

    /**
     * Gets the value of the ttlOcrncs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOcrncs() {
        return ttlOcrncs;
    }

    /**
     * Sets the value of the ttlOcrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setTtlOcrncs(String value) {
        this.ttlOcrncs = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency17Code }
     *     
     */
    public Frequency17Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency17Code }
     *     
     */
    public ReportData6 setFrqcy(Frequency17Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public ReportData6 setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the conttnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttnInd() {
        return conttnInd;
    }

    /**
     * Sets the value of the conttnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReportData6 setConttnInd(Boolean value) {
        this.conttnInd = value;
        return this;
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
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public ReportData6 setFrmt(OutputFormat5Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportData6 setOthrFrmt(String value) {
        this.othrFrmt = value;
        return this;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportContent1 }
     * 
     * 
     */
    public List<ReportContent1> getCntt() {
        if (cntt == null) {
            cntt = new ArrayList<ReportContent1>();
        }
        return this.cntt;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public ReportData6 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

    /**
     * Adds a new item to the cntt list.
     * @see #getCntt()
     * 
     */
    public ReportData6 addCntt(ReportContent1 cntt) {
        getCntt().add(cntt);
        return this;
    }

}
