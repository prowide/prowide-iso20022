
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
 * Specifies the penalties for a given party.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyPerCounterparty3", propOrder = {
    "acctSvcr",
    "ptyId",
    "aggtdNetAmt",
    "pnltyDtls"
})
public class PenaltyPerCounterparty3 {

    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification136 acctSvcr;
    @XmlElement(name = "PtyId", required = true)
    protected PenaltyPartyIdentification1 ptyId;
    @XmlElement(name = "AggtdNetAmt", required = true)
    protected AmountAndDirection5 aggtdNetAmt;
    @XmlElement(name = "PnltyDtls")
    protected List<PenaltyRecord3> pnltyDtls;

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PenaltyPerCounterparty3 setAcctSvcr(PartyIdentification136 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyPartyIdentification1 }
     *     
     */
    public PenaltyPartyIdentification1 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyPartyIdentification1 }
     *     
     */
    public PenaltyPerCounterparty3 setPtyId(PenaltyPartyIdentification1 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the aggtdNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAggtdNetAmt() {
        return aggtdNetAmt;
    }

    /**
     * Sets the value of the aggtdNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public PenaltyPerCounterparty3 setAggtdNetAmt(AmountAndDirection5 value) {
        this.aggtdNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the pnltyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pnltyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnltyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyRecord3 }
     * 
     * 
     * @return
     *     The value of the pnltyDtls property.
     */
    public List<PenaltyRecord3> getPnltyDtls() {
        if (pnltyDtls == null) {
            pnltyDtls = new ArrayList<>();
        }
        return this.pnltyDtls;
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
     * Adds a new item to the pnltyDtls list.
     * @see #getPnltyDtls()
     * 
     */
    public PenaltyPerCounterparty3 addPnltyDtls(PenaltyRecord3 pnltyDtls) {
        getPnltyDtls().add(pnltyDtls);
        return this;
    }

}
