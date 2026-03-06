
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
@XmlType(name = "Linkages57__1", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "refOwnr"
})
public class Linkages571Semt031Draft {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition7Choice1Draft prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber5Choice1 msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References34Choice1 ref;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification127Choice1 refOwnr;

    /**
     * Gets the value of the prcgPos property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition7Choice1Draft }
     *     
     */
    public ProcessingPosition7Choice1Draft getPrcgPos() {
        return prcgPos;
    }

    /**
     * Sets the value of the prcgPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition7Choice1Draft }
     *     
     */
    public Linkages571Semt031Draft setPrcgPos(ProcessingPosition7Choice1Draft value) {
        this.prcgPos = value;
        return this;
    }

    /**
     * Gets the value of the msgNb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber5Choice1 }
     *     
     */
    public DocumentNumber5Choice1 getMsgNb() {
        return msgNb;
    }

    /**
     * Sets the value of the msgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber5Choice1 }
     *     
     */
    public Linkages571Semt031Draft setMsgNb(DocumentNumber5Choice1 value) {
        this.msgNb = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References34Choice1 }
     *     
     */
    public References34Choice1 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References34Choice1 }
     *     
     */
    public Linkages571Semt031Draft setRef(References34Choice1 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the refOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice1 }
     *     
     */
    public PartyIdentification127Choice1 getRefOwnr() {
        return refOwnr;
    }

    /**
     * Sets the value of the refOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice1 }
     *     
     */
    public Linkages571Semt031Draft setRefOwnr(PartyIdentification127Choice1 value) {
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
