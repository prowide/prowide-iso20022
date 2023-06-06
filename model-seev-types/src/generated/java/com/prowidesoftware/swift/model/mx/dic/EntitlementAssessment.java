
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementAssessment", propOrder = {
    "sctiesBlckgDdln",
    "sctiesBlckgMktDdln",
    "sctiesBlckgPrdEndDt",
    "sctiesRregnDdln",
    "sctiesRregnMktDdln",
    "sctiesRegnDt",
    "regnBnfcry",
    "rcrdDt",
    "entitlmntDesc",
    "entitlmntRatio"
})
public class EntitlementAssessment {

    @XmlElement(name = "SctiesBlckgDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesBlckgDdln;
    @XmlElement(name = "SctiesBlckgMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesBlckgMktDdln;
    @XmlElement(name = "SctiesBlckgPrdEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesBlckgPrdEndDt;
    @XmlElement(name = "SctiesRregnDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesRregnDdln;
    @XmlElement(name = "SctiesRregnMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesRregnMktDdln;
    @XmlElement(name = "SctiesRegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sctiesRegnDt;
    @XmlElement(name = "RegnBnfcry")
    protected PartyIdentification7Choice regnBnfcry;
    @XmlElement(name = "RcrdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rcrdDt;
    @XmlElement(name = "EntitlmntDesc")
    protected String entitlmntDesc;
    @XmlElement(name = "EntitlmntRatio")
    protected BigDecimal entitlmntRatio;

    /**
     * Gets the value of the sctiesBlckgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesBlckgDdln() {
        return sctiesBlckgDdln;
    }

    /**
     * Sets the value of the sctiesBlckgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesBlckgDdln(OffsetDateTime value) {
        this.sctiesBlckgDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesBlckgMktDdln() {
        return sctiesBlckgMktDdln;
    }

    /**
     * Sets the value of the sctiesBlckgMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesBlckgMktDdln(OffsetDateTime value) {
        this.sctiesBlckgMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesBlckgPrdEndDt() {
        return sctiesBlckgPrdEndDt;
    }

    /**
     * Sets the value of the sctiesBlckgPrdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesBlckgPrdEndDt(OffsetDateTime value) {
        this.sctiesBlckgPrdEndDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRregnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesRregnDdln() {
        return sctiesRregnDdln;
    }

    /**
     * Sets the value of the sctiesRregnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesRregnDdln(OffsetDateTime value) {
        this.sctiesRregnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRregnMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSctiesRregnMktDdln() {
        return sctiesRregnMktDdln;
    }

    /**
     * Sets the value of the sctiesRregnMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesRregnMktDdln(OffsetDateTime value) {
        this.sctiesRregnMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRegnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSctiesRegnDt() {
        return sctiesRegnDt;
    }

    /**
     * Sets the value of the sctiesRegnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setSctiesRegnDt(LocalDate value) {
        this.sctiesRegnDt = value;
        return this;
    }

    /**
     * Gets the value of the regnBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getRegnBnfcry() {
        return regnBnfcry;
    }

    /**
     * Sets the value of the regnBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public EntitlementAssessment setRegnBnfcry(PartyIdentification7Choice value) {
        this.regnBnfcry = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setRcrdDt(LocalDate value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlmntDesc() {
        return entitlmntDesc;
    }

    /**
     * Sets the value of the entitlmntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntitlementAssessment setEntitlmntDesc(String value) {
        this.entitlmntDesc = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntitlmntRatio() {
        return entitlmntRatio;
    }

    /**
     * Sets the value of the entitlmntRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EntitlementAssessment setEntitlmntRatio(BigDecimal value) {
        this.entitlmntRatio = value;
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
