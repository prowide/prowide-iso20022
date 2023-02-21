
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details related to an update of an individual record in the static data of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogPartyRecord1Choice", propOrder = {
    "adr",
    "ctctDtls",
    "opngDt",
    "clsgDt",
    "tp",
    "techAdr",
    "mktSpcfcAttr",
    "nm",
    "resTp",
    "lckSts",
    "rstrctn",
    "othr"
})
public class UpdateLogPartyRecord1Choice {

    @XmlElement(name = "Adr")
    protected UpdateLogAddress1 adr;
    @XmlElement(name = "CtctDtls")
    protected UpdateLogContact1 ctctDtls;
    @XmlElement(name = "OpngDt")
    protected UpdateLogDate1 opngDt;
    @XmlElement(name = "ClsgDt")
    protected UpdateLogDate1 clsgDt;
    @XmlElement(name = "Tp")
    protected UpdateLogSystemPartyType1 tp;
    @XmlElement(name = "TechAdr")
    protected UpdateLogTechnicalAddress1 techAdr;
    @XmlElement(name = "MktSpcfcAttr")
    protected UpdateLogMarketSpecificAttribute1 mktSpcfcAttr;
    @XmlElement(name = "Nm")
    protected UpdateLogPartyName1 nm;
    @XmlElement(name = "ResTp")
    protected UpdateLogResidenceType1 resTp;
    @XmlElement(name = "LckSts")
    protected UpdateLogPartyLockStatus1 lckSts;
    @XmlElement(name = "Rstrctn")
    protected UpdateLogRestriction1 rstrctn;
    @XmlElement(name = "Othr")
    protected List<UpdateLogProprietary1> othr;

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogAddress1 }
     *     
     */
    public UpdateLogAddress1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogAddress1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setAdr(UpdateLogAddress1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogContact1 }
     *     
     */
    public UpdateLogContact1 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogContact1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setCtctDtls(UpdateLogContact1 value) {
        this.ctctDtls = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDate1 getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setOpngDt(UpdateLogDate1 value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogDate1 getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogDate1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setClsgDt(UpdateLogDate1 value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogSystemPartyType1 }
     *     
     */
    public UpdateLogSystemPartyType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogSystemPartyType1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setTp(UpdateLogSystemPartyType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogTechnicalAddress1 }
     *     
     */
    public UpdateLogTechnicalAddress1 getTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogTechnicalAddress1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setTechAdr(UpdateLogTechnicalAddress1 value) {
        this.techAdr = value;
        return this;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogMarketSpecificAttribute1 }
     *     
     */
    public UpdateLogMarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogMarketSpecificAttribute1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setMktSpcfcAttr(UpdateLogMarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogPartyName1 }
     *     
     */
    public UpdateLogPartyName1 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogPartyName1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setNm(UpdateLogPartyName1 value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogResidenceType1 }
     *     
     */
    public UpdateLogResidenceType1 getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogResidenceType1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setResTp(UpdateLogResidenceType1 value) {
        this.resTp = value;
        return this;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogPartyLockStatus1 }
     *     
     */
    public UpdateLogPartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogPartyLockStatus1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setLckSts(UpdateLogPartyLockStatus1 value) {
        this.lckSts = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateLogRestriction1 }
     *     
     */
    public UpdateLogRestriction1 getRstrctn() {
        return rstrctn;
    }

    /**
     * Sets the value of the rstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateLogRestriction1 }
     *     
     */
    public UpdateLogPartyRecord1Choice setRstrctn(UpdateLogRestriction1 value) {
        this.rstrctn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateLogProprietary1 }
     * 
     * 
     */
    public List<UpdateLogProprietary1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<UpdateLogProprietary1>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public UpdateLogPartyRecord1Choice addOthr(UpdateLogProprietary1 othr) {
        getOthr().add(othr);
        return this;
    }

}
