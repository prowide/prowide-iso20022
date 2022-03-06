
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "InterestStatement2", propOrder = {
    "intrstPrd",
    "ttlIntrstAmtDueToA",
    "ttlIntrstAmtDueToB",
    "valDt",
    "intrstPmtReqId",
    "intrstClctnDtls"
})
public class InterestStatement2 {

    @XmlElement(name = "IntrstPrd", required = true)
    protected DatePeriodDetails intrstPrd;
    @XmlElement(name = "TtlIntrstAmtDueToA")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToA;
    @XmlElement(name = "TtlIntrstAmtDueToB")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToB;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "IntrstPmtReqId")
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstClctnDtls")
    protected List<InterestCalculation2> intrstClctnDtls;

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
    public InterestStatement2 setIntrstPrd(DatePeriodDetails value) {
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
    public InterestStatement2 setTtlIntrstAmtDueToA(ActiveCurrencyAndAmount value) {
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
    public InterestStatement2 setTtlIntrstAmtDueToB(ActiveCurrencyAndAmount value) {
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
    public XMLGregorianCalendar getValDt() {
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
    public InterestStatement2 setValDt(XMLGregorianCalendar value) {
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
    public InterestStatement2 setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
        return this;
    }

    /**
     * Gets the value of the intrstClctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrstClctnDtls property.
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
     * {@link InterestCalculation2 }
     * 
     * 
     */
    public List<InterestCalculation2> getIntrstClctnDtls() {
        if (intrstClctnDtls == null) {
            intrstClctnDtls = new ArrayList<InterestCalculation2>();
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
    public InterestStatement2 addIntrstClctnDtls(InterestCalculation2 intrstClctnDtls) {
        getIntrstClctnDtls().add(intrstClctnDtls);
        return this;
    }

}
