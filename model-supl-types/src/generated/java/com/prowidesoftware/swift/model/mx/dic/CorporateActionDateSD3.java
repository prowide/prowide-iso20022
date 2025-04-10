
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides additional information regarding corporate action date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD3", propOrder = {
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
    "filgDt",
    "hrgDt"
})
public class CorporateActionDateSD3 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCLastDayForEarlyRed", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcLastDayForEarlyRed;
    @XmlElement(name = "DTCPosCaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcPosCaptrDt;
    @XmlElement(name = "NewYorkCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newYorkCutOffDt;
    @XmlElement(name = "DTCXtndedCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcXtndedCutOffDt;
    @XmlElement(name = "FctvDtByXchg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDtByXchg;
    @XmlElement(name = "DtDclrdWrthls", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtDclrdWrthls;
    @XmlElement(name = "DelWrthlsSctyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delWrthlsSctyDt;
    @XmlElement(name = "DTCExitDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtcExitDt;
    @XmlElement(name = "SbcptBegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sbcptBegnDt;
    @XmlElement(name = "FilgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filgDt;
    @XmlElement(name = "HrgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hrgDt;

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
    public CorporateActionDateSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcLastDayForEarlyRed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDTCLastDayForEarlyRed(XMLGregorianCalendar value) {
        this.dtcLastDayForEarlyRed = value;
        return this;
    }

    /**
     * Gets the value of the dtcPosCaptrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDTCPosCaptrDt(XMLGregorianCalendar value) {
        this.dtcPosCaptrDt = value;
        return this;
    }

    /**
     * Gets the value of the newYorkCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setNewYorkCutOffDt(XMLGregorianCalendar value) {
        this.newYorkCutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcXtndedCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDTCXtndedCutOffDt(XMLGregorianCalendar value) {
        this.dtcXtndedCutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDtByXchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setFctvDtByXchg(XMLGregorianCalendar value) {
        this.fctvDtByXchg = value;
        return this;
    }

    /**
     * Gets the value of the dtDclrdWrthls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDtDclrdWrthls(XMLGregorianCalendar value) {
        this.dtDclrdWrthls = value;
        return this;
    }

    /**
     * Gets the value of the delWrthlsSctyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDelWrthlsSctyDt(XMLGregorianCalendar value) {
        this.delWrthlsSctyDt = value;
        return this;
    }

    /**
     * Gets the value of the dtcExitDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setDTCExitDt(XMLGregorianCalendar value) {
        this.dtcExitDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptBegnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setSbcptBegnDt(XMLGregorianCalendar value) {
        this.sbcptBegnDt = value;
        return this;
    }

    /**
     * Gets the value of the filgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFilgDt() {
        return filgDt;
    }

    /**
     * Sets the value of the filgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setFilgDt(XMLGregorianCalendar value) {
        this.filgDt = value;
        return this;
    }

    /**
     * Gets the value of the hrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getHrgDt() {
        return hrgDt;
    }

    /**
     * Sets the value of the hrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDateSD3 setHrgDt(XMLGregorianCalendar value) {
        this.hrgDt = value;
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
