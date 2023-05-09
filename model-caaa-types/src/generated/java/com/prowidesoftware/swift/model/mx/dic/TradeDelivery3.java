
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies how the supply chain shipping arrangements and the delivery of products and/or services as well as related documentation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDelivery3", propOrder = {
    "dlvryPrd",
    "dlvryDtTm",
    "shipFr",
    "shipTo",
    "ultmtShipTo",
    "dlvryNote",
    "consgnmt"
})
public class TradeDelivery3 {

    @XmlElement(name = "DlvryPrd")
    protected Period14 dlvryPrd;
    @XmlElement(name = "DlvryDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dlvryDtTm;
    @XmlElement(name = "ShipFr")
    protected TradeParty4 shipFr;
    @XmlElement(name = "ShipTo")
    protected TradeParty4 shipTo;
    @XmlElement(name = "UltmtShipTo")
    protected TradeParty4 ultmtShipTo;
    @XmlElement(name = "DlvryNote")
    protected DocumentIdentification22 dlvryNote;
    @XmlElement(name = "Consgnmt")
    protected List<Consignment5> consgnmt;

    /**
     * Gets the value of the dlvryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period14 }
     *     
     */
    public Period14 getDlvryPrd() {
        return dlvryPrd;
    }

    /**
     * Sets the value of the dlvryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period14 }
     *     
     */
    public TradeDelivery3 setDlvryPrd(Period14 value) {
        this.dlvryPrd = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDlvryDtTm() {
        return dlvryDtTm;
    }

    /**
     * Sets the value of the dlvryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeDelivery3 setDlvryDtTm(OffsetDateTime value) {
        this.dlvryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the shipFr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getShipFr() {
        return shipFr;
    }

    /**
     * Sets the value of the shipFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeDelivery3 setShipFr(TradeParty4 value) {
        this.shipFr = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeDelivery3 setShipTo(TradeParty4 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the ultmtShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getUltmtShipTo() {
        return ultmtShipTo;
    }

    /**
     * Sets the value of the ultmtShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeDelivery3 setUltmtShipTo(TradeParty4 value) {
        this.ultmtShipTo = value;
        return this;
    }

    /**
     * Gets the value of the dlvryNote property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getDlvryNote() {
        return dlvryNote;
    }

    /**
     * Sets the value of the dlvryNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeDelivery3 setDlvryNote(DocumentIdentification22 value) {
        this.dlvryNote = value;
        return this;
    }

    /**
     * Gets the value of the consgnmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the consgnmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsgnmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consignment5 }
     * 
     * 
     * @return
     *     The value of the consgnmt property.
     */
    public List<Consignment5> getConsgnmt() {
        if (consgnmt == null) {
            consgnmt = new ArrayList<>();
        }
        return this.consgnmt;
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
     * Adds a new item to the consgnmt list.
     * @see #getConsgnmt()
     * 
     */
    public TradeDelivery3 addConsgnmt(Consignment5 consgnmt) {
        getConsgnmt().add(consgnmt);
        return this;
    }

}
