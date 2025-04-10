
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future4", propOrder = {
    "ctrctSz",
    "exrcPric",
    "futrDt",
    "minSz",
    "unitOfMeasr",
    "tmUnit",
    "addtlUndrlygAttrbts"
})
public class Future4 {

    @XmlElement(name = "CtrctSz")
    protected BigDecimal ctrctSz;
    @XmlElement(name = "ExrcPric")
    protected Price8 exrcPric;
    @XmlElement(name = "FutrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar futrDt;
    @XmlElement(name = "MinSz")
    protected ActiveCurrencyAndAmount minSz;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure7Choice unitOfMeasr;
    @XmlElement(name = "TmUnit")
    protected TimeUnit3Choice tmUnit;
    @XmlElement(name = "AddtlUndrlygAttrbts")
    protected List<UnderlyingAttributes4> addtlUndrlygAttrbts;

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Future4 setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public Future4 setExrcPric(Price8 value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the futrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFutrDt() {
        return futrDt;
    }

    /**
     * Sets the value of the futrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Future4 setFutrDt(XMLGregorianCalendar value) {
        this.futrDt = value;
        return this;
    }

    /**
     * Gets the value of the minSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSz() {
        return minSz;
    }

    /**
     * Sets the value of the minSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Future4 setMinSz(ActiveCurrencyAndAmount value) {
        this.minSz = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure7Choice }
     *     
     */
    public UnitOfMeasure7Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure7Choice }
     *     
     */
    public Future4 setUnitOfMeasr(UnitOfMeasure7Choice value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the tmUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit3Choice }
     *     
     */
    public TimeUnit3Choice getTmUnit() {
        return tmUnit;
    }

    /**
     * Sets the value of the tmUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit3Choice }
     *     
     */
    public Future4 setTmUnit(TimeUnit3Choice value) {
        this.tmUnit = value;
        return this;
    }

    /**
     * Gets the value of the addtlUndrlygAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlUndrlygAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlUndrlygAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAttributes4 }
     * 
     * 
     */
    public List<UnderlyingAttributes4> getAddtlUndrlygAttrbts() {
        if (addtlUndrlygAttrbts == null) {
            addtlUndrlygAttrbts = new ArrayList<UnderlyingAttributes4>();
        }
        return this.addtlUndrlygAttrbts;
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
     * Adds a new item to the addtlUndrlygAttrbts list.
     * @see #getAddtlUndrlygAttrbts()
     * 
     */
    public Future4 addAddtlUndrlygAttrbts(UnderlyingAttributes4 addtlUndrlygAttrbts) {
        getAddtlUndrlygAttrbts().add(addtlUndrlygAttrbts);
        return this;
    }

}
