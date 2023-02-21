
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionDetail3", propOrder = {
    "txAmts",
    "txFees",
    "addtlAmts",
    "msgRsn",
    "vldtyDt",
    "uattnddLvlCtgy",
    "acctFr",
    "acctTo",
    "instlmt",
    "aml",
    "iccRltdData"
})
public class CardTransactionDetail3 {

    @XmlElement(name = "TxAmts", required = true)
    protected CardTransactionAmount3 txAmts;
    @XmlElement(name = "TxFees")
    protected List<DetailedAmount11> txFees;
    @XmlElement(name = "AddtlAmts")
    protected List<DetailedAmount10> addtlAmts;
    @XmlElement(name = "MsgRsn")
    @XmlSchemaType(name = "string")
    protected MessageReason1Code msgRsn;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctFr")
    protected CardAccount1 acctFr;
    @XmlElement(name = "AcctTo")
    protected CardAccount1 acctTo;
    @XmlElement(name = "Instlmt")
    protected RecurringTransaction2 instlmt;
    @XmlElement(name = "AML")
    protected AntiMoneyLaundering1 aml;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the txAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransactionAmount3 }
     *     
     */
    public CardTransactionAmount3 getTxAmts() {
        return txAmts;
    }

    /**
     * Sets the value of the txAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransactionAmount3 }
     *     
     */
    public CardTransactionDetail3 setTxAmts(CardTransactionAmount3 value) {
        this.txAmts = value;
        return this;
    }

    /**
     * Gets the value of the txFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount11 }
     * 
     * 
     */
    public List<DetailedAmount11> getTxFees() {
        if (txFees == null) {
            txFees = new ArrayList<DetailedAmount11>();
        }
        return this.txFees;
    }

    /**
     * Gets the value of the addtlAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount10 }
     * 
     * 
     */
    public List<DetailedAmount10> getAddtlAmts() {
        if (addtlAmts == null) {
            addtlAmts = new ArrayList<DetailedAmount10>();
        }
        return this.addtlAmts;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReason1Code }
     *     
     */
    public MessageReason1Code getMsgRsn() {
        return msgRsn;
    }

    /**
     * Sets the value of the msgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReason1Code }
     *     
     */
    public CardTransactionDetail3 setMsgRsn(MessageReason1Code value) {
        this.msgRsn = value;
        return this;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionDetail3 setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionDetail3 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount1 }
     *     
     */
    public CardAccount1 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount1 }
     *     
     */
    public CardTransactionDetail3 setAcctFr(CardAccount1 value) {
        this.acctFr = value;
        return this;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount1 }
     *     
     */
    public CardAccount1 getAcctTo() {
        return acctTo;
    }

    /**
     * Sets the value of the acctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount1 }
     *     
     */
    public CardTransactionDetail3 setAcctTo(CardAccount1 value) {
        this.acctTo = value;
        return this;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public RecurringTransaction2 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public CardTransactionDetail3 setInstlmt(RecurringTransaction2 value) {
        this.instlmt = value;
        return this;
    }

    /**
     * Gets the value of the aml property.
     * 
     * @return
     *     possible object is
     *     {@link AntiMoneyLaundering1 }
     *     
     */
    public AntiMoneyLaundering1 getAML() {
        return aml;
    }

    /**
     * Sets the value of the aml property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiMoneyLaundering1 }
     *     
     */
    public CardTransactionDetail3 setAML(AntiMoneyLaundering1 value) {
        this.aml = value;
        return this;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardTransactionDetail3 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
     * Adds a new item to the txFees list.
     * @see #getTxFees()
     * 
     */
    public CardTransactionDetail3 addTxFees(DetailedAmount11 txFees) {
        getTxFees().add(txFees);
        return this;
    }

    /**
     * Adds a new item to the addtlAmts list.
     * @see #getAddtlAmts()
     * 
     */
    public CardTransactionDetail3 addAddtlAmts(DetailedAmount10 addtlAmts) {
        getAddtlAmts().add(addtlAmts);
        return this;
    }

}
