
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
 * Margin required to cover the risk because of the price fluctuations occurred on the unsettled exposures towards central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationMargin2", propOrder = {
    "ttlVartnMrgn",
    "ttlMrkToMkt",
    "mrkToMktNetd",
    "mrkToMktGrss",
    "mrkToMktFls",
    "flsHrcut"
})
public class VariationMargin2 {

    @XmlElement(name = "TtlVartnMrgn", required = true)
    protected List<TotalVariationMargin1> ttlVartnMrgn;
    @XmlElement(name = "TtlMrkToMkt", required = true)
    protected Amount2 ttlMrkToMkt;
    @XmlElement(name = "MrkToMktNetd")
    protected List<Amount2> mrkToMktNetd;
    @XmlElement(name = "MrkToMktGrss")
    protected List<Amount2> mrkToMktGrss;
    @XmlElement(name = "MrkToMktFls")
    protected List<Amount2> mrkToMktFls;
    @XmlElement(name = "FlsHrcut", required = true)
    protected Amount2 flsHrcut;

    /**
     * Gets the value of the ttlVartnMrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttlVartnMrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlVartnMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalVariationMargin1 }
     * 
     * 
     */
    public List<TotalVariationMargin1> getTtlVartnMrgn() {
        if (ttlVartnMrgn == null) {
            ttlVartnMrgn = new ArrayList<TotalVariationMargin1>();
        }
        return this.ttlVartnMrgn;
    }

    /**
     * Gets the value of the ttlMrkToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getTtlMrkToMkt() {
        return ttlMrkToMkt;
    }

    /**
     * Sets the value of the ttlMrkToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public VariationMargin2 setTtlMrkToMkt(Amount2 value) {
        this.ttlMrkToMkt = value;
        return this;
    }

    /**
     * Gets the value of the mrkToMktNetd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrkToMktNetd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktNetd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     */
    public List<Amount2> getMrkToMktNetd() {
        if (mrkToMktNetd == null) {
            mrkToMktNetd = new ArrayList<Amount2>();
        }
        return this.mrkToMktNetd;
    }

    /**
     * Gets the value of the mrkToMktGrss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrkToMktGrss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktGrss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     */
    public List<Amount2> getMrkToMktGrss() {
        if (mrkToMktGrss == null) {
            mrkToMktGrss = new ArrayList<Amount2>();
        }
        return this.mrkToMktGrss;
    }

    /**
     * Gets the value of the mrkToMktFls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrkToMktFls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkToMktFls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount2 }
     * 
     * 
     */
    public List<Amount2> getMrkToMktFls() {
        if (mrkToMktFls == null) {
            mrkToMktFls = new ArrayList<Amount2>();
        }
        return this.mrkToMktFls;
    }

    /**
     * Gets the value of the flsHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getFlsHrcut() {
        return flsHrcut;
    }

    /**
     * Sets the value of the flsHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public VariationMargin2 setFlsHrcut(Amount2 value) {
        this.flsHrcut = value;
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
     * Adds a new item to the ttlVartnMrgn list.
     * @see #getTtlVartnMrgn()
     * 
     */
    public VariationMargin2 addTtlVartnMrgn(TotalVariationMargin1 ttlVartnMrgn) {
        getTtlVartnMrgn().add(ttlVartnMrgn);
        return this;
    }

    /**
     * Adds a new item to the mrkToMktNetd list.
     * @see #getMrkToMktNetd()
     * 
     */
    public VariationMargin2 addMrkToMktNetd(Amount2 mrkToMktNetd) {
        getMrkToMktNetd().add(mrkToMktNetd);
        return this;
    }

    /**
     * Adds a new item to the mrkToMktGrss list.
     * @see #getMrkToMktGrss()
     * 
     */
    public VariationMargin2 addMrkToMktGrss(Amount2 mrkToMktGrss) {
        getMrkToMktGrss().add(mrkToMktGrss);
        return this;
    }

    /**
     * Adds a new item to the mrkToMktFls list.
     * @see #getMrkToMktFls()
     * 
     */
    public VariationMargin2 addMrkToMktFls(Amount2 mrkToMktFls) {
        getMrkToMktFls().add(mrkToMktFls);
        return this;
    }

}
