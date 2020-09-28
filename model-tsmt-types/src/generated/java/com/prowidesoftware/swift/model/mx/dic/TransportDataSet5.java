
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on the transportation of goods that are part of a commercial trade agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDataSet5", propOrder = {
    "dataSetId",
    "buyr",
    "sellr",
    "consgnr",
    "consgn",
    "shipTo",
    "trnsprtInf"
})
public class TransportDataSet5 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "Buyr")
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr")
    protected PartyIdentification26 sellr;
    @XmlElement(name = "Consgnr", required = true)
    protected PartyIdentification26 consgnr;
    @XmlElement(name = "Consgn")
    protected PartyIdentification26 consgn;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification26 shipTo;
    @XmlElement(name = "TrnsprtInf", required = true)
    protected TransportDetails4 trnsprtInf;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public TransportDataSet5 setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public TransportDataSet5 setBuyr(PartyIdentification26 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public TransportDataSet5 setSellr(PartyIdentification26 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public TransportDataSet5 setConsgnr(PartyIdentification26 value) {
        this.consgnr = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public TransportDataSet5 setConsgn(PartyIdentification26 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public TransportDataSet5 setShipTo(PartyIdentification26 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtInf property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDetails4 }
     *     
     */
    public TransportDetails4 getTrnsprtInf() {
        return trnsprtInf;
    }

    /**
     * Sets the value of the trnsprtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDetails4 }
     *     
     */
    public TransportDataSet5 setTrnsprtInf(TransportDetails4 value) {
        this.trnsprtInf = value;
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

}
