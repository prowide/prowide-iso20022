
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
 * Set of actions to be performed by the card acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action7", propOrder = {
    "actnTp",
    "msgToPres",
    "reqToPrfrm"
})
public class Action7 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType6Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage4 msgToPres;
    @XmlElement(name = "ReqToPrfrm")
    @XmlSchemaType(name = "string")
    protected MessageFunction11Code reqToPrfrm;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType6Code }
     *     
     */
    public ActionType6Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType6Code }
     *     
     */
    public Action7 setActnTp(ActionType6Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the msgToPres property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage4 }
     *     
     */
    public ActionMessage4 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Sets the value of the msgToPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage4 }
     *     
     */
    public Action7 setMsgToPres(ActionMessage4 value) {
        this.msgToPres = value;
        return this;
    }

    /**
     * Gets the value of the reqToPrfrm property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction11Code }
     *     
     */
    public MessageFunction11Code getReqToPrfrm() {
        return reqToPrfrm;
    }

    /**
     * Sets the value of the reqToPrfrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction11Code }
     *     
     */
    public Action7 setReqToPrfrm(MessageFunction11Code value) {
        this.reqToPrfrm = value;
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
