
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
 * Authorisation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorAuthorisationResponse8", propOrder = {
    "envt",
    "tx",
    "txRspn",
    "splmtryData"
})
public class AcceptorAuthorisationResponse8 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment69 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction88 tx;
    @XmlElement(name = "TxRspn", required = true)
    protected CardPaymentTransaction84 txRspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment69 }
     *     
     */
    public CardPaymentEnvironment69 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment69 }
     *     
     */
    public AcceptorAuthorisationResponse8 setEnvt(CardPaymentEnvironment69 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction88 }
     *     
     */
    public CardPaymentTransaction88 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction88 }
     *     
     */
    public AcceptorAuthorisationResponse8 setTx(CardPaymentTransaction88 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction84 }
     *     
     */
    public CardPaymentTransaction84 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction84 }
     *     
     */
    public AcceptorAuthorisationResponse8 setTxRspn(CardPaymentTransaction84 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AcceptorAuthorisationResponse8 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
