
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the reconciliation of an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationAdvice1", propOrder = {
    "envt",
    "cmdRslt",
    "cmdCntxt",
    "tx"
})
public class ATMReconciliationAdvice1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment10 envt;
    @XmlElement(name = "CmdRslt")
    protected List<ATMCommand5> cmdRslt;
    @XmlElement(name = "CmdCntxt")
    protected ATMCommand6 cmdCntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction11 tx;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment10 }
     *     
     */
    public ATMEnvironment10 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment10 }
     *     
     */
    public ATMReconciliationAdvice1 setEnvt(ATMEnvironment10 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cmdRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmdRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmdRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand5 }
     * 
     * 
     */
    public List<ATMCommand5> getCmdRslt() {
        if (cmdRslt == null) {
            cmdRslt = new ArrayList<ATMCommand5>();
        }
        return this.cmdRslt;
    }

    /**
     * Gets the value of the cmdCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand6 }
     *     
     */
    public ATMCommand6 getCmdCntxt() {
        return cmdCntxt;
    }

    /**
     * Sets the value of the cmdCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand6 }
     *     
     */
    public ATMReconciliationAdvice1 setCmdCntxt(ATMCommand6 value) {
        this.cmdCntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction11 }
     *     
     */
    public ATMTransaction11 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction11 }
     *     
     */
    public ATMReconciliationAdvice1 setTx(ATMTransaction11 value) {
        this.tx = value;
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

    /**
     * Adds a new item to the cmdRslt list.
     * @see #getCmdRslt()
     * 
     */
    public ATMReconciliationAdvice1 addCmdRslt(ATMCommand5 cmdRslt) {
        getCmdRslt().add(cmdRslt);
        return this;
    }

}
