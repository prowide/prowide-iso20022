
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
 * Specifies further details on the penalty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyRecord1", propOrder = {
    "id",
    "tp",
    "sts",
    "cmptdAmt",
    "clctnMtd",
    "nbOfDays",
    "clctnData",
    "rltdTx"
})
public class PenaltyRecord1 {

    @XmlElement(name = "Id", required = true)
    protected PenaltyIdentification1 id;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected PenaltyType1Code tp;
    @XmlElement(name = "Sts")
    protected PenaltyStatus1 sts;
    @XmlElement(name = "CmptdAmt", required = true)
    protected AmountAndDirection5 cmptdAmt;
    @XmlElement(name = "ClctnMtd")
    @XmlSchemaType(name = "string")
    protected PenaltyCalculationMethod1Code clctnMtd;
    @XmlElement(name = "NbOfDays")
    protected BigDecimal nbOfDays;
    @XmlElement(name = "ClctnData")
    protected List<PenaltyCalculationRecord1> clctnData;
    @XmlElement(name = "RltdTx")
    protected PenaltyTransaction1 rltdTx;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyIdentification1 }
     *     
     */
    public PenaltyIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyIdentification1 }
     *     
     */
    public PenaltyRecord1 setId(PenaltyIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyType1Code }
     *     
     */
    public PenaltyType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyType1Code }
     *     
     */
    public PenaltyRecord1 setTp(PenaltyType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyStatus1 }
     *     
     */
    public PenaltyStatus1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyStatus1 }
     *     
     */
    public PenaltyRecord1 setSts(PenaltyStatus1 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the cmptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getCmptdAmt() {
        return cmptdAmt;
    }

    /**
     * Sets the value of the cmptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public PenaltyRecord1 setCmptdAmt(AmountAndDirection5 value) {
        this.cmptdAmt = value;
        return this;
    }

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyCalculationMethod1Code }
     *     
     */
    public PenaltyCalculationMethod1Code getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyCalculationMethod1Code }
     *     
     */
    public PenaltyRecord1 setClctnMtd(PenaltyCalculationMethod1Code value) {
        this.clctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PenaltyRecord1 setNbOfDays(BigDecimal value) {
        this.nbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the clctnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clctnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClctnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyCalculationRecord1 }
     * 
     * 
     */
    public List<PenaltyCalculationRecord1> getClctnData() {
        if (clctnData == null) {
            clctnData = new ArrayList<PenaltyCalculationRecord1>();
        }
        return this.clctnData;
    }

    /**
     * Gets the value of the rltdTx property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTransaction1 }
     *     
     */
    public PenaltyTransaction1 getRltdTx() {
        return rltdTx;
    }

    /**
     * Sets the value of the rltdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTransaction1 }
     *     
     */
    public PenaltyRecord1 setRltdTx(PenaltyTransaction1 value) {
        this.rltdTx = value;
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
     * Adds a new item to the clctnData list.
     * @see #getClctnData()
     * 
     */
    public PenaltyRecord1 addClctnData(PenaltyCalculationRecord1 clctnData) {
        getClctnData().add(clctnData);
        return this;
    }

}
