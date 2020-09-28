
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD10", propOrder = {
    "plcAndNm",
    "dtcLastDayForEarlyRed",
    "dtcPosCaptrDt",
    "newYorkCutOffDt",
    "dtcXtndedCutOffDt",
    "fctvDtByXchg",
    "dtDclrdWrthls",
    "delWrthlsSctyDt",
    "dtcExitDt",
    "sbcptBegnDt",
    "rghtsDstrbtnAsOfDt",
    "rghtsDstrbtnDt",
    "tmgDt"
})
public class CorporateActionDateSD10 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "DTCLastDayForEarlyRed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcLastDayForEarlyRed;
    @XmlElement(name = "DTCPosCaptrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcPosCaptrDt;
    @XmlElement(name = "NewYorkCutOffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newYorkCutOffDt;
    @XmlElement(name = "DTCXtndedCutOffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcXtndedCutOffDt;
    @XmlElement(name = "FctvDtByXchg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDtByXchg;
    @XmlElement(name = "DtDclrdWrthls")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtDclrdWrthls;
    @XmlElement(name = "DelWrthlsSctyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delWrthlsSctyDt;
    @XmlElement(name = "DTCExitDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcExitDt;
    @XmlElement(name = "SbcptBegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sbcptBegnDt;
    @XmlElement(name = "RghtsDstrbtnAsOfDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rghtsDstrbtnAsOfDt;
    @XmlElement(name = "RghtsDstrbtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rghtsDstrbtnDt;
    @XmlElement(name = "TmgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tmgDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD10 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcLastDayForEarlyRed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCLastDayForEarlyRed() {
        return dtcLastDayForEarlyRed;
    }

    /**
     * Sets the value of the dtcLastDayForEarlyRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDTCLastDayForEarlyRed(XMLGregorianCalendar value) {
        this.dtcLastDayForEarlyRed = value;
        return this;
    }

    /**
     * Gets the value of the dtcPosCaptrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCPosCaptrDt() {
        return dtcPosCaptrDt;
    }

    /**
     * Sets the value of the dtcPosCaptrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDTCPosCaptrDt(XMLGregorianCalendar value) {
        this.dtcPosCaptrDt = value;
        return this;
    }

    /**
     * Gets the value of the newYorkCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewYorkCutOffDt() {
        return newYorkCutOffDt;
    }

    /**
     * Sets the value of the newYorkCutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setNewYorkCutOffDt(XMLGregorianCalendar value) {
        this.newYorkCutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcXtndedCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCXtndedCutOffDt() {
        return dtcXtndedCutOffDt;
    }

    /**
     * Sets the value of the dtcXtndedCutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDTCXtndedCutOffDt(XMLGregorianCalendar value) {
        this.dtcXtndedCutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDtByXchg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDtByXchg() {
        return fctvDtByXchg;
    }

    /**
     * Sets the value of the fctvDtByXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setFctvDtByXchg(XMLGregorianCalendar value) {
        this.fctvDtByXchg = value;
        return this;
    }

    /**
     * Gets the value of the dtDclrdWrthls property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtDclrdWrthls() {
        return dtDclrdWrthls;
    }

    /**
     * Sets the value of the dtDclrdWrthls property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDtDclrdWrthls(XMLGregorianCalendar value) {
        this.dtDclrdWrthls = value;
        return this;
    }

    /**
     * Gets the value of the delWrthlsSctyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelWrthlsSctyDt() {
        return delWrthlsSctyDt;
    }

    /**
     * Sets the value of the delWrthlsSctyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDelWrthlsSctyDt(XMLGregorianCalendar value) {
        this.delWrthlsSctyDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcExitDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTCExitDt() {
        return dtcExitDt;
    }

    /**
     * Sets the value of the dtcExitDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setDTCExitDt(XMLGregorianCalendar value) {
        this.dtcExitDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptBegnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSbcptBegnDt() {
        return sbcptBegnDt;
    }

    /**
     * Sets the value of the sbcptBegnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setSbcptBegnDt(XMLGregorianCalendar value) {
        this.sbcptBegnDt = value;
        return this;
    }

    /**
     * Gets the value of the rghtsDstrbtnAsOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRghtsDstrbtnAsOfDt() {
        return rghtsDstrbtnAsOfDt;
    }

    /**
     * Sets the value of the rghtsDstrbtnAsOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setRghtsDstrbtnAsOfDt(XMLGregorianCalendar value) {
        this.rghtsDstrbtnAsOfDt = value;
        return this;
    }

    /**
     * Gets the value of the rghtsDstrbtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRghtsDstrbtnDt() {
        return rghtsDstrbtnDt;
    }

    /**
     * Sets the value of the rghtsDstrbtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setRghtsDstrbtnDt(XMLGregorianCalendar value) {
        this.rghtsDstrbtnDt = value;
        return this;
    }

    /**
     * Gets the value of the tmgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmgDt() {
        return tmgDt;
    }

    /**
     * Sets the value of the tmgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDateSD10 setTmgDt(XMLGregorianCalendar value) {
        this.tmgDt = value;
        return this;
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

}
