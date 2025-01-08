
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
@XmlType(name = "EntitlementAssessment3", propOrder = {
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
    "entitlmnt"
})
public class EntitlementAssessment3 {

    @XmlElement(name = "SctiesBlckgDdln")
    protected DateFormat29Choice sctiesBlckgDdln;
    @XmlElement(name = "SctiesBlckgSTPDdln")
    protected DateFormat29Choice sctiesBlckgSTPDdln;
    @XmlElement(name = "SctiesBlckgMktDdln")
    protected DateFormat29Choice sctiesBlckgMktDdln;
    @XmlElement(name = "SctiesBlckgPrdEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime sctiesBlckgPrdEndDt;
    @XmlElement(name = "EntitlmntFxgDt")
    protected DateFormat1 entitlmntFxgDt;
    @XmlElement(name = "RegnSctiesDdln")
    protected DateFormat29Choice regnSctiesDdln;
    @XmlElement(name = "RegnSctiesSTPDdln")
    protected DateFormat29Choice regnSctiesSTPDdln;
    @XmlElement(name = "RegnSctiesMktDdln")
    protected DateFormat29Choice regnSctiesMktDdln;
    @XmlElement(name = "RegnPrtcptnDdln")
    protected DateFormat29Choice regnPrtcptnDdln;
    @XmlElement(name = "RegnPrtcptnSTPDdln")
    protected DateFormat29Choice regnPrtcptnSTPDdln;
    @XmlElement(name = "RegnPrtcptnMktDdln")
    protected DateFormat29Choice regnPrtcptnMktDdln;
    @XmlElement(name = "Entitlmnt")
    protected Entitlement1Choice entitlmnt;

    /**
     * Gets the value of the sctiesBlckgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getSctiesBlckgDdln() {
        return sctiesBlckgDdln;
    }

    /**
     * Sets the value of the sctiesBlckgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setSctiesBlckgDdln(DateFormat29Choice value) {
        this.sctiesBlckgDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getSctiesBlckgSTPDdln() {
        return sctiesBlckgSTPDdln;
    }

    /**
     * Sets the value of the sctiesBlckgSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setSctiesBlckgSTPDdln(DateFormat29Choice value) {
        this.sctiesBlckgSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBlckgMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getSctiesBlckgMktDdln() {
        return sctiesBlckgMktDdln;
    }

    /**
     * Sets the value of the sctiesBlckgMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setSctiesBlckgMktDdln(DateFormat29Choice value) {
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
    public EntitlementAssessment3 setSctiesBlckgPrdEndDt(OffsetDateTime value) {
        this.sctiesBlckgPrdEndDt = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat1 }
     *     
     */
    public DateFormat1 getEntitlmntFxgDt() {
        return entitlmntFxgDt;
    }

    /**
     * Sets the value of the entitlmntFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat1 }
     *     
     */
    public EntitlementAssessment3 setEntitlmntFxgDt(DateFormat1 value) {
        this.entitlmntFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnSctiesDdln() {
        return regnSctiesDdln;
    }

    /**
     * Sets the value of the regnSctiesDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnSctiesDdln(DateFormat29Choice value) {
        this.regnSctiesDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnSctiesSTPDdln() {
        return regnSctiesSTPDdln;
    }

    /**
     * Sets the value of the regnSctiesSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnSctiesSTPDdln(DateFormat29Choice value) {
        this.regnSctiesSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnSctiesMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnSctiesMktDdln() {
        return regnSctiesMktDdln;
    }

    /**
     * Sets the value of the regnSctiesMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnSctiesMktDdln(DateFormat29Choice value) {
        this.regnSctiesMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnPrtcptnDdln() {
        return regnPrtcptnDdln;
    }

    /**
     * Sets the value of the regnPrtcptnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnPrtcptnDdln(DateFormat29Choice value) {
        this.regnPrtcptnDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnSTPDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnPrtcptnSTPDdln() {
        return regnPrtcptnSTPDdln;
    }

    /**
     * Sets the value of the regnPrtcptnSTPDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnPrtcptnSTPDdln(DateFormat29Choice value) {
        this.regnPrtcptnSTPDdln = value;
        return this;
    }

    /**
     * Gets the value of the regnPrtcptnMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getRegnPrtcptnMktDdln() {
        return regnPrtcptnMktDdln;
    }

    /**
     * Sets the value of the regnPrtcptnMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public EntitlementAssessment3 setRegnPrtcptnMktDdln(DateFormat29Choice value) {
        this.regnPrtcptnMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the entitlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Entitlement1Choice }
     *     
     */
    public Entitlement1Choice getEntitlmnt() {
        return entitlmnt;
    }

    /**
     * Sets the value of the entitlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entitlement1Choice }
     *     
     */
    public EntitlementAssessment3 setEntitlmnt(Entitlement1Choice value) {
        this.entitlmnt = value;
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
