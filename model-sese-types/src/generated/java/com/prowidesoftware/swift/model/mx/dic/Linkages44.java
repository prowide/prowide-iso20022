
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
 * Information related to a linked transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages44", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "refOwnr"
})
public class Linkages44 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition18Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber16Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References54Choice ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification103Choice refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition18Choice }
     *     
     */
    public ProcessingPosition18Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition18Choice }
     *     
     */
    public Linkages44 setPrcgPos(ProcessingPosition18Choice value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber16Choice }
     *     
     */
    public DocumentNumber16Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber16Choice }
     *     
     */
    public Linkages44 setMsgNb(DocumentNumber16Choice value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References54Choice }
     *     
     */
    public References54Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References54Choice }
     *     
     */
    public Linkages44 setRef(References54Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public PartyIdentification103Choice getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public Linkages44 setRefOwnr(PartyIdentification103Choice value) {
        this.refOwnr = value;
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
