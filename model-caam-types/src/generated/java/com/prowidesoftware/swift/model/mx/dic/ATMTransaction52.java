
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Information about the reconciliation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction52", propOrder = {
    "tpOfOpr",
    "txId",
    "rcncltnId",
    "txRspn",
    "atmTtls",
    "csstt",
    "cmd"
})
public class ATMTransaction52 {

    @XmlElement(name = "TpOfOpr")
    @XmlSchemaType(name = "string")
    protected ATMOperation2Code tpOfOpr;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType12 txRspn;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals4> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette3> csstt;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

    /**
     * Gets the value of the tpOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMOperation2Code }
     *     
     */
    public ATMOperation2Code getTpOfOpr() {
        return tpOfOpr;
    }

    /**
     * Sets the value of the tpOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMOperation2Code }
     *     
     */
    public ATMTransaction52 setTpOfOpr(ATMOperation2Code value) {
        this.tpOfOpr = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public TransactionIdentifier3 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public ATMTransaction52 setTxId(TransactionIdentifier3 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction52 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType12 }
     *     
     */
    public ResponseType12 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType12 }
     *     
     */
    public ATMTransaction52 setTxRspn(ResponseType12 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals4 }
     * 
     * 
     */
    public List<ATMTotals4> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<ATMTotals4>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csstt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsstt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassette3 }
     * 
     * 
     */
    public List<ATMCassette3> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<ATMCassette3>();
        }
        return this.csstt;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<ATMCommand7>();
        }
        return this.cmd;
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
     * Adds a new item to the aTMTtls list.
     * @see #getATMTtls()
     * 
     */
    public ATMTransaction52 addATMTtls(ATMTotals4 aTMTtls) {
        getATMTtls().add(aTMTtls);
        return this;
    }

    /**
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMTransaction52 addCsstt(ATMCassette3 csstt) {
        getCsstt().add(csstt);
        return this;
    }

    /**
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMTransaction52 addCmd(ATMCommand7 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
