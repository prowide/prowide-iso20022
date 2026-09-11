
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The CashAccountActivityReport message is sent by the executing party to an instructing party containing information about changes on cash account reference data.
 * 
 * Scope and usage: 
 * It aims at informing about the changes occurred during a business date for cash account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountActivityAdviceV01", propOrder = {
    "msgId",
    "msgOrgtr",
    "msgRcpt",
    "cshAcctActvty",
    "splmtryData"
})
public class CashAccountActivityAdviceV01Draft4 {

    @XmlElement(name = "MsgId")
    protected DocumentIdentification50 msgId;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification136 msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification136 msgRcpt;
    @XmlElement(name = "CshAcctActvty", required = true)
    protected CashAccountStatement2 cshAcctActvty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification50 }
     *     
     */
    public DocumentIdentification50 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification50 }
     *     
     */
    public CashAccountActivityAdviceV01Draft4 setMsgId(DocumentIdentification50 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public CashAccountActivityAdviceV01Draft4 setMsgOrgtr(PartyIdentification136 value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public CashAccountActivityAdviceV01Draft4 setMsgRcpt(PartyIdentification136 value) {
        this.msgRcpt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctActvty property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountStatement2 }
     *     
     */
    public CashAccountStatement2 getCshAcctActvty() {
        return cshAcctActvty;
    }

    /**
     * Sets the value of the cshAcctActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountStatement2 }
     *     
     */
    public CashAccountActivityAdviceV01Draft4 setCshAcctActvty(CashAccountStatement2 value) {
        this.cshAcctActvty = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CashAccountActivityAdviceV01Draft4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
