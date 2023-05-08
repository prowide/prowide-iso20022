
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Specifies parameters of the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsReportHeader2", propOrder = {
    "creDtTm",
    "rptgPrd",
    "ccy",
    "rptSts",
    "sctiesSttlmSys"
})
public class SettlementFailsReportHeader2 {

    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "RptgPrd", required = true)
    protected DatePeriod2 rptgPrd;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "RptSts", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionOperationType4Code rptSts;
    @XmlElement(name = "SctiesSttlmSys", required = true)
    protected SecuritiesSettlementSystemIdentification2 sctiesSttlmSys;

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailsReportHeader2 setCreDtTm(Calendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public SettlementFailsReportHeader2 setRptgPrd(DatePeriod2 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailsReportHeader2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType4Code }
     *     
     */
    public TransactionOperationType4Code getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType4Code }
     *     
     */
    public SettlementFailsReportHeader2 setRptSts(TransactionOperationType4Code value) {
        this.rptSts = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmSys property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementSystemIdentification2 }
     *     
     */
    public SecuritiesSettlementSystemIdentification2 getSctiesSttlmSys() {
        return sctiesSttlmSys;
    }

    /**
     * Sets the value of the sctiesSttlmSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementSystemIdentification2 }
     *     
     */
    public SettlementFailsReportHeader2 setSctiesSttlmSys(SecuritiesSettlementSystemIdentification2 value) {
        this.sctiesSttlmSys = value;
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
