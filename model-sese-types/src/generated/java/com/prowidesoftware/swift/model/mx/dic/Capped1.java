
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a capped drawdown.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capped1", propOrder = {
    "startDt",
    "incmLmtCurPrd",
    "incmCurPrd",
    "incmLmtNxtPrd",
    "addtlInf"
})
public class Capped1 {

    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar startDt;
    @XmlElement(name = "IncmLmtCurPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmLmtCurPrd;
    @XmlElement(name = "IncmCurPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmCurPrd;
    @XmlElement(name = "IncmLmtNxtPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmLmtNxtPrd;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Capped1 setStartDt(Calendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the incmLmtCurPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmLmtCurPrd() {
        return incmLmtCurPrd;
    }

    /**
     * Sets the value of the incmLmtCurPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Capped1 setIncmLmtCurPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmLmtCurPrd = value;
        return this;
    }

    /**
     * Gets the value of the incmCurPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmCurPrd() {
        return incmCurPrd;
    }

    /**
     * Sets the value of the incmCurPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Capped1 setIncmCurPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmCurPrd = value;
        return this;
    }

    /**
     * Gets the value of the incmLmtNxtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmLmtNxtPrd() {
        return incmLmtNxtPrd;
    }

    /**
     * Sets the value of the incmLmtNxtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Capped1 setIncmLmtNxtPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmLmtNxtPrd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Capped1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
