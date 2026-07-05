
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "Linkages48", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "lkdQty"
})
public class Linkages48 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition10Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber6Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References58Choice ref;
    @XmlElement(name = "LkdQty")
    protected PairedOrTurnedQuantity4Choice lkdQty;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public ProcessingPosition10Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition10Choice }
     *     
     */
    public Linkages48 setPrcgPos(ProcessingPosition10Choice value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentNumber6Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public Linkages48 setMsgNb(DocumentNumber6Choice value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References58Choice }
     *     
     */
    public References58Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References58Choice }
     *     
     */
    public Linkages48 setRef(References58Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the lkdQty property.
     * 
     * @return
     *     possible object is
     *     {@link PairedOrTurnedQuantity4Choice }
     *     
     */
    public PairedOrTurnedQuantity4Choice getLkdQty() {
        return lkdQty;
    }

    /**
     * Sets the value of the lkdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairedOrTurnedQuantity4Choice }
     *     
     */
    public Linkages48 setLkdQty(PairedOrTurnedQuantity4Choice value) {
        this.lkdQty = value;
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
