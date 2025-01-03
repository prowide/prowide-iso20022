
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Configuration parameters in use by the security device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration1", propOrder = {
    "keys",
    "ncrptn",
    "macAlgo",
    "dgstAlgo",
    "dgtlSgntr",
    "pin",
    "msgPrtcn"
})
public class ATMSecurityConfiguration1 {

    @XmlElement(name = "Keys")
    protected ATMSecurityConfiguration2 keys;
    @XmlElement(name = "Ncrptn")
    protected ATMSecurityConfiguration3 ncrptn;
    @XmlElement(name = "MACAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm12Code> macAlgo;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm11Code> dgstAlgo;
    @XmlElement(name = "DgtlSgntr")
    protected ATMSecurityConfiguration4 dgtlSgntr;
    @XmlElement(name = "PIN")
    protected ATMSecurityConfiguration5 pin;
    @XmlElement(name = "MsgPrtcn")
    @XmlSchemaType(name = "string")
    protected List<MessageProtection1Code> msgPrtcn;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration2 }
     *     
     */
    public ATMSecurityConfiguration2 getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration2 }
     *     
     */
    public ATMSecurityConfiguration1 setKeys(ATMSecurityConfiguration2 value) {
        this.keys = value;
        return this;
    }

    /**
     * Gets the value of the ncrptn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration3 }
     *     
     */
    public ATMSecurityConfiguration3 getNcrptn() {
        return ncrptn;
    }

    /**
     * Sets the value of the ncrptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration3 }
     *     
     */
    public ATMSecurityConfiguration1 setNcrptn(ATMSecurityConfiguration3 value) {
        this.ncrptn = value;
        return this;
    }

    /**
     * Gets the value of the macAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the macAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMACAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm12Code }
     * 
     * 
     * @return
     *     The value of the macAlgo property.
     */
    public List<Algorithm12Code> getMACAlgo() {
        if (macAlgo == null) {
            macAlgo = new ArrayList<>();
        }
        return this.macAlgo;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgstAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgstAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm11Code }
     * 
     * 
     * @return
     *     The value of the dgstAlgo property.
     */
    public List<Algorithm11Code> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<>();
        }
        return this.dgstAlgo;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration4 }
     *     
     */
    public ATMSecurityConfiguration4 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration4 }
     *     
     */
    public ATMSecurityConfiguration1 setDgtlSgntr(ATMSecurityConfiguration4 value) {
        this.dgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration5 }
     *     
     */
    public ATMSecurityConfiguration5 getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration5 }
     *     
     */
    public ATMSecurityConfiguration1 setPIN(ATMSecurityConfiguration5 value) {
        this.pin = value;
        return this;
    }

    /**
     * Gets the value of the msgPrtcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgPrtcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgPrtcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageProtection1Code }
     * 
     * 
     * @return
     *     The value of the msgPrtcn property.
     */
    public List<MessageProtection1Code> getMsgPrtcn() {
        if (msgPrtcn == null) {
            msgPrtcn = new ArrayList<>();
        }
        return this.msgPrtcn;
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

    /**
     * Adds a new item to the mACAlgo list.
     * @see #getMACAlgo()
     * 
     */
    public ATMSecurityConfiguration1 addMACAlgo(Algorithm12Code mACAlgo) {
        getMACAlgo().add(mACAlgo);
        return this;
    }

    /**
     * Adds a new item to the dgstAlgo list.
     * @see #getDgstAlgo()
     * 
     */
    public ATMSecurityConfiguration1 addDgstAlgo(Algorithm11Code dgstAlgo) {
        getDgstAlgo().add(dgstAlgo);
        return this;
    }

    /**
     * Adds a new item to the msgPrtcn list.
     * @see #getMsgPrtcn()
     * 
     */
    public ATMSecurityConfiguration1 addMsgPrtcn(MessageProtection1Code msgPrtcn) {
        getMsgPrtcn().add(msgPrtcn);
        return this;
    }

}
