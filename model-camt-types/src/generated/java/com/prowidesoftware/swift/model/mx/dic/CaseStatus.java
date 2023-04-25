
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
 * Defines the status of an investigation case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatus", propOrder = {
    "dtTm",
    "caseSts",
    "invstgtnSts",
    "rsn"
})
public class CaseStatus {

    @XmlElement(name = "DtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dtTm;
    @XmlElement(name = "CaseSts", required = true)
    @XmlSchemaType(name = "string")
    protected CaseStatus1Code caseSts;
    @XmlElement(name = "InvstgtnSts")
    @XmlSchemaType(name = "string")
    protected InvestigationExecutionConfirmation1Code invstgtnSts;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CaseStatus setDtTm(Calendar value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the caseSts property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus1Code }
     *     
     */
    public CaseStatus1Code getCaseSts() {
        return caseSts;
    }

    /**
     * Sets the value of the caseSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus1Code }
     *     
     */
    public CaseStatus setCaseSts(CaseStatus1Code value) {
        this.caseSts = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationExecutionConfirmation1Code }
     *     
     */
    public InvestigationExecutionConfirmation1Code getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Sets the value of the invstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationExecutionConfirmation1Code }
     *     
     */
    public CaseStatus setInvstgtnSts(InvestigationExecutionConfirmation1Code value) {
        this.invstgtnSts = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CaseStatus setRsn(String value) {
        this.rsn = value;
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
