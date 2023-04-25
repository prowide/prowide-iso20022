
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warrant4", propOrder = {
    "mltplr",
    "sbcptPric",
    "tp",
    "warrtAgt"
})
public class Warrant4 {

    @XmlElement(name = "Mltplr")
    protected BigDecimal mltplr;
    @XmlElement(name = "SbcptPric")
    protected Price8 sbcptPric;
    @XmlElement(name = "Tp")
    protected WarrantStyle3Choice tp;
    @XmlElement(name = "WarrtAgt")
    protected List<Organisation38> warrtAgt;

    /**
     * Gets the value of the mltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMltplr() {
        return mltplr;
    }

    /**
     * Sets the value of the mltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Warrant4 setMltplr(BigDecimal value) {
        this.mltplr = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public Warrant4 setSbcptPric(Price8 value) {
        this.sbcptPric = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantStyle3Choice }
     *     
     */
    public WarrantStyle3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantStyle3Choice }
     *     
     */
    public Warrant4 setTp(WarrantStyle3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the warrtAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the warrtAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrtAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation38 }
     * 
     * 
     * @return
     *     The value of the warrtAgt property.
     */
    public List<Organisation38> getWarrtAgt() {
        if (warrtAgt == null) {
            warrtAgt = new ArrayList<>();
        }
        return this.warrtAgt;
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
     * Adds a new item to the warrtAgt list.
     * @see #getWarrtAgt()
     * 
     */
    public Warrant4 addWarrtAgt(Organisation38 warrtAgt) {
        getWarrtAgt().add(warrtAgt);
        return this;
    }

}
