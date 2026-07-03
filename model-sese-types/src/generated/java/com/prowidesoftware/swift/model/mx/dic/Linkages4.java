
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
@XmlType(name = "Linkages4", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "lkdQty"
})
public class Linkages4 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition3Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber2Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References12Choice ref;
    @XmlElement(name = "LkdQty")
    protected PairedOrTurnedQuantity2Choice lkdQty;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition3Choice }
     *     
     */
    public ProcessingPosition3Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition3Choice }
     *     
     */
    public Linkages4 setPrcgPos(ProcessingPosition3Choice value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber2Choice }
     *     
     */
    public DocumentNumber2Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber2Choice }
     *     
     */
    public Linkages4 setMsgNb(DocumentNumber2Choice value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References12Choice }
     *     
     */
    public References12Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References12Choice }
     *     
     */
    public Linkages4 setRef(References12Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the lkdQty property.
     * 
     * @return
     *     possible object is
     *     {@link PairedOrTurnedQuantity2Choice }
     *     
     */
    public PairedOrTurnedQuantity2Choice getLkdQty() {
        return lkdQty;
    }

    /**
     * Sets the value of the lkdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairedOrTurnedQuantity2Choice }
     *     
     */
    public Linkages4 setLkdQty(PairedOrTurnedQuantity2Choice value) {
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
