
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
 * Choice of status for the replacement processing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplacementProcessingStatus10Choice", propOrder = {
    "accptd",
    "cmpltd",
    "dnd",
    "inRpr",
    "prtlRplcmntAccptd",
    "pdg",
    "rcvdAtIntrmy",
    "rcvdAtStockXchg",
    "rjctd",
    "modReqd",
    "prtrySts"
})
public class ReplacementProcessingStatus10Choice {

    @XmlElement(name = "Accptd")
    protected ProprietaryReason4 accptd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason4 cmpltd;
    @XmlElement(name = "Dnd")
    protected ProprietaryReason4 dnd;
    @XmlElement(name = "InRpr")
    protected ProprietaryReason4 inRpr;
    @XmlElement(name = "PrtlRplcmntAccptd")
    protected ProprietaryReason4 prtlRplcmntAccptd;
    @XmlElement(name = "Pdg")
    protected ProprietaryReason4 pdg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason4 rcvdAtIntrmy;
    @XmlElement(name = "RcvdAtStockXchg")
    protected ProprietaryReason4 rcvdAtStockXchg;
    @XmlElement(name = "Rjctd")
    protected ProprietaryReason4 rjctd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason4 modReqd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setAccptd(ProprietaryReason4 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setCmpltd(ProprietaryReason4 value) {
        this.cmpltd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setDnd(ProprietaryReason4 value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setInRpr(ProprietaryReason4 value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the prtlRplcmntAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPrtlRplcmntAccptd() {
        return prtlRplcmntAccptd;
    }

    /**
     * Sets the value of the prtlRplcmntAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setPrtlRplcmntAccptd(ProprietaryReason4 value) {
        this.prtlRplcmntAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setPdg(ProprietaryReason4 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setRcvdAtIntrmy(ProprietaryReason4 value) {
        this.rcvdAtIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRcvdAtStockXchg() {
        return rcvdAtStockXchg;
    }

    /**
     * Sets the value of the rcvdAtStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setRcvdAtStockXchg(ProprietaryReason4 value) {
        this.rcvdAtStockXchg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setRjctd(ProprietaryReason4 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ReplacementProcessingStatus10Choice setModReqd(ProprietaryReason4 value) {
        this.modReqd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ReplacementProcessingStatus10Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
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
