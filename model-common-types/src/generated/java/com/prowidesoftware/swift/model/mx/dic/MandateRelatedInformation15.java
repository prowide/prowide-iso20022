
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
 * Provides further details related to a direct debit mandate signed between the creditor and the debtor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformation15", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "amdmntInd",
    "amdmntInfDtls",
    "elctrncSgntr",
    "frstColltnDt",
    "fnlColltnDt",
    "frqcy",
    "rsn",
    "trckgDays"
})
public class MandateRelatedInformation15 {

    @XmlElement(name = "MndtId")
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfSgntr;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "AmdmntInfDtls")
    protected AmendmentInformationDetails14 amdmntInfDtls;
    @XmlElement(name = "ElctrncSgntr")
    protected String elctrncSgntr;
    @XmlElement(name = "FrstColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frstColltnDt;
    @XmlElement(name = "FnlColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fnlColltnDt;
    @XmlElement(name = "Frqcy")
    protected Frequency36Choice frqcy;
    @XmlElement(name = "Rsn")
    protected MandateSetupReason1Choice rsn;
    @XmlElement(name = "TrckgDays")
    protected String trckgDays;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setMndtId(String value) {
        this.mndtId = value;
        return this;
    }

    /**
     * Gets the value of the dtOfSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfSgntr() {
        return dtOfSgntr;
    }

    /**
     * Sets the value of the dtOfSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setDtOfSgntr(LocalDate value) {
        this.dtOfSgntr = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MandateRelatedInformation15 setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
        return this;
    }

    /**
     * Gets the value of the amdmntInfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationDetails14 }
     *     
     */
    public AmendmentInformationDetails14 getAmdmntInfDtls() {
        return amdmntInfDtls;
    }

    /**
     * Sets the value of the amdmntInfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationDetails14 }
     *     
     */
    public MandateRelatedInformation15 setAmdmntInfDtls(AmendmentInformationDetails14 value) {
        this.amdmntInfDtls = value;
        return this;
    }

    /**
     * Gets the value of the elctrncSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSgntr() {
        return elctrncSgntr;
    }

    /**
     * Sets the value of the elctrncSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setElctrncSgntr(String value) {
        this.elctrncSgntr = value;
        return this;
    }

    /**
     * Gets the value of the frstColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFrstColltnDt() {
        return frstColltnDt;
    }

    /**
     * Sets the value of the frstColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setFrstColltnDt(LocalDate value) {
        this.frstColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the fnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFnlColltnDt() {
        return fnlColltnDt;
    }

    /**
     * Sets the value of the fnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setFnlColltnDt(LocalDate value) {
        this.fnlColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency36Choice }
     *     
     */
    public Frequency36Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency36Choice }
     *     
     */
    public MandateRelatedInformation15 setFrqcy(Frequency36Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateRelatedInformation15 setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the trckgDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckgDays() {
        return trckgDays;
    }

    /**
     * Sets the value of the trckgDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MandateRelatedInformation15 setTrckgDays(String value) {
        this.trckgDays = value;
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
