
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
@XmlType(name = "SingleTransport2", propOrder = {
    "trnsprtByAir",
    "trnsprtBySea",
    "trnsprtByRoad",
    "trnsprtByRail"
})
public class SingleTransport2 {

    @XmlElement(name = "TrnsprtByAir")
    protected List<TransportByAir2> trnsprtByAir;
    @XmlElement(name = "TrnsprtBySea")
    protected List<TransportBySea2> trnsprtBySea;
    @XmlElement(name = "TrnsprtByRoad")
    protected List<TransportByRoad2> trnsprtByRoad;
    @XmlElement(name = "TrnsprtByRail")
    protected List<TransportByRail2> trnsprtByRail;

    /**
     * Gets the value of the trnsprtByAir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByAir property.
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
     * {@link TransportByAir2 }
     * 
     * 
     * @return
     *     The value of the trnsprtByAir property.
     */
    public List<TransportByAir2> getTrnsprtByAir() {
        if (trnsprtByAir == null) {
            trnsprtByAir = new ArrayList<>();
        }
        return this.trnsprtByAir;
    }

    /**
     * Gets the value of the trnsprtBySea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtBySea property.
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
     * {@link TransportBySea2 }
     * 
     * 
     * @return
     *     The value of the trnsprtBySea property.
     */
    public List<TransportBySea2> getTrnsprtBySea() {
        if (trnsprtBySea == null) {
            trnsprtBySea = new ArrayList<>();
        }
        return this.trnsprtBySea;
    }

    /**
     * Gets the value of the trnsprtByRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByRoad property.
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
     * {@link TransportByRoad2 }
     * 
     * 
     * @return
     *     The value of the trnsprtByRoad property.
     */
    public List<TransportByRoad2> getTrnsprtByRoad() {
        if (trnsprtByRoad == null) {
            trnsprtByRoad = new ArrayList<>();
        }
        return this.trnsprtByRoad;
    }

    /**
     * Gets the value of the trnsprtByRail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trnsprtByRail property.
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
     * {@link TransportByRail2 }
     * 
     * 
     * @return
     *     The value of the trnsprtByRail property.
     */
    public List<TransportByRail2> getTrnsprtByRail() {
        if (trnsprtByRail == null) {
            trnsprtByRail = new ArrayList<>();
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
    public SingleTransport2 addTrnsprtByAir(TransportByAir2 trnsprtByAir) {
        getTrnsprtByAir().add(trnsprtByAir);
        return this;
    }

    /**
     * Adds a new item to the trnsprtBySea list.
     * @see #getTrnsprtBySea()
     * 
     */
    public SingleTransport2 addTrnsprtBySea(TransportBySea2 trnsprtBySea) {
        getTrnsprtBySea().add(trnsprtBySea);
        return this;
    }

    /**
     * Adds a new item to the trnsprtByRoad list.
     * @see #getTrnsprtByRoad()
     * 
     */
    public SingleTransport2 addTrnsprtByRoad(TransportByRoad2 trnsprtByRoad) {
        getTrnsprtByRoad().add(trnsprtByRoad);
        return this;
    }

    /**
     * Adds a new item to the trnsprtByRail list.
     * @see #getTrnsprtByRail()
     * 
     */
    public SingleTransport2 addTrnsprtByRail(TransportByRail2 trnsprtByRail) {
        getTrnsprtByRail().add(trnsprtByRail);
        return this;
    }

}
