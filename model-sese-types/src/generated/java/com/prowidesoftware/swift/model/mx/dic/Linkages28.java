
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
@XmlType(name = "Linkages28", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "refOwnr"
})
public class Linkages28 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition6Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber3Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References31Choice ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification51Choice refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition6Choice }
     *     
     */
    public ProcessingPosition6Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition6Choice }
     *     
     */
    public Linkages28 setPrcgPos(ProcessingPosition6Choice value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber3Choice }
     *     
     */
    public DocumentNumber3Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber3Choice }
     *     
     */
    public Linkages28 setMsgNb(DocumentNumber3Choice value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References31Choice }
     *     
     */
    public References31Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References31Choice }
     *     
     */
    public Linkages28 setRef(References31Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public Linkages28 setRefOwnr(PartyIdentification51Choice value) {
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
