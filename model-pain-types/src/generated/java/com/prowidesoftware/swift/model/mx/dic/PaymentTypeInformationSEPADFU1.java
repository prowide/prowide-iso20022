
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * PaymentTypeInformationSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformationSEPA_DFU1", propOrder = {
    "instrPrty",
    "svcLvl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
public class PaymentTypeInformationSEPADFU1 {

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevelSEPADFU1 svcLvl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrumentSEPADFU1 lclInstrm;
    @XmlElement(name = "SeqTp")
    @XmlSchemaType(name = "string")
    protected SequenceType1Code seqTp;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurposeSEPADFU1 ctgyPurp;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public PaymentTypeInformationSEPADFU1 setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
        return this;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelSEPADFU1 }
     *     
     */
    public ServiceLevelSEPADFU1 getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSEPADFU1 setSvcLvl(ServiceLevelSEPADFU1 value) {
        this.svcLvl = value;
        return this;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrumentSEPADFU1 }
     *     
     */
    public LocalInstrumentSEPADFU1 getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrumentSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSEPADFU1 setLclInstrm(LocalInstrumentSEPADFU1 value) {
        this.lclInstrm = value;
        return this;
    }

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType1Code }
     *     
     */
    public SequenceType1Code getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType1Code }
     *     
     */
    public PaymentTypeInformationSEPADFU1 setSeqTp(SequenceType1Code value) {
        this.seqTp = value;
        return this;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurposeSEPADFU1 }
     *     
     */
    public CategoryPurposeSEPADFU1 getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurposeSEPADFU1 }
     *     
     */
    public PaymentTypeInformationSEPADFU1 setCtgyPurp(CategoryPurposeSEPADFU1 value) {
        this.ctgyPurp = value;
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
