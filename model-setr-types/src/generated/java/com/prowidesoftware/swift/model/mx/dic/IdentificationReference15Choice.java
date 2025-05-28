
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Unique identifier of a document, message or transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationReference15Choice", propOrder = {
    "instgPtyTxId",
    "exctgPtyTxId",
    "mktInfrstrctrTxId",
    "clntOrdrLkId",
    "poolId",
    "blckId",
    "allcnId",
    "indvAllcnId",
    "scndryAllcnId",
    "indxId",
    "cmonId",
    "cmplcId",
    "collTxId",
    "unqTxIdr"
})
public class IdentificationReference15Choice {

    @XmlElement(name = "InstgPtyTxId")
    protected String instgPtyTxId;
    @XmlElement(name = "ExctgPtyTxId")
    protected String exctgPtyTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "ClntOrdrLkId")
    protected String clntOrdrLkId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "BlckId")
    protected String blckId;
    @XmlElement(name = "AllcnId")
    protected String allcnId;
    @XmlElement(name = "IndvAllcnId")
    protected String indvAllcnId;
    @XmlElement(name = "ScndryAllcnId")
    protected String scndryAllcnId;
    @XmlElement(name = "IndxId")
    protected String indxId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "CmplcId")
    protected String cmplcId;
    @XmlElement(name = "CollTxId")
    protected String collTxId;
    @XmlElement(name = "UnqTxIdr")
    protected String unqTxIdr;

    /**
     * Gets the value of the instgPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPtyTxId() {
        return instgPtyTxId;
    }

    /**
     * Sets the value of the instgPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setInstgPtyTxId(String value) {
        this.instgPtyTxId = value;
        return this;
    }

    /**
     * Gets the value of the exctgPtyTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPtyTxId() {
        return exctgPtyTxId;
    }

    /**
     * Sets the value of the exctgPtyTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setExctgPtyTxId(String value) {
        this.exctgPtyTxId = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrLkId() {
        return clntOrdrLkId;
    }

    /**
     * Sets the value of the clntOrdrLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setClntOrdrLkId(String value) {
        this.clntOrdrLkId = value;
        return this;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setPoolId(String value) {
        this.poolId = value;
        return this;
    }

    /**
     * Gets the value of the blckId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckId() {
        return blckId;
    }

    /**
     * Sets the value of the blckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setBlckId(String value) {
        this.blckId = value;
        return this;
    }

    /**
     * Gets the value of the allcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllcnId() {
        return allcnId;
    }

    /**
     * Sets the value of the allcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setAllcnId(String value) {
        this.allcnId = value;
        return this;
    }

    /**
     * Gets the value of the indvAllcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvAllcnId() {
        return indvAllcnId;
    }

    /**
     * Sets the value of the indvAllcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setIndvAllcnId(String value) {
        this.indvAllcnId = value;
        return this;
    }

    /**
     * Gets the value of the scndryAllcnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryAllcnId() {
        return scndryAllcnId;
    }

    /**
     * Sets the value of the scndryAllcnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setScndryAllcnId(String value) {
        this.scndryAllcnId = value;
        return this;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setIndxId(String value) {
        this.indxId = value;
        return this;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the cmplcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplcId() {
        return cmplcId;
    }

    /**
     * Sets the value of the cmplcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setCmplcId(String value) {
        this.cmplcId = value;
        return this;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollTxId() {
        return collTxId;
    }

    /**
     * Sets the value of the collTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setCollTxId(String value) {
        this.collTxId = value;
        return this;
    }

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IdentificationReference15Choice setUnqTxIdr(String value) {
        this.unqTxIdr = value;
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
