
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
 * Consideration, such as amount of money, paid or received in exchange for an amount of money that has been invested, loaned or borrowed for a certain period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestStatement1", propOrder = {
    "intrstPrd",
    "ttlIntrstAmtDueToA",
    "ttlIntrstAmtDueToB",
    "valDt",
    "intrstPmtReqId",
    "intrstClctnDtls"
})
public class InterestStatement1 {

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
    @XmlElement(name = "IntrstClctnDtls")
    protected List<InterestCalculation1> intrstClctnDtls;

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
    public InterestStatement1 setIntrstPrd(DatePeriodDetails value) {
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
    public InterestStatement1 setTtlIntrstAmtDueToA(ActiveCurrencyAndAmount value) {
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
    public InterestStatement1 setTtlIntrstAmtDueToB(ActiveCurrencyAndAmount value) {
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
    public InterestStatement1 setValDt(Calendar value) {
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
    public InterestStatement1 setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
        return this;
    }

    /**
     * Gets the value of the intrstClctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstClctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstClctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCalculation1 }
     * 
     * 
     * @return
     *     The value of the intrstClctnDtls property.
     */
    public List<InterestCalculation1> getIntrstClctnDtls() {
        if (intrstClctnDtls == null) {
            intrstClctnDtls = new ArrayList<>();
        }
        return this.intrstClctnDtls;
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
     * Adds a new item to the intrstClctnDtls list.
     * @see #getIntrstClctnDtls()
     * 
     */
    public InterestStatement1 addIntrstClctnDtls(InterestCalculation1 intrstClctnDtls) {
        getIntrstClctnDtls().add(intrstClctnDtls);
        return this;
    }

}
