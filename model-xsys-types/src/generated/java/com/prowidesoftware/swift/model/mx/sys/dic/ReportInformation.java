
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime ;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Java class for ReportInformation complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportInformation", propOrder = {
    "pgNb",
    "lstPgInd",
    "exctnRptRslt",
    "exctnRptFailrDtls",
    "exctnTm"
})
public class ReportInformation {

    @XmlElement(name = "PgNb", required = true)
    protected BigDecimal pgNb;
    @XmlElement(name = "LstPgInd", required = true)
    @XmlSchemaType(name = "string")
    protected SwBooleanIndicator lstPgInd;
    @XmlElement(name = "ExctnRptRslt", required = true)
    @XmlSchemaType(name = "string")
    protected ResultCode exctnRptRslt;
    @XmlElement(name = "ExctnRptFailrDtls")
    protected ExecutionReportFailureDetails exctnRptFailrDtls;
    @XmlElement(name = "ExctnTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime exctnTm;

    /**
     * Gets the value of the pgNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPgNb() {
        return pgNb;
    }

    /**
     * Sets the value of the pgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportInformation setPgNb(BigDecimal value) {
        this.pgNb = value;
        return this;
    }

    /**
     * Gets the value of the lstPgInd property.
     * 
     * @return
     *     possible object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public SwBooleanIndicator getLstPgInd() {
        return lstPgInd;
    }

    /**
     * Sets the value of the lstPgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public ReportInformation setLstPgInd(SwBooleanIndicator value) {
        this.lstPgInd = value;
        return this;
    }

    /**
     * Gets the value of the exctnRptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResultCode }
     *     
     */
    public ResultCode getExctnRptRslt() {
        return exctnRptRslt;
    }

    /**
     * Sets the value of the exctnRptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCode }
     *     
     */
    public ReportInformation setExctnRptRslt(ResultCode value) {
        this.exctnRptRslt = value;
        return this;
    }

    /**
     * Gets the value of the exctnRptFailrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionReportFailureDetails }
     *     
     */
    public ExecutionReportFailureDetails getExctnRptFailrDtls() {
        return exctnRptFailrDtls;
    }

    /**
     * Sets the value of the exctnRptFailrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionReportFailureDetails }
     *     
     */
    public ReportInformation setExctnRptFailrDtls(ExecutionReportFailureDetails value) {
        this.exctnRptFailrDtls = value;
        return this;
    }

    /**
     * Gets the value of the exctnTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getExctnTm() {
        return exctnTm;
    }

    /**
     * Sets the value of the exctnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportInformation setExctnTm(OffsetDateTime value) {
        this.exctnTm = value;
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
