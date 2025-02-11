
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
 * Return criteria for information to be returned in the report deriving from a query about party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataReturnCriteria2", propOrder = {
    "opngDt",
    "clsgDt",
    "tp",
    "ptyId",
    "rspnsblPtyId",
    "rstrctnId",
    "rstrctdOnDt",
    "nm",
    "shrtNm",
    "adr",
    "techAdr",
    "ctctDtls",
    "resTp",
    "lckSts",
    "mktSpcfcAttr"
})
public class PartyDataReturnCriteria2 {

    @XmlElement(name = "OpngDt")
    protected Boolean opngDt;
    @XmlElement(name = "ClsgDt")
    protected Boolean clsgDt;
    @XmlElement(name = "Tp")
    protected Boolean tp;
    @XmlElement(name = "PtyId")
    protected Boolean ptyId;
    @XmlElement(name = "RspnsblPtyId")
    protected Boolean rspnsblPtyId;
    @XmlElement(name = "RstrctnId")
    protected Boolean rstrctnId;
    @XmlElement(name = "RstrctdOnDt")
    protected Boolean rstrctdOnDt;
    @XmlElement(name = "Nm")
    protected Boolean nm;
    @XmlElement(name = "ShrtNm")
    protected Boolean shrtNm;
    @XmlElement(name = "Adr")
    protected Boolean adr;
    @XmlElement(name = "TechAdr")
    protected Boolean techAdr;
    @XmlElement(name = "CtctDtls")
    protected Boolean ctctDtls;
    @XmlElement(name = "ResTp")
    protected Boolean resTp;
    @XmlElement(name = "LckSts")
    protected Boolean lckSts;
    @XmlElement(name = "MktSpcfcAttr")
    protected Boolean mktSpcfcAttr;

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setOpngDt(Boolean value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setClsgDt(Boolean value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setTp(Boolean value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setPtyId(Boolean value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setRspnsblPtyId(Boolean value) {
        this.rspnsblPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rstrctnId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctnId() {
        return rstrctnId;
    }

    /**
     * Sets the value of the rstrctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setRstrctnId(Boolean value) {
        this.rstrctnId = value;
        return this;
    }

    /**
     * Gets the value of the rstrctdOnDt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdOnDt() {
        return rstrctdOnDt;
    }

    /**
     * Sets the value of the rstrctdOnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setRstrctdOnDt(Boolean value) {
        this.rstrctdOnDt = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setNm(Boolean value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setShrtNm(Boolean value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setAdr(Boolean value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setTechAdr(Boolean value) {
        this.techAdr = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setCtctDtls(Boolean value) {
        this.ctctDtls = value;
        return this;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setResTp(Boolean value) {
        this.resTp = value;
        return this;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setLckSts(Boolean value) {
        this.lckSts = value;
        return this;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PartyDataReturnCriteria2 setMktSpcfcAttr(Boolean value) {
        this.mktSpcfcAttr = value;
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
