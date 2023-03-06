
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of a movement record requested in a single settlement instruction. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementRecord1", propOrder = {
    "id",
    "seqNb",
    "amt",
    "sttlmAgt",
    "sttlmAgtAcct",
    "ptcpt",
    "ptcptAcct",
    "ref"
})
public class MovementRecord1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection5 amt;
    @XmlElement(name = "SttlmAgt")
    protected PartyIdentification135 sttlmAgt;
    @XmlElement(name = "SttlmAgtAcct")
    protected CashAccount40 sttlmAgtAcct;
    @XmlElement(name = "Ptcpt")
    protected PartyIdentification135 ptcpt;
    @XmlElement(name = "PtcptAcct")
    protected CashAccount40 ptcptAcct;
    @XmlElement(name = "Ref")
    protected String ref;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MovementRecord1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MovementRecord1 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public MovementRecord1 setAmt(AmountAndDirection5 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getSttlmAgt() {
        return sttlmAgt;
    }

    /**
     * Sets the value of the sttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public MovementRecord1 setSttlmAgt(PartyIdentification135 value) {
        this.sttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getSttlmAgtAcct() {
        return sttlmAgtAcct;
    }

    /**
     * Sets the value of the sttlmAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public MovementRecord1 setSttlmAgtAcct(CashAccount40 value) {
        this.sttlmAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the ptcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPtcpt() {
        return ptcpt;
    }

    /**
     * Sets the value of the ptcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public MovementRecord1 setPtcpt(PartyIdentification135 value) {
        this.ptcpt = value;
        return this;
    }

    /**
     * Gets the value of the ptcptAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPtcptAcct() {
        return ptcptAcct;
    }

    /**
     * Sets the value of the ptcptAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public MovementRecord1 setPtcptAcct(CashAccount40 value) {
        this.ptcptAcct = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MovementRecord1 setRef(String value) {
        this.ref = value;
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
