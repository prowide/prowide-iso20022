
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
@XmlType(name = "ReplacementProcessingStatus7Choice", propOrder = {
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
public class ReplacementProcessingStatus7Choice {

    @XmlElement(name = "Accptd")
    protected ProprietaryReason1 accptd;
    @XmlElement(name = "Cmpltd")
    protected ProprietaryReason1 cmpltd;
    @XmlElement(name = "Dnd")
    protected ProprietaryReason1 dnd;
    @XmlElement(name = "InRpr")
    protected ProprietaryReason1 inRpr;
    @XmlElement(name = "PrtlRplcmntAccptd")
    protected ProprietaryReason1 prtlRplcmntAccptd;
    @XmlElement(name = "Pdg")
    protected ProprietaryReason1 pdg;
    @XmlElement(name = "RcvdAtIntrmy")
    protected ProprietaryReason1 rcvdAtIntrmy;
    @XmlElement(name = "RcvdAtStockXchg")
    protected ProprietaryReason1 rcvdAtStockXchg;
    @XmlElement(name = "Rjctd")
    protected ProprietaryReason1 rjctd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason1 modReqd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason1 prtrySts;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setAccptd(ProprietaryReason1 value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getCmpltd() {
        return cmpltd;
    }

    /**
     * Sets the value of the cmpltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setCmpltd(ProprietaryReason1 value) {
        this.cmpltd = value;
        return this;
    }

    /**
     * Gets the value of the dnd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getDnd() {
        return dnd;
    }

    /**
     * Sets the value of the dnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setDnd(ProprietaryReason1 value) {
        this.dnd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setInRpr(ProprietaryReason1 value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the prtlRplcmntAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getPrtlRplcmntAccptd() {
        return prtlRplcmntAccptd;
    }

    /**
     * Sets the value of the prtlRplcmntAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setPrtlRplcmntAccptd(ProprietaryReason1 value) {
        this.prtlRplcmntAccptd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setPdg(ProprietaryReason1 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtIntrmy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getRcvdAtIntrmy() {
        return rcvdAtIntrmy;
    }

    /**
     * Sets the value of the rcvdAtIntrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setRcvdAtIntrmy(ProprietaryReason1 value) {
        this.rcvdAtIntrmy = value;
        return this;
    }

    /**
     * Gets the value of the rcvdAtStockXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getRcvdAtStockXchg() {
        return rcvdAtStockXchg;
    }

    /**
     * Sets the value of the rcvdAtStockXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setRcvdAtStockXchg(ProprietaryReason1 value) {
        this.rcvdAtStockXchg = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setRjctd(ProprietaryReason1 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the modReqd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getModReqd() {
        return modReqd;
    }

    /**
     * Sets the value of the modReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setModReqd(ProprietaryReason1 value) {
        this.modReqd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ReplacementProcessingStatus7Choice setPrtrySts(ProprietaryStatusAndReason1 value) {
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
