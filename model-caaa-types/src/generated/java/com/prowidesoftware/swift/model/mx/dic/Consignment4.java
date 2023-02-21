
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
 * Specifies the arrangement of the transport of goods and services and the parties involved in this process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment4", propOrder = {
    "consgnr",
    "consgn",
    "trnsprtMeans"
})
public class Consignment4 {

    @XmlElement(name = "Consgnr")
    protected TradeParty3 consgnr;
    @XmlElement(name = "Consgn")
    protected TradeParty3 consgn;
    @XmlElement(name = "TrnsprtMeans")
    protected List<TransportMeans3> trnsprtMeans;

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty3 }
     *     
     */
    public TradeParty3 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty3 }
     *     
     */
    public Consignment4 setConsgnr(TradeParty3 value) {
        this.consgnr = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty3 }
     *     
     */
    public TradeParty3 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty3 }
     *     
     */
    public Consignment4 setConsgn(TradeParty3 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeans3 }
     * 
     * 
     */
    public List<TransportMeans3> getTrnsprtMeans() {
        if (trnsprtMeans == null) {
            trnsprtMeans = new ArrayList<TransportMeans3>();
        }
        return this.trnsprtMeans;
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
     * Adds a new item to the trnsprtMeans list.
     * @see #getTrnsprtMeans()
     * 
     */
    public Consignment4 addTrnsprtMeans(TransportMeans3 trnsprtMeans) {
        getTrnsprtMeans().add(trnsprtMeans);
        return this;
    }

}
