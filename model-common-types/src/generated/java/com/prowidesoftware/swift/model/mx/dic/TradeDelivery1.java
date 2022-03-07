
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "TradeDelivery1", propOrder = {
    "dlvryPrd",
    "dlvryDtTm",
    "shipFr",
    "shipTo",
    "ultmtShipTo",
    "dlvryNote",
    "consgnmt"
})
public class TradeDelivery1 {

    @XmlElement(name = "DlvryPrd")
    protected Period1 dlvryPrd;
    @XmlElement(name = "DlvryDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dlvryDtTm;
    @XmlElement(name = "ShipFr")
    protected TradeParty1 shipFr;
    @XmlElement(name = "ShipTo")
    protected TradeParty1 shipTo;
    @XmlElement(name = "UltmtShipTo")
    protected TradeParty1 ultmtShipTo;
    @XmlElement(name = "DlvryNote")
    protected DocumentIdentification22 dlvryNote;
    @XmlElement(name = "Consgnmt")
    protected List<Consignment2> consgnmt;

    /**
     * Gets the value of the dlvryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getDlvryPrd() {
        return dlvryPrd;
    }

    /**
     * Sets the value of the dlvryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public TradeDelivery1 setDlvryPrd(Period1 value) {
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
    public XMLGregorianCalendar getDlvryDtTm() {
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
    public TradeDelivery1 setDlvryDtTm(XMLGregorianCalendar value) {
        this.dlvryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the shipFr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getShipFr() {
        return shipFr;
    }

    /**
     * Sets the value of the shipFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeDelivery1 setShipFr(TradeParty1 value) {
        this.shipFr = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeDelivery1 setShipTo(TradeParty1 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the ultmtShipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getUltmtShipTo() {
        return ultmtShipTo;
    }

    /**
     * Sets the value of the ultmtShipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeDelivery1 setUltmtShipTo(TradeParty1 value) {
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
    public TradeDelivery1 setDlvryNote(DocumentIdentification22 value) {
        this.dlvryNote = value;
        return this;
    }

    /**
     * Gets the value of the consgnmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consgnmt property.
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
     * {@link Consignment2 }
     * 
     * 
     */
    public List<Consignment2> getConsgnmt() {
        if (consgnmt == null) {
            consgnmt = new ArrayList<Consignment2>();
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
    public TradeDelivery1 addConsgnmt(Consignment2 consgnmt) {
        getConsgnmt().add(consgnmt);
        return this;
    }

}
