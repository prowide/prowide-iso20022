
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
 * Provides details on the interest statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestStatement4", propOrder = {
    "intrstPrd",
    "ttlIntrstAmtDueToA",
    "ttlIntrstAmtDueToB",
    "valDt",
    "intrstPmtReqId",
    "intrstClctn"
})
public class InterestStatement4 {

    @XmlElement(name = "IntrstPrd", required = true)
    protected DatePeriodDetails intrstPrd;
    @XmlElement(name = "TtlIntrstAmtDueToA")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToA;
    @XmlElement(name = "TtlIntrstAmtDueToB")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToB;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar valDt;
    @XmlElement(name = "IntrstPmtReqId")
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstClctn")
    protected List<InterestCalculation4> intrstClctn;

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public InterestStatement4 setIntrstPrd(DatePeriodDetails value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the ttlIntrstAmtDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrstAmtDueToA() {
        return ttlIntrstAmtDueToA;
    }

    /**
     * Sets the value of the ttlIntrstAmtDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestStatement4 setTtlIntrstAmtDueToA(ActiveCurrencyAndAmount value) {
        this.ttlIntrstAmtDueToA = value;
        return this;
    }

    /**
     * Gets the value of the ttlIntrstAmtDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrstAmtDueToB() {
        return ttlIntrstAmtDueToB;
    }

    /**
     * Sets the value of the ttlIntrstAmtDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestStatement4 setTtlIntrstAmtDueToB(ActiveCurrencyAndAmount value) {
        this.ttlIntrstAmtDueToB = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestStatement4 setValDt(Calendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestStatement4 setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
        return this;
    }

    /**
     * Gets the value of the intrstClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCalculation4 }
     * 
     * 
     * @return
     *     The value of the intrstClctn property.
     */
    public List<InterestCalculation4> getIntrstClctn() {
        if (intrstClctn == null) {
            intrstClctn = new ArrayList<>();
        }
        return this.intrstClctn;
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
     * Adds a new item to the intrstClctn list.
     * @see #getIntrstClctn()
     * 
     */
    public InterestStatement4 addIntrstClctn(InterestCalculation4 intrstClctn) {
        getIntrstClctn().add(intrstClctn);
        return this;
    }

}
