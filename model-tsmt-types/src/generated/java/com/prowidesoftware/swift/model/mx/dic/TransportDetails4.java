
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
 * Information on the shipment date, the charges, the routing and the goods described in the transport document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDetails4", propOrder = {
    "trnsprtDocRef",
    "trnsprtdGoods",
    "consgnmt",
    "rtgSummry",
    "shipmntDt",
    "frghtChrgs",
    "incotrms"
})
public class TransportDetails4 {

    @XmlElement(name = "TrnsprtDocRef", required = true)
    protected List<DocumentIdentification7> trnsprtDocRef;
    @XmlElement(name = "TrnsprtdGoods", required = true)
    protected List<TransportedGoods1> trnsprtdGoods;
    @XmlElement(name = "Consgnmt")
    protected Consignment3 consgnmt;
    @XmlElement(name = "RtgSummry", required = true)
    protected TransportMeans6 rtgSummry;
    @XmlElement(name = "ShipmntDt", required = true)
    protected ShipmentDate1Choice shipmntDt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge25 frghtChrgs;
    @XmlElement(name = "Incotrms")
    protected Incoterms4 incotrms;

    /**
     * Gets the value of the trnsprtDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification7 }
     * 
     * 
     * @return
     *     The value of the trnsprtDocRef property.
     */
    public List<DocumentIdentification7> getTrnsprtDocRef() {
        if (trnsprtDocRef == null) {
            trnsprtDocRef = new ArrayList<>();
        }
        return this.trnsprtDocRef;
    }

    /**
     * Gets the value of the trnsprtdGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtdGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtdGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportedGoods1 }
     * 
     * 
     * @return
     *     The value of the trnsprtdGoods property.
     */
    public List<TransportedGoods1> getTrnsprtdGoods() {
        if (trnsprtdGoods == null) {
            trnsprtdGoods = new ArrayList<>();
        }
        return this.trnsprtdGoods;
    }

    /**
     * Gets the value of the consgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link Consignment3 }
     *     
     */
    public Consignment3 getConsgnmt() {
        return consgnmt;
    }

    /**
     * Sets the value of the consgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consignment3 }
     *     
     */
    public TransportDetails4 setConsgnmt(Consignment3 value) {
        this.consgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans6 }
     *     
     */
    public TransportMeans6 getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans6 }
     *     
     */
    public TransportDetails4 setRtgSummry(TransportMeans6 value) {
        this.rtgSummry = value;
        return this;
    }

    /**
     * Gets the value of the shipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDate1Choice }
     *     
     */
    public ShipmentDate1Choice getShipmntDt() {
        return shipmntDt;
    }

    /**
     * Sets the value of the shipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDate1Choice }
     *     
     */
    public TransportDetails4 setShipmntDt(ShipmentDate1Choice value) {
        this.shipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge25 }
     *     
     */
    public Charge25 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge25 }
     *     
     */
    public TransportDetails4 setFrghtChrgs(Charge25 value) {
        this.frghtChrgs = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4 }
     *     
     */
    public Incoterms4 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4 }
     *     
     */
    public TransportDetails4 setIncotrms(Incoterms4 value) {
        this.incotrms = value;
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
     * Adds a new item to the trnsprtDocRef list.
     * @see #getTrnsprtDocRef()
     * 
     */
    public TransportDetails4 addTrnsprtDocRef(DocumentIdentification7 trnsprtDocRef) {
        getTrnsprtDocRef().add(trnsprtDocRef);
        return this;
    }

    /**
     * Adds a new item to the trnsprtdGoods list.
     * @see #getTrnsprtdGoods()
     * 
     */
    public TransportDetails4 addTrnsprtdGoods(TransportedGoods1 trnsprtdGoods) {
        getTrnsprtdGoods().add(trnsprtdGoods);
        return this;
    }

}
