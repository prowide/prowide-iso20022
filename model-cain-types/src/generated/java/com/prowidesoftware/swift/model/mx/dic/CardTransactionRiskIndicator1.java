
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Indicates to the issuer the level of risk of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionRiskIndicator1", propOrder = {
    "rsn",
    "lvl",
    "rcmmnddActn"
})
public class CardTransactionRiskIndicator1 {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected List<CardTransactionRiskReason1Code> rsn;
    @XmlElement(name = "Lvl", required = true)
    protected BigDecimal lvl;
    @XmlElement(name = "RcmmnddActn")
    @XmlSchemaType(name = "string")
    protected List<ActionType4Code> rcmmnddActn;

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTransactionRiskReason1Code }
     * 
     * 
     */
    public List<CardTransactionRiskReason1Code> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<CardTransactionRiskReason1Code>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransactionRiskIndicator1 setLvl(BigDecimal value) {
        this.lvl = value;
        return this;
    }

    /**
     * Gets the value of the rcmmnddActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcmmnddActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcmmnddActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType4Code }
     * 
     * 
     */
    public List<ActionType4Code> getRcmmnddActn() {
        if (rcmmnddActn == null) {
            rcmmnddActn = new ArrayList<ActionType4Code>();
        }
        return this.rcmmnddActn;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public CardTransactionRiskIndicator1 addRsn(CardTransactionRiskReason1Code rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the rcmmnddActn list.
     * @see #getRcmmnddActn()
     * 
     */
    public CardTransactionRiskIndicator1 addRcmmnddActn(ActionType4Code rcmmnddActn) {
        getRcmmnddActn().add(rcmmnddActn);
        return this;
    }

}
