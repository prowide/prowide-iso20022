
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
 * Specifies individually each leg of a transport of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTransport8", propOrder = {
    "trnsprtByAir",
    "trnsprtBySea",
    "trnsprtByRoad",
    "trnsprtByRail"
})
public class SingleTransport8 {

    @XmlElement(name = "TrnsprtByAir")
    protected List<TransportByAir4> trnsprtByAir;
    @XmlElement(name = "TrnsprtBySea")
    protected List<TransportBySea5> trnsprtBySea;
    @XmlElement(name = "TrnsprtByRoad")
    protected List<TransportByRoad4> trnsprtByRoad;
    @XmlElement(name = "TrnsprtByRail")
    protected List<TransportByRail4> trnsprtByRail;

    /**
     * Gets the value of the trnsprtByAir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtByAir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByAir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByAir4 }
     * 
     * 
     */
    public List<TransportByAir4> getTrnsprtByAir() {
        if (trnsprtByAir == null) {
            trnsprtByAir = new ArrayList<TransportByAir4>();
        }
        return this.trnsprtByAir;
    }

    /**
     * Gets the value of the trnsprtBySea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtBySea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtBySea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportBySea5 }
     * 
     * 
     */
    public List<TransportBySea5> getTrnsprtBySea() {
        if (trnsprtBySea == null) {
            trnsprtBySea = new ArrayList<TransportBySea5>();
        }
        return this.trnsprtBySea;
    }

    /**
     * Gets the value of the trnsprtByRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtByRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByRoad4 }
     * 
     * 
     */
    public List<TransportByRoad4> getTrnsprtByRoad() {
        if (trnsprtByRoad == null) {
            trnsprtByRoad = new ArrayList<TransportByRoad4>();
        }
        return this.trnsprtByRoad;
    }

    /**
     * Gets the value of the trnsprtByRail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtByRail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtByRail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportByRail4 }
     * 
     * 
     */
    public List<TransportByRail4> getTrnsprtByRail() {
        if (trnsprtByRail == null) {
            trnsprtByRail = new ArrayList<TransportByRail4>();
        }
        return this.trnsprtByRail;
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
     * Adds a new item to the trnsprtByAir list.
     * @see #getTrnsprtByAir()
     * 
     */
    public SingleTransport8 addTrnsprtByAir(TransportByAir4 trnsprtByAir) {
        getTrnsprtByAir().add(trnsprtByAir);
        return this;
    }

    /**
     * Adds a new item to the trnsprtBySea list.
     * @see #getTrnsprtBySea()
     * 
     */
    public SingleTransport8 addTrnsprtBySea(TransportBySea5 trnsprtBySea) {
        getTrnsprtBySea().add(trnsprtBySea);
        return this;
    }

    /**
     * Adds a new item to the trnsprtByRoad list.
     * @see #getTrnsprtByRoad()
     * 
     */
    public SingleTransport8 addTrnsprtByRoad(TransportByRoad4 trnsprtByRoad) {
        getTrnsprtByRoad().add(trnsprtByRoad);
        return this;
    }

    /**
     * Adds a new item to the trnsprtByRail list.
     * @see #getTrnsprtByRail()
     * 
     */
    public SingleTransport8 addTrnsprtByRail(TransportByRail4 trnsprtByRail) {
        getTrnsprtByRail().add(trnsprtByRail);
        return this;
    }

}
