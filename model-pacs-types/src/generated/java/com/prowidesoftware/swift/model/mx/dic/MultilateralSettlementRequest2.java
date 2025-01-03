
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details specific to the individual settlement instruction(s) included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequest2", propOrder = {
    "instrId",
    "instrPrty",
    "sttlmTmReq",
    "sttlmPrty",
    "sttlmCycl",
    "nbOfMvmntRcrds",
    "mvmntRcrd"
})
public class MultilateralSettlementRequest2 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "SttlmPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmCycl")
    protected String sttlmCycl;
    @XmlElement(name = "NbOfMvmntRcrds")
    protected BigDecimal nbOfMvmntRcrds;
    @XmlElement(name = "MvmntRcrd", required = true)
    protected List<MovementRecord1> mvmntRcrd;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MultilateralSettlementRequest2 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public MultilateralSettlementRequest2 setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public MultilateralSettlementRequest2 setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Sets the value of the sttlmPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public MultilateralSettlementRequest2 setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MultilateralSettlementRequest2 setSttlmCycl(String value) {
        this.sttlmCycl = value;
        return this;
    }

    /**
     * Gets the value of the nbOfMvmntRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMvmntRcrds() {
        return nbOfMvmntRcrds;
    }

    /**
     * Sets the value of the nbOfMvmntRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public MultilateralSettlementRequest2 setNbOfMvmntRcrds(BigDecimal value) {
        this.nbOfMvmntRcrds = value;
        return this;
    }

    /**
     * Gets the value of the mvmntRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mvmntRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementRecord1 }
     * 
     * 
     * @return
     *     The value of the mvmntRcrd property.
     */
    public List<MovementRecord1> getMvmntRcrd() {
        if (mvmntRcrd == null) {
            mvmntRcrd = new ArrayList<>();
        }
        return this.mvmntRcrd;
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
     * Adds a new item to the mvmntRcrd list.
     * @see #getMvmntRcrd()
     * 
     */
    public MultilateralSettlementRequest2 addMvmntRcrd(MovementRecord1 mvmntRcrd) {
        getMvmntRcrd().add(mvmntRcrd);
        return this;
    }

}
