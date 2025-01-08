
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of actions to be performed by the POI (Point Of Interaction) system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action6", propOrder = {
    "actnTp",
    "msgToPres"
})
public class Action6 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType3Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage2 msgToPres;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType3Code }
     *     
     */
    public ActionType3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType3Code }
     *     
     */
    public Action6 setActnTp(ActionType3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the msgToPres property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage2 }
     *     
     */
    public ActionMessage2 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Sets the value of the msgToPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage2 }
     *     
     */
    public Action6 setMsgToPres(ActionMessage2 value) {
        this.msgToPres = value;
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
