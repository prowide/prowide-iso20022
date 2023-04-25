
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the parameters, such as dates, used to calculate the entitlement to vote at a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementAssessment1", propOrder = {
    "sctiesBlckgDdln",
    "sctiesBlckgSTPDdln",
    "sctiesBlckgMktDdln",
    "sctiesBlckgPrdEndDt",
    "entitlmntFxgDt",
    "regnSctiesDdln",
    "regnSctiesSTPDdln",
    "regnSctiesMktDdln",
    "regnPrtcptnDdln",
    "regnPrtcptnSTPDdln",
    "regnPrtcptnMktDdln",
    "entitlmntDesc",
    "entitlmntRatio"
})
public class EntitlementAssessment1 {

    @XmlElement(name = "SctiesBlckgDdln")
    protected DateFormat2Choice sctiesBlckgDdln;
    @XmlElement(name = "SctiesBlckgSTPDdln")
    protected DateFormat2Choice sctiesBlckgSTPDdln;
    @XmlElement(name = "SctiesBlckgMktDdln")
    protected DateFormat2Choice sctiesBlckgMktDdln;
    @XmlElement(name = "SctiesBlckgPrdEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar sctiesBlckgPrdEndDt;
    @XmlElement(name = "EntitlmntFxgDt")
    protected DateFormat3Choice entitlmntFxgDt;
    @XmlElement(name = "RegnSctiesDdln")
    protected DateFormat2Choice regnSctiesDdln;
    @XmlElement(name = "RegnSctiesSTPDdln")
    protected DateFormat2Choice regnSctiesSTPDdln;
    @XmlElement(name = "RegnSctiesMktDdln")
    protected DateFormat2Choice regnSctiesMktDdln;
    @XmlElement(name = "RegnPrtcptnDdln")
    protected DateFormat2Choice regnPrtcptnDdln;
    @XmlElement(name = "RegnPrtcptnSTPDdln")
    protected DateFormat2Choice regnPrtcptnSTPDdln;
    @XmlElement(name = "RegnPrtcptnMktDdln")
    protected DateFormat2Choice regnPrtcptnMktDdln;
    @XmlElement(name = "EntitlmntDesc")
    protected String entitlmntDesc;
    @XmlElement(name = "EntitlmntRatio")
    protected BigDecimal entitlmntRatio;

    /**
     * Gets the value of the sctiesBlckgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgDdln() {
        return sctiesBlckgDdln;
    }

    /**
     * Sets the value of the sctiesBlckgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setSctiesBlckgDdln(DateFormat2Choice value) {
        this.sctiesBlckgDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgSTPDdln() {
        return sctiesBlckgSTPDdln;
    }

    /**
     * Sets the value of the sctiesBlckgSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setSctiesBlckgSTPDdln(DateFormat2Choice value) {
        this.sctiesBlckgSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getSctiesBlckgMktDdln() {
        return sctiesBlckgMktDdln;
    }

    /**
     * Sets the value of the sctiesBlckgMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setSctiesBlckgMktDdln(DateFormat2Choice value) {
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
    public Calendar getSctiesBlckgPrdEndDt() {
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
    public EntitlementAssessment1 setSctiesBlckgPrdEndDt(Calendar value) {
        this.sctiesBlckgPrdEndDt = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getEntitlmntFxgDt() {
        return entitlmntFxgDt;
    }

    /**
     * Sets the value of the entitlmntFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public EntitlementAssessment1 setEntitlmntFxgDt(DateFormat3Choice value) {
        this.entitlmntFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesDdln() {
        return regnSctiesDdln;
    }

    /**
     * Sets the value of the regnSctiesDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnSctiesDdln(DateFormat2Choice value) {
        this.regnSctiesDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesSTPDdln() {
        return regnSctiesSTPDdln;
    }

    /**
     * Sets the value of the regnSctiesSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnSctiesSTPDdln(DateFormat2Choice value) {
        this.regnSctiesSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnSctiesMktDdln() {
        return regnSctiesMktDdln;
    }

    /**
     * Sets the value of the regnSctiesMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnSctiesMktDdln(DateFormat2Choice value) {
        this.regnSctiesMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnDdln() {
        return regnPrtcptnDdln;
    }

    /**
     * Sets the value of the regnPrtcptnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnPrtcptnDdln(DateFormat2Choice value) {
        this.regnPrtcptnDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnSTPDdln() {
        return regnPrtcptnSTPDdln;
    }

    /**
     * Sets the value of the regnPrtcptnSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnPrtcptnSTPDdln(DateFormat2Choice value) {
        this.regnPrtcptnSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getRegnPrtcptnMktDdln() {
        return regnPrtcptnMktDdln;
    }

    /**
     * Sets the value of the regnPrtcptnMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public EntitlementAssessment1 setRegnPrtcptnMktDdln(DateFormat2Choice value) {
        this.regnPrtcptnMktDdln = value;
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
    public EntitlementAssessment1 setEntitlmntDesc(String value) {
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
    public EntitlementAssessment1 setEntitlmntRatio(BigDecimal value) {
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
