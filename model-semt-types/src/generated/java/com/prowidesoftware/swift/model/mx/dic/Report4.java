
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General characteristics of the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report4", propOrder = {
    "rptNb",
    "qryRef",
    "rptId",
    "rptDtTm",
    "creDtTm",
    "prvsRptDtTm",
    "frqcy",
    "updTp",
    "rptBsis",
    "rptPrd",
    "rptSrc",
    "audtdInd",
    "actvtyInd"
})
public class Report4 {

    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptDtTm", required = true)
    protected DateAndDateTimeChoice rptDtTm;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeChoice creDtTm;
    @XmlElement(name = "PrvsRptDtTm")
    protected DateAndDateTimeChoice prvsRptDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected Frequency8Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected UpdateType4Choice updTp;
    @XmlElement(name = "RptBsis", required = true)
    protected StatementBasis6Choice rptBsis;
    @XmlElement(name = "RptPrd")
    protected DatePeriodDetails rptPrd;
    @XmlElement(name = "RptSrc")
    protected StatementSource1Choice rptSrc;
    @XmlElement(name = "AudtdInd")
    protected Boolean audtdInd;
    @XmlElement(name = "ActvtyInd")
    protected Boolean actvtyInd;

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Report4 setRptNb(String value) {
        this.rptNb = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Report4 setQryRef(String value) {
        this.qryRef = value;
        return this;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Report4 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getRptDtTm() {
        return rptDtTm;
    }

    /**
     * Sets the value of the rptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Report4 setRptDtTm(DateAndDateTimeChoice value) {
        this.rptDtTm = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Report4 setCreDtTm(DateAndDateTimeChoice value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsRptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrvsRptDtTm() {
        return prvsRptDtTm;
    }

    /**
     * Sets the value of the prvsRptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Report4 setPrvsRptDtTm(DateAndDateTimeChoice value) {
        this.prvsRptDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency8Choice }
     *     
     */
    public Frequency8Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency8Choice }
     *     
     */
    public Report4 setFrqcy(Frequency8Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateType4Choice }
     *     
     */
    public UpdateType4Choice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType4Choice }
     *     
     */
    public Report4 setUpdTp(UpdateType4Choice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the rptBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasis6Choice }
     *     
     */
    public StatementBasis6Choice getRptBsis() {
        return rptBsis;
    }

    /**
     * Sets the value of the rptBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasis6Choice }
     *     
     */
    public Report4 setRptBsis(StatementBasis6Choice value) {
        this.rptBsis = value;
        return this;
    }

    /**
     * Gets the value of the rptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getRptPrd() {
        return rptPrd;
    }

    /**
     * Sets the value of the rptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public Report4 setRptPrd(DatePeriodDetails value) {
        this.rptPrd = value;
        return this;
    }

    /**
     * Gets the value of the rptSrc property.
     * 
     * @return
     *     possible object is
     *     {@link StatementSource1Choice }
     *     
     */
    public StatementSource1Choice getRptSrc() {
        return rptSrc;
    }

    /**
     * Sets the value of the rptSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementSource1Choice }
     *     
     */
    public Report4 setRptSrc(StatementSource1Choice value) {
        this.rptSrc = value;
        return this;
    }

    /**
     * Gets the value of the audtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudtdInd() {
        return audtdInd;
    }

    /**
     * Sets the value of the audtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Report4 setAudtdInd(Boolean value) {
        this.audtdInd = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Report4 setActvtyInd(Boolean value) {
        this.actvtyInd = value;
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
