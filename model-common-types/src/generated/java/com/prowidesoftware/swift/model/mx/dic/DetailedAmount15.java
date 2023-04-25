
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
 * Detailed amounts associated with the total amount of transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount15", propOrder = {
    "amtGoodsAndSvcs",
    "cshBck",
    "grtty",
    "fees",
    "rbt",
    "valAddedTax",
    "srchrg"
})
public class DetailedAmount15 {

    @XmlElement(name = "AmtGoodsAndSvcs")
    protected BigDecimal amtGoodsAndSvcs;
    @XmlElement(name = "CshBck")
    protected BigDecimal cshBck;
    @XmlElement(name = "Grtty")
    protected BigDecimal grtty;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount4> fees;
    @XmlElement(name = "Rbt")
    protected List<DetailedAmount4> rbt;
    @XmlElement(name = "ValAddedTax")
    protected List<DetailedAmount4> valAddedTax;
    @XmlElement(name = "Srchrg")
    protected List<DetailedAmount4> srchrg;

    /**
     * Gets the value of the amtGoodsAndSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtGoodsAndSvcs() {
        return amtGoodsAndSvcs;
    }

    /**
     * Sets the value of the amtGoodsAndSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount15 setAmtGoodsAndSvcs(BigDecimal value) {
        this.amtGoodsAndSvcs = value;
        return this;
    }

    /**
     * Gets the value of the cshBck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshBck() {
        return cshBck;
    }

    /**
     * Sets the value of the cshBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount15 setCshBck(BigDecimal value) {
        this.cshBck = value;
        return this;
    }

    /**
     * Gets the value of the grtty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrtty() {
        return grtty;
    }

    /**
     * Sets the value of the grtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount15 setGrtty(BigDecimal value) {
        this.grtty = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<DetailedAmount4> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the rbt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rbt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRbt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the rbt property.
     */
    public List<DetailedAmount4> getRbt() {
        if (rbt == null) {
            rbt = new ArrayList<>();
        }
        return this.rbt;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valAddedTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValAddedTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the valAddedTax property.
     */
    public List<DetailedAmount4> getValAddedTax() {
        if (valAddedTax == null) {
            valAddedTax = new ArrayList<>();
        }
        return this.valAddedTax;
    }

    /**
     * Gets the value of the srchrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the srchrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrchrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount4 }
     * 
     * 
     * @return
     *     The value of the srchrg property.
     */
    public List<DetailedAmount4> getSrchrg() {
        if (srchrg == null) {
            srchrg = new ArrayList<>();
        }
        return this.srchrg;
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
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public DetailedAmount15 addFees(DetailedAmount4 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the rbt list.
     * @see #getRbt()
     * 
     */
    public DetailedAmount15 addRbt(DetailedAmount4 rbt) {
        getRbt().add(rbt);
        return this;
    }

    /**
     * Adds a new item to the valAddedTax list.
     * @see #getValAddedTax()
     * 
     */
    public DetailedAmount15 addValAddedTax(DetailedAmount4 valAddedTax) {
        getValAddedTax().add(valAddedTax);
        return this;
    }

    /**
     * Adds a new item to the srchrg list.
     * @see #getSrchrg()
     * 
     */
    public DetailedAmount15 addSrchrg(DetailedAmount4 srchrg) {
        getSrchrg().add(srchrg);
        return this;
    }

}
