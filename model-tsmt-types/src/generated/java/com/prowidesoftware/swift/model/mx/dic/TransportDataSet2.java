
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
 * Provides details on the transportation of goods that are part of a commercial trade agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDataSet2", propOrder = {
    "dataSetId",
    "buyr",
    "sellr",
    "shipTo",
    "consgn",
    "trnsprtInf"
})
public class TransportDataSet2 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification9 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification9 sellr;
    @XmlElement(name = "ShipTo")
    protected PartyIdentification9 shipTo;
    @XmlElement(name = "Consgn")
    protected PartyIdentification9 consgn;
    @XmlElement(name = "TrnsprtInf", required = true)
    protected List<TransportDetails1> trnsprtInf;

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
    public TransportDataSet2 setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransportDataSet2 setBuyr(PartyIdentification9 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransportDataSet2 setSellr(PartyIdentification9 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransportDataSet2 setShipTo(PartyIdentification9 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransportDataSet2 setConsgn(PartyIdentification9 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportDetails1 }
     * 
     * 
     */
    public List<TransportDetails1> getTrnsprtInf() {
        if (trnsprtInf == null) {
            trnsprtInf = new ArrayList<TransportDetails1>();
        }
        return this.trnsprtInf;
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
     * Adds a new item to the trnsprtInf list.
     * @see #getTrnsprtInf()
     * 
     */
    public TransportDataSet2 addTrnsprtInf(TransportDetails1 trnsprtInf) {
        getTrnsprtInf().add(trnsprtInf);
        return this;
    }

}
