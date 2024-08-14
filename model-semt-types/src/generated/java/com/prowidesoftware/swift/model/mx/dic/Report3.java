
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General characteristics related to a statement which reports information for a precise date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report3", propOrder = {
    "rptNb",
    "qryRef",
    "rptId",
    "rptDtTm",
    "frqcy",
    "updTp",
    "ntceTp"
})
public class Report3 {

    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "QryRef")
    protected QueryReference qryRef;
    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptDtTm", required = true)
    protected DateAndDateTime1Choice rptDtTm;
    @XmlElement(name = "Frqcy")
    protected Frequency4Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected StatementUpdateTypeCodeAndDSSCodeChoice updTp;
    @XmlElement(name = "NtceTp")
    protected GenericIdentification38 ntceTp;

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
    public Report3 setRptNb(String value) {
        this.rptNb = value;
        return this;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link QueryReference }
     *     
     */
    public QueryReference getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryReference }
     *     
     */
    public Report3 setQryRef(QueryReference value) {
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
    public Report3 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getRptDtTm() {
        return rptDtTm;
    }

    /**
     * Sets the value of the rptDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public Report3 setRptDtTm(DateAndDateTime1Choice value) {
        this.rptDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency4Choice }
     *     
     */
    public Frequency4Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency4Choice }
     *     
     */
    public Report3 setFrqcy(Frequency4Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCodeChoice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public Report3 setUpdTp(StatementUpdateTypeCodeAndDSSCodeChoice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the ntceTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification38 }
     *     
     */
    public GenericIdentification38 getNtceTp() {
        return ntceTp;
    }

    /**
     * Sets the value of the ntceTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification38 }
     *     
     */
    public Report3 setNtceTp(GenericIdentification38 value) {
        this.ntceTp = value;
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
