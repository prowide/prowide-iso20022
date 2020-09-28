
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additionnal details related to the leg.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentLeg1", propOrder = {
    "legIOIQty",
    "instrmLegDtls",
    "legStiptns",
    "legFinInstrmAttrbts"
})
public class InstrumentLeg1 {

    @XmlElement(name = "LegIOIQty", required = true)
    protected Quantity1Choice legIOIQty;
    @XmlElement(name = "InstrmLegDtls")
    protected SecurityIdentification7 instrmLegDtls;
    @XmlElement(name = "LegStiptns")
    protected FinancialInstrumentStipulations legStiptns;
    @XmlElement(name = "LegFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> legFinInstrmAttrbts;

    /**
     * Gets the value of the legIOIQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity1Choice }
     *     
     */
    public Quantity1Choice getLegIOIQty() {
        return legIOIQty;
    }

    /**
     * Sets the value of the legIOIQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity1Choice }
     *     
     */
    public InstrumentLeg1 setLegIOIQty(Quantity1Choice value) {
        this.legIOIQty = value;
        return this;
    }

    /**
     * Gets the value of the instrmLegDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getInstrmLegDtls() {
        return instrmLegDtls;
    }

    /**
     * Sets the value of the instrmLegDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public InstrumentLeg1 setInstrmLegDtls(SecurityIdentification7 value) {
        this.instrmLegDtls = value;
        return this;
    }

    /**
     * Gets the value of the legStiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getLegStiptns() {
        return legStiptns;
    }

    /**
     * Sets the value of the legStiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public InstrumentLeg1 setLegStiptns(FinancialInstrumentStipulations value) {
        this.legStiptns = value;
        return this;
    }

    /**
     * Gets the value of the legFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributes1> getLegFinInstrmAttrbts() {
        if (legFinInstrmAttrbts == null) {
            legFinInstrmAttrbts = new ArrayList<FinancialInstrumentAttributes1>();
        }
        return this.legFinInstrmAttrbts;
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
     * Adds a new item to the legFinInstrmAttrbts list.
     * @see #getLegFinInstrmAttrbts()
     * 
     */
    public InstrumentLeg1 addLegFinInstrmAttrbts(FinancialInstrumentAttributes1 legFinInstrmAttrbts) {
        getLegFinInstrmAttrbts().add(legFinInstrmAttrbts);
        return this;
    }

}
