
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
 * Specifies the penalties for a given party.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Penalty2__1", propOrder = {
    "ccy",
    "dt",
    "ptyId",
    "pnltyPerCtrPty"
})
public class Penalty21 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice1Semt044Draft dt;
    @XmlElement(name = "PtyId", required = true)
    protected PenaltyPartyIdentification11 ptyId;
    @XmlElement(name = "PnltyPerCtrPty", required = true)
    protected List<PenaltyPerCounterparty21> pnltyPerCtrPty;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Penalty21 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1Semt044Draft }
     *     
     */
    public DateAndDateTime2Choice1Semt044Draft getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1Semt044Draft }
     *     
     */
    public Penalty21 setDt(DateAndDateTime2Choice1Semt044Draft value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyPartyIdentification11 }
     *     
     */
    public PenaltyPartyIdentification11 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyPartyIdentification11 }
     *     
     */
    public Penalty21 setPtyId(PenaltyPartyIdentification11 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the pnltyPerCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pnltyPerCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnltyPerCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyPerCounterparty21 }
     * 
     * 
     * @return
     *     The value of the pnltyPerCtrPty property.
     */
    public List<PenaltyPerCounterparty21> getPnltyPerCtrPty() {
        if (pnltyPerCtrPty == null) {
            pnltyPerCtrPty = new ArrayList<>();
        }
        return this.pnltyPerCtrPty;
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
     * Adds a new item to the pnltyPerCtrPty list.
     * @see #getPnltyPerCtrPty()
     * 
     */
    public Penalty21 addPnltyPerCtrPty(PenaltyPerCounterparty21 pnltyPerCtrPty) {
        getPnltyPerCtrPty().add(pnltyPerCtrPty);
        return this;
    }

}
