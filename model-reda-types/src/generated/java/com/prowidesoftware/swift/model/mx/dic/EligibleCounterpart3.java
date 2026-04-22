
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
 * Represents a party to be identified as eligible for the instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibleCounterpart3", propOrder = {
    "issrId",
    "elgblCntrptId",
    "vldFr",
    "vldTo",
    "elgbltyTp",
    "elgbltyId"
})
public class EligibleCounterpart3 {

    @XmlElement(name = "IssrId", required = true)
    protected SystemPartyIdentification2Choice issrId;
    @XmlElement(name = "ElgblCntrptId", required = true)
    protected SystemPartyIdentification2Choice elgblCntrptId;
    @XmlElement(name = "VldFr", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldFr;
    @XmlElement(name = "VldTo", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldTo;
    @XmlElement(name = "ElgbltyTp", required = true)
    @XmlSchemaType(name = "string")
    protected EligibilityType1Code elgbltyTp;
    @XmlElement(name = "ElgbltyId", required = true)
    protected EligibilityIdentification3Choice elgbltyId;

    /**
     * Gets the value of the issrId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getIssrId() {
        return issrId;
    }

    /**
     * Sets the value of the issrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public EligibleCounterpart3 setIssrId(SystemPartyIdentification2Choice value) {
        this.issrId = value;
        return this;
    }

    /**
     * Gets the value of the elgblCntrptId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getElgblCntrptId() {
        return elgblCntrptId;
    }

    /**
     * Sets the value of the elgblCntrptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public EligibleCounterpart3 setElgblCntrptId(SystemPartyIdentification2Choice value) {
        this.elgblCntrptId = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligibleCounterpart3 setVldFr(LocalDate value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldTo() {
        return vldTo;
    }

    /**
     * Sets the value of the vldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligibleCounterpart3 setVldTo(LocalDate value) {
        this.vldTo = value;
        return this;
    }

    /**
     * Gets the value of the elgbltyTp property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType1Code }
     *     
     */
    public EligibilityType1Code getElgbltyTp() {
        return elgbltyTp;
    }

    /**
     * Sets the value of the elgbltyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType1Code }
     *     
     */
    public EligibleCounterpart3 setElgbltyTp(EligibilityType1Code value) {
        this.elgbltyTp = value;
        return this;
    }

    /**
     * Gets the value of the elgbltyId property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityIdentification3Choice }
     *     
     */
    public EligibilityIdentification3Choice getElgbltyId() {
        return elgbltyId;
    }

    /**
     * Sets the value of the elgbltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityIdentification3Choice }
     *     
     */
    public EligibleCounterpart3 setElgbltyId(EligibilityIdentification3Choice value) {
        this.elgbltyId = value;
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
