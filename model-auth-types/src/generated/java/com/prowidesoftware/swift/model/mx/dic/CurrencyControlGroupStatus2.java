
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
 * Provides the currency control group status details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlGroupStatus2", propOrder = {
    "orgnlRefs",
    "rptgPty",
    "regnAgt",
    "rptgPrd",
    "sts",
    "stsRsn",
    "stsDtTm"
})
public class CurrencyControlGroupStatus2 {

    @XmlElement(name = "OrgnlRefs", required = true)
    protected OriginalMessage5 orgnlRefs;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected StatisticalReportingStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected List<ValidationStatusReason2> stsRsn;
    @XmlElement(name = "StsDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar stsDtTm;

    /**
     * Gets the value of the orgnlRefs property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage5 }
     *     
     */
    public OriginalMessage5 getOrgnlRefs() {
        return orgnlRefs;
    }

    /**
     * Sets the value of the orgnlRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage5 }
     *     
     */
    public CurrencyControlGroupStatus2 setOrgnlRefs(OriginalMessage5 value) {
        this.orgnlRefs = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public CurrencyControlGroupStatus2 setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CurrencyControlGroupStatus2 setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public CurrencyControlGroupStatus2 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public StatisticalReportingStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalReportingStatus1Code }
     *     
     */
    public CurrencyControlGroupStatus2 setSts(StatisticalReportingStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationStatusReason2 }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<ValidationStatusReason2> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the stsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStsDtTm() {
        return stsDtTm;
    }

    /**
     * Sets the value of the stsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyControlGroupStatus2 setStsDtTm(Calendar value) {
        this.stsDtTm = value;
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

    /**
     * Adds a new item to the stsRsn list.
     * @see #getStsRsn()
     * 
     */
    public CurrencyControlGroupStatus2 addStsRsn(ValidationStatusReason2 stsRsn) {
        getStsRsn().add(stsRsn);
        return this;
    }

}
