
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
@XmlType(name = "Linkages8", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "refOwnr"
})
public class Linkages8 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition1Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber1Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References14Choice ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification36Choice refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition1Choice }
     *     
     */
    public ProcessingPosition1Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition1Choice }
     *     
     */
    public Linkages8 setPrcgPos(ProcessingPosition1Choice value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber1Choice }
     *     
     */
    public DocumentNumber1Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber1Choice }
     *     
     */
    public Linkages8 setMsgNb(DocumentNumber1Choice value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References14Choice }
     *     
     */
    public References14Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References14Choice }
     *     
     */
    public Linkages8 setRef(References14Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public PartyIdentification36Choice getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public Linkages8 setRefOwnr(PartyIdentification36Choice value) {
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
