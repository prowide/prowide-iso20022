
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "Action17", propOrder = {
    "actnTp",
    "msgToPres",
    "rmotAccs",
    "rtry",
    "tmCond"
})
public class Action17 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType15Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage11 msgToPres;
    @XmlElement(name = "RmotAccs")
    protected NetworkParameters7 rmotAccs;
    @XmlElement(name = "Rtry")
    protected ProcessRetry3 rtry;
    @XmlElement(name = "TmCond")
    protected ProcessTiming6 tmCond;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType15Code }
     *     
     */
    public ActionType15Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType15Code }
     *     
     */
    public Action17 setActnTp(ActionType15Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the msgToPres property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage11 }
     *     
     */
    public ActionMessage11 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Sets the value of the msgToPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage11 }
     *     
     */
    public Action17 setMsgToPres(ActionMessage11 value) {
        this.msgToPres = value;
        return this;
    }

    /**
     * Gets the value of the rmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getRmotAccs() {
        return rmotAccs;
    }

    /**
     * Sets the value of the rmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public Action17 setRmotAccs(NetworkParameters7 value) {
        this.rmotAccs = value;
        return this;
    }

    /**
     * Gets the value of the rtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry3 }
     *     
     */
    public ProcessRetry3 getRtry() {
        return rtry;
    }

    /**
     * Sets the value of the rtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry3 }
     *     
     */
    public Action17 setRtry(ProcessRetry3 value) {
        this.rtry = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming6 }
     *     
     */
    public ProcessTiming6 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming6 }
     *     
     */
    public Action17 setTmCond(ProcessTiming6 value) {
        this.tmCond = value;
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
