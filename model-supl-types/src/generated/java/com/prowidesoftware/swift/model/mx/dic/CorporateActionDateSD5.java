
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Provides additional information regarding corporate action date details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDateSD5", propOrder = {
    "plcAndNm",
    "dtcLastDayForEarlyRed",
    "dtcPosCaptrDt",
    "newYorkCutOffDt",
    "dtcXtndedCutOffDt",
    "fctvDtByXchg",
    "dtDclrdWrthls",
    "delWrthlsSctyDt",
    "dtcExitDt",
    "sbcptBegnDt"
})
public class CorporateActionDateSD5 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCLastDayForEarlyRed", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtcLastDayForEarlyRed;
    @XmlElement(name = "DTCPosCaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtcPosCaptrDt;
    @XmlElement(name = "NewYorkCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate newYorkCutOffDt;
    @XmlElement(name = "DTCXtndedCutOffDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtcXtndedCutOffDt;
    @XmlElement(name = "FctvDtByXchg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fctvDtByXchg;
    @XmlElement(name = "DtDclrdWrthls", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtDclrdWrthls;
    @XmlElement(name = "DelWrthlsSctyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate delWrthlsSctyDt;
    @XmlElement(name = "DTCExitDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtcExitDt;
    @XmlElement(name = "SbcptBegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sbcptBegnDt;

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
    public CorporateActionDateSD5 setPlcAndNm(String value) {
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
    public LocalDate getDTCLastDayForEarlyRed() {
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
    public CorporateActionDateSD5 setDTCLastDayForEarlyRed(LocalDate value) {
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
    public LocalDate getDTCPosCaptrDt() {
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
    public CorporateActionDateSD5 setDTCPosCaptrDt(LocalDate value) {
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
    public LocalDate getNewYorkCutOffDt() {
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
    public CorporateActionDateSD5 setNewYorkCutOffDt(LocalDate value) {
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
    public LocalDate getDTCXtndedCutOffDt() {
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
    public CorporateActionDateSD5 setDTCXtndedCutOffDt(LocalDate value) {
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
    public LocalDate getFctvDtByXchg() {
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
    public CorporateActionDateSD5 setFctvDtByXchg(LocalDate value) {
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
    public LocalDate getDtDclrdWrthls() {
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
    public CorporateActionDateSD5 setDtDclrdWrthls(LocalDate value) {
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
    public LocalDate getDelWrthlsSctyDt() {
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
    public CorporateActionDateSD5 setDelWrthlsSctyDt(LocalDate value) {
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
    public LocalDate getDTCExitDt() {
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
    public CorporateActionDateSD5 setDTCExitDt(LocalDate value) {
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
    public LocalDate getSbcptBegnDt() {
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
    public CorporateActionDateSD5 setSbcptBegnDt(LocalDate value) {
        this.sbcptBegnDt = value;
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
